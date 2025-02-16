/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tom_roush.pdfbox.pdmodel.encryption;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;

//import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * Singleton which provides a security provider.
 *
 */
public class SecurityProvider
{
    private static Provider provider = null;

    private SecurityProvider()
    {
    }

    /**
     * Returns the provider to be used for advanced encrypting/decrypting. Default is the BouncyCastleProvider.
     *
     * @return the security provider
     *
     * @throws IOException if the default provider can't be instantiated
     */
/*
    public static Provider getProvider() throws IOException
    {
        // TODO synchronize access
        if (provider == null)
        {
            try
            {
                // Remove Android-provided BouncyCastle implementation
                Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
                Security.addProvider(new BouncyCastleProvider());
                Class<Provider> providerClass = (Class<Provider>) Class
                    .forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
                provider = providerClass.getDeclaredConstructor().newInstance();
            }
            catch (ClassNotFoundException ex)
            {
                throw new IOException(ex);
            }
            catch (InstantiationException ex)
            {
                throw new IOException(ex);
            }
            catch (IllegalAccessException ex)
            {
                throw new IOException(ex);
            }
            catch (NoSuchMethodException ex)
            {
                throw new IOException(ex);
            }
            catch (InvocationTargetException ex)
            {
                throw new IOException(ex);
            }
        }
        return provider;
    }
*/

    /**
     * Set the provider to be used for advanced encrypting/decrypting.
     *
     * @param provider the security provider
     */
    public static void setProvider(Provider provider)
    {
        SecurityProvider.provider = provider;
    }
}
