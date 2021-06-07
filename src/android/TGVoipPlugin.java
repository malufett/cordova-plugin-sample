package org.parler;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TGVoipPlugin extends CordovaPlugin {
  
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) {
        if (action.equals("test")) {
            try {
                JSONObject options = args.getJSONObject(0);
                String message = options.getString("message");
                String duration = options.getString("duration");
                callbackContext.success(message + duration);
            } catch (JSONException e) {
                callbackContext.error("Error encountered: " + e.getMessage());
                return false;
            }
            PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
            callbackContext.sendPluginResult(pluginResult);
        }
        return true;
    }
    
}