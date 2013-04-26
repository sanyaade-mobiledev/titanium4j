package com.emitrom.ti4j.mobile.modules.gmap.client;

import com.emitrom.ti4j.mobile.client.core.events.ui.ClickEvent;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Fired when the user selects, deselects, or clicks on an annotation.
 * 
 * Note that the click event is not fired every time the user clicks on the map.
 * It is fired in two circumstances:
 * <ul>
 * <li>If the user clicks on an annotation to select it.</li>
 * <li>The user deselects an annotation.</li>
 * </ul>
 * 
 */
public class GMapClickEvent extends ClickEvent {

    protected GMapClickEvent() {

    }

    private GMapClickEvent(JavaScriptObject jso) {
        this.jsObj = jso;
    }

    /**
     * Annotation source object.
     */
    public native GMapAnnotation getAnnotation() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.annotation;
		return @com.emitrom.ti4j.mobile.modules.gmap.client.GMapAnnotation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native GMapAnnotation getClickSource() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.clicksource;
		return @com.emitrom.ti4j.mobile.modules.gmap.client.GMapAnnotation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native String getClickSourceAsstring() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.clicksource;
    }-*/;

    public native double getLatitude() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.latitude;
    }-*/;

    public native double getLongitude() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.longitude;
    }-*/;

    public native GMapView getMap() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		var obj = jso.map;
		return @com.emitrom.ti4j.mobile.modules.gmap.client.GMapView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native String getSubtitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.subtitle;
    }-*/;

    public native String getTitle() /*-{
		var jso = this.@com.emitrom.ti4j.core.client.ProxyObject::getJsObj()();
		return jso.title;
    }-*/;

    public static GMapClickEvent cast(ClickEvent event) {
        return new GMapClickEvent(event.getJsObj());
    }

}