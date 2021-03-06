package com.dimka.myunivertable;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
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

    static WeekDay mon_1 = new WeekDay();
    static WeekDay tue_1 = new WeekDay();
    static WeekDay wed_1 = new WeekDay();
    static WeekDay thu_1 = new WeekDay();
    static WeekDay fri_1 = new WeekDay();
    static WeekDay sat_1 = new WeekDay();

    static WeekDay mon_2 = new WeekDay();
    static WeekDay tue_2 = new WeekDay();
    static WeekDay wed_2 = new WeekDay();
    static WeekDay thu_2 = new WeekDay();
    static WeekDay fri_2 = new WeekDay();
    static WeekDay sat_2 = new WeekDay();

    static SharedPreferences sPref;
    BottomNavigationView navigation;

//    final static String mon_1_p1_time_start = "mon_1_p1_time_start";

   static SharedPreferences sp; //для хранения настроек


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.week1:
//                    mEdAct.loadText();
//                    loadText();
                    loadWeek1();
                    print_all_1();
//                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.week2:
                    loadWeek2();
                    print_all_2();
//                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.calendar:
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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // Отображение только портретный режим

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initializeNavigationDrawer(toolbar);

        sp = PreferenceManager.getDefaultSharedPreferences(this);

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
        mTextMonPredmet3 = (TextView) findViewById(R.id.mon_p3_predmet);
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
        mTextTuePredmet3 = (TextView) findViewById(R.id.tue_p3_predmet);
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
        mTextWedPredmet3 = (TextView) findViewById(R.id.wed_p3_predmet);
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
        mTextThuPredmet3 = (TextView) findViewById(R.id.thu_p3_predmet);
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
        mTextFriPredmet3 = (TextView) findViewById(R.id.fri_p3_predmet);
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
        mTextSatPredmet3 = (TextView) findViewById(R.id.sat_p3_predmet);
        mTextSatKab3 = (TextView) findViewById(R.id.sat_p3_kab);
        mTextSatFam3 = (TextView) findViewById(R.id.sat_p3_fam);
        mTextSatStartTime4 = (TextView) findViewById(R.id.sat_p4_start_time);
        mTextSatFinishTime4 = (TextView) findViewById(R.id.sat_p4_finish_time);
        mTextSatPredmet4 = (TextView) findViewById(R.id.sat_p4_predmet);
        mTextSatKab4 = (TextView) findViewById(R.id.sat_p4_kab);
        mTextSatFam4 = (TextView) findViewById(R.id.sat_p4_fam);


        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // получаем SharedPreferences, которое работает с файлом настроек
        sp = PreferenceManager.getDefaultSharedPreferences(this);
    }

//вывод и настройка бокового меню
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
                                .withName(R.string.edit)
                                .withIcon(FontAwesome.Icon.faw_edit)
                                .withIdentifier(3),
                        new PrimaryDrawerItem()
                                .withName(R.string.setting)
                                .withIcon(FontAwesome.Icon.faw_gear)
                                .withIdentifier(1),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem()
                                .withName(R.string.about)
                                .withIcon(FontAwesome.Icon.faw_info_circle)
                                .withIdentifier(2)
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


    protected void onResume() {
        super.onResume();
        loadSize();    //при востановлениии изменяет размер
        navigation.setSelectedItemId(R.id.week1);
        loadWeek1(); //подгрузка данных 1 недели
        print_all_1(); //отображение 1 недели
//        navigation.setSelectedItemId(R.id.navigation_home);
    }

    private void loadSize() { //подгрузка размера шрифтов из настроек
        int timeSize = Integer.parseInt(sp.getString("timeSize", "1"));
        int predmetSize = Integer.parseInt(sp.getString("predmetSize", "1"));
        int kabSize = Integer.parseInt(sp.getString("kabSize", "1"));
        int famSize = Integer.parseInt(sp.getString("famSize", "1"));
        if (timeSize != 1) {
            loadTimeSize(timeSize);
        } else {
            loadTimeSize(12);
        }

        if (predmetSize != 1) {
            loadPredmetSize(predmetSize);
        } else {
            loadPredmetSize(14);
        }

        if (kabSize != 1) {
            loadKabSize(kabSize);
        } else {
            loadKabSize(12);
        }

        if (famSize != 1) {
            loadFamSize(famSize);
        } else {
            loadFamSize(13);
        }
    }

