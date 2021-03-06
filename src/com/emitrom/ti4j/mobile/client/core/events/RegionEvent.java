/**************************************************************************
   RegionEvent.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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

package com.emitrom.ti4j.mobile.client.core.events;

import com.emitrom.ti4j.mobile.client.core.handlers.geolocation.RegionChangeHandler;
import com.emitrom.ti4j.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class RegionEvent extends TiEvent {

    public static final String REGION_CHANGED = "regionchanged";

	/**
	 * UiBinder implementations
	 */
	private static Type<RegionChangeHandler> TYPE = new Type<RegionChangeHandler>(REGION_CHANGED, null);
	public static Type<RegionChangeHandler> getType() {
		return TYPE;
	}
	
	public static Type<RegionChangeHandler> getAssociatedType() {
		return TYPE;
	}
	
    protected RegionEvent() {

    }

    private RegionEvent(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the y point of the event, in receiving view coordinates
     */
    public final native Object getY() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.y;
    }-*/;

    /**
     * the new longitude
     */
    public final native double getLongitude() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.longitude;
    }-*/;

    /**
     * the new latitude delta
     */
    public final native double getLatitudeDelta() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.latitudeDelta;
    }-*/;

    /**
     * the new longitude delta
     */
    public final native double getLongitudeDelta() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.longitudeDelta;
    }-*/;

    /**
     * the new latitude
     */
    public final native double getLatitude() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.latitude;
    }-*/;

    /**
     * the x point of the event in receiving view coordiantes
     */
    public final native double getX() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.x;
    }-*/;

    /**
     * a dictionary with properties x and y describing the point of the event in
     * screen coordinates
     */
    public final native Point getGlobalPoint() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.globalPoint;
		var toReturn = @com.emitrom.ti4j.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

}
