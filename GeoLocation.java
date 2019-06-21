package deven.geolocation;


import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class GeoLocation extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		GPSTracker gps = new GPSTracker(GeoLocation.this);
        if (action.equals("getLocation")) {
           if(gps.canGetLocation()){

		           double latitude = gps.getLatitude();
		           double longitude = gps.getLongitude();
					//double latitude = 18.23564;
		          	//double longitude = 73.12566;
					callbackContext.success("Lat"+latitude+", Long:" +longitude);
         			 return true;
		           
		     }else{
		          
		           gps.showSettingsAlert();
		        }
        }
        return false;
    }
}