//показ недель
    void print_all_1(){
        mTextMon.setText(R.string.mon1);
        mTextTue.setText(R.string.tue1);
        mTextWed.setText(R.string.wed1);
        mTextThu.setText(R.string.thu1);
        mTextFri.setText(R.string.fri1);
        mTextSat.setText(R.string.sat1);

        print_mon(mon_1.start_time1, mon_1.finish_time1, mon_1.predmet1, mon_1.kab1, mon_1.fam1,
                mon_1.start_time2, mon_1.finish_time2, mon_1.predmet2, mon_1.kab2, mon_1.fam2,
                mon_1.start_time3, mon_1.finish_time3, mon_1.predmet3, mon_1.kab3, mon_1.fam3,
                mon_1.start_time4, mon_1.finish_time4, mon_1.predmet4, mon_1.kab4, mon_1.fam4);
        print_tue(tue_1.start_time1, tue_1.finish_time1, tue_1.predmet1, tue_1.kab1, tue_1.fam1,
                tue_1.start_time2, tue_1.finish_time2, tue_1.predmet2, tue_1.kab2, tue_1.fam2,
                tue_1.start_time3, tue_1.finish_time3, tue_1.predmet3, tue_1.kab3, tue_1.fam3,
                tue_1.start_time4, tue_1.finish_time4, tue_1.predmet4, tue_1.kab4, tue_1.fam4);
        print_wed(wed_1.start_time1, wed_1.finish_time1, wed_1.predmet1, wed_1.kab1, wed_1.fam1,
                wed_1.start_time2, wed_1.finish_time2, wed_1.predmet2, wed_1.kab2, wed_1.fam2,
                wed_1.start_time3, wed_1.finish_time3, wed_1.predmet3, wed_1.kab3, wed_1.fam3,
                wed_1.start_time4, wed_1.finish_time4, wed_1.predmet4, wed_1.kab4, wed_1.fam4);
        print_thu(thu_1.start_time1, thu_1.finish_time1, thu_1.predmet1, thu_1.kab1, thu_1.fam1,
                thu_1.start_time2, thu_1.finish_time2, thu_1.predmet2, thu_1.kab2, thu_1.fam2,
                thu_1.start_time3, thu_1.finish_time3, thu_1.predmet3, thu_1.kab3, thu_1.fam3,
                thu_1.start_time4, thu_1.finish_time4, thu_1.predmet4, thu_1.kab4, thu_1.fam4);
        print_fri(fri_1.start_time1, fri_1.finish_time1, fri_1.predmet1, fri_1.kab1, fri_1.fam1,
                fri_1.start_time2, fri_1.finish_time2, fri_1.predmet2, fri_1.kab2, fri_1.fam2,
                fri_1.start_time3, fri_1.finish_time3, fri_1.predmet3, fri_1.kab3, fri_1.fam3,
                fri_1.start_time4, fri_1.finish_time4, fri_1.predmet4, fri_1.kab4, fri_1.fam4);
        print_sat(sat_1.start_time1, sat_1.finish_time1, sat_1.predmet1, sat_1.kab1, sat_1.fam1,
                sat_1.start_time2, sat_1.finish_time2, sat_1.predmet2, sat_1.kab2, sat_1.fam2,
                sat_1.start_time3, sat_1.finish_time3, sat_1.predmet3, sat_1.kab3, sat_1.fam3,
                sat_1.start_time4, sat_1.finish_time4, sat_1.predmet4, sat_1.kab4, sat_1.fam4);
    }

    void print_all_2(){
        mTextMon.setText(R.string.mon2);
        mTextTue.setText(R.string.tue2);
        mTextWed.setText(R.string.wed2);
        mTextThu.setText(R.string.thu2);
        mTextFri.setText(R.string.fri2);
        mTextSat.setText(R.string.sat2);

        print_mon(mon_2.start_time1, mon_2.finish_time1, mon_2.predmet1, mon_2.kab1, mon_2.fam1,
                mon_2.start_time2, mon_2.finish_time2, mon_2.predmet2, mon_2.kab2, mon_2.fam2,
                mon_2.start_time3, mon_2.finish_time3, mon_2.predmet3, mon_2.kab3, mon_2.fam3,
                mon_2.start_time4, mon_2.finish_time4, mon_2.predmet4, mon_2.kab4, mon_2.fam4);
        print_tue(tue_2.start_time1, tue_2.finish_time1, tue_2.predmet1, tue_2.kab1, tue_2.fam1,
                tue_2.start_time2, tue_2.finish_time2, tue_2.predmet2, tue_2.kab2, tue_2.fam2,
                tue_2.start_time3, tue_2.finish_time3, tue_2.predmet3, tue_2.kab3, tue_2.fam3,
                tue_2.start_time4, tue_2.finish_time4, tue_2.predmet4, tue_2.kab4, tue_2.fam4);
        print_wed(wed_2.start_time1, wed_2.finish_time1, wed_2.predmet1, wed_2.kab1, wed_2.fam1,
                wed_2.start_time2, wed_2.finish_time2, wed_2.predmet2, wed_2.kab2, wed_2.fam2,
                wed_2.start_time3, wed_2.finish_time3, wed_2.predmet3, wed_2.kab3, wed_2.fam3,
                wed_2.start_time4, wed_2.finish_time4, wed_2.predmet4, wed_2.kab4, wed_2.fam4);
        print_thu(thu_2.start_time1, thu_2.finish_time1, thu_2.predmet1, thu_2.kab1, thu_2.fam1,
                thu_2.start_time2, thu_2.finish_time2, thu_2.predmet2, thu_2.kab2, thu_2.fam2,
                thu_2.start_time3, thu_2.finish_time3, thu_2.predmet3, thu_2.kab3, thu_2.fam3,
                thu_2.start_time4, thu_2.finish_time4, thu_2.predmet4, thu_2.kab4, thu_2.fam4);
        print_fri(fri_2.start_time1, fri_2.finish_time1, fri_2.predmet1, fri_2.kab1, fri_2.fam1,
                fri_2.start_time2, fri_2.finish_time2, fri_2.predmet2, fri_2.kab2, fri_2.fam2,
                fri_2.start_time3, fri_2.finish_time3, fri_2.predmet3, fri_2.kab3, fri_2.fam3,
                fri_2.start_time4, fri_2.finish_time4, fri_2.predmet4, fri_2.kab4, fri_2.fam4);
        print_sat(sat_2.start_time1, sat_2.finish_time1, sat_2.predmet1, sat_2.kab1, sat_2.fam1,
                sat_2.start_time2, sat_2.finish_time2, sat_2.predmet2, sat_2.kab2, sat_2.fam2,
                sat_2.start_time3, sat_2.finish_time3, sat_2.predmet3, sat_2.kab3, sat_2.fam3,
                sat_2.start_time4, sat_2.finish_time4, sat_2.predmet4, sat_2.kab4, sat_2.fam4);
    }


    void print_mon (String start1, String finish1, String predmet1, String kab1, String fam1,
               String start2, String finish2, String predmet2, String kab2, String fam2,
               String start3, String finish3, String predmet3, String kab3, String fam3,
               String start4, String finish4, String predmet4, String kab4, String fam4){


        mTextMonStartTime1.setText(start1);
        mTextMonFinishTime1.setText(finish1);
        mTextMonPredmet1.setText(predmet1);
        mTextMonKab1.setText(kab1);
        mTextMonFam1.setText(fam1);

        mTextMonStartTime2.setText(start2);
        mTextMonFinishTime2.setText(finish2);
        mTextMonPredmet2.setText(predmet2);
        mTextMonKab2.setText(kab2);
        mTextMonFam2.setText(fam2);

        mTextMonStartTime3.setText(start3);
        mTextMonFinishTime3.setText(finish3);
        mTextMonPredmet3.setText(predmet3);
        mTextMonKab3.setText(kab3);
        mTextMonFam3.setText(fam3);

        mTextMonStartTime4.setText(start4);
        mTextMonFinishTime4.setText(finish4);
        mTextMonPredmet4.setText(predmet4);
        mTextMonKab4.setText(kab4);
        mTextMonFam4.setText(fam4);
    }

    void print_tue (String start1, String finish1, String predmet1, String kab1, String fam1,
                    String start2, String finish2, String predmet2, String kab2, String fam2,
                    String start3, String finish3, String predmet3, String kab3, String fam3,
                    String start4, String finish4, String predmet4, String kab4, String fam4){


        mTextTueStartTime1.setText(start1);
        mTextTueFinishTime1.setText(finish1);
        mTextTuePredmet1.setText(predmet1);
        mTextTueKab1.setText(kab1);
        mTextTueFam1.setText(fam1);

        mTextTueStartTime2.setText(start2);
        mTextTueFinishTime2.setText(finish2);
        mTextTuePredmet2.setText(predmet2);
        mTextTueKab2.setText(kab2);
        mTextTueFam2.setText(fam2);

        mTextTueStartTime3.setText(start3);
        mTextTueFinishTime3.setText(finish3);
        mTextTuePredmet3.setText(predmet3);
        mTextTueKab3.setText(kab3);
        mTextTueFam3.setText(fam3);

        mTextTueStartTime4.setText(start4);
        mTextTueFinishTime4.setText(finish4);
        mTextTuePredmet4.setText(predmet4);
        mTextTueKab4.setText(kab4);
        mTextTueFam4.setText(fam4);
    }

    void print_wed (String start1, String finish1, String predmet1, String kab1, String fam1,
                    String start2, String finish2, String predmet2, String kab2, String fam2,
                    String start3, String finish3, String predmet3, String kab3, String fam3,
                    String start4, String finish4, String predmet4, String kab4, String fam4){


        mTextWedStartTime1.setText(start1);
        mTextWedFinishTime1.setText(finish1);
        mTextWedPredmet1.setText(predmet1);
        mTextWedKab1.setText(kab1);
        mTextWedFam1.setText(fam1);

        mTextWedStartTime2.setText(start2);
        mTextWedFinishTime2.setText(finish2);
        mTextWedPredmet2.setText(predmet2);
        mTextWedKab2.setText(kab2);
        mTextWedFam2.setText(fam2);

        mTextWedStartTime3.setText(start3);
        mTextWedFinishTime3.setText(finish3);
        mTextWedPredmet3.setText(predmet3);
        mTextWedKab3.setText(kab3);
        mTextWedFam3.setText(fam3);

        mTextWedStartTime4.setText(start4);
        mTextWedFinishTime4.setText(finish4);
        mTextWedPredmet4.setText(predmet4);
        mTextWedKab4.setText(kab4);
        mTextWedFam4.setText(fam4);
    }

    void print_thu (String start1, String finish1, String predmet1, String kab1, String fam1,
                    String start2, String finish2, String predmet2, String kab2, String fam2,
                    String start3, String finish3, String predmet3, String kab3, String fam3,
                    String start4, String finish4, String predmet4, String kab4, String fam4){


        mTextThuStartTime1.setText(start1);
        mTextThuFinishTime1.setText(finish1);
        mTextThuPredmet1.setText(predmet1);
        mTextThuKab1.setText(kab1);
        mTextThuFam1.setText(fam1);

        mTextThuStartTime2.setText(start2);
        mTextThuFinishTime2.setText(finish2);
        mTextThuPredmet2.setText(predmet2);
        mTextThuKab2.setText(kab2);
        mTextThuFam2.setText(fam2);

        mTextThuStartTime3.setText(start3);
        mTextThuFinishTime3.setText(finish3);
        mTextThuPredmet3.setText(predmet3);
        mTextThuKab3.setText(kab3);
        mTextThuFam3.setText(fam3);

        mTextThuStartTime4.setText(start4);
        mTextThuFinishTime4.setText(finish4);
        mTextThuPredmet4.setText(predmet4);
        mTextThuKab4.setText(kab4);
        mTextThuFam4.setText(fam4);
    }

    void print_fri (String start1, String finish1, String predmet1, String kab1, String fam1,
                    String start2, String finish2, String predmet2, String kab2, String fam2,
                    String start3, String finish3, String predmet3, String kab3, String fam3,
                    String start4, String finish4, String predmet4, String kab4, String fam4){


        mTextFriStartTime1.setText(start1);
        mTextFriFinishTime1.setText(finish1);
        mTextFriPredmet1.setText(predmet1);
        mTextFriKab1.setText(kab1);
        mTextFriFam1.setText(fam1);

        mTextFriStartTime2.setText(start2);
        mTextFriFinishTime2.setText(finish2);
        mTextFriPredmet2.setText(predmet2);
        mTextFriKab2.setText(kab2);
        mTextFriFam2.setText(fam2);

        mTextFriStartTime3.setText(start3);
        mTextFriFinishTime3.setText(finish3);
        mTextFriPredmet3.setText(predmet3);
        mTextFriKab3.setText(kab3);
        mTextFriFam3.setText(fam3);

        mTextFriStartTime4.setText(start4);
        mTextFriFinishTime4.setText(finish4);
        mTextFriPredmet4.setText(predmet4);
        mTextFriKab4.setText(kab4);
        mTextFriFam4.setText(fam4);
    }

    void print_sat (String start1, String finish1, String predmet1, String kab1, String fam1,
                    String start2, String finish2, String predmet2, String kab2, String fam2,
                    String start3, String finish3, String predmet3, String kab3, String fam3,
                    String start4, String finish4, String predmet4, String kab4, String fam4){

        mTextSatStartTime1.setText(start1);
        mTextSatFinishTime1.setText(finish1);
        mTextSatPredmet1.setText(predmet1);
        mTextSatKab1.setText(kab1);
        mTextSatFam1.setText(fam1);

        mTextSatStartTime2.setText(start2);
        mTextSatFinishTime2.setText(finish2);
        mTextSatPredmet2.setText(predmet2);
        mTextSatKab2.setText(kab2);
        mTextSatFam2.setText(fam2);

        mTextSatStartTime3.setText(start3);
        mTextSatFinishTime3.setText(finish3);
        mTextSatPredmet3.setText(predmet3);
        mTextSatKab3.setText(kab3);
        mTextSatFam3.setText(fam3);

        mTextSatStartTime4.setText(start4);
        mTextSatFinishTime4.setText(finish4);
        mTextSatPredmet4.setText(predmet4);
        mTextSatKab4.setText(kab4);
        mTextSatFam4.setText(fam4);
    }

