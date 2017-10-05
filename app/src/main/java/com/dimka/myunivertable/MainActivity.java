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

    private TextView mTextMon;

    private TextView mTextMonStartTime1;
    private TextView mTextMonFinishTime1;
    private TextView mTextMonPredmet1;
    private TextView mTextMonKab1;
    private TextView mTextMonFam1;

    private TextView mTextMonStartTime2;
    private TextView mTextMonFinishTime2;
    private TextView mTextMonPredmet2;
    private TextView mTextMonKab2;
    private TextView mTextMonFam2;

    private TextView mTextMonStartTime3;
    private TextView mTextMonFinishTime3;
    private TextView mTextMonPredmet3;
    private TextView mTextMonKab3;
    private TextView mTextMonFam3;

    private TextView mTextMonStartTime4;
    private TextView mTextMonFinishTime4;
    private TextView mTextMonPredmet4;
    private TextView mTextMonKab4;
    private TextView mTextMonFam4;

    private TextView mTextTue;

    private TextView mTextTueStartTime1;
    private TextView mTextTueFinishTime1;
    private TextView mTextTuePredmet1;
    private TextView mTextTueKab1;
    private TextView mTextTueFam1;

    private TextView mTextTueStartTime2;
    private TextView mTextTueFinishTime2;
    private TextView mTextTuePredmet2;
    private TextView mTextTueKab2;
    private TextView mTextTueFam2;

    private TextView mTextTueStartTime3;
    private TextView mTextTueFinishTime3;
    private TextView mTextTuePredmet3;
    private TextView mTextTueKab3;
    private TextView mTextTueFam3;

    private TextView mTextTueStartTime4;
    private TextView mTextTueFinishTime4;
    private TextView mTextTuePredmet4;
    private TextView mTextTueKab4;
    private TextView mTextTueFam4;

    private TextView mTextWed;

    private TextView mTextWedStartTime1;
    private TextView mTextWedFinishTime1;
    private TextView mTextWedPredmet1;
    private TextView mTextWedKab1;
    private TextView mTextWedFam1;

    private TextView mTextWedStartTime2;
    private TextView mTextWedFinishTime2;
    private TextView mTextWedPredmet2;
    private TextView mTextWedKab2;
    private TextView mTextWedFam2;

    private TextView mTextWedStartTime3;
    private TextView mTextWedFinishTime3;
    private TextView mTextWedPredmet3;
    private TextView mTextWedKab3;
    private TextView mTextWedFam3;

    private TextView mTextWedStartTime4;
    private TextView mTextWedFinishTime4;
    private TextView mTextWedPredmet4;
    private TextView mTextWedKab4;
    private TextView mTextWedFam4;

    private TextView mTextThu;

    private TextView mTextThuStartTime1;
    private TextView mTextThuFinishTime1;
    private TextView mTextThuPredmet1;
    private TextView mTextThuKab1;
    private TextView mTextThuFam1;

    private TextView mTextThuStartTime2;
    private TextView mTextThuFinishTime2;
    private TextView mTextThuPredmet2;
    private TextView mTextThuKab2;
    private TextView mTextThuFam2;

    private TextView mTextThuStartTime3;
    private TextView mTextThuFinishTime3;
    private TextView mTextThuPredmet3;
    private TextView mTextThuKab3;
    private TextView mTextThuFam3;

    private TextView mTextThuStartTime4;
    private TextView mTextThuFinishTime4;
    private TextView mTextThuPredmet4;
    private TextView mTextThuKab4;
    private TextView mTextThuFam4;

    private TextView mTextFri;

    private TextView mTextFriStartTime1;
    private TextView mTextFriFinishTime1;
    private TextView mTextFriPredmet1;
    private TextView mTextFriKab1;
    private TextView mTextFriFam1;

    private TextView mTextFriStartTime2;
    private TextView mTextFriFinishTime2;
    private TextView mTextFriPredmet2;
    private TextView mTextFriKab2;
    private TextView mTextFriFam2;

    private TextView mTextFriStartTime3;
    private TextView mTextFriFinishTime3;
    private TextView mTextFriPredmet3;
    private TextView mTextFriKab3;
    private TextView mTextFriFam3;

    private TextView mTextFriStartTime4;
    private TextView mTextFriFinishTime4;
    private TextView mTextFriPredmet4;
    private TextView mTextFriKab4;
    private TextView mTextFriFam4;

    private TextView mTextSat;

    private TextView mTextSatStartTime1;
    private TextView mTextSatFinishTime1;
    private TextView mTextSatPredmet1;
    private TextView mTextSatKab1;
    private TextView mTextSatFam1;

    private TextView mTextSatStartTime2;
    private TextView mTextSatFinishTime2;
    private TextView mTextSatPredmet2;
    private TextView mTextSatKab2;
    private TextView mTextSatFam2;

    private TextView mTextSatStartTime3;
    private TextView mTextSatFinishTime3;
    private TextView mTextSatPredmet3;
    private TextView mTextSatKab3;
    private TextView mTextSatFam3;

    private TextView mTextSatStartTime4;
    private TextView mTextSatFinishTime4;
    private TextView mTextSatPredmet4;
    private TextView mTextSatKab4;
    private TextView mTextSatFam4;


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


        mTextMon = (TextView) findViewById(R.id.mon);
        mTextMonStartTime1 = (TextView) findViewById(R.id.mon_p1_start_time);
        mTextMonFinishTime1 = (TextView) findViewById(R.id.mon_p1_finish_time);
        mTextMonPredmet1 = (TextView) findViewById(R.id.mon_p1_predmet);
        mTextMonKab1 = (TextView) findViewById(R.id.mon_p1_kab);
        mTextMonFam1 = (TextView) findViewById(R.id.mon_p1_fam);
        mTextMonStartTime2 = (TextView) findViewById(R.id.mon_p2_start_time);
        mTextMonFinishTime2 = (TextView) findViewById(R.id.mon_p2_finish_time);
        mTextMonPredmet2 = (TextView) findViewById(R.id.mon_p2_predmet);
        mTextMonKab2 = (TextView) findViewById(R.id.mon_p2_kab);
        mTextMonFam2 = (TextView) findViewById(R.id.mon_p2_fam);
        mTextMonStartTime3 = (TextView) findViewById(R.id.mon_p3_start_time);
        mTextMonFinishTime3 = (TextView) findViewById(R.id.mon_p3_finish_time);
        mTextMonPredmet3 = (TextView) findViewById(R.id.mon_p3_prepod);
        mTextMonKab3 = (TextView) findViewById(R.id.mon_p3_kab);
        mTextMonFam3 = (TextView) findViewById(R.id.mon_p3_fam);
        mTextMonStartTime4 = (TextView) findViewById(R.id.mon_p4_start_time);
        mTextMonFinishTime4 = (TextView) findViewById(R.id.mon_p4_finish_time);
        mTextMonPredmet4 = (TextView) findViewById(R.id.mon_p4_predmet);
        mTextMonKab4 = (TextView) findViewById(R.id.mon_p4_kab);
        mTextMonFam4 = (TextView) findViewById(R.id.mon_p4_fam);

        mTextTue = (TextView) findViewById(R.id.tue);
        mTextTueStartTime1 = (TextView) findViewById(R.id.tue_p1_start_time);
        mTextTueFinishTime1 = (TextView) findViewById(R.id.tue_p1_finish_time);
        mTextTuePredmet1 = (TextView) findViewById(R.id.tue_p1_predmet);
        mTextTueKab1 = (TextView) findViewById(R.id.tue_p1_kab);
        mTextTueFam1 = (TextView) findViewById(R.id.tue_p1_fam);
        mTextTueStartTime2 = (TextView) findViewById(R.id.tue_p2_start_time);
        mTextTueFinishTime2 = (TextView) findViewById(R.id.tue_p2_finish_time);
        mTextTuePredmet2 = (TextView) findViewById(R.id.tue_p2_predmet);
        mTextTueKab2 = (TextView) findViewById(R.id.tue_p2_kab);
        mTextTueFam2 = (TextView) findViewById(R.id.tue_p2_fam);
        mTextTueStartTime3 = (TextView) findViewById(R.id.tue_p3_start_time);
        mTextTueFinishTime3 = (TextView) findViewById(R.id.tue_p3_finish_time);
        mTextTuePredmet3 = (TextView) findViewById(R.id.tue_p3_prepod);
        mTextTueKab3 = (TextView) findViewById(R.id.tue_p3_kab);
        mTextTueFam3 = (TextView) findViewById(R.id.tue_p3_fam);
        mTextTueStartTime4 = (TextView) findViewById(R.id.tue_p4_start_time);
        mTextTueFinishTime4 = (TextView) findViewById(R.id.tue_p4_finish_time);
        mTextTuePredmet4 = (TextView) findViewById(R.id.tue_p4_predmet);
        mTextTueKab4 = (TextView) findViewById(R.id.tue_p4_kab);
        mTextTueFam4 = (TextView) findViewById(R.id.tue_p4_fam);

        mTextWed = (TextView) findViewById(R.id.wed);
        mTextWedStartTime1 = (TextView) findViewById(R.id.wed_p1_start_time);
        mTextWedFinishTime1 = (TextView) findViewById(R.id.wed_p1_finish_time);
        mTextWedPredmet1 = (TextView) findViewById(R.id.wed_p1_predmet);
        mTextWedKab1 = (TextView) findViewById(R.id.wed_p1_kab);
        mTextWedFam1 = (TextView) findViewById(R.id.wed_p1_fam);
        mTextWedStartTime2 = (TextView) findViewById(R.id.wed_p2_start_time);
        mTextWedFinishTime2 = (TextView) findViewById(R.id.wed_p2_finish_time);
        mTextWedPredmet2 = (TextView) findViewById(R.id.wed_p2_predmet);
        mTextWedKab2 = (TextView) findViewById(R.id.wed_p2_kab);
        mTextWedFam2 = (TextView) findViewById(R.id.wed_p2_fam);
        mTextWedStartTime3 = (TextView) findViewById(R.id.wed_p3_start_time);
        mTextWedFinishTime3 = (TextView) findViewById(R.id.wed_p3_finish_time);
        mTextWedPredmet3 = (TextView) findViewById(R.id.wed_p3_prepod);
        mTextWedKab3 = (TextView) findViewById(R.id.wed_p3_kab);
        mTextWedFam3 = (TextView) findViewById(R.id.wed_p3_fam);
        mTextWedStartTime4 = (TextView) findViewById(R.id.wed_p4_start_time);
        mTextWedFinishTime4 = (TextView) findViewById(R.id.wed_p4_finish_time);
        mTextWedPredmet4 = (TextView) findViewById(R.id.wed_p4_predmet);
        mTextWedKab4 = (TextView) findViewById(R.id.wed_p4_kab);
        mTextWedFam4 = (TextView) findViewById(R.id.wed_p4_fam);

        mTextThu = (TextView) findViewById(R.id.thu);
        mTextThuStartTime1 = (TextView) findViewById(R.id.thu_p1_start_time);
        mTextThuFinishTime1 = (TextView) findViewById(R.id.thu_p1_finish_time);
        mTextThuPredmet1 = (TextView) findViewById(R.id.thu_p1_predmet);
        mTextThuKab1 = (TextView) findViewById(R.id.thu_p1_kab);
        mTextThuFam1 = (TextView) findViewById(R.id.thu_p1_fam);
        mTextThuStartTime2 = (TextView) findViewById(R.id.thu_p2_start_time);
        mTextThuFinishTime2 = (TextView) findViewById(R.id.thu_p2_finish_time);
        mTextThuPredmet2 = (TextView) findViewById(R.id.thu_p2_predmet);
        mTextThuKab2 = (TextView) findViewById(R.id.thu_p2_kab);
        mTextThuFam2 = (TextView) findViewById(R.id.thu_p2_fam);
        mTextThuStartTime3 = (TextView) findViewById(R.id.thu_p3_start_time);
        mTextThuFinishTime3 = (TextView) findViewById(R.id.thu_p3_finish_time);
        mTextThuPredmet3 = (TextView) findViewById(R.id.thu_p3_prepod);
        mTextThuKab3 = (TextView) findViewById(R.id.thu_p3_kab);
        mTextThuFam3 = (TextView) findViewById(R.id.thu_p3_fam);
        mTextThuStartTime4 = (TextView) findViewById(R.id.thu_p4_start_time);
        mTextThuFinishTime4 = (TextView) findViewById(R.id.thu_p4_finish_time);
        mTextThuPredmet4 = (TextView) findViewById(R.id.thu_p4_predmet);
        mTextThuKab4 = (TextView) findViewById(R.id.thu_p4_kab);
        mTextThuFam4 = (TextView) findViewById(R.id.thu_p4_fam);

        mTextFri = (TextView) findViewById(R.id.fri);
        mTextFriStartTime1 = (TextView) findViewById(R.id.fri_p1_start_time);
        mTextFriFinishTime1 = (TextView) findViewById(R.id.fri_p1_finish_time);
        mTextFriPredmet1 = (TextView) findViewById(R.id.fri_p1_predmet);
        mTextFriKab1 = (TextView) findViewById(R.id.fri_p1_kab);
        mTextFriFam1 = (TextView) findViewById(R.id.fri_p1_fam);
        mTextFriStartTime2 = (TextView) findViewById(R.id.fri_p2_start_time);
        mTextFriFinishTime2 = (TextView) findViewById(R.id.fri_p2_finish_time);
        mTextFriPredmet2 = (TextView) findViewById(R.id.fri_p2_predmet);
        mTextFriKab2 = (TextView) findViewById(R.id.fri_p2_kab);
        mTextFriFam2 = (TextView) findViewById(R.id.fri_p2_fam);
        mTextFriStartTime3 = (TextView) findViewById(R.id.fri_p3_start_time);
        mTextFriFinishTime3 = (TextView) findViewById(R.id.fri_p3_finish_time);
        mTextFriPredmet3 = (TextView) findViewById(R.id.fri_p3_prepod);
        mTextFriKab3 = (TextView) findViewById(R.id.fri_p3_kab);
        mTextFriFam3 = (TextView) findViewById(R.id.fri_p3_fam);
        mTextFriStartTime4 = (TextView) findViewById(R.id.fri_p4_start_time);
        mTextFriFinishTime4 = (TextView) findViewById(R.id.fri_p4_finish_time);
        mTextFriPredmet4 = (TextView) findViewById(R.id.fri_p4_predmet);
        mTextFriKab4 = (TextView) findViewById(R.id.fri_p4_kab);
        mTextFriFam4 = (TextView) findViewById(R.id.fri_p4_fam);

        mTextSat = (TextView) findViewById(R.id.sat);
        mTextSatStartTime1 = (TextView) findViewById(R.id.sat_p1_start_time);
        mTextSatFinishTime1 = (TextView) findViewById(R.id.sat_p1_finish_time);
        mTextSatPredmet1 = (TextView) findViewById(R.id.sat_p1_predmet);
        mTextSatKab1 = (TextView) findViewById(R.id.sat_p1_kab);
        mTextSatFam1 = (TextView) findViewById(R.id.sat_p1_fam);
        mTextSatStartTime2 = (TextView) findViewById(R.id.sat_p2_start_time);
        mTextSatFinishTime2 = (TextView) findViewById(R.id.sat_p2_finish_time);
        mTextSatPredmet2 = (TextView) findViewById(R.id.sat_p2_predmet);
        mTextSatKab2 = (TextView) findViewById(R.id.sat_p2_kab);
        mTextSatFam2 = (TextView) findViewById(R.id.sat_p2_fam);
        mTextSatStartTime3 = (TextView) findViewById(R.id.sat_p3_start_time);
        mTextSatFinishTime3 = (TextView) findViewById(R.id.sat_p3_finish_time);
        mTextSatPredmet3 = (TextView) findViewById(R.id.sat_p3_prepod);
        mTextSatKab3 = (TextView) findViewById(R.id.sat_p3_kab);
        mTextSatFam3 = (TextView) findViewById(R.id.sat_p3_fam);
        mTextSatStartTime4 = (TextView) findViewById(R.id.sat_p4_start_time);
        mTextSatFinishTime4 = (TextView) findViewById(R.id.sat_p4_finish_time);
        mTextSatPredmet4 = (TextView) findViewById(R.id.sat_p4_predmet);
        mTextSatKab4 = (TextView) findViewById(R.id.sat_p4_kab);
        mTextSatFam4 = (TextView) findViewById(R.id.sat_p4_fam);


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
                                .withIdentifier(2),
                        new PrimaryDrawerItem()
                                .withName(R.string.app_name)
                                .withIcon(FontAwesome.Icon.faw_info_circle)
                                .withIdentifier(3)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {

                        if (drawerItem instanceof Nameable) {
                            switch (drawerItem.getIdentifier()) {
                                case 1:
                                    Intent setting = new Intent(MainActivity.this, SettingActivity.class);
                                    startActivity(setting);
                                    break;
                                case 2:
                                    Toast.makeText(MainActivity.this, R.string.app_name, Toast.LENGTH_LONG).show();
                                    break;
                                case 3:
                                    Intent edit = new Intent(MainActivity.this, EditActivity.class);
                                    startActivity(edit);
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
