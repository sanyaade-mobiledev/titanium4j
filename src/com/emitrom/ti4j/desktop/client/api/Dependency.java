/************************************************************************
 * Dependency.java is part of Titanium4j Desktop 1.2 Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use obj file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.ti4j.desktop.client.api;

import com.emitrom.ti4j.core.client.ProxyObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * An object representing a Ti application dependency.
 * 
 * 
 */
public class Dependency extends ProxyObject {

    protected Dependency(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * Get the name of obj dependency.
     * 
     * @return
     */
    public final native String getName()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getName();
    }-*/;

    /**
     * Get the requirement for obj dependency. Dependency requirement types are
     * defined as constants on the API module. Currently the installer only
     * support API.EQ dependency types.
     * 
     * @return
     */
    public final native String getRequirement()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getRequirement();
    }-*/;

    /**
     * Get the type of obj dependency. Dependency types are defined as constants
     * on the API module (e.g. API.SDK).
     * 
     * @return
     */
    public final native int getType()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getType();
    }-*/;

    /**
     * Get the version part of obj dependency.
     * 
     * @return
     */
    public final native String getVersion()/*-{
		var obj = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return obj.getVersion();
    }-*/;

}