//подгрузка данных
    String loadText(String name) {
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        return sPref.getString(name, "");
//        mon_1.fam1 = SAVED_TEXT;
       // Toast.makeText(this, "nu a zdes"+ sPref.getString(SAVED_TEXT, ""), Toast.LENGTH_SHORT).show();
    }


    private void loadWeek1() {
        mon_1.start_time1 = loadText(EditActivity.mon_1_p1_time_start);
        mon_1.finish_time1 = loadText(EditActivity.mon_1_p1_time_finish);
        mon_1.predmet1 = loadText(EditActivity.mon_1_p1_predmet);
        mon_1.kab1 = loadText(EditActivity.mon_1_p1_kab);
        mon_1.fam1 = loadText(EditActivity.mon_1_p1_fam);

        mon_1.start_time2 = loadText(EditActivity.mon_1_p2_time_start);
        mon_1.finish_time2 = loadText(EditActivity.mon_1_p2_time_finish);
        mon_1.predmet2 = loadText(EditActivity.mon_1_p2_predmet);
        mon_1.kab2 = loadText(EditActivity.mon_1_p2_kab);
        mon_1.fam2 = loadText(EditActivity.mon_1_p2_fam);

        mon_1.start_time3 = loadText(EditActivity.mon_1_p3_time_start);
        mon_1.finish_time3 = loadText(EditActivity.mon_1_p3_time_finish);
        mon_1.predmet3 = loadText(EditActivity.mon_1_p3_predmet);
        mon_1.kab3 = loadText(EditActivity.mon_1_p3_kab);
        mon_1.fam3 = loadText(EditActivity.mon_1_p3_fam);

        mon_1.start_time4 = loadText(EditActivity.mon_1_p4_time_start);
        mon_1.finish_time4 = loadText(EditActivity.mon_1_p4_time_finish);
        mon_1.predmet4 = loadText(EditActivity.mon_1_p4_predmet);
        mon_1.kab4 = loadText(EditActivity.mon_1_p4_kab);
        mon_1.fam4 = loadText(EditActivity.mon_1_p4_fam);



        tue_1.start_time1 = loadText(EditActivity.tue_1_p1_time_start);
        tue_1.finish_time1 = loadText(EditActivity.tue_1_p1_time_finish);
        tue_1.predmet1 = loadText(EditActivity.tue_1_p1_predmet);
        tue_1.kab1 = loadText(EditActivity.tue_1_p1_kab);
        tue_1.fam1 = loadText(EditActivity.tue_1_p1_fam);

        tue_1.start_time2 = loadText(EditActivity.tue_1_p2_time_start);
        tue_1.finish_time2 = loadText(EditActivity.tue_1_p2_time_finish);
        tue_1.predmet2 = loadText(EditActivity.tue_1_p2_predmet);
        tue_1.kab2 = loadText(EditActivity.tue_1_p2_kab);
        tue_1.fam2 = loadText(EditActivity.tue_1_p2_fam);

        tue_1.start_time3 = loadText(EditActivity.tue_1_p3_time_start);
        tue_1.finish_time3 = loadText(EditActivity.tue_1_p3_time_finish);
        tue_1.predmet3 = loadText(EditActivity.tue_1_p3_predmet);
        tue_1.kab3 = loadText(EditActivity.tue_1_p3_kab);
        tue_1.fam3 = loadText(EditActivity.tue_1_p3_fam);

        tue_1.start_time4 = loadText(EditActivity.tue_1_p4_time_start);
        tue_1.finish_time4 = loadText(EditActivity.tue_1_p4_time_finish);
        tue_1.predmet4 = loadText(EditActivity.tue_1_p4_predmet);
        tue_1.kab4 = loadText(EditActivity.tue_1_p4_kab);
        tue_1.fam4 = loadText(EditActivity.tue_1_p4_fam);



        wed_1.start_time1 = loadText(EditActivity.wed_1_p1_time_start);
        wed_1.finish_time1 = loadText(EditActivity.wed_1_p1_time_finish);
        wed_1.predmet1 = loadText(EditActivity.wed_1_p1_predmet);
        wed_1.kab1 = loadText(EditActivity.wed_1_p1_kab);
        wed_1.fam1 = loadText(EditActivity.wed_1_p1_fam);

        wed_1.start_time2 = loadText(EditActivity.wed_1_p2_time_start);
        wed_1.finish_time2 = loadText(EditActivity.wed_1_p2_time_finish);
        wed_1.predmet2 = loadText(EditActivity.wed_1_p2_predmet);
        wed_1.kab2 = loadText(EditActivity.wed_1_p2_kab);
        wed_1.fam2 = loadText(EditActivity.wed_1_p2_fam);

        wed_1.start_time3 = loadText(EditActivity.wed_1_p3_time_start);
        wed_1.finish_time3 = loadText(EditActivity.wed_1_p3_time_finish);
        wed_1.predmet3 = loadText(EditActivity.wed_1_p3_predmet);
        wed_1.kab3 = loadText(EditActivity.wed_1_p3_kab);
        wed_1.fam3 = loadText(EditActivity.wed_1_p3_fam);

        wed_1.start_time4 = loadText(EditActivity.wed_1_p4_time_start);
        wed_1.finish_time4 = loadText(EditActivity.wed_1_p4_time_finish);
        wed_1.predmet4 = loadText(EditActivity.wed_1_p4_predmet);
        wed_1.kab4 = loadText(EditActivity.wed_1_p4_kab);
        wed_1.fam4 = loadText(EditActivity.wed_1_p4_fam);



        thu_1.start_time1 = loadText(EditActivity.thu_1_p1_time_start);
        thu_1.finish_time1 = loadText(EditActivity.thu_1_p1_time_finish);
        thu_1.predmet1 = loadText(EditActivity.thu_1_p1_predmet);
        thu_1.kab1 = loadText(EditActivity.thu_1_p1_kab);
        thu_1.fam1 = loadText(EditActivity.thu_1_p1_fam);

        thu_1.start_time2 = loadText(EditActivity.thu_1_p2_time_start);
        thu_1.finish_time2 = loadText(EditActivity.thu_1_p2_time_finish);
        thu_1.predmet2 = loadText(EditActivity.thu_1_p2_predmet);
        thu_1.kab2 = loadText(EditActivity.thu_1_p2_kab);
        thu_1.fam2 = loadText(EditActivity.thu_1_p2_fam);

        thu_1.start_time3 = loadText(EditActivity.thu_1_p3_time_start);
        thu_1.finish_time3 = loadText(EditActivity.thu_1_p3_time_finish);
        thu_1.predmet3 = loadText(EditActivity.thu_1_p3_predmet);
        thu_1.kab3 = loadText(EditActivity.thu_1_p3_kab);
        thu_1.fam3 = loadText(EditActivity.thu_1_p3_fam);

        thu_1.start_time4 = loadText(EditActivity.thu_1_p4_time_start);
        thu_1.finish_time4 = loadText(EditActivity.thu_1_p4_time_finish);
        thu_1.predmet4 = loadText(EditActivity.thu_1_p4_predmet);
        thu_1.kab4 = loadText(EditActivity.thu_1_p4_kab);
        thu_1.fam4 = loadText(EditActivity.thu_1_p4_fam);



        fri_1.start_time1 = loadText(EditActivity.fri_1_p1_time_start);
        fri_1.finish_time1 = loadText(EditActivity.fri_1_p1_time_finish);
        fri_1.predmet1 = loadText(EditActivity.fri_1_p1_predmet);
        fri_1.kab1 = loadText(EditActivity.fri_1_p1_kab);
        fri_1.fam1 = loadText(EditActivity.fri_1_p1_fam);

        fri_1.start_time2 = loadText(EditActivity.fri_1_p2_time_start);
        fri_1.finish_time2 = loadText(EditActivity.fri_1_p2_time_finish);
        fri_1.predmet2 = loadText(EditActivity.fri_1_p2_predmet);
        fri_1.kab2 = loadText(EditActivity.fri_1_p2_kab);
        fri_1.fam2 = loadText(EditActivity.fri_1_p2_fam);

        fri_1.start_time3 = loadText(EditActivity.fri_1_p3_time_start);
        fri_1.finish_time3 = loadText(EditActivity.fri_1_p3_time_finish);
        fri_1.predmet3 = loadText(EditActivity.fri_1_p3_predmet);
        fri_1.kab3 = loadText(EditActivity.fri_1_p3_kab);
        fri_1.fam3 = loadText(EditActivity.fri_1_p3_fam);

        fri_1.start_time4 = loadText(EditActivity.fri_1_p4_time_start);
        fri_1.finish_time4 = loadText(EditActivity.fri_1_p4_time_finish);
        fri_1.predmet4 = loadText(EditActivity.fri_1_p4_predmet);
        fri_1.kab4 = loadText(EditActivity.fri_1_p4_kab);
        fri_1.fam4 = loadText(EditActivity.fri_1_p4_fam);



        sat_1.start_time1 = loadText(EditActivity.sat_1_p1_time_start);
        sat_1.finish_time1 = loadText(EditActivity.sat_1_p1_time_finish);
        sat_1.predmet1 = loadText(EditActivity.sat_1_p1_predmet);
        sat_1.kab1 = loadText(EditActivity.sat_1_p1_kab);
        sat_1.fam1 = loadText(EditActivity.sat_1_p1_fam);

        sat_1.start_time2 = loadText(EditActivity.sat_1_p2_time_start);
        sat_1.finish_time2 = loadText(EditActivity.sat_1_p2_time_finish);
        sat_1.predmet2 = loadText(EditActivity.sat_1_p2_predmet);
        sat_1.kab2 = loadText(EditActivity.sat_1_p2_kab);
        sat_1.fam2 = loadText(EditActivity.sat_1_p2_fam);

        sat_1.start_time3 = loadText(EditActivity.sat_1_p3_time_start);
        sat_1.finish_time3 = loadText(EditActivity.sat_1_p3_time_finish);
        sat_1.predmet3 = loadText(EditActivity.sat_1_p3_predmet);
        sat_1.kab3 = loadText(EditActivity.sat_1_p3_kab);
        sat_1.fam3 = loadText(EditActivity.sat_1_p3_fam);

        sat_1.start_time4 = loadText(EditActivity.sat_1_p4_time_start);
        sat_1.finish_time4 = loadText(EditActivity.sat_1_p4_time_finish);
        sat_1.predmet4 = loadText(EditActivity.sat_1_p4_predmet);
        sat_1.kab4 = loadText(EditActivity.sat_1_p4_kab);
        sat_1.fam4 = loadText(EditActivity.sat_1_p4_fam);
    }

    private void loadWeek2() {
        mon_2.start_time1 = loadText(EditActivity.mon_2_p1_time_start);
        mon_2.finish_time1 = loadText(EditActivity.mon_2_p1_time_finish);
        mon_2.predmet1 = loadText(EditActivity.mon_2_p1_predmet);
        mon_2.kab1 = loadText(EditActivity.mon_2_p1_kab);
        mon_2.fam1 = loadText(EditActivity.mon_2_p1_fam);

        mon_2.start_time2 = loadText(EditActivity.mon_2_p2_time_start);
        mon_2.finish_time2 = loadText(EditActivity.mon_2_p2_time_finish);
        mon_2.predmet2 = loadText(EditActivity.mon_2_p2_predmet);
        mon_2.kab2 = loadText(EditActivity.mon_2_p2_kab);
        mon_2.fam2 = loadText(EditActivity.mon_2_p2_fam);

        mon_2.start_time3 = loadText(EditActivity.mon_2_p3_time_start);
        mon_2.finish_time3 = loadText(EditActivity.mon_2_p3_time_finish);
        mon_2.predmet3 = loadText(EditActivity.mon_2_p3_predmet);
        mon_2.kab3 = loadText(EditActivity.mon_2_p3_kab);
        mon_2.fam3 = loadText(EditActivity.mon_2_p3_fam);

        mon_2.start_time4 = loadText(EditActivity.mon_2_p4_time_start);
        mon_2.finish_time4 = loadText(EditActivity.mon_2_p4_time_finish);
        mon_2.predmet4 = loadText(EditActivity.mon_2_p4_predmet);
        mon_2.kab4 = loadText(EditActivity.mon_2_p4_kab);
        mon_2.fam4 = loadText(EditActivity.mon_2_p4_fam);



        tue_2.start_time1 = loadText(EditActivity.tue_2_p1_time_start);
        tue_2.finish_time1 = loadText(EditActivity.tue_2_p1_time_finish);
        tue_2.predmet1 = loadText(EditActivity.tue_2_p1_predmet);
        tue_2.kab1 = loadText(EditActivity.tue_2_p1_kab);
        tue_2.fam1 = loadText(EditActivity.tue_2_p1_fam);

        tue_2.start_time2 = loadText(EditActivity.tue_2_p2_time_start);
        tue_2.finish_time2 = loadText(EditActivity.tue_2_p2_time_finish);
        tue_2.predmet2 = loadText(EditActivity.tue_2_p2_predmet);
        tue_2.kab2 = loadText(EditActivity.tue_2_p2_kab);
        tue_2.fam2 = loadText(EditActivity.tue_2_p2_fam);

        tue_2.start_time3 = loadText(EditActivity.tue_2_p3_time_start);
        tue_2.finish_time3 = loadText(EditActivity.tue_2_p3_time_finish);
        tue_2.predmet3 = loadText(EditActivity.tue_2_p3_predmet);
        tue_2.kab3 = loadText(EditActivity.tue_2_p3_kab);
        tue_2.fam3 = loadText(EditActivity.tue_2_p3_fam);

        tue_2.start_time4 = loadText(EditActivity.tue_2_p4_time_start);
        tue_2.finish_time4 = loadText(EditActivity.tue_2_p4_time_finish);
        tue_2.predmet4 = loadText(EditActivity.tue_2_p4_predmet);
        tue_2.kab4 = loadText(EditActivity.tue_2_p4_kab);
        tue_2.fam4 = loadText(EditActivity.tue_2_p4_fam);



        wed_2.start_time1 = loadText(EditActivity.wed_2_p1_time_start);
        wed_2.finish_time1 = loadText(EditActivity.wed_2_p1_time_finish);
        wed_2.predmet1 = loadText(EditActivity.wed_2_p1_predmet);
        wed_2.kab1 = loadText(EditActivity.wed_2_p1_kab);
        wed_2.fam1 = loadText(EditActivity.wed_2_p1_fam);

        wed_2.start_time2 = loadText(EditActivity.wed_2_p2_time_start);
        wed_2.finish_time2 = loadText(EditActivity.wed_2_p2_time_finish);
        wed_2.predmet2 = loadText(EditActivity.wed_2_p2_predmet);
        wed_2.kab2 = loadText(EditActivity.wed_2_p2_kab);
        wed_2.fam2 = loadText(EditActivity.wed_2_p2_fam);

        wed_2.start_time3 = loadText(EditActivity.wed_2_p3_time_start);
        wed_2.finish_time3 = loadText(EditActivity.wed_2_p3_time_finish);
        wed_2.predmet3 = loadText(EditActivity.wed_2_p3_predmet);
        wed_2.kab3 = loadText(EditActivity.wed_2_p3_kab);
        wed_2.fam3 = loadText(EditActivity.wed_2_p3_fam);

        wed_2.start_time4 = loadText(EditActivity.wed_2_p4_time_start);
        wed_2.finish_time4 = loadText(EditActivity.wed_2_p4_time_finish);
        wed_2.predmet4 = loadText(EditActivity.wed_2_p4_predmet);
        wed_2.kab4 = loadText(EditActivity.wed_2_p4_kab);
        wed_2.fam4 = loadText(EditActivity.wed_2_p4_fam);



        thu_2.start_time1 = loadText(EditActivity.thu_2_p1_time_start);
        thu_2.finish_time1 = loadText(EditActivity.thu_2_p1_time_finish);
        thu_2.predmet1 = loadText(EditActivity.thu_2_p1_predmet);
        thu_2.kab1 = loadText(EditActivity.thu_2_p1_kab);
        thu_2.fam1 = loadText(EditActivity.thu_2_p1_fam);

        thu_2.start_time2 = loadText(EditActivity.thu_2_p2_time_start);
        thu_2.finish_time2 = loadText(EditActivity.thu_2_p2_time_finish);
        thu_2.predmet2 = loadText(EditActivity.thu_2_p2_predmet);
        thu_2.kab2 = loadText(EditActivity.thu_2_p2_kab);
        thu_2.fam2 = loadText(EditActivity.thu_2_p2_fam);

        thu_2.start_time3 = loadText(EditActivity.thu_2_p3_time_start);
        thu_2.finish_time3 = loadText(EditActivity.thu_2_p3_time_finish);
        thu_2.predmet3 = loadText(EditActivity.thu_2_p3_predmet);
        thu_2.kab3 = loadText(EditActivity.thu_2_p3_kab);
        thu_2.fam3 = loadText(EditActivity.thu_2_p3_fam);

        thu_2.start_time4 = loadText(EditActivity.thu_2_p4_time_start);
        thu_2.finish_time4 = loadText(EditActivity.thu_2_p4_time_finish);
        thu_2.predmet4 = loadText(EditActivity.thu_2_p4_predmet);
        thu_2.kab4 = loadText(EditActivity.thu_2_p4_kab);
        thu_2.fam4 = loadText(EditActivity.thu_2_p4_fam);



        fri_2.start_time1 = loadText(EditActivity.fri_2_p1_time_start);
        fri_2.finish_time1 = loadText(EditActivity.fri_2_p1_time_finish);
        fri_2.predmet1 = loadText(EditActivity.fri_2_p1_predmet);
        fri_2.kab1 = loadText(EditActivity.fri_2_p1_kab);
        fri_2.fam1 = loadText(EditActivity.fri_2_p1_fam);

        fri_2.start_time2 = loadText(EditActivity.fri_2_p2_time_start);
        fri_2.finish_time2 = loadText(EditActivity.fri_2_p2_time_finish);
        fri_2.predmet2 = loadText(EditActivity.fri_2_p2_predmet);
        fri_2.kab2 = loadText(EditActivity.fri_2_p2_kab);
        fri_2.fam2 = loadText(EditActivity.fri_2_p2_fam);

        fri_2.start_time3 = loadText(EditActivity.fri_2_p3_time_start);
        fri_2.finish_time3 = loadText(EditActivity.fri_2_p3_time_finish);
        fri_2.predmet3 = loadText(EditActivity.fri_2_p3_predmet);
        fri_2.kab3 = loadText(EditActivity.fri_2_p3_kab);
        fri_2.fam3 = loadText(EditActivity.fri_2_p3_fam);

        fri_2.start_time4 = loadText(EditActivity.fri_2_p4_time_start);
        fri_2.finish_time4 = loadText(EditActivity.fri_2_p4_time_finish);
        fri_2.predmet4 = loadText(EditActivity.fri_2_p4_predmet);
        fri_2.kab4 = loadText(EditActivity.fri_2_p4_kab);
        fri_2.fam4 = loadText(EditActivity.fri_2_p4_fam);



        sat_2.start_time1 = loadText(EditActivity.sat_2_p1_time_start);
        sat_2.finish_time1 = loadText(EditActivity.sat_2_p1_time_finish);
        sat_2.predmet1 = loadText(EditActivity.sat_2_p1_predmet);
        sat_2.kab1 = loadText(EditActivity.sat_2_p1_kab);
        sat_2.fam1 = loadText(EditActivity.sat_2_p1_fam);

        sat_2.start_time2 = loadText(EditActivity.sat_2_p2_time_start);
        sat_2.finish_time2 = loadText(EditActivity.sat_2_p2_time_finish);
        sat_2.predmet2 = loadText(EditActivity.sat_2_p2_predmet);
        sat_2.kab2 = loadText(EditActivity.sat_2_p2_kab);
        sat_2.fam2 = loadText(EditActivity.sat_2_p2_fam);

        sat_2.start_time3 = loadText(EditActivity.sat_2_p3_time_start);
        sat_2.finish_time3 = loadText(EditActivity.sat_2_p3_time_finish);
        sat_2.predmet3 = loadText(EditActivity.sat_2_p3_predmet);
        sat_2.kab3 = loadText(EditActivity.sat_2_p3_kab);
        sat_2.fam3 = loadText(EditActivity.sat_2_p3_fam);

        sat_2.start_time4 = loadText(EditActivity.sat_2_p4_time_start);
        sat_2.finish_time4 = loadText(EditActivity.sat_2_p4_time_finish);
        sat_2.predmet4 = loadText(EditActivity.sat_2_p4_predmet);
        sat_2.kab4 = loadText(EditActivity.sat_2_p4_kab);
        sat_2.fam4 = loadText(EditActivity.sat_2_p4_fam);
    }


