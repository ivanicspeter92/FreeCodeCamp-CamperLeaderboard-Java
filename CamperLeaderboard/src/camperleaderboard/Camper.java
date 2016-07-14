package camperleaderboard;

import java.util.Calendar;

/**
 * Created by Artem Klimenko on 14/07/2016.
 */
public class Camper
{
    String username;
    String img;
    int alltime;
    int recent;
    Calendar lastUpdate;

public Camper(String username, String img, int alltime, int recent, Calendar lastUpdate){
    this.username = username;
    this.img = img;
    this.alltime = alltime;
    this.recent = recent;
    this.lastUpdate = lastUpdate;
}

}
