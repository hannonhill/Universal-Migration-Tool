/*
 * Created on Dec 11, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.hannonhill.smt.ProjectInformation;
import com.hannonhill.smt.util.PathUtil;

/**
 * A service responsible for tasks related with files and folders
 * 
 * @author Artur Tomusiak
 * @since 1.0
 */
public class FileSystem
{
    /**
     * Unzips the contents of the zip file to a new directory and returns the path of the directory.
     * 
     * @param zip
     * @param zipFileName
     * @param projectInformation
     * @return
     * @throws Exception
     */
    public static String unzip(File zip, String zipFileName, ProjectInformation projectInformation) throws Exception
    {
        String uploadDir = projectInformation.getUploadsDir() + zipFileName.substring(0, zipFileName.lastIndexOf('.'));

        ZipFile zipFile;
        Enumeration<? extends ZipEntry> entries;

        zipFile = new ZipFile(zip);
        entries = zipFile.entries();
        while (entries.hasMoreElements())
        {
            ZipEntry entry = entries.nextElement();

            if (entry.isDirectory())
                (new File(uploadDir + "\\" + entry.getName())).mkdirs();
            else
            {
                (new File(uploadDir + "\\" + PathUtil.getParentFolderPathFromPath(entry.getName()))).mkdirs();
                copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(uploadDir + "\\" + entry.getName())));
            }
        }

        zipFile.close();

        return uploadDir;
    }

    /**
     * Returns the contents of the file in a byte array.
     * 
     * @param file
     * @return
     * @throws IOException
     */
    public static byte[] getBytesFromFile(File file) throws IOException
    {
        InputStream is = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];

        // Read in the bytes
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0)
            offset += numRead;

        // Ensure all the bytes have been read in
        if (offset < bytes.length)
            throw new IOException("Could not completely read file " + file.getName());

        // Close the input stream and return bytes
        is.close();
        return bytes;
    }

    /**
     * Returns folder contents in a form of a list of {@link File}s
     * 
     * @param folder
     * @return
     */
    public static List<File> getFolderContents(File folder)
    {
        List<File> result = new ArrayList<File>();
        for (String fileString : folder.list())
            result.add(new File(folder.getAbsolutePath() + "\\" + fileString));
        return result;
    }

    /**
     * Creates a folder with given path if it doesn't exist
     * 
     * @param path
     */
    public static void createFolderIfDoesNotExist(String path)
    {
        File f = new File(path);
        f.mkdir();
    }

    /**
     * Saves the contents to a file with given path
     * 
     * @param filePath
     * @param contents
     * @throws Exception
     */
    public static void saveFile(String filePath, String contents) throws Exception
    {
        FileWriter outFile = new FileWriter(filePath);
        PrintWriter out = new PrintWriter(outFile);
        out.print(contents);
        out.close();
    }

    /**
     * Reads file and returns its contents as String
     * 
     * @param file
     * @return
     * @throws Exception
     */
    public static String getFileContents(File file) throws Exception
    {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null)
        {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        return stringBuilder.toString();
    }

    /**
     * Copies the input stream
     * 
     * @param in
     * @param out
     * @throws IOException
     */
    private static void copyInputStream(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int len;

        while ((len = in.read(buffer)) >= 0)
            out.write(buffer, 0, len);

        in.close();
        out.close();
    }

}
