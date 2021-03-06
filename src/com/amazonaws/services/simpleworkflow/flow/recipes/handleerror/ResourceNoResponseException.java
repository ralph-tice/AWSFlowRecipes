/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.recipes.handleerror;

public class ResourceNoResponseException extends Exception {

    /**
     * serial version id generated by eclipse
     */
    private static final long serialVersionUID = 2064998195406586390L;

    public ResourceNoResponseException() {
        super();
    }

    /**
     * this constructor will be used by JSON data converter for data
     * serialization
     */
    public ResourceNoResponseException(String message) {
        super(message);
    }

}
