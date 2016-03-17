package ameerhamza.tabsusinglabrariy;

import android.support.v7.widget.RecyclerView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

/**
 * Created by DELL 3542 on 2/21/2016.
 */
public class AnimactionUtil {
    public static void animate(RecyclerView.ViewHolder viewHolder)
    {

        YoYo.with(Techniques.RotateIn)
                .duration(700)
                .playOn(viewHolder.itemView);

    }
}
