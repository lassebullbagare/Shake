import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by bullen on 2017-05-11.
 */

public class GifList {
    public ArrayList<String> gif;
    public Random slumpaBild;
    private Date d;
    private String bild;

    public GifList(){
    ArrayList<String> gif = new ArrayList<>();
    gif.add(0,"drawable/skak.gif");
    gif.add(1,"drawable/high.gif");
    gif.add(2,"drawable/will.gif");
    gif.add(3,"drawable/cool.gif");
    gif.add(4,"drawable/kram.gif");
    gif.add(5,"drawable/kram2.gif");
    gif.add(6,"drawable/chest.gif");
    Date datum;


}
    public Date getDate(Date d) {
        DateFormat format = new SimpleDateFormat("yyyy/mm/dd");
        d = new Date();

        return d;
                }
    public String randomBild(){
        String bild;
        int index = slumpaBild.nextInt(gif.size());
        bild = gif.get(index);
        System.out.println("Bild " + bild);
        return bild;
    }

    public String getImage(Context context){

        Date n = new Date();
    if(d!=n){
        bild = randomBild();
        String id = "imageView";
        int resID = context.getResources().getIdentifier(id , "id", "main.res.layout");
        ImageView image = (ImageView) findViewById(resID);
        d = n;
    }
    return bild;
    }




}
