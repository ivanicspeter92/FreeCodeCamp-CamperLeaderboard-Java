/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camperleaderboard;

import java.util.ArrayList;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author peter.ivanics
 */
public class CamperFactory {
    public static ArrayList<Camper> getCampers(String json) {
        ArrayList<Camper> campers = new ArrayList();
        
        JSONArray camperObjects = new JSONArray(json);
        for (int i = 0; i < camperObjects.length(); i++) {
            JSONObject camperObject = camperObjects.getJSONObject(i);
            Camper thisCamper = CamperFactory.unwrapCamper(camperObject);
            
            if (thisCamper != null) 
                campers.add(thisCamper);
        }
        return campers;
    }
    
    private static Camper unwrapCamper(JSONObject fromObject) {
        try {
            String username = fromObject.getString("username");
            String img = fromObject.getString("img");
            int alltime = fromObject.getInt("alltime");
            int recent = fromObject.getInt("recent");
            String lastUpdate = fromObject.getString("lastUpdate");
        
            return new Camper(username, img, alltime, recent, lastUpdate);
        } catch (Exception e) {
            return null;
        }
    }
}
