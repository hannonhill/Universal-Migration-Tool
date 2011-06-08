/*
 * Created on Dec 11, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation. All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
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
                (new File(uploadDir + "/" + entry.getName())).mkdirs();
            else if (entry.getName().endsWith(".xml") || entry.getName().endsWith(".jsp"))
                copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(uploadDir + "/" + entry.getName())));
        }

        zipFile.close();

        return uploadDir;
    }

    /**
     * Returns all the files with given extension in the folder and all sub-folders
     * 
     * @param projectInformation
     * @param extension For example ".xml" for xml files
     * @return
     */
    public static List<File> getAllXmlFiles(File folder)
    {
        List<File> files = new ArrayList<File>();
        for (String fileString : folder.list())
        {
            File file = new File(folder.getAbsolutePath() + "/" + fileString);

            if (!file.isFile())
                files.addAll(getAllXmlFiles(file));
            else if (file.getName().endsWith(".xml"))
                files.add(file);
        }
        return files;
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
