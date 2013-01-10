/**************************************************************************
   AbstractHandlerResponse.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 **************************************************************************/
package com.emitrom.gwt4.ti.mobile.client.cloud.core;

import com.emitrom.gwt4.ti.mobile.client.core.ProxyObject;

/**
 * Base class for chat request objects
 * 
 */
public abstract class AbstractHandlerResponse extends ProxyObject {

    public native boolean isSuccess()/*-{
		var peer = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return peer.success;
    }-*/;

    public native String getError()/*-{
		var peer = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return peer.error;
    }-*/;

    public native String getMessage()/*-{
		var peer = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return peer.message;
    }-*/;

}
