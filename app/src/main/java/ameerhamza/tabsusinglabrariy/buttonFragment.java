package ameerhamza.tabsusinglabrariy;


import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dd.morphingbutton.MorphingButton;

import java.util.Random;

import it.neokree.materialtabs.MaterialTab;

/**
 * Created by DELL 3542 on 3/3/2016.
 */
public class buttonFragment extends android.support.v4.app.DialogFragment {


    private Button button;
    private MorphingButton btnMorph,videoButoon,docButton;
    private  MainActivity obj;

    private ViewPager viewPager;
    public   static  int myButtonClickPosition;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        ;
        super.onCreate(savedInstanceState);



    }


    public  void setMainActivityObj(MainActivity obj , ViewPager viewPager)
    {
        this.obj= obj;

       this.viewPager = viewPager;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {




        View layout = inflater.inflate(R.layout.button_fragment, container, false);



        return layout;
    }

    private int getColor()
    {
        Random random = new Random();
        int color =  Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

        return color;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
      //  ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
       this.btnMorph = (MorphingButton) view.findViewById(R.id.progammButton);
        this.videoButoon = (MorphingButton) view.findViewById(R.id.videoButton);
        this.docButton = (MorphingButton) view.findViewById(R.id.docButton);


       this. btnMorph.setBackgroundColor(getColor());
        this.docButton.setBackgroundColor(getColor());
        this.videoButoon.setBackgroundColor(getColor());


        this.btnMorph.setText("Programms ");
        this.videoButoon.setText("Video lectures");
        this.docButton.setText("References");


        this.videoButoon
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {




                        MainActivity.temp = "video";
                        MainActivity.tabSelectedPosition = 1;
                        MainActivity.setViewPager(1);
                        android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        recylerViewFragment recylerViewFragment = new recylerViewFragment();
                        fragmentTransaction.replace(R.id.frag_contaner, recylerViewFragment, "TAG_FRAGEMENT");
                        //  fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }
                });

        this.docButton
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        myButtonClickPosition = 1;
                        MainActivity.setViewPager(2);
                        MainActivity.temp = "documentation";
                        MainActivity.tabSelectedPosition = 2;
                        android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        recylerViewFragment recylerViewFragment = new recylerViewFragment();
                        fragmentTransaction.replace(R.id.frag_contaner, recylerViewFragment, "TAG_FRAGEMENT");
                        //  fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }
                });
        this.btnMorph
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        myButtonClickPosition=0;



                        MainActivity.temp = "programsList";
                        MainActivity.tabSelectedPosition = 0;
                        MainActivity.setViewPager(0);
                        android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        recylerViewFragment recylerViewFragment = new recylerViewFragment();
                        fragmentTransaction.replace(R.id.frag_contaner, recylerViewFragment, "TAG_FRAGEMENT");
                        //  fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }
                });


//// inside on click event
//        MorphingButton.Params circle = MorphingButton.Params.create()
//
//                .duration(500)
//                .cornerRadius(R.dimen.mb_height_56) // 56 dp
//                .width(R.dimen.mb_height_56) // 56 dp
//                .height(R.dimen.mb_height_56) // 56 dp
//                .color(Color.GREEN) // normal state color
//                .colorPressed(Color.GREEN) // pressed state color
//                .icon(R.drawable.cricket_icon); // icon
//        btnMorph.morph(circle);
//        button = (Button) view.findViewById(R.id.start);
    }




}
