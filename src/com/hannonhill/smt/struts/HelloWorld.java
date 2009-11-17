/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.hannonhill.smt.struts;

/**
 * <code>Set welcome message.</code>
 */
public class HelloWorld extends ExampleSupport
{
    private static final long serialVersionUID = 290016339072091593L;

    @Override
    public String execute() throws Exception
    {
        setMessage("Struts is up and running ...");
        return SUCCESS;
    }

    /**
     * Field for Message property.
     */
    private String message;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message)
    {
        this.message = message;
    }
}
