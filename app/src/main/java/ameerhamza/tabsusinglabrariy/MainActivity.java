package ameerhamza.tabsusinglabrariy;

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, MaterialTabListener {
    private static final String TAG = "fragment tag";
    static String temp;
    static int tabSelectedPosition;
    private static ViewPager viewPager;
    int[] icon = {R.drawable.source_code, R.drawable.tv_icon, R.drawable.document};
    private String[] tabs;
    private MaterialTabHost tabHost;
    private ActionBar actionBar;
    private android.support.v4.app.FragmentManager fragmentManager;
    private buttonFragment buttonFragment;
    private NavigationView navigationView;
    private android.support.v7.widget.SearchView searchView;
    private SearchManager searchManager;

    public static void setViewPager(int positon) {
        viewPager.setCurrentItem(positon);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabHost = (MaterialTabHost) this.findViewById(R.id.materialTabHost);

        this.viewPager = (ViewPager) this.findViewById(R.id.myViewPager);

        // MainActivity.temp = "programsList";
        //android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        this.fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag_contaner, new buttonFragment());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


        this.viewPager.setAdapter(new myPagerAdupter(getSupportFragmentManager()));

        this.viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // when user do a swipe the selected tab change
                tabHost.setSelectedNavigationItem(position);
            }
        });


        for (int i = 0; i < 3; i++) {
            tabHost.addTab(
                    tabHost.newTab().setText(tabs[i])
                            //tabHost.newTab().setIcon(getIcon(i))

                            .setTabListener(this)
            );
        }

        setSupportActionBar(toolbar);


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setBackgroundTintList(ColorStateList.valueOf(getColor()));
//        fab.setOnClickListener(new View.OnClickListener() {
//            StringBuffer sb = new StringBuffer();
//
//            @Override
//            public void onClick(View view) {
//
//
//                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
//
//                //set the type
//                shareIntent.setType("text/plain");
//
//                //add a subject
//                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Insert Subject Here");
//
//                //build the body of the message to be shared
//              //  String shareMessage = strings.programs[getitemClickPosition()];
//
//                //add the message
//                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml((String) sb.toString()).toString());
//
//                //start the chooser for sharing
//                startActivity(Intent.createChooser(shareIntent, "share using "));
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().findItem(R.id.nav_program).setIcon(R.drawable.source_code);
        navigationView.getMenu().findItem(R.id.nav_video).setIcon(R.drawable.tv_icon);
        navigationView.getMenu().findItem(R.id.nav_pdf).setIcon(R.drawable.document);
        navigationView.setNavigationItemSelectedListener(this);
    }


    public MainActivity getRefrance() {
        return this;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);


        } else {
            if (getFragmentManager().getBackStackEntryCount() == 0) {

                super.onBackPressed();


            } else {


                getFragmentManager().popBackStack();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        searchView = (android.support.v7.widget.SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.action_search));
         searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_exit) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return true;
        }
        if(id==R.id.action_search)
        {
            this.searchView.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    //Fragment_program_list.adapter.getFilter().filter(newText);
                    return false;
                }
            });
            return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_program) {

            MainActivity.temp = "programsList";
            MainActivity.setViewPager(0);
            MainActivity.tabSelectedPosition = 0;
            addFragment();

        } else if (id == R.id.nav_video) {
            MainActivity.temp = "video";
            MainActivity.setViewPager(1);
            MainActivity.tabSelectedPosition = 1;
            addFragment();

        } else if (id == R.id.nav_pdf) {
            MainActivity.temp = "documentation";
            MainActivity.setViewPager(2);
            MainActivity.tabSelectedPosition = 2;
            addFragment();

        } else if (id == R.id.nav_share) {

            Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);

            //set the type
            shareIntent.setType("text/plain");

            //add a subject
            shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Insert Subject Here");

            //build the body of the message to be shared
            //String shareMessage = FragmentB.programs[index];

            //add the message
           // shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml((String) sb.toString()).toString());

            //start the chooser for sharing
            startActivity(Intent.createChooser(shareIntent, "share using "));

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onTabSelected(MaterialTab tab) {
        Toast bread = Toast.makeText(getApplicationContext(), "item click" + tab.getPosition(), Toast.LENGTH_LONG);
        // lastItemVissible = getPosition();
        bread.show();
        if (tab.getPosition() == 0) {
            MainActivity.temp = "programsList";
            MainActivity.tabSelectedPosition = tab.getPosition();
            addFragment();


        }
        if (tab.getPosition() == 1) {
            MainActivity.tabSelectedPosition = tab.getPosition();
            MainActivity.temp = "video";


            addFragment();
        }
        if (tab.getPosition() == 2) {
            MainActivity.tabSelectedPosition = tab.getPosition();
            MainActivity.temp = "documentation";
            addFragment();
        }


        viewPager.setCurrentItem(tab.getPosition());


    }

    public void addFragment() {
        fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        recylerViewFragment recylerViewFragment = new recylerViewFragment();
        fragmentTransaction.replace(R.id.frag_contaner, recylerViewFragment, "TAG_FRAGEMENT");
        //  fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onTabReselected(MaterialTab tab) {

        if (tab.getPosition() == 0) {
            MainActivity.temp = "programsList";
            MainActivity.tabSelectedPosition = tab.getPosition();
            addFragment();

        }


    }

    @Override
    public void onTabUnselected(MaterialTab tab) {


    }


    class myPagerAdupter extends FragmentPagerAdapter {


        public myPagerAdupter(FragmentManager fm) {

            super(fm);
            tabs = getResources().getStringArray(R.array.tabs);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }


        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            android.support.v4.app.Fragment fragment = new android.support.v4.app.Fragment();
            return fragment;
        }


        @Override
        public int getCount() {
            return 3;
        }


    }
}