//
//    void saveText() {
//        mEdAct.sPref = getPreferences(MODE_PRIVATE);
//        SharedPreferences.Editor ed = mEdAct.sPref.edit();
//        ed.putString(mEdAct.SAVED_TEXT, EditActivity.p1_fam.getText().toString());
//        ed.apply();
////        Toast.makeText(this, SAVED_TEXT, Toast.LENGTH_SHORT).show();
//
//    }

//подгрузка размера шрифтов
    void loadTimeSize(int size){
        mTextMonStartTime1.setTextSize(size);
        mTextMonStartTime2.setTextSize(size);
        mTextMonStartTime3.setTextSize(size);
        mTextMonStartTime4.setTextSize(size);
        mTextMonFinishTime1.setTextSize(size);
        mTextMonFinishTime2.setTextSize(size);
        mTextMonFinishTime3.setTextSize(size);
        mTextMonFinishTime4.setTextSize(size);

        mTextTueStartTime1.setTextSize(size);
        mTextTueStartTime2.setTextSize(size);
        mTextTueStartTime3.setTextSize(size);
        mTextTueStartTime4.setTextSize(size);
        mTextTueFinishTime1.setTextSize(size);
        mTextTueFinishTime2.setTextSize(size);
        mTextTueFinishTime3.setTextSize(size);
        mTextTueFinishTime4.setTextSize(size);

        mTextWedStartTime1.setTextSize(size);
        mTextWedStartTime2.setTextSize(size);
        mTextWedStartTime3.setTextSize(size);
        mTextWedStartTime4.setTextSize(size);
        mTextWedFinishTime1.setTextSize(size);
        mTextWedFinishTime2.setTextSize(size);
        mTextWedFinishTime3.setTextSize(size);
        mTextWedFinishTime4.setTextSize(size);

        mTextThuStartTime1.setTextSize(size);
        mTextThuStartTime2.setTextSize(size);
        mTextThuStartTime3.setTextSize(size);
        mTextThuStartTime4.setTextSize(size);
        mTextThuFinishTime1.setTextSize(size);
        mTextThuFinishTime2.setTextSize(size);
        mTextThuFinishTime3.setTextSize(size);
        mTextThuFinishTime4.setTextSize(size);

        mTextFriStartTime1.setTextSize(size);
        mTextFriStartTime2.setTextSize(size);
        mTextFriStartTime3.setTextSize(size);
        mTextFriStartTime4.setTextSize(size);
        mTextFriFinishTime1.setTextSize(size);
        mTextFriFinishTime2.setTextSize(size);
        mTextFriFinishTime3.setTextSize(size);
        mTextFriFinishTime4.setTextSize(size);

        mTextSatStartTime1.setTextSize(size);
        mTextSatStartTime2.setTextSize(size);
        mTextSatStartTime3.setTextSize(size);
        mTextSatStartTime4.setTextSize(size);
        mTextSatFinishTime1.setTextSize(size);
        mTextSatFinishTime2.setTextSize(size);
        mTextSatFinishTime3.setTextSize(size);
        mTextSatFinishTime4.setTextSize(size);

    }


    private void loadPredmetSize(int size) {
        mTextMonPredmet1.setTextSize(size);
        mTextMonPredmet2.setTextSize(size);
        mTextMonPredmet3.setTextSize(size);
        mTextMonPredmet4.setTextSize(size);
        mTextTuePredmet1.setTextSize(size);
        mTextTuePredmet2.setTextSize(size);
        mTextTuePredmet3.setTextSize(size);
        mTextTuePredmet4.setTextSize(size);
        mTextWedPredmet1.setTextSize(size);
        mTextWedPredmet2.setTextSize(size);
        mTextWedPredmet3.setTextSize(size);
        mTextWedPredmet4.setTextSize(size);
        mTextThuPredmet1.setTextSize(size);
        mTextThuPredmet2.setTextSize(size);
        mTextThuPredmet3.setTextSize(size);
        mTextThuPredmet4.setTextSize(size);
        mTextFriPredmet1.setTextSize(size);
        mTextFriPredmet2.setTextSize(size);
        mTextFriPredmet3.setTextSize(size);
        mTextFriPredmet4.setTextSize(size);
        mTextSatPredmet1.setTextSize(size);
        mTextSatPredmet2.setTextSize(size);
        mTextSatPredmet3.setTextSize(size);
        mTextSatPredmet4.setTextSize(size);

    }

    private void loadKabSize(int size) {
        mTextMonKab1.setTextSize(size);
        mTextMonKab2.setTextSize(size);
        mTextMonKab3.setTextSize(size);
        mTextMonKab4.setTextSize(size);
        mTextTueKab1.setTextSize(size);
        mTextTueKab2.setTextSize(size);
        mTextTueKab3.setTextSize(size);
        mTextTueKab4.setTextSize(size);
        mTextWedKab1.setTextSize(size);
        mTextWedKab2.setTextSize(size);
        mTextWedKab3.setTextSize(size);
        mTextWedKab4.setTextSize(size);
        mTextThuKab1.setTextSize(size);
        mTextThuKab2.setTextSize(size);
        mTextThuKab3.setTextSize(size);
        mTextThuKab4.setTextSize(size);
        mTextFriKab1.setTextSize(size);
        mTextFriKab2.setTextSize(size);
        mTextFriKab3.setTextSize(size);
        mTextFriKab4.setTextSize(size);
        mTextSatKab1.setTextSize(size);
        mTextSatKab2.setTextSize(size);
        mTextSatKab3.setTextSize(size);
        mTextSatKab4.setTextSize(size);

    }

    private void loadFamSize(int size) {
        mTextMonFam1.setTextSize(size);
        mTextMonFam2.setTextSize(size);
        mTextMonFam3.setTextSize(size);
        mTextMonFam4.setTextSize(size);
        mTextTueFam1.setTextSize(size);
        mTextTueFam2.setTextSize(size);
        mTextTueFam3.setTextSize(size);
        mTextTueFam4.setTextSize(size);
        mTextWedFam1.setTextSize(size);
        mTextWedFam2.setTextSize(size);
        mTextWedFam3.setTextSize(size);
        mTextWedFam4.setTextSize(size);
        mTextThuFam1.setTextSize(size);
        mTextThuFam2.setTextSize(size);
        mTextThuFam3.setTextSize(size);
        mTextThuFam4.setTextSize(size);
        mTextFriFam1.setTextSize(size);
        mTextFriFam2.setTextSize(size);
        mTextFriFam3.setTextSize(size);
        mTextFriFam4.setTextSize(size);
        mTextSatFam1.setTextSize(size);
        mTextSatFam2.setTextSize(size);
        mTextSatFam3.setTextSize(size);
        mTextSatFam4.setTextSize(size);

    }


}
