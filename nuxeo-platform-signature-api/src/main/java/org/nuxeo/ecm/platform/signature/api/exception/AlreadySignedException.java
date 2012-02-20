/*
 * (C) Copyright 2010 Nuxeo SA (http://nuxeo.com/) and contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * Contributors:
 *    Wojciech Sulejman
 */
package org.nuxeo.ecm.platform.signature.api.exception;

import org.nuxeo.ecm.core.api.ClientException;

/**
 * @author <a href="mailto:ws@nuxeo.com">Wojciech Sulejman</a>
 *
 */
public class AlreadySignedException extends SignException {

    private static final long serialVersionUID = 333L;
    
    public AlreadySignedException(String message) {
        super(message);
    }

    public AlreadySignedException(String message, ClientException cause) {
        super(message, cause);
    }

    public AlreadySignedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlreadySignedException(Throwable cause) {
        super(cause);
    }
}
