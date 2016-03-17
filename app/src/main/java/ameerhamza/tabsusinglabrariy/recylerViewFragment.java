package ameerhamza.tabsusinglabrariy;


import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by DELL 3542 on 2/20/2016.
 */
public class recylerViewFragment extends android.support.v4.app.Fragment {
    public static int pos;
    private RecyclerView recyclerView;
    private NameListAdapeter nameListAdapeter;
    public static int itemClickPosition = 0;
    private String[] title;
    private int listFirstvisibleposition;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ((AppCompatActivity)getActivity()).getSupportActionBar().show();

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.recyler_view_frag, container, false);
        return layout;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        recyclerView = (RecyclerView) view.findViewById(R.id.myRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(getActivity()).color(getRendeomColore.getColor()).sizeResId(R.dimen.divider).margin(10, 10).build());
        nameListAdapeter = new NameListAdapeter();
        recyclerView.setAdapter(nameListAdapeter);
        for (int i = 1; i < title.length; i++) {
            nameListAdapeter.addName(title[i]);

        }
        super.onViewCreated(view, savedInstanceState);
    }




    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//       listFirstvisibleposition = ((LinearLayoutManager)recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
//
//
//
//
//    }
    private class NameListAdapeter extends android.support.v7.widget.RecyclerView.Adapter<NameListViewHolder> {
        String temp;
        public  ArrayList<String> Name;

        public NameListAdapeter() {
            int[] icon = {R.drawable.a, R.drawable.b, R.drawable.c};


            Name = new ArrayList<>();
            if (MainActivity.temp.equals("programsList")) {

                title = getResources().getStringArray(R.array.programsList);
            } else if (MainActivity.temp.equals("video")) {

                title = getResources().getStringArray(R.array.video);

            } else if (MainActivity.temp.equals("documentation")) {
                title = getResources().getStringArray(R.array.documentation);

            }


        }

        public void addName(String name) {


            Name.add(name);
            notifyItemInserted(Name.size());
        }

        public void removeName(String name) {
            int position = name.indexOf(name);
            Name.remove(position);
            notifyItemRemoved(position);
        }

        @Override
        public NameListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = getActivity().getLayoutInflater().inflate(R.layout.list_item_name, parent, false);

            return new NameListViewHolder(view);
        }

        @Override
        public void onBindViewHolder(NameListViewHolder holder, int position) {

            String name = Name.get(position);


            holder.NameTextView.setText(name);
            // holder.NameTextView.setTextColor(Color.BLACK);
            // holder.NameTextView.setBackgroundColor(Color.WHITE);
            // holder.imageView.setBackgroundColor(Color.WHITE);
            if (MainActivity.tabSelectedPosition == 0) {
                //holder.imageView.setImageResource(R.drawable.source_code);
                holder.fab1.setBackgroundTintList(ColorStateList.valueOf(getRendeomColore.getColor()));
                holder.fab1.setImageResource(R.drawable.source_code);


            } else if (MainActivity.tabSelectedPosition == 1) {
                //holder.imageView.setImageResource(R.drawable.tv_icon);
                holder.fab1.setBackgroundTintList(ColorStateList.valueOf(getRendeomColore.getColor()));
                holder.fab1.setImageResource(R.drawable.tv_icon);

            } else {
                //  holder.imageView.setImageResource(R.drawable.document);
                holder.fab1.setBackgroundTintList(ColorStateList.valueOf(getRendeomColore.getColor()));
                holder.fab1.setImageResource(R.drawable.document);


            }
            AnimactionUtil.animate(holder);

        }

        @Override
        public int getItemCount() {

            return Name.size();
        }

    }

    public class NameListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView NameTextView;
        public ImageView imageView;
        public FloatingActionButton fab1;

        public NameListViewHolder(View itemView) {
            super(itemView);

            NameTextView = (TextView) itemView.findViewById(R.id.List_item_name);
            // imageView = (ImageView) itemView.findViewById(R.id.item_icon);
            fab1 = (FloatingActionButton) itemView.findViewById(R.id.fab1);
            NameTextView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            Toast bread = Toast.makeText(getActivity(), "item click" + getPosition(), Toast.LENGTH_LONG);
            itemClickPosition = getPosition();
            bread.show();
            recylerViewFragment.pos = getPosition();
            if (MainActivity.tabSelectedPosition == 1) {

                Intent intent_for_video_list = new Intent(getActivity(), YoutubePlayerActivity.class);
                intent_for_video_list.putExtra("index", getPosition());
                startActivity(intent_for_video_list);
            }
            if (MainActivity.tabSelectedPosition == 0 || MainActivity.tabSelectedPosition == 2) {
                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                webViewFragment viewFragment = new webViewFragment();
                fragmentTransaction.replace(R.id.frag_contaner, viewFragment, "a").addToBackStack(null).commit();


            }
        }
    }

}

