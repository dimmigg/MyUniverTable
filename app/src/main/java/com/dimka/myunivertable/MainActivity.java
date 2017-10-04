package com.dimka.myunivertable;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Badgeable;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Nameable;

public class MainActivity extends AppCompatActivity {

    private Drawer.Result drawerResult;//боковое меню

//    private TextView mTextMessage;

    WeekDay mon_1 = new WeekDay();
    WeekDay tue_1 = new WeekDay();
    WeekDay wed_1 = new WeekDay();
    WeekDay thu_1 = new WeekDay();
    WeekDay fri_1 = new WeekDay();
    WeekDay sat_1 = new WeekDay();

    WeekDay mon_2 = new WeekDay();
    WeekDay tue_2 = new WeekDay();
    WeekDay wed_2 = new WeekDay();
    WeekDay thu_2 = new WeekDay();
    WeekDay fri_2 = new WeekDay();
    WeekDay sat_2 = new WeekDay();


    SharedPreferences sp; //для хранения настроек

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
//                    mTextMessage.setText(R.string.title_notifications);
                    Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                    startActivity(intent);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initializeNavigationDrawer(toolbar);


//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        // получаем SharedPreferences, которое работает с файлом настроек
        sp = PreferenceManager.getDefaultSharedPreferences(this);
    }

    private void initializeNavigationDrawer(Toolbar toolbar) {
        drawerResult = new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withActionBarDrawerToggleAnimated(true)
                .withTranslucentStatusBar(false)
                .withTranslucentActionBarCompatibility(false)
                .withDrawerWidthPx(650)
//                .withDisplayBelowToolbar(true)
//                .withTranslucentNavigationBarProgrammatically(true)
//                .setTranslucentStatusFlag(true)
//                .withHeader(R.layout.drawer_header)
                .withSelectedItem(-1)
                .addDrawerItems(
//                        new PrimaryDrawerItem().withName(R.string.drawer_item_home).withIcon(FontAwesome.Icon.faw_home).withBadge("99").withIdentifier(1),
//                        new PrimaryDrawerItem().withName(R.string.drawer_item_free_play).withIcon(FontAwesome.Icon.faw_gamepad),
//                        new PrimaryDrawerItem().withName(R.string.drawer_item_custom).withIcon(FontAwesome.Icon.faw_eye).withBadge("6").withIdentifier(2),
//                        new SectionDrawerItem().withName(R.string.drawer_item_settings),
//                        new SecondaryDrawerItem().withName(R.string.drawer_item_help).withIcon(FontAwesome.Icon.faw_cog),
//                        new SecondaryDrawerItem().withName(R.string.drawer_item_open_source).withIcon(FontAwesome.Icon.faw_question).setEnabled(false),
//                        new DividerDrawerItem(),
//                        new SecondaryDrawerItem().withName(R.string.drawer_item_contact).withIcon(FontAwesome.Icon.faw_github).withBadge("12+").withIdentifier(1)
//                        new PrimaryDrawerItem()

                        new PrimaryDrawerItem()
                                .withName(R.string.app_name)
                                .withIcon(FontAwesome.Icon.faw_gear)
                                .withIdentifier(1),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem()
                                .withName(R.string.app_name)
                                .withIcon(FontAwesome.Icon.faw_info_circle)
                                .withIdentifier(2)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {

                        if (drawerItem instanceof Nameable) {
                            switch (drawerItem.getIdentifier()) {
                                case 1:
                                    Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                                    startActivity(intent);
                                    break;
                                case 2:
                                    Toast.makeText(MainActivity.this, R.string.app_name, Toast.LENGTH_LONG).show();
                                    break;

                            }
                        }
                        if (drawerItem instanceof Badgeable) {
                            Badgeable badgeable = (Badgeable) drawerItem;
                            if (badgeable.getBadge() != null) {
                                // учтите, не делайте так, если ваш бейдж содержит символ "+"
                                try {
                                    int badge = Integer.valueOf(badgeable.getBadge());
                                    if (badge > 0) {
                                        drawerResult.updateBadge(String.valueOf(badge - 1), position);
                                    }
                                } catch (Exception e) {
                                    Log.d("test", "Не нажимайте на бейдж, содержащий плюс! :)");
                                }
                            }
                        }
                    }


//                        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
//                        startActivity(intent);

                })
                .build();
    }

    //при востановлениии изменяет размер
    protected void onResume() {
        super.onResume();
        int TimeTextSize = Integer.parseInt(sp.getString("list", "1"));
        if (TimeTextSize != 1) {
//            mTextMessage.setTextSize(TimeTextSize);
        } else {
//            mTextMessage.setTextSize(14);
        }
    }


}
