/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2017 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/
package com.hitachi.hcp.test.util;

import com.hitachi.hcp.core.ConnectionFactory;
import com.hitachi.hcp.core.IConnection;
import com.hitachi.hcp.core.HCPException;

public class ConnectionManager {
  public static IConnection getConnection() throws HCPException {
    // WARNING - Pass FALSE as the last parameter for real solutions - else you are not validating the server, and would
    //           be prone to man in the middle attacks!
    return ConnectionFactory.create( "ns01", "pdi", "hcp01.coe.net", "admin", "PD!42017", 100, true );
  }
}