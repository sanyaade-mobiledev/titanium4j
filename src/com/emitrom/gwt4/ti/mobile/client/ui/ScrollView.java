/**************************************************************************
   ScrollView.java is part of Titanium4j Mobile 3.0.  Copyright 2012 Emitrom LLC

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
package com.emitrom.gwt4.ti.mobile.client.ui;

import com.emitrom.gwt4.ti.mobile.client.core.ProxyObject;
import com.emitrom.gwt4.ti.mobile.client.core.Unit;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.ScaleHandler;
import com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.ScrollViewScrollHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A scroll view is used to create a scrollable region of content. views added
 * to the scroll view will be scrolled based on the content size of the scroll
 * view. In android, scroll views can only scroll in one direction, either
 * vertical or horizontal, but not both at the same time. see the
 * {@link com.emitrom.gwt4.ti.mobile.client.ui.ScrollView.getScrollType}
 * property
 * 
 * <p>
 * If your scrollable region fits within the size of the content area the scroll
 * view will not scroll.
 */
public class ScrollView extends View {

    public ScrollView() {
        createPeer();
    }

    ScrollView(JavaScriptObject proxy) {
        jsObj = proxy;
    }

    /**
     * @return (iPhone only) boolean to indicate if the scroll view can cancel
     *         subview touches in order to scroll instead. default of true
     */
    public native boolean canCancelEvents() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.canCancelEvents;
    }-*/;

    public native void setCanCancelEvents(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.canCancelEvents = value;
    }-*/;

    /**
     * @return The height of the scrollable area
     */
    public native <T> T getContentHeight() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.contentHeight;
    }-*/;

    public void setContentHeight(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "contentHeight", value);
    }

    public void setContentHeight(String value) {
        UI.get().setSizePropertyAsString(jsObj, "contentHeight", value);
    }

    public void setContentHeight(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "contentHeight", value, unit);
    }

    /**
     * @return An object (with x and y properties) to indicate the offset of the
     *         content area
     */
    public native Point getContentOffset() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		var obj = jso.contentOffset;
		var toReturn = @com.emitrom.gwt4.ti.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		return toReturn;
    }-*/;

    public native void setContentOffset(Point value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.contentOffset = value.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
    }-*/;

    /**
     * @return The width of the scrollable area
     */
    public native <T> T getContentWidth() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.contentWidth;
    }-*/;

    public void setContentWidth(double value) {
        UI.get().setSizePropertyAsDouble(jsObj, "contentWidth", value);
    }

    public void setContentWidth(String value) {
        UI.get().setSizePropertyAsString(jsObj, "contentWidth", value);
    }

    public void setContentWidth(String value, Unit unit) {
        UI.get().setSizePropertyAsString(jsObj, "contentWidth", value, unit);
    }

    /**
     * @return Disable view bouncing. ios only. Available only on iOs
     */
    public native boolean disableBounce() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.disableBounce;
    }-*/;

    public native void setDisableBounce(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.disableBounce = value;
    }-*/;

    /**
     * @return Boolean to control the horizontal bounce during scrolling
     *         Available only on iOs
     */
    public native boolean horizontalBounce() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.horizontalBounce;
    }-*/;

    public native void setHorizontalBounce(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.horizontalBounce = value;
    }-*/;

    /**
     * @return The maximum scale of the content Available only on iOs
     */
    public native double getMaxZoomScale() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.maxZoomScale;
    }-*/;

    public native void setMaxZoomScale(double value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.maxZoomScale = value;
    }-*/;

    /**
     * @return The minimum scale of the content Available only on iOs
     */
    public native double getMinZoomScale() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.minZoomScale;
    }-*/;

    public native void setMinZoomScale(double value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.minZoomScale = value;
    }-*/;

    /**
     * @return (android only) the type of scrollview: "vertical" or "horizontal"
     * 
     * @platforms android
     */
    public native String getScrollType() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.scrollType;
    }-*/;

    public native void setScrollType(String value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.scrollType = value;
    }-*/;

    /**
     * @return Boolean to indicate whether the horizontal scroll indicator is
     *         visible
     */
    public native boolean showHorizontalScrollIndicator() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.showHorizontalScrollIndicator;
    }-*/;

    public native void setShowHorizontalScrollIndicator(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.showHorizontalScrollIndicator = value;
    }-*/;

    /**
     * @return Boolean to indicate whether the vertical scroll indicator is
     *         visible
     */
    public native boolean showVerticalScrollIndicator() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.showVerticalScrollIndicator;
    }-*/;

    public native void setShowVerticalScrollIndicator(boolean value) /*-{
		jso.showVerticalScrollIndicator = value;
    }-*/;

    /**
     * @return Boolean to control the vertical bounce during scrolling Available
     *         only on iOs
     */
    public native boolean verticalBounce() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.verticalBounce;
    }-*/;

    public native void setVerticalBounce(boolean value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.verticalBounce = value;
    }-*/;

    /**
     * @return Set the zoom scale for the current content area Available only on
     *         iOs
     */
    public native double getZoomScale() /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		return jso.zoomScale;
    }-*/;

    public native void setZoomScale(double value) /*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso.zoomScale = value;
    }-*/;

    /**
     * Scrollto a particular point
     * 
     * @param x the x point within the view
     * @param y the y point within the view
     */
    public native void scrollTo(double x, double y) /*-{
		jso.scrollTo(x, y);
    }-*/;

    public void scrollTo(Point point) {
        scrollTo(point.getX(), point.getY());
    }

    public native void addScrollHandler(ScrollViewScrollHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.gwt4.ti.mobile.client.core.events.ui.scrollview.ScrollViewEvent::SCROLL,
						function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.scrollview.ScrollViewEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.ScrollViewScrollHandler::onScroll(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/scrollview/ScrollViewEvent;)(eventObject);
						});
    }-*/;

    public native void addScaleHandler(ScaleHandler handler)/*-{
		var jso = this.@com.emitrom.gwt4.ti.mobile.client.core.ProxyObject::getJsObj()();
		jso
				.addEventListener(
						@com.emitrom.gwt4.ti.mobile.client.core.events.ui.ScaleEvent::SCALE,
						function(e) {
							var eventObject = @com.emitrom.gwt4.ti.mobile.client.core.events.ui.ScaleEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							handler.@com.emitrom.gwt4.ti.mobile.client.core.handlers.ui.ScaleHandler::onScale(Lcom/emitrom/gwt4/ti/mobile/client/core/events/ui/ScaleEvent;)(eventObject);
						});
    }-*/;

    @Override
    public void createPeer() {
        jsObj = UI.createScrollView();
    }

    public static ScrollView from(ProxyObject proxy) {
        return new ScrollView(proxy.getJsObj());
    }

}
