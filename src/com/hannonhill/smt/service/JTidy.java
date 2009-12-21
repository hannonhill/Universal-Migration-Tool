/*
 * Created on Dec 7, 2009 by Artur Tomusiak
 * 
 * Copyright(c) 2000-2009 Hannon Hill Corporation.  All rights reserved.
 */
package com.hannonhill.smt.service;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import org.w3c.tidy.Tidy;

/**
 * A service responsible for tidying cdata content into valid xml
 * 
 * @author  Artur Tomusiak
 * @version $Id$
 * @since   1.0
 */
public class JTidy
{
    /**
     * Runs JTidy on the provided content and returns the result
     * 
     * @param content
     * @return
     */
    public static String tidyContent(String content)
    {
        Tidy tidy = getTidy();
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        tidy.parse(new StringReader(content), outStream); // run tidy, providing a string reader and output stream
        return outStream.toString();
    }

    /**
     * Copied from Cascade source code for consistency
     * 
     * <p>Get a new {@link CascadeXMLTidy} object, configured with the most
     * common options Cascade uses to Tidy (X)HTML content. The following
     * parameters are set:</p>
     * 
     * <ul>
     *  <li>Do not produce a tidy mark</li>
     *  <li>Output numerical entities</li>
     *  <li>Only return the content inside of the &lt;body&gt; element</li>
     *  <li>Do not turn naked ampersands into &amp;amp;</li>
     *  <li>Always map non-ASCII characters to their entity equivalent</li>
     *  <li>Clean up word/microsoft content</li>
     *  <li>Remove empty paragraphs (&lt;p&gt; elements containing only whitespace)</li>
     *  <li>Return valid XHTML</li>
     *  <li>Do not output any messages to the console (stdout)</li>
     *  <li>Always produce a result, even if errors were encountered</li>
     * </ul>
     * 
     * @return a configured {@link Tidy} object, ready to tidy the content
     */
    public static final Tidy getTidy()
    {
        final Tidy tidy = new Tidy();

        //We don't want a mark in the code saying it was tidied
        tidy.setTidyMark(false);
        //output numerical entities (i.e. &#160; rather than &nbsp;)
        tidy.setNumEntities(true);
        //since only include body content in the output - since this
        //is WYSIWYG content that will be wrapped in a page anyways.
        tidy.setPrintBodyOnly(true);
        //do not turn naked ampersands into &amp;
        tidy.setQuoteAmpersand(true);

        //always map non-ascii characters to their entity equivalent
        //for maximum compatibility
        tidy.setRawOut(false);
        //clean the heck out of some bad word html!
        tidy.setWord2000(true);
        //get rid of empty paragraph tags
        tidy.setDropEmptyParas(true);
        //don't trim empty elements (CSCD-2163)
        tidy.setTrimEmptyElements(false);

        //get rid of extra microsoft "cruft"
        tidy.setMakeBare(true);

        //CSCD-2197: we want our output to be XML and XHTML
        //such that JTidy outputs certain nested elements correctly.
        tidy.setXmlOut(true);
        tidy.setXHTML(true);

        tidy.setDocType("omit");

        //don't output anything to stdout
        tidy.setQuiet(true);

        //we do this so that tidy doesn't output errors/warnings to the console
        tidy.setErrout(new PrintWriter(new StringWriter()));

        //always output something
        tidy.setForceOutput(true);

        //CSCD-2049: Convert <b> to <strong> and <i> to <em>
        tidy.setLogicalEmphasis(true);

        //disable wrapping.
        tidy.setWraplen(0);

        tidy.setSmartIndent(false);

        return tidy;
    }
}
