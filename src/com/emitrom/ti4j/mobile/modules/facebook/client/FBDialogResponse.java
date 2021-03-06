package com.emitrom.ti4j.mobile.modules.facebook.client;

import com.emitrom.ti4j.core.client.JsoHelper;
import com.emitrom.ti4j.mobile.client.core.events.ErrorResponse;
import com.google.gwt.core.client.JavaScriptObject;

public class FBDialogResponse extends ErrorResponse {

    protected FBDialogResponse(JavaScriptObject obj) {
        super(obj);
    }

    /**
     * Indicates if the user canceled the dialog.
     */
    public boolean isCancelled() {
        return JsoHelper.getAttributeAsBoolean(jsObj, "cancelled");
    }

    /**
     * If successful, returns the JSON response containing the post_id of the
     * new post. If the user canceled the dialog, the results is undefined.
     */
    public String getResult() {
        return JsoHelper.getAttribute(jsObj, "result");
    }

}
