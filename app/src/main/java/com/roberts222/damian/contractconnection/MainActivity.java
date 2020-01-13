package com.roberts222.damian.contractconnection;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.room.Room;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send, R.id.nav_help, R.id.nav_logout)
                .setDrawerLayout(drawer)
                .build();


        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();

        ViewPager viewPager = findViewById(R.id.viewPager);
        //PagerAdapter myPagerAdapter = new PagerAdapter(getSupportFragmentManager(), viewPager.getChildCount());
        //viewPager.setAdapter(myPagerAdapter);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        //tabLayout.setupWithViewPager(viewPager);



    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle item selection
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        switch (item.getItemId()) {
            case R.id.nav_home:
                //navController.navigate();
                return true;
            case R.id.nav_gallery:
                navController.navigate(R.id.nav_gallery);
                return true;
            case R.id.nav_slideshow:
                navController.navigate(R.id.nav_slideshow);
                return true;
            case R.id.nav_tools:
                navController.navigate(R.id.nav_tools);
                return true;
            case R.id.nav_share:
                navController.navigate(R.id.nav_share);
                return true;
            case R.id.nav_send:
                navController.navigate(R.id.nav_send);
                return true;
            case R.id.nav_help:
                //navController.navigate();
                return true;
            case R.id.nav_logout:
                //showHelp();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
