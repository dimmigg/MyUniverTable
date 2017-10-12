package com.dimka.myunivertable;

import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class EditActivity extends AppCompatActivity {
    private static long back_pressed;  //закртыие по двойному НАЗАД

    Button save;
    Button close;

    int a = 0; // костыль для сохранения

    Button mMo;
    Button mTu;
    Button mWe;
    Button mTh;
    Button mFr;
    Button mSa;

    EditText p1_predmet;
    EditText p1_fam;
    EditText p1_kab;
    EditText p1_time_start;
    EditText p1_time_finish;
    EditText p2_predmet;
    EditText p2_fam;
    EditText p2_kab;
    EditText p2_time_start;
    EditText p2_time_finish;
    EditText p3_predmet;
    EditText p3_fam;
    EditText p3_kab;
    EditText p3_time_start;
    EditText p3_time_finish;
    EditText p4_predmet;
    EditText p4_fam;
    EditText p4_kab;
    EditText p4_time_start;
    EditText p4_time_finish;

    CheckBox mChkBox; //Чекбокс какая неделя
    TextView mDay;


    static SharedPreferences sPref;

    String mon1 = "ПОНЕДЕЛЬНИК (1)";
    String tue1 = "ВТОРНИК (1)";
    String wed1 = "СРЕДА (1)";
    String thu1 = "ЧЕТВЕРГ (1)";
    String fri1 = "ПЯТНИЦА (1)";
    String sat1 = "СУББОТА (1)";

    String mon2 = "ПОНЕДЕЛЬНИК (2)";
    String tue2 = "ВТОРНИК (2)";
    String wed2 = "СРЕДА (2)";
    String thu2 = "ЧЕТВЕРГ (2)";
    String fri2 = "ПЯТНИЦА (2)";
    String sat2 = "СУББОТА (2)";

    final static String mon_1_p1_time_start = "mon_1_p1_time_start";
    final static String tue_1_p1_time_start = "tue_1_p1_time_start";
    final static String wed_1_p1_time_start = "wed_1_p1_time_start";
    final static String thu_1_p1_time_start = "thu_1_p1_time_start";
    final static String fri_1_p1_time_start = "fri_1_p1_time_start";
    final static String sat_1_p1_time_start = "sat_1_p1_time_start";

    final static String mon_1_p1_time_finish = "mon_1_p1_time_finish";
    final static String tue_1_p1_time_finish = "tue_1_p1_time_finish";
    final static String wed_1_p1_time_finish = "wed_1_p1_time_finish";
    final static String thu_1_p1_time_finish = "thu_1_p1_time_finish";
    final static String fri_1_p1_time_finish = "fri_1_p1_time_finish";
    final static String sat_1_p1_time_finish = "sat_1_p1_time_finish";

    final static String mon_1_p1_predmet = "mon_1_p1_predmet";
    final static String tue_1_p1_predmet = "tue_1_p1_predmet";
    final static String wed_1_p1_predmet = "wed_1_p1_predmet";
    final static String thu_1_p1_predmet = "thu_1_p1_predmet";
    final static String fri_1_p1_predmet = "fri_1_p1_predmet";
    final static String sat_1_p1_predmet = "sat_1_p1_predmet";

    final static String mon_1_p1_kab = "mon_1_p1_time_kab";
    final static String tue_1_p1_kab = "tue_1_p1_time_kab";
    final static String wed_1_p1_kab = "wed_1_p1_time_kab";
    final static String thu_1_p1_kab = "thu_1_p1_time_kab";
    final static String fri_1_p1_kab = "fri_1_p1_time_kab";
    final static String sat_1_p1_kab = "sat_1_p1_time_kab";

    final static String mon_1_p1_fam = "mon_1_p1_time_fam";
    final static String tue_1_p1_fam = "tue_1_p1_time_fam";
    final static String wed_1_p1_fam = "wed_1_p1_time_fam";
    final static String thu_1_p1_fam = "thu_1_p1_time_fam";
    final static String fri_1_p1_fam = "fri_1_p1_time_fam";
    final static String sat_1_p1_fam = "sat_1_p1_time_fam";

    final static String mon_1_p2_time_start = "mon_1_p2_time_start";
    final static String tue_1_p2_time_start = "tue_1_p2_time_start";
    final static String wed_1_p2_time_start = "wed_1_p2_time_start";
    final static String thu_1_p2_time_start = "thu_1_p2_time_start";
    final static String fri_1_p2_time_start = "fri_1_p2_time_start";
    final static String sat_1_p2_time_start = "sat_1_p2_time_start";

    final static String mon_1_p2_time_finish = "mon_1_p2_time_finish";
    final static String tue_1_p2_time_finish = "tue_1_p2_time_finish";
    final static String wed_1_p2_time_finish = "wed_1_p2_time_finish";
    final static String thu_1_p2_time_finish = "thu_1_p2_time_finish";
    final static String fri_1_p2_time_finish = "fri_1_p2_time_finish";
    final static String sat_1_p2_time_finish = "sat_1_p2_time_finish";

    final static String mon_1_p2_predmet = "mon_1_p2_predmet";
    final static String tue_1_p2_predmet = "tue_1_p2_predmet";
    final static String wed_1_p2_predmet = "wed_1_p2_predmet";
    final static String thu_1_p2_predmet = "thu_1_p2_predmet";
    final static String fri_1_p2_predmet = "fri_1_p2_predmet";
    final static String sat_1_p2_predmet = "sat_1_p2_predmet";

    final static String mon_1_p2_kab = "mon_1_p2_time_kab";
    final static String tue_1_p2_kab = "tue_1_p2_time_kab";
    final static String wed_1_p2_kab = "wed_1_p2_time_kab";
    final static String thu_1_p2_kab = "thu_1_p2_time_kab";
    final static String fri_1_p2_kab = "fri_1_p2_time_kab";
    final static String sat_1_p2_kab = "sat_1_p2_time_kab";

    final static String mon_1_p2_fam = "mon_1_p2_time_fam";
    final static String tue_1_p2_fam = "tue_1_p2_time_fam";
    final static String wed_1_p2_fam = "wed_1_p2_time_fam";
    final static String thu_1_p2_fam = "thu_1_p2_time_fam";
    final static String fri_1_p2_fam = "fri_1_p2_time_fam";
    final static String sat_1_p2_fam = "sat_1_p2_time_fam";

    final static String mon_1_p3_time_start = "mon_1_p3_time_start";
    final static String tue_1_p3_time_start = "tue_1_p3_time_start";
    final static String wed_1_p3_time_start = "wed_1_p3_time_start";
    final static String thu_1_p3_time_start = "thu_1_p3_time_start";
    final static String fri_1_p3_time_start = "fri_1_p3_time_start";
    final static String sat_1_p3_time_start = "sat_1_p3_time_start";

    final static String mon_1_p3_time_finish = "mon_1_p3_time_finish";
    final static String tue_1_p3_time_finish = "tue_1_p3_time_finish";
    final static String wed_1_p3_time_finish = "wed_1_p3_time_finish";
    final static String thu_1_p3_time_finish = "thu_1_p3_time_finish";
    final static String fri_1_p3_time_finish = "fri_1_p3_time_finish";
    final static String sat_1_p3_time_finish = "sat_1_p3_time_finish";

    final static String mon_1_p3_predmet = "mon_1_p3_predmet";
    final static String tue_1_p3_predmet = "tue_1_p3_predmet";
    final static String wed_1_p3_predmet = "wed_1_p3_predmet";
    final static String thu_1_p3_predmet = "thu_1_p3_predmet";
    final static String fri_1_p3_predmet = "fri_1_p3_predmet";
    final static String sat_1_p3_predmet = "sat_1_p3_predmet";

    final static String mon_1_p3_kab = "mon_1_p3_time_kab";
    final static String tue_1_p3_kab = "tue_1_p3_time_kab";
    final static String wed_1_p3_kab = "wed_1_p3_time_kab";
    final static String thu_1_p3_kab = "thu_1_p3_time_kab";
    final static String fri_1_p3_kab = "fri_1_p3_time_kab";
    final static String sat_1_p3_kab = "sat_1_p3_time_kab";

    final static String mon_1_p3_fam = "mon_1_p3_time_fam";
    final static String tue_1_p3_fam = "tue_1_p3_time_fam";
    final static String wed_1_p3_fam = "wed_1_p3_time_fam";
    final static String thu_1_p3_fam = "thu_1_p3_time_fam";
    final static String fri_1_p3_fam = "fri_1_p3_time_fam";
    final static String sat_1_p3_fam = "sat_1_p3_time_fam";

    final static String mon_1_p4_time_start = "mon_1_p4_time_start";
    final static String tue_1_p4_time_start = "tue_1_p4_time_start";
    final static String wed_1_p4_time_start = "wed_1_p4_time_start";
    final static String thu_1_p4_time_start = "thu_1_p4_time_start";
    final static String fri_1_p4_time_start = "fri_1_p4_time_start";
    final static String sat_1_p4_time_start = "sat_1_p4_time_start";

    final static String mon_1_p4_time_finish = "mon_1_p4_time_finish";
    final static String tue_1_p4_time_finish = "tue_1_p4_time_finish";
    final static String wed_1_p4_time_finish = "wed_1_p4_time_finish";
    final static String thu_1_p4_time_finish = "thu_1_p4_time_finish";
    final static String fri_1_p4_time_finish = "fri_1_p4_time_finish";
    final static String sat_1_p4_time_finish = "sat_1_p4_time_finish";

    final static String mon_1_p4_predmet = "mon_1_p4_predmet";
    final static String tue_1_p4_predmet = "tue_1_p4_predmet";
    final static String wed_1_p4_predmet = "wed_1_p4_predmet";
    final static String thu_1_p4_predmet = "thu_1_p4_predmet";
    final static String fri_1_p4_predmet = "fri_1_p4_predmet";
    final static String sat_1_p4_predmet = "sat_1_p4_predmet";

    final static String mon_1_p4_kab = "mon_1_p4_time_kab";
    final static String tue_1_p4_kab = "tue_1_p4_time_kab";
    final static String wed_1_p4_kab = "wed_1_p4_time_kab";
    final static String thu_1_p4_kab = "thu_1_p4_time_kab";
    final static String fri_1_p4_kab = "fri_1_p4_time_kab";
    final static String sat_1_p4_kab = "sat_1_p4_time_kab";

    final static String mon_1_p4_fam = "mon_1_p4_time_fam";
    final static String tue_1_p4_fam = "tue_1_p4_time_fam";
    final static String wed_1_p4_fam = "wed_1_p4_time_fam";
    final static String thu_1_p4_fam = "thu_1_p4_time_fam";
    final static String fri_1_p4_fam = "fri_1_p4_time_fam";
    final static String sat_1_p4_fam = "sat_1_p4_time_fam";


    final static String mon_2_p1_time_start = "mon_2_p1_time_start";
    final static String tue_2_p1_time_start = "tue_2_p1_time_start";
    final static String wed_2_p1_time_start = "wed_2_p1_time_start";
    final static String thu_2_p1_time_start = "thu_2_p1_time_start";
    final static String fri_2_p1_time_start = "fri_2_p1_time_start";
    final static String sat_2_p1_time_start = "sat_2_p1_time_start";

    final static String mon_2_p1_time_finish = "mon_2_p1_time_finish";
    final static String tue_2_p1_time_finish = "tue_2_p1_time_finish";
    final static String wed_2_p1_time_finish = "wed_2_p1_time_finish";
    final static String thu_2_p1_time_finish = "thu_2_p1_time_finish";
    final static String fri_2_p1_time_finish = "fri_2_p1_time_finish";
    final static String sat_2_p1_time_finish = "sat_2_p1_time_finish";

    final static String mon_2_p1_predmet = "mon_2_p1_predmet";
    final static String tue_2_p1_predmet = "tue_2_p1_predmet";
    final static String wed_2_p1_predmet = "wed_2_p1_predmet";
    final static String thu_2_p1_predmet = "thu_2_p1_predmet";
    final static String fri_2_p1_predmet = "fri_2_p1_predmet";
    final static String sat_2_p1_predmet = "sat_2_p1_predmet";

    final static String mon_2_p1_kab = "mon_2_p1_time_kab";
    final static String tue_2_p1_kab = "tue_2_p1_time_kab";
    final static String wed_2_p1_kab = "wed_2_p1_time_kab";
    final static String thu_2_p1_kab = "thu_2_p1_time_kab";
    final static String fri_2_p1_kab = "fri_2_p1_time_kab";
    final static String sat_2_p1_kab = "sat_2_p1_time_kab";

    final static String mon_2_p1_fam = "mon_2_p1_time_fam";
    final static String tue_2_p1_fam = "tue_2_p1_time_fam";
    final static String wed_2_p1_fam = "wed_2_p1_time_fam";
    final static String thu_2_p1_fam = "thu_2_p1_time_fam";
    final static String fri_2_p1_fam = "fri_2_p1_time_fam";
    final static String sat_2_p1_fam = "sat_2_p1_time_fam";

    final static String mon_2_p2_time_start = "mon_2_p2_time_start";
    final static String tue_2_p2_time_start = "tue_2_p2_time_start";
    final static String wed_2_p2_time_start = "wed_2_p2_time_start";
    final static String thu_2_p2_time_start = "thu_2_p2_time_start";
    final static String fri_2_p2_time_start = "fri_2_p2_time_start";
    final static String sat_2_p2_time_start = "sat_2_p2_time_start";

    final static String mon_2_p2_time_finish = "mon_2_p2_time_finish";
    final static String tue_2_p2_time_finish = "tue_2_p2_time_finish";
    final static String wed_2_p2_time_finish = "wed_2_p2_time_finish";
    final static String thu_2_p2_time_finish = "thu_2_p2_time_finish";
    final static String fri_2_p2_time_finish = "fri_2_p2_time_finish";
    final static String sat_2_p2_time_finish = "sat_2_p2_time_finish";

    final static String mon_2_p2_predmet = "mon_2_p2_predmet";
    final static String tue_2_p2_predmet = "tue_2_p2_predmet";
    final static String wed_2_p2_predmet = "wed_2_p2_predmet";
    final static String thu_2_p2_predmet = "thu_2_p2_predmet";
    final static String fri_2_p2_predmet = "fri_2_p2_predmet";
    final static String sat_2_p2_predmet = "sat_2_p2_predmet";

    final static String mon_2_p2_kab = "mon_2_p2_time_kab";
    final static String tue_2_p2_kab = "tue_2_p2_time_kab";
    final static String wed_2_p2_kab = "wed_2_p2_time_kab";
    final static String thu_2_p2_kab = "thu_2_p2_time_kab";
    final static String fri_2_p2_kab = "fri_2_p2_time_kab";
    final static String sat_2_p2_kab = "sat_2_p2_time_kab";

    final static String mon_2_p2_fam = "mon_2_p2_time_fam";
    final static String tue_2_p2_fam = "tue_2_p2_time_fam";
    final static String wed_2_p2_fam = "wed_2_p2_time_fam";
    final static String thu_2_p2_fam = "thu_2_p2_time_fam";
    final static String fri_2_p2_fam = "fri_2_p2_time_fam";
    final static String sat_2_p2_fam = "sat_2_p2_time_fam";

    final static String mon_2_p3_time_start = "mon_2_p3_time_start";
    final static String tue_2_p3_time_start = "tue_2_p3_time_start";
    final static String wed_2_p3_time_start = "wed_2_p3_time_start";
    final static String thu_2_p3_time_start = "thu_2_p3_time_start";
    final static String fri_2_p3_time_start = "fri_2_p3_time_start";
    final static String sat_2_p3_time_start = "sat_2_p3_time_start";

    final static String mon_2_p3_time_finish = "mon_2_p3_time_finish";
    final static String tue_2_p3_time_finish = "tue_2_p3_time_finish";
    final static String wed_2_p3_time_finish = "wed_2_p3_time_finish";
    final static String thu_2_p3_time_finish = "thu_2_p3_time_finish";
    final static String fri_2_p3_time_finish = "fri_2_p3_time_finish";
    final static String sat_2_p3_time_finish = "sat_2_p3_time_finish";

    final static String mon_2_p3_predmet = "mon_2_p3_predmet";
    final static String tue_2_p3_predmet = "tue_2_p3_predmet";
    final static String wed_2_p3_predmet = "wed_2_p3_predmet";
    final static String thu_2_p3_predmet = "thu_2_p3_predmet";
    final static String fri_2_p3_predmet = "fri_2_p3_predmet";
    final static String sat_2_p3_predmet = "sat_2_p3_predmet";

    final static String mon_2_p3_kab = "mon_2_p3_time_kab";
    final static String tue_2_p3_kab = "tue_2_p3_time_kab";
    final static String wed_2_p3_kab = "wed_2_p3_time_kab";
    final static String thu_2_p3_kab = "thu_2_p3_time_kab";
    final static String fri_2_p3_kab = "fri_2_p3_time_kab";
    final static String sat_2_p3_kab = "sat_2_p3_time_kab";

    final static String mon_2_p3_fam = "mon_2_p3_time_fam";
    final static String tue_2_p3_fam = "tue_2_p3_time_fam";
    final static String wed_2_p3_fam = "wed_2_p3_time_fam";
    final static String thu_2_p3_fam = "thu_2_p3_time_fam";
    final static String fri_2_p3_fam = "fri_2_p3_time_fam";
    final static String sat_2_p3_fam = "sat_2_p3_time_fam";

    final static String mon_2_p4_time_start = "mon_2_p4_time_start";
    final static String tue_2_p4_time_start = "tue_2_p4_time_start";
    final static String wed_2_p4_time_start = "wed_2_p4_time_start";
    final static String thu_2_p4_time_start = "thu_2_p4_time_start";
    final static String fri_2_p4_time_start = "fri_2_p4_time_start";
    final static String sat_2_p4_time_start = "sat_2_p4_time_start";

    final static String mon_2_p4_time_finish = "mon_2_p4_time_finish";
    final static String tue_2_p4_time_finish = "tue_2_p4_time_finish";
    final static String wed_2_p4_time_finish = "wed_2_p4_time_finish";
    final static String thu_2_p4_time_finish = "thu_2_p4_time_finish";
    final static String fri_2_p4_time_finish = "fri_2_p4_time_finish";
    final static String sat_2_p4_time_finish = "sat_2_p4_time_finish";

    final static String mon_2_p4_predmet = "mon_2_p4_predmet";
    final static String tue_2_p4_predmet = "tue_2_p4_predmet";
    final static String wed_2_p4_predmet = "wed_2_p4_predmet";
    final static String thu_2_p4_predmet = "thu_2_p4_predmet";
    final static String fri_2_p4_predmet = "fri_2_p4_predmet";
    final static String sat_2_p4_predmet = "sat_2_p4_predmet";

    final static String mon_2_p4_kab = "mon_2_p4_time_kab";
    final static String tue_2_p4_kab = "tue_2_p4_time_kab";
    final static String wed_2_p4_kab = "wed_2_p4_time_kab";
    final static String thu_2_p4_kab = "thu_2_p4_time_kab";
    final static String fri_2_p4_kab = "fri_2_p4_time_kab";
    final static String sat_2_p4_kab = "sat_2_p4_time_kab";

    final static String mon_2_p4_fam = "mon_2_p4_time_fam";
    final static String tue_2_p4_fam = "tue_2_p4_time_fam";
    final static String wed_2_p4_fam = "wed_2_p4_time_fam";
    final static String thu_2_p4_fam = "thu_2_p4_time_fam";
    final static String fri_2_p4_fam = "fri_2_p4_time_fam";
    final static String sat_2_p4_fam = "sat_2_p4_time_fam";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // Отображение только портретный режим

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        loadText();


        save = (Button) findViewById(R.id.save);
        close = (Button) findViewById(R.id.close);

        mMo = (Button) findViewById(R.id.mon);
        mTu = (Button) findViewById(R.id.tue);
        mWe = (Button) findViewById(R.id.wed);
        mTh = (Button) findViewById(R.id.thu);
        mFr = (Button) findViewById(R.id.fri);
        mSa = (Button) findViewById(R.id.sat);

        p1_predmet = (EditText) findViewById(R.id.p1_predmet);
        p1_fam = (EditText) findViewById(R.id.p1_fam);
        p1_kab = (EditText) findViewById(R.id.p1_kab);
        p1_time_start = (EditText) findViewById(R.id.p1_time_start);
        p1_time_finish = (EditText) findViewById(R.id.p1_time_finish);

        p2_predmet = (EditText) findViewById(R.id.p2_predmet);
        p2_fam = (EditText) findViewById(R.id.p2_fam);
        p2_kab = (EditText) findViewById(R.id.p2_kab);
        p2_time_start = (EditText) findViewById(R.id.p2_time_start);
        p2_time_finish = (EditText) findViewById(R.id.p2_time_finish);

        p3_predmet = (EditText) findViewById(R.id.p3_predmet);
        p3_fam = (EditText) findViewById(R.id.p3_fam);
        p3_kab = (EditText) findViewById(R.id.p3_kab);
        p3_time_start = (EditText) findViewById(R.id.p3_time_start);
        p3_time_finish = (EditText) findViewById(R.id.p3_time_finish);

        p4_predmet = (EditText) findViewById(R.id.p4_predmet);
        p4_fam = (EditText) findViewById(R.id.p4_fam);
        p4_kab = (EditText) findViewById(R.id.p4_kab);
        p4_time_start = (EditText) findViewById(R.id.p4_time_start);
        p4_time_finish = (EditText) findViewById(R.id.p4_time_finish);

        mDay = (TextView) findViewById(R.id.day);


        save.setOnClickListener(onClickListener);
        close.setOnClickListener(onClickListener);

        mMo.setOnClickListener(onClickListener);
        mTu.setOnClickListener(onClickListener);
        mWe.setOnClickListener(onClickListener);
        mTh.setOnClickListener(onClickListener);
        mFr.setOnClickListener(onClickListener);
        mSa.setOnClickListener(onClickListener);

        mChkBox = (CheckBox) findViewById(R.id.chkBox);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if (mChkBox.isChecked()) {
                switch (view.getId()) {

                    case R.id.close:
                        //  Intent intent = new Intent(EditActivity.this, MainActivity.class);
                        //  startActivity(intent);
                        onBackPressed();
                        break;

                    case R.id.mon:
                        mDay.setText(R.string.mon1);
                        a = 1;
                        printMon1();
                        break;

                    case R.id.tue:
                        mDay.setText(R.string.tue1);
                        a = 2;
                        printTue1();
                        break;

                    case R.id.wed:
                        mDay.setText(R.string.wed1);
                        a = 3;
                        printWed1();
                        break;

                    case R.id.thu:
                        mDay.setText(R.string.thu1);
                        a = 4;
                        printThu1();
                        break;

                    case R.id.fri:
                        mDay.setText(R.string.fri1);
                        a = 5;
                        printFri1();
                        break;

                    case R.id.sat:
                        mDay.setText(R.string.sat1);
                        a = 6;
                        printSat1();
                        break;

                    case R.id.save:
                        switch (a) {
                            case 1:
                                saveMon1();
                                Toast.makeText(EditActivity.this, mon1 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                saveTue1();
                                Toast.makeText(EditActivity.this, tue1 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                saveWed1();
                                Toast.makeText(EditActivity.this, wed1 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 4:
                                saveThu1();
                                Toast.makeText(EditActivity.this, thu1 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 5:
                                saveFri1();
                                Toast.makeText(EditActivity.this, fri1 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 6:
                                saveSat1();
                                Toast.makeText(EditActivity.this, sat1 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                Toast.makeText(EditActivity.this, "Выберите день недели", Toast.LENGTH_SHORT).show();

                        }


//                    saveText(mon_1_p1_time_start, p1_time_start.getText().toString());
//                    Toast.makeText(EditActivity.this, p1_fam.getText().toString(), Toast.LENGTH_SHORT).show();
//                    Toast.makeText(EditActivity.this, MainActivity.SAVED_TEXT, Toast.LENGTH_SHORT).show();
                        break;
                }
            } else {
                switch (view.getId()) {

                    case R.id.close:
                        //  Intent intent = new Intent(EditActivity.this, MainActivity.class);
                        //  startActivity(intent);
                        Toast.makeText(EditActivity.this, "ntcn", Toast.LENGTH_SHORT).show();
                        onBackPressed();
                        break;

                    case R.id.mon:
                        mDay.setText(R.string.mon2);
                        a = 1;
                        printMon2();
                        break;

                    case R.id.tue:
                        mDay.setText(R.string.tue2);
                        a = 2;
                        printTue2();
                        break;

                    case R.id.wed:
                        mDay.setText(R.string.wed2);
                        a = 3;
                        printWed2();
                        break;

                    case R.id.thu:
                        mDay.setText(R.string.thu2);
                        a = 4;
                        printThu2();
                        break;

                    case R.id.fri:
                        mDay.setText(R.string.fri2);
                        a = 5;
                        printFri2();
                        break;

                    case R.id.sat:
                        mDay.setText(R.string.sat2);
                        a = 6;
                        printSat2();
                        break;

                    case R.id.save:
                        switch (a) {
                            case 1:
                                saveMon2();
                                Toast.makeText(EditActivity.this, mon2 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                saveTue2();
                                Toast.makeText(EditActivity.this, tue2 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                saveWed2();
                                Toast.makeText(EditActivity.this, wed2 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 4:
                                saveThu2();
                                Toast.makeText(EditActivity.this, thu2 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 5:
                                saveFri2();
                                Toast.makeText(EditActivity.this, fri2 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            case 6:
                                saveSat2();
                                Toast.makeText(EditActivity.this, sat2 + "\n\rсохранено", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                Toast.makeText(EditActivity.this, "Выберите день недели", Toast.LENGTH_SHORT).show();

                        }


//                    saveText(mon_1_p1_time_start, p1_time_start.getText().toString());
//                    Toast.makeText(EditActivity.this, p1_fam.getText().toString(), Toast.LENGTH_SHORT).show();
//                    Toast.makeText(EditActivity.this, MainActivity.SAVED_TEXT, Toast.LENGTH_SHORT).show();
                        break;

                }


            }

        }
    };


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Выберите день недели", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        if (back_pressed + 2000 > System.currentTimeMillis())
            super.onBackPressed();
        else
            Toast.makeText(getBaseContext(), R.string.onBackPressed,
                    Toast.LENGTH_SHORT).show();
        back_pressed = System.currentTimeMillis();
    }


    void saveText(String name, String mesto) {
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(name, mesto); //SAVED_TEXT - name, p1_fam.getText().toString() - mesto
        ed.apply();
//        ed.commit();
//        Toast.makeText(this, sPref.getString(name, ""), Toast.LENGTH_SHORT).show();

    }

    String loadText(String weekDay) {
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        return sPref.getString(weekDay, "");
        // String savedText = sPref.getString(SAVED_TEXT, "");
        //Toast.makeText(this, "a tut text" + savedText, Toast.LENGTH_SHORT).show();
    }


    private void printMon1() {
        p1_time_start.setText(loadText(mon_1_p1_time_start));
        p1_time_finish.setText(loadText(mon_1_p1_time_finish));
        p1_predmet.setText(loadText(mon_1_p1_predmet));
        p1_kab.setText(loadText(mon_1_p1_kab));
        p1_fam.setText(loadText(mon_1_p1_fam));

        p2_time_start.setText(loadText(mon_1_p2_time_start));
        p2_time_finish.setText(loadText(mon_1_p2_time_finish));
        p2_predmet.setText(loadText(mon_1_p2_predmet));
        p2_kab.setText(loadText(mon_1_p2_kab));
        p2_fam.setText(loadText(mon_1_p2_fam));

        p3_time_start.setText(loadText(mon_1_p3_time_start));
        p3_time_finish.setText(loadText(mon_1_p3_time_finish));
        p3_predmet.setText(loadText(mon_1_p3_predmet));
        p3_kab.setText(loadText(mon_1_p3_kab));
        p3_fam.setText(loadText(mon_1_p3_fam));

        p4_time_start.setText(loadText(mon_1_p4_time_start));
        p4_time_finish.setText(loadText(mon_1_p4_time_finish));
        p4_predmet.setText(loadText(mon_1_p4_predmet));
        p4_kab.setText(loadText(mon_1_p4_kab));
        p4_fam.setText(loadText(mon_1_p4_fam));

    }
    private void printTue1() {
        p1_time_start.setText(loadText(tue_1_p1_time_start));
        p1_time_finish.setText(loadText(tue_1_p1_time_finish));
        p1_predmet.setText(loadText(tue_1_p1_predmet));
        p1_kab.setText(loadText(tue_1_p1_kab));
        p1_fam.setText(loadText(tue_1_p1_fam));

        p2_time_start.setText(loadText(tue_1_p2_time_start));
        p2_time_finish.setText(loadText(tue_1_p2_time_finish));
        p2_predmet.setText(loadText(tue_1_p2_predmet));
        p2_kab.setText(loadText(tue_1_p2_kab));
        p2_fam.setText(loadText(tue_1_p2_fam));

        p3_time_start.setText(loadText(tue_1_p3_time_start));
        p3_time_finish.setText(loadText(tue_1_p3_time_finish));
        p3_predmet.setText(loadText(tue_1_p3_predmet));
        p3_kab.setText(loadText(tue_1_p3_kab));
        p3_fam.setText(loadText(tue_1_p3_fam));

        p4_time_start.setText(loadText(tue_1_p4_time_start));
        p4_time_finish.setText(loadText(tue_1_p4_time_finish));
        p4_predmet.setText(loadText(tue_1_p4_predmet));
        p4_kab.setText(loadText(tue_1_p4_kab));
        p4_fam.setText(loadText(tue_1_p4_fam));

    }
    private void printWed1() {
        p1_time_start.setText(loadText(wed_1_p1_time_start));
        p1_time_finish.setText(loadText(wed_1_p1_time_finish));
        p1_predmet.setText(loadText(wed_1_p1_predmet));
        p1_kab.setText(loadText(wed_1_p1_kab));
        p1_fam.setText(loadText(wed_1_p1_fam));

        p2_time_start.setText(loadText(wed_1_p2_time_start));
        p2_time_finish.setText(loadText(wed_1_p2_time_finish));
        p2_predmet.setText(loadText(wed_1_p2_predmet));
        p2_kab.setText(loadText(wed_1_p2_kab));
        p2_fam.setText(loadText(wed_1_p2_fam));

        p3_time_start.setText(loadText(wed_1_p3_time_start));
        p3_time_finish.setText(loadText(wed_1_p3_time_finish));
        p3_predmet.setText(loadText(wed_1_p3_predmet));
        p3_kab.setText(loadText(wed_1_p3_kab));
        p3_fam.setText(loadText(wed_1_p3_fam));

        p4_time_start.setText(loadText(wed_1_p4_time_start));
        p4_time_finish.setText(loadText(wed_1_p4_time_finish));
        p4_predmet.setText(loadText(wed_1_p4_predmet));
        p4_kab.setText(loadText(wed_1_p4_kab));
        p4_fam.setText(loadText(wed_1_p4_fam));

    }
    private void printThu1() {
        p1_time_start.setText(loadText(thu_1_p1_time_start));
        p1_time_finish.setText(loadText(thu_1_p1_time_finish));
        p1_predmet.setText(loadText(thu_1_p1_predmet));
        p1_kab.setText(loadText(thu_1_p1_kab));
        p1_fam.setText(loadText(thu_1_p1_fam));

        p2_time_start.setText(loadText(thu_1_p2_time_start));
        p2_time_finish.setText(loadText(thu_1_p2_time_finish));
        p2_predmet.setText(loadText(thu_1_p2_predmet));
        p2_kab.setText(loadText(thu_1_p2_kab));
        p2_fam.setText(loadText(thu_1_p2_fam));

        p3_time_start.setText(loadText(thu_1_p3_time_start));
        p3_time_finish.setText(loadText(thu_1_p3_time_finish));
        p3_predmet.setText(loadText(thu_1_p3_predmet));
        p3_kab.setText(loadText(thu_1_p3_kab));
        p3_fam.setText(loadText(thu_1_p3_fam));

        p4_time_start.setText(loadText(thu_1_p4_time_start));
        p4_time_finish.setText(loadText(thu_1_p4_time_finish));
        p4_predmet.setText(loadText(thu_1_p4_predmet));
        p4_kab.setText(loadText(thu_1_p4_kab));
        p4_fam.setText(loadText(thu_1_p4_fam));

    }
    private void printFri1() {
        p1_time_start.setText(loadText(fri_1_p1_time_start));
        p1_time_finish.setText(loadText(fri_1_p1_time_finish));
        p1_predmet.setText(loadText(fri_1_p1_predmet));
        p1_kab.setText(loadText(fri_1_p1_kab));
        p1_fam.setText(loadText(fri_1_p1_fam));

        p2_time_start.setText(loadText(fri_1_p2_time_start));
        p2_time_finish.setText(loadText(fri_1_p2_time_finish));
        p2_predmet.setText(loadText(fri_1_p2_predmet));
        p2_kab.setText(loadText(fri_1_p2_kab));
        p2_fam.setText(loadText(fri_1_p2_fam));

        p3_time_start.setText(loadText(fri_1_p3_time_start));
        p3_time_finish.setText(loadText(fri_1_p3_time_finish));
        p3_predmet.setText(loadText(fri_1_p3_predmet));
        p3_kab.setText(loadText(fri_1_p3_kab));
        p3_fam.setText(loadText(fri_1_p3_fam));

        p4_time_start.setText(loadText(fri_1_p4_time_start));
        p4_time_finish.setText(loadText(fri_1_p4_time_finish));
        p4_predmet.setText(loadText(fri_1_p4_predmet));
        p4_kab.setText(loadText(fri_1_p4_kab));
        p4_fam.setText(loadText(fri_1_p4_fam));

    }
    private void printSat1() {
        p1_time_start.setText(loadText(sat_1_p1_time_start));
        p1_time_finish.setText(loadText(sat_1_p1_time_finish));
        p1_predmet.setText(loadText(sat_1_p1_predmet));
        p1_kab.setText(loadText(sat_1_p1_kab));
        p1_fam.setText(loadText(sat_1_p1_fam));

        p2_time_start.setText(loadText(sat_1_p2_time_start));
        p2_time_finish.setText(loadText(sat_1_p2_time_finish));
        p2_predmet.setText(loadText(sat_1_p2_predmet));
        p2_kab.setText(loadText(sat_1_p2_kab));
        p2_fam.setText(loadText(sat_1_p2_fam));

        p3_time_start.setText(loadText(sat_1_p3_time_start));
        p3_time_finish.setText(loadText(sat_1_p3_time_finish));
        p3_predmet.setText(loadText(sat_1_p3_predmet));
        p3_kab.setText(loadText(sat_1_p3_kab));
        p3_fam.setText(loadText(sat_1_p3_fam));

        p4_time_start.setText(loadText(sat_1_p4_time_start));
        p4_time_finish.setText(loadText(sat_1_p4_time_finish));
        p4_predmet.setText(loadText(sat_1_p4_predmet));
        p4_kab.setText(loadText(sat_1_p4_kab));
        p4_fam.setText(loadText(sat_1_p4_fam));

    }


    private void printMon2() {
        p1_time_start.setText(loadText(mon_2_p1_time_start));
        p1_time_finish.setText(loadText(mon_2_p1_time_finish));
        p1_predmet.setText(loadText(mon_2_p1_predmet));
        p1_kab.setText(loadText(mon_2_p1_kab));
        p1_fam.setText(loadText(mon_2_p1_fam));

        p2_time_start.setText(loadText(mon_2_p2_time_start));
        p2_time_finish.setText(loadText(mon_2_p2_time_finish));
        p2_predmet.setText(loadText(mon_2_p2_predmet));
        p2_kab.setText(loadText(mon_2_p2_kab));
        p2_fam.setText(loadText(mon_2_p2_fam));

        p3_time_start.setText(loadText(mon_2_p3_time_start));
        p3_time_finish.setText(loadText(mon_2_p3_time_finish));
        p3_predmet.setText(loadText(mon_2_p3_predmet));
        p3_kab.setText(loadText(mon_2_p3_kab));
        p3_fam.setText(loadText(mon_2_p3_fam));

        p4_time_start.setText(loadText(mon_2_p4_time_start));
        p4_time_finish.setText(loadText(mon_2_p4_time_finish));
        p4_predmet.setText(loadText(mon_2_p4_predmet));
        p4_kab.setText(loadText(mon_2_p4_kab));
        p4_fam.setText(loadText(mon_2_p4_fam));

    }
    private void printTue2() {
        p1_time_start.setText(loadText(tue_2_p1_time_start));
        p1_time_finish.setText(loadText(tue_2_p1_time_finish));
        p1_predmet.setText(loadText(tue_2_p1_predmet));
        p1_kab.setText(loadText(tue_2_p1_kab));
        p1_fam.setText(loadText(tue_2_p1_fam));

        p2_time_start.setText(loadText(tue_2_p2_time_start));
        p2_time_finish.setText(loadText(tue_2_p2_time_finish));
        p2_predmet.setText(loadText(tue_2_p2_predmet));
        p2_kab.setText(loadText(tue_2_p2_kab));
        p2_fam.setText(loadText(tue_2_p2_fam));

        p3_time_start.setText(loadText(tue_2_p3_time_start));
        p3_time_finish.setText(loadText(tue_2_p3_time_finish));
        p3_predmet.setText(loadText(tue_2_p3_predmet));
        p3_kab.setText(loadText(tue_2_p3_kab));
        p3_fam.setText(loadText(tue_2_p3_fam));

        p4_time_start.setText(loadText(tue_2_p4_time_start));
        p4_time_finish.setText(loadText(tue_2_p4_time_finish));
        p4_predmet.setText(loadText(tue_2_p4_predmet));
        p4_kab.setText(loadText(tue_2_p4_kab));
        p4_fam.setText(loadText(tue_2_p4_fam));

    }
    private void printWed2() {
        p1_time_start.setText(loadText(wed_2_p1_time_start));
        p1_time_finish.setText(loadText(wed_2_p1_time_finish));
        p1_predmet.setText(loadText(wed_2_p1_predmet));
        p1_kab.setText(loadText(wed_2_p1_kab));
        p1_fam.setText(loadText(wed_2_p1_fam));

        p2_time_start.setText(loadText(wed_2_p2_time_start));
        p2_time_finish.setText(loadText(wed_2_p2_time_finish));
        p2_predmet.setText(loadText(wed_2_p2_predmet));
        p2_kab.setText(loadText(wed_2_p2_kab));
        p2_fam.setText(loadText(wed_2_p2_fam));

        p3_time_start.setText(loadText(wed_2_p3_time_start));
        p3_time_finish.setText(loadText(wed_2_p3_time_finish));
        p3_predmet.setText(loadText(wed_2_p3_predmet));
        p3_kab.setText(loadText(wed_2_p3_kab));
        p3_fam.setText(loadText(wed_2_p3_fam));

        p4_time_start.setText(loadText(wed_2_p4_time_start));
        p4_time_finish.setText(loadText(wed_2_p4_time_finish));
        p4_predmet.setText(loadText(wed_2_p4_predmet));
        p4_kab.setText(loadText(wed_2_p4_kab));
        p4_fam.setText(loadText(wed_2_p4_fam));

    }
    private void printThu2() {
        p1_time_start.setText(loadText(thu_2_p1_time_start));
        p1_time_finish.setText(loadText(thu_2_p1_time_finish));
        p1_predmet.setText(loadText(thu_2_p1_predmet));
        p1_kab.setText(loadText(thu_2_p1_kab));
        p1_fam.setText(loadText(thu_2_p1_fam));

        p2_time_start.setText(loadText(thu_2_p2_time_start));
        p2_time_finish.setText(loadText(thu_2_p2_time_finish));
        p2_predmet.setText(loadText(thu_2_p2_predmet));
        p2_kab.setText(loadText(thu_2_p2_kab));
        p2_fam.setText(loadText(thu_2_p2_fam));

        p3_time_start.setText(loadText(thu_2_p3_time_start));
        p3_time_finish.setText(loadText(thu_2_p3_time_finish));
        p3_predmet.setText(loadText(thu_2_p3_predmet));
        p3_kab.setText(loadText(thu_2_p3_kab));
        p3_fam.setText(loadText(thu_2_p3_fam));

        p4_time_start.setText(loadText(thu_2_p4_time_start));
        p4_time_finish.setText(loadText(thu_2_p4_time_finish));
        p4_predmet.setText(loadText(thu_2_p4_predmet));
        p4_kab.setText(loadText(thu_2_p4_kab));
        p4_fam.setText(loadText(thu_2_p4_fam));

    }
    private void printFri2() {
        p1_time_start.setText(loadText(fri_2_p1_time_start));
        p1_time_finish.setText(loadText(fri_2_p1_time_finish));
        p1_predmet.setText(loadText(fri_2_p1_predmet));
        p1_kab.setText(loadText(fri_2_p1_kab));
        p1_fam.setText(loadText(fri_2_p1_fam));

        p2_time_start.setText(loadText(fri_2_p2_time_start));
        p2_time_finish.setText(loadText(fri_2_p2_time_finish));
        p2_predmet.setText(loadText(fri_2_p2_predmet));
        p2_kab.setText(loadText(fri_2_p2_kab));
        p2_fam.setText(loadText(fri_2_p2_fam));

        p3_time_start.setText(loadText(fri_2_p3_time_start));
        p3_time_finish.setText(loadText(fri_2_p3_time_finish));
        p3_predmet.setText(loadText(fri_2_p3_predmet));
        p3_kab.setText(loadText(fri_2_p3_kab));
        p3_fam.setText(loadText(fri_2_p3_fam));

        p4_time_start.setText(loadText(fri_2_p4_time_start));
        p4_time_finish.setText(loadText(fri_2_p4_time_finish));
        p4_predmet.setText(loadText(fri_2_p4_predmet));
        p4_kab.setText(loadText(fri_2_p4_kab));
        p4_fam.setText(loadText(fri_2_p4_fam));

    }
    private void printSat2() {
        p1_time_start.setText(loadText(sat_2_p1_time_start));
        p1_time_finish.setText(loadText(sat_2_p1_time_finish));
        p1_predmet.setText(loadText(sat_2_p1_predmet));
        p1_kab.setText(loadText(sat_2_p1_kab));
        p1_fam.setText(loadText(sat_2_p1_fam));

        p2_time_start.setText(loadText(sat_2_p2_time_start));
        p2_time_finish.setText(loadText(sat_2_p2_time_finish));
        p2_predmet.setText(loadText(sat_2_p2_predmet));
        p2_kab.setText(loadText(sat_2_p2_kab));
        p2_fam.setText(loadText(sat_2_p2_fam));

        p3_time_start.setText(loadText(sat_2_p3_time_start));
        p3_time_finish.setText(loadText(sat_2_p3_time_finish));
        p3_predmet.setText(loadText(sat_2_p3_predmet));
        p3_kab.setText(loadText(sat_2_p3_kab));
        p3_fam.setText(loadText(sat_2_p3_fam));

        p4_time_start.setText(loadText(sat_2_p4_time_start));
        p4_time_finish.setText(loadText(sat_2_p4_time_finish));
        p4_predmet.setText(loadText(sat_2_p4_predmet));
        p4_kab.setText(loadText(sat_2_p4_kab));
        p4_fam.setText(loadText(sat_2_p4_fam));

    }


    private void saveMon1() {
        saveText(mon_1_p1_time_start, p1_time_start.getText().toString());
        saveText(mon_1_p1_time_finish, p1_time_finish.getText().toString());
        saveText(mon_1_p1_predmet, p1_predmet.getText().toString());
        saveText(mon_1_p1_kab, p1_kab.getText().toString());
        saveText(mon_1_p1_fam, p1_fam.getText().toString());

        saveText(mon_1_p2_time_start, p2_time_start.getText().toString());
        saveText(mon_1_p2_time_finish, p2_time_finish.getText().toString());
        saveText(mon_1_p2_predmet, p2_predmet.getText().toString());
        saveText(mon_1_p2_kab, p2_kab.getText().toString());
        saveText(mon_1_p2_fam, p2_fam.getText().toString());

        saveText(mon_1_p3_time_start, p3_time_start.getText().toString());
        saveText(mon_1_p3_time_finish, p3_time_finish.getText().toString());
        saveText(mon_1_p3_predmet, p3_predmet.getText().toString());
        saveText(mon_1_p3_kab, p3_kab.getText().toString());
        saveText(mon_1_p3_fam, p3_fam.getText().toString());

        saveText(mon_1_p4_time_start, p4_time_start.getText().toString());
        saveText(mon_1_p4_time_finish, p4_time_finish.getText().toString());
        saveText(mon_1_p4_predmet, p4_predmet.getText().toString());
        saveText(mon_1_p4_kab, p4_kab.getText().toString());
        saveText(mon_1_p4_fam, p4_fam.getText().toString());

    }

    private void saveTue1() {
        saveText(tue_1_p1_time_start, p1_time_start.getText().toString());
        saveText(tue_1_p1_time_finish, p1_time_finish.getText().toString());
        saveText(tue_1_p1_predmet, p1_predmet.getText().toString());
        saveText(tue_1_p1_kab, p1_kab.getText().toString());
        saveText(tue_1_p1_fam, p1_fam.getText().toString());

        saveText(tue_1_p2_time_start, p2_time_start.getText().toString());
        saveText(tue_1_p2_time_finish, p2_time_finish.getText().toString());
        saveText(tue_1_p2_predmet, p2_predmet.getText().toString());
        saveText(tue_1_p2_kab, p2_kab.getText().toString());
        saveText(tue_1_p2_fam, p2_fam.getText().toString());

        saveText(tue_1_p3_time_start, p3_time_start.getText().toString());
        saveText(tue_1_p3_time_finish, p3_time_finish.getText().toString());
        saveText(tue_1_p3_predmet, p3_predmet.getText().toString());
        saveText(tue_1_p3_kab, p3_kab.getText().toString());
        saveText(tue_1_p3_fam, p3_fam.getText().toString());

        saveText(tue_1_p4_time_start, p4_time_start.getText().toString());
        saveText(tue_1_p4_time_finish, p4_time_finish.getText().toString());
        saveText(tue_1_p4_predmet, p4_predmet.getText().toString());
        saveText(tue_1_p4_kab, p4_kab.getText().toString());
        saveText(tue_1_p4_fam, p4_fam.getText().toString());

    }

    private void saveWed1() {
        saveText(wed_1_p1_time_start, p1_time_start.getText().toString());
        saveText(wed_1_p1_time_finish, p1_time_finish.getText().toString());
        saveText(wed_1_p1_predmet, p1_predmet.getText().toString());
        saveText(wed_1_p1_kab, p1_kab.getText().toString());
        saveText(wed_1_p1_fam, p1_fam.getText().toString());

        saveText(wed_1_p2_time_start, p2_time_start.getText().toString());
        saveText(wed_1_p2_time_finish, p2_time_finish.getText().toString());
        saveText(wed_1_p2_predmet, p2_predmet.getText().toString());
        saveText(wed_1_p2_kab, p2_kab.getText().toString());
        saveText(wed_1_p2_fam, p2_fam.getText().toString());

        saveText(wed_1_p3_time_start, p3_time_start.getText().toString());
        saveText(wed_1_p3_time_finish, p3_time_finish.getText().toString());
        saveText(wed_1_p3_predmet, p3_predmet.getText().toString());
        saveText(wed_1_p3_kab, p3_kab.getText().toString());
        saveText(wed_1_p3_fam, p3_fam.getText().toString());

        saveText(wed_1_p4_time_start, p4_time_start.getText().toString());
        saveText(wed_1_p4_time_finish, p4_time_finish.getText().toString());
        saveText(wed_1_p4_predmet, p4_predmet.getText().toString());
        saveText(wed_1_p4_kab, p4_kab.getText().toString());
        saveText(wed_1_p4_fam, p4_fam.getText().toString());

    }

    private void saveThu1() {
        saveText(thu_1_p1_time_start, p1_time_start.getText().toString());
        saveText(thu_1_p1_time_finish, p1_time_finish.getText().toString());
        saveText(thu_1_p1_predmet, p1_predmet.getText().toString());
        saveText(thu_1_p1_kab, p1_kab.getText().toString());
        saveText(thu_1_p1_fam, p1_fam.getText().toString());

        saveText(thu_1_p2_time_start, p2_time_start.getText().toString());
        saveText(thu_1_p2_time_finish, p2_time_finish.getText().toString());
        saveText(thu_1_p2_predmet, p2_predmet.getText().toString());
        saveText(thu_1_p2_kab, p2_kab.getText().toString());
        saveText(thu_1_p2_fam, p2_fam.getText().toString());

        saveText(thu_1_p3_time_start, p3_time_start.getText().toString());
        saveText(thu_1_p3_time_finish, p3_time_finish.getText().toString());
        saveText(thu_1_p3_predmet, p3_predmet.getText().toString());
        saveText(thu_1_p3_kab, p3_kab.getText().toString());
        saveText(thu_1_p3_fam, p3_fam.getText().toString());

        saveText(thu_1_p4_time_start, p4_time_start.getText().toString());
        saveText(thu_1_p4_time_finish, p4_time_finish.getText().toString());
        saveText(thu_1_p4_predmet, p4_predmet.getText().toString());
        saveText(thu_1_p4_kab, p4_kab.getText().toString());
        saveText(thu_1_p4_fam, p4_fam.getText().toString());

    }

    private void saveFri1() {
        saveText(fri_1_p1_time_start, p1_time_start.getText().toString());
        saveText(fri_1_p1_time_finish, p1_time_finish.getText().toString());
        saveText(fri_1_p1_predmet, p1_predmet.getText().toString());
        saveText(fri_1_p1_kab, p1_kab.getText().toString());
        saveText(fri_1_p1_fam, p1_fam.getText().toString());

        saveText(fri_1_p2_time_start, p2_time_start.getText().toString());
        saveText(fri_1_p2_time_finish, p2_time_finish.getText().toString());
        saveText(fri_1_p2_predmet, p2_predmet.getText().toString());
        saveText(fri_1_p2_kab, p2_kab.getText().toString());
        saveText(fri_1_p2_fam, p2_fam.getText().toString());

        saveText(fri_1_p3_time_start, p3_time_start.getText().toString());
        saveText(fri_1_p3_time_finish, p3_time_finish.getText().toString());
        saveText(fri_1_p3_predmet, p3_predmet.getText().toString());
        saveText(fri_1_p3_kab, p3_kab.getText().toString());
        saveText(fri_1_p3_fam, p3_fam.getText().toString());

        saveText(fri_1_p4_time_start, p4_time_start.getText().toString());
        saveText(fri_1_p4_time_finish, p4_time_finish.getText().toString());
        saveText(fri_1_p4_predmet, p4_predmet.getText().toString());
        saveText(fri_1_p4_kab, p4_kab.getText().toString());
        saveText(fri_1_p4_fam, p4_fam.getText().toString());

    }

    private void saveSat1() {
        saveText(sat_1_p1_time_start, p1_time_start.getText().toString());
        saveText(sat_1_p1_time_finish, p1_time_finish.getText().toString());
        saveText(sat_1_p1_predmet, p1_predmet.getText().toString());
        saveText(sat_1_p1_kab, p1_kab.getText().toString());
        saveText(sat_1_p1_fam, p1_fam.getText().toString());

        saveText(sat_1_p2_time_start, p2_time_start.getText().toString());
        saveText(sat_1_p2_time_finish, p2_time_finish.getText().toString());
        saveText(sat_1_p2_predmet, p2_predmet.getText().toString());
        saveText(sat_1_p2_kab, p2_kab.getText().toString());
        saveText(sat_1_p2_fam, p2_fam.getText().toString());

        saveText(sat_1_p3_time_start, p3_time_start.getText().toString());
        saveText(sat_1_p3_time_finish, p3_time_finish.getText().toString());
        saveText(sat_1_p3_predmet, p3_predmet.getText().toString());
        saveText(sat_1_p3_kab, p3_kab.getText().toString());
        saveText(sat_1_p3_fam, p3_fam.getText().toString());

        saveText(sat_1_p4_time_start, p4_time_start.getText().toString());
        saveText(sat_1_p4_time_finish, p4_time_finish.getText().toString());
        saveText(sat_1_p4_predmet, p4_predmet.getText().toString());
        saveText(sat_1_p4_kab, p4_kab.getText().toString());
        saveText(sat_1_p4_fam, p4_fam.getText().toString());

    }



    private void saveMon2() {
        saveText(mon_2_p1_time_start, p1_time_start.getText().toString());
        saveText(mon_2_p1_time_finish, p1_time_finish.getText().toString());
        saveText(mon_2_p1_predmet, p1_predmet.getText().toString());
        saveText(mon_2_p1_kab, p1_kab.getText().toString());
        saveText(mon_2_p1_fam, p1_fam.getText().toString());

        saveText(mon_2_p2_time_start, p2_time_start.getText().toString());
        saveText(mon_2_p2_time_finish, p2_time_finish.getText().toString());
        saveText(mon_2_p2_predmet, p2_predmet.getText().toString());
        saveText(mon_2_p2_kab, p2_kab.getText().toString());
        saveText(mon_2_p2_fam, p2_fam.getText().toString());

        saveText(mon_2_p3_time_start, p3_time_start.getText().toString());
        saveText(mon_2_p3_time_finish, p3_time_finish.getText().toString());
        saveText(mon_2_p3_predmet, p3_predmet.getText().toString());
        saveText(mon_2_p3_kab, p3_kab.getText().toString());
        saveText(mon_2_p3_fam, p3_fam.getText().toString());

        saveText(mon_2_p4_time_start, p4_time_start.getText().toString());
        saveText(mon_2_p4_time_finish, p4_time_finish.getText().toString());
        saveText(mon_2_p4_predmet, p4_predmet.getText().toString());
        saveText(mon_2_p4_kab, p4_kab.getText().toString());
        saveText(mon_2_p4_fam, p4_fam.getText().toString());

    }

    private void saveTue2() {
        saveText(tue_2_p1_time_start, p1_time_start.getText().toString());
        saveText(tue_2_p1_time_finish, p1_time_finish.getText().toString());
        saveText(tue_2_p1_predmet, p1_predmet.getText().toString());
        saveText(tue_2_p1_kab, p1_kab.getText().toString());
        saveText(tue_2_p1_fam, p1_fam.getText().toString());

        saveText(tue_2_p2_time_start, p2_time_start.getText().toString());
        saveText(tue_2_p2_time_finish, p2_time_finish.getText().toString());
        saveText(tue_2_p2_predmet, p2_predmet.getText().toString());
        saveText(tue_2_p2_kab, p2_kab.getText().toString());
        saveText(tue_2_p2_fam, p2_fam.getText().toString());

        saveText(tue_2_p3_time_start, p3_time_start.getText().toString());
        saveText(tue_2_p3_time_finish, p3_time_finish.getText().toString());
        saveText(tue_2_p3_predmet, p3_predmet.getText().toString());
        saveText(tue_2_p3_kab, p3_kab.getText().toString());
        saveText(tue_2_p3_fam, p3_fam.getText().toString());

        saveText(tue_2_p4_time_start, p4_time_start.getText().toString());
        saveText(tue_2_p4_time_finish, p4_time_finish.getText().toString());
        saveText(tue_2_p4_predmet, p4_predmet.getText().toString());
        saveText(tue_2_p4_kab, p4_kab.getText().toString());
        saveText(tue_2_p4_fam, p4_fam.getText().toString());

    }

    private void saveWed2() {
        saveText(wed_2_p1_time_start, p1_time_start.getText().toString());
        saveText(wed_2_p1_time_finish, p1_time_finish.getText().toString());
        saveText(wed_2_p1_predmet, p1_predmet.getText().toString());
        saveText(wed_2_p1_kab, p1_kab.getText().toString());
        saveText(wed_2_p1_fam, p1_fam.getText().toString());

        saveText(wed_2_p2_time_start, p2_time_start.getText().toString());
        saveText(wed_2_p2_time_finish, p2_time_finish.getText().toString());
        saveText(wed_2_p2_predmet, p2_predmet.getText().toString());
        saveText(wed_2_p2_kab, p2_kab.getText().toString());
        saveText(wed_2_p2_fam, p2_fam.getText().toString());

        saveText(wed_2_p3_time_start, p3_time_start.getText().toString());
        saveText(wed_2_p3_time_finish, p3_time_finish.getText().toString());
        saveText(wed_2_p3_predmet, p3_predmet.getText().toString());
        saveText(wed_2_p3_kab, p3_kab.getText().toString());
        saveText(wed_2_p3_fam, p3_fam.getText().toString());

        saveText(wed_2_p4_time_start, p4_time_start.getText().toString());
        saveText(wed_2_p4_time_finish, p4_time_finish.getText().toString());
        saveText(wed_2_p4_predmet, p4_predmet.getText().toString());
        saveText(wed_2_p4_kab, p4_kab.getText().toString());
        saveText(wed_2_p4_fam, p4_fam.getText().toString());

    }

    private void saveThu2() {
        saveText(thu_2_p1_time_start, p1_time_start.getText().toString());
        saveText(thu_2_p1_time_finish, p1_time_finish.getText().toString());
        saveText(thu_2_p1_predmet, p1_predmet.getText().toString());
        saveText(thu_2_p1_kab, p1_kab.getText().toString());
        saveText(thu_2_p1_fam, p1_fam.getText().toString());

        saveText(thu_2_p2_time_start, p2_time_start.getText().toString());
        saveText(thu_2_p2_time_finish, p2_time_finish.getText().toString());
        saveText(thu_2_p2_predmet, p2_predmet.getText().toString());
        saveText(thu_2_p2_kab, p2_kab.getText().toString());
        saveText(thu_2_p2_fam, p2_fam.getText().toString());

        saveText(thu_2_p3_time_start, p3_time_start.getText().toString());
        saveText(thu_2_p3_time_finish, p3_time_finish.getText().toString());
        saveText(thu_2_p3_predmet, p3_predmet.getText().toString());
        saveText(thu_2_p3_kab, p3_kab.getText().toString());
        saveText(thu_2_p3_fam, p3_fam.getText().toString());

        saveText(thu_2_p4_time_start, p4_time_start.getText().toString());
        saveText(thu_2_p4_time_finish, p4_time_finish.getText().toString());
        saveText(thu_2_p4_predmet, p4_predmet.getText().toString());
        saveText(thu_2_p4_kab, p4_kab.getText().toString());
        saveText(thu_2_p4_fam, p4_fam.getText().toString());

    }

    private void saveFri2() {
        saveText(fri_2_p1_time_start, p1_time_start.getText().toString());
        saveText(fri_2_p1_time_finish, p1_time_finish.getText().toString());
        saveText(fri_2_p1_predmet, p1_predmet.getText().toString());
        saveText(fri_2_p1_kab, p1_kab.getText().toString());
        saveText(fri_2_p1_fam, p1_fam.getText().toString());

        saveText(fri_2_p2_time_start, p2_time_start.getText().toString());
        saveText(fri_2_p2_time_finish, p2_time_finish.getText().toString());
        saveText(fri_2_p2_predmet, p2_predmet.getText().toString());
        saveText(fri_2_p2_kab, p2_kab.getText().toString());
        saveText(fri_2_p2_fam, p2_fam.getText().toString());

        saveText(fri_2_p3_time_start, p3_time_start.getText().toString());
        saveText(fri_2_p3_time_finish, p3_time_finish.getText().toString());
        saveText(fri_2_p3_predmet, p3_predmet.getText().toString());
        saveText(fri_2_p3_kab, p3_kab.getText().toString());
        saveText(fri_2_p3_fam, p3_fam.getText().toString());

        saveText(fri_2_p4_time_start, p4_time_start.getText().toString());
        saveText(fri_2_p4_time_finish, p4_time_finish.getText().toString());
        saveText(fri_2_p4_predmet, p4_predmet.getText().toString());
        saveText(fri_2_p4_kab, p4_kab.getText().toString());
        saveText(fri_2_p4_fam, p4_fam.getText().toString());

    }

    private void saveSat2() {
        saveText(sat_2_p1_time_start, p1_time_start.getText().toString());
        saveText(sat_2_p1_time_finish, p1_time_finish.getText().toString());
        saveText(sat_2_p1_predmet, p1_predmet.getText().toString());
        saveText(sat_2_p1_kab, p1_kab.getText().toString());
        saveText(sat_2_p1_fam, p1_fam.getText().toString());

        saveText(sat_2_p2_time_start, p2_time_start.getText().toString());
        saveText(sat_2_p2_time_finish, p2_time_finish.getText().toString());
        saveText(sat_2_p2_predmet, p2_predmet.getText().toString());
        saveText(sat_2_p2_kab, p2_kab.getText().toString());
        saveText(sat_2_p2_fam, p2_fam.getText().toString());

        saveText(sat_2_p3_time_start, p3_time_start.getText().toString());
        saveText(sat_2_p3_time_finish, p3_time_finish.getText().toString());
        saveText(sat_2_p3_predmet, p3_predmet.getText().toString());
        saveText(sat_2_p3_kab, p3_kab.getText().toString());
        saveText(sat_2_p3_fam, p3_fam.getText().toString());

        saveText(sat_2_p4_time_start, p4_time_start.getText().toString());
        saveText(sat_2_p4_time_finish, p4_time_finish.getText().toString());
        saveText(sat_2_p4_predmet, p4_predmet.getText().toString());
        saveText(sat_2_p4_kab, p4_kab.getText().toString());
        saveText(sat_2_p4_fam, p4_fam.getText().toString());

    }

}
