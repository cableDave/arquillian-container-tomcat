/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.container.tomcat;

/**
 * Utilities for Strings inspired by the <a
 * href="http://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html">utility of the same
 * name</a> in Apache Commons Lang.
 *
 * @author <a href="mailto:ian@ianbrandt.com">Ian Brandt</a>
 */
public class StringUtils {

    public static boolean isBlank(final String string) {

        return string == null || string.trim().length() == 0;
    }
}