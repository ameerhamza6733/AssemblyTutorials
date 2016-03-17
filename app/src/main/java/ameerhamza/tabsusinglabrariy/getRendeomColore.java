package ameerhamza.tabsusinglabrariy;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by DELL 3542 on 3/11/2016.
 */
public class getRendeomColore  {
    public static int getColor() {
        Random random = new Random();
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

        return color;
    }
}
