/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package javax.ejb;

/**
 * The EJBMetaData interface allows a client to obtain the enterprise Bean's
 * meta-data information.
 *
 * <p> The meta-data is intended for development tools used for
 * building applications that use deployed enterprise Beans, and for clients
 * using a scripting language to access the enterprise Bean.
 *
 * <p> Note that the EJBMetaData is not a remote interface. The class that
 * implements this interface (this class is typically generated by container
 * tools) must be serializable, and must be a valid RMI/IDL value type.
 */
public interface EJBMetaData {
    /**
     * Obtain the remote home interface of the enterprise Bean.
     *
     * @return the remote home interface of the enterprise Bean.
     */
    EJBHome getEJBHome();

    /**
     * Obtain the Class object for the enterprise Bean's remote home interface.
     * @return the Class object for the enterprise Bean's remote home interface.
     */
    Class getHomeInterfaceClass();

    /**
     * Obtain the Class object for the enterprise Bean's remote interface.
     *
     * @return the Class object for the enterprise Bean's remote interface.
     */
    Class getRemoteInterfaceClass();

    /**
     * Obtain the Class object for the enterprise Bean's primary key class.
     *
     * @return the Class object for the enterprise Bean's primary key class.
     */
    Class getPrimaryKeyClass();

    /**
     * Test if the enterprise Bean's type is "session".
     *
     * @return True if the type of the enterprise Bean is session bean.
     */
    boolean isSession();

    /**
     * Test if the enterprise Bean's type is "stateless session".
     *
     * @return True if the type of the enterprise Bean is stateless
     *     session.
     */
    boolean isStatelessSession();
}
