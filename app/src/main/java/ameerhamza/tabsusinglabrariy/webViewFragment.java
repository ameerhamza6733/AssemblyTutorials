package ameerhamza.tabsusinglabrariy;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import  android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;

import it.neokree.materialtabs.MaterialTab;

/**
 * Created by DELL 3542 on 2/21/2016.
 */
public class webViewFragment extends Fragment{
    private String url= "file:///android_asset/";
    private String temp =".html";
    private int positonOfitemClick;
    private MaterialTab tab;
    private int tabPosition;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.positonOfitemClick = recylerViewFragment.pos;
        this.tabPosition=MainActivity.tabSelectedPosition;
        Toast bread = Toast.makeText(getActivity(), "tab in webview" + this.tabPosition, Toast.LENGTH_LONG);
        bread.show();



            super.onCreate(savedInstanceState);
    }

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View layout = inflater.inflate(R.layout.web_view_fragment, container, false);
             return layout;
        }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        WebView myb = (WebView) view.findViewById(R.id.myWebView);




        FloatingActionButton my_share_fab = (FloatingActionButton) getActivity().findViewById(R.id.my_share_fab);
        if (MainActivity.temp.equals("programsList")) {

            my_share_fab.setBackgroundTintList(ColorStateList.valueOf(getRendeomColore.getColor()));
            my_share_fab.setOnClickListener(new View.OnClickListener() {
                StringBuffer sb = new StringBuffer();

                @Override
                public void onClick(View view) {


                    Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);

                    //set the type
                    shareIntent.setType("text/plain");

                    //add a subject
                    shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Insert Subject Here");

                    //build the body of the message to be shared
                    String shareMessage = strings.programs[recylerViewFragment.itemClickPosition+1];

                    //add the message
                    shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareMessage);

                    //start the chooser for sharing
                    startActivity(Intent.createChooser(shareIntent, "share using "));
                }
            });


        } else if (MainActivity.temp.equals("video")) {

            my_share_fab.setVisibility(View.GONE);

        } else if (MainActivity.temp.equals("documentation")) {

            my_share_fab.setVisibility(View.GONE);
        }

        if(this.tabPosition==0)
        {
            myb.loadUrl("file:///android_asset/h.html");
        }
        else
        myb.loadUrl(this.GernaterUrl());
    }
    public String GernaterUrl()
    {
        StringBuffer stringBuffer =  new StringBuffer(this.url);
        stringBuffer.append(this.positonOfitemClick);
        stringBuffer.append(this.temp);
        return stringBuffer.toString();
    }
}
