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

    static EditText p1_predmet;
    static EditText p1_fam;
    static EditText p1_kab;
    static EditText p1_time_start;
    static EditText p1_time_finish;
    static EditText p2_predmet;
    static EditText p2_fam;
    static EditText p2_kab;
    static EditText p2_time_start;
    static EditText p2_time_finish;
    static EditText p3_predmet;
    static EditText p3_fam;
    static EditText p3_kab;
    static EditText p3_time_start;
    static EditText p3_time_finish;
    static EditText p4_predmet;
    static EditText p4_fam;
    static EditText p4_kab;
    static EditText p4_time_start;
    static EditText p4_time_finish;

    CheckBox mChkBox; //Чекбокс какая неделя
    TextView mDay;


    static SharedPreferences sPref;
    final String SAVED_TEXT = "SAVED_TEXT";


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

    final static String mon_1_p2_time_start = "mon_2_p2_time_start";
    final static String tue_1_p2_time_start = "tue_2_p2_time_start";
    final static String wed_1_p2_time_start = "wed_2_p2_time_start";
    final static String thu_1_p2_time_start = "thu_2_p2_time_start";
    final static String fri_1_p2_time_start = "fri_2_p2_time_start";
    final static String sat_1_p2_time_start = "sat_2_p2_time_start";

    final static String mon_1_p2_time_finish = "mon_2_p2_time_finish";
    final static String tue_1_p2_time_finish = "tue_2_p2_time_finish";
    final static String wed_1_p2_time_finish = "wed_2_p2_time_finish";
    final static String thu_1_p2_time_finish = "thu_2_p2_time_finish";
    final static String fri_1_p2_time_finish = "fri_2_p2_time_finish";
    final static String sat_1_p2_time_finish = "sat_2_p2_time_finish";

    final static String mon_1_p2_predmet = "mon_2_p2_predmet";
    final static String tue_1_p2_predmet = "tue_2_p2_predmet";
    final static String wed_1_p2_predmet = "wed_2_p2_predmet";
    final static String thu_1_p2_predmet = "thu_2_p2_predmet";
    final static String fri_1_p2_predmet = "fri_2_p2_predmet";
    final static String sat_1_p2_predmet = "sat_2_p2_predmet";

    final static String mon_1_p2_kab = "mon_2_p2_time_kab";
    final static String tue_1_p2_kab = "tue_2_p2_time_kab";
    final static String wed_1_p2_kab = "wed_2_p2_time_kab";
    final static String thu_1_p2_kab = "thu_2_p2_time_kab";
    final static String fri_1_p2_kab = "fri_2_p2_time_kab";
    final static String sat_1_p2_kab = "sat_2_p2_time_kab";

    final static String mon_1_p2_fam = "mon_2_p2_time_fam";
    final static String tue_1_p2_fam = "tue_2_p2_time_fam";
    final static String wed_1_p2_fam = "wed_2_p2_time_fam";
    final static String thu_1_p2_fam = "thu_2_p2_time_fam";
    final static String fri_1_p2_fam = "fri_2_p2_time_fam";
    final static String sat_1_p2_fam = "sat_2_p2_time_fam";

    final static String mon_1_p3_time_start = "mon_3_p3_time_start";
    final static String tue_1_p3_time_start = "tue_3_p3_time_start";
    final static String wed_1_p3_time_start = "wed_3_p3_time_start";
    final static String thu_1_p3_time_start = "thu_3_p3_time_start";
    final static String fri_1_p3_time_start = "fri_3_p3_time_start";
    final static String sat_1_p3_time_start = "sat_3_p3_time_start";

    final static String mon_1_p3_time_finish = "mon_3_p3_time_finish";
    final static String tue_1_p3_time_finish = "tue_3_p3_time_finish";
    final static String wed_1_p3_time_finish = "wed_3_p3_time_finish";
    final static String thu_1_p3_time_finish = "thu_3_p3_time_finish";
    final static String fri_1_p3_time_finish = "fri_3_p3_time_finish";
    final static String sat_1_p3_time_finish = "sat_3_p3_time_finish";

    final static String mon_1_p3_predmet = "mon_3_p3_predmet";
    final static String tue_1_p3_predmet = "tue_3_p3_predmet";
    final static String wed_1_p3_predmet = "wed_3_p3_predmet";
    final static String thu_1_p3_predmet = "thu_3_p3_predmet";
    final static String fri_1_p3_predmet = "fri_3_p3_predmet";
    final static String sat_1_p3_predmet = "sat_3_p3_predmet";

    final static String mon_1_p3_kab = "mon_3_p3_time_kab";
    final static String tue_1_p3_kab = "tue_3_p3_time_kab";
    final static String wed_1_p3_kab = "wed_3_p3_time_kab";
    final static String thu_1_p3_kab = "thu_3_p3_time_kab";
    final static String fri_1_p3_kab = "fri_3_p3_time_kab";
    final static String sat_1_p3_kab = "sat_3_p3_time_kab";

    final static String mon_1_p3_fam = "mon_3_p3_time_fam";
    final static String tue_1_p3_fam = "tue_3_p3_time_fam";
    final static String wed_1_p3_fam = "wed_3_p3_time_fam";
    final static String thu_1_p3_fam = "thu_3_p3_time_fam";
    final static String fri_1_p3_fam = "fri_3_p3_time_fam";
    final static String sat_1_p3_fam = "sat_3_p3_time_fam";

    final static String mon_1_p4_time_start = "mon_4_p4_time_start";
    final static String tue_1_p4_time_start = "tue_4_p4_time_start";
    final static String wed_1_p4_time_start = "wed_4_p4_time_start";
    final static String thu_1_p4_time_start = "thu_4_p4_time_start";
    final static String fri_1_p4_time_start = "fri_4_p4_time_start";
    final static String sat_1_p4_time_start = "sat_4_p4_time_start";

    final static String mon_1_p4_time_finish = "mon_4_p4_time_finish";
    final static String tue_1_p4_time_finish = "tue_4_p4_time_finish";
    final static String wed_1_p4_time_finish = "wed_4_p4_time_finish";
    final static String thu_1_p4_time_finish = "thu_4_p4_time_finish";
    final static String fri_1_p4_time_finish = "fri_4_p4_time_finish";
    final static String sat_1_p4_time_finish = "sat_4_p4_time_finish";

    final static String mon_1_p4_predmet = "mon_4_p4_predmet";
    final static String tue_1_p4_predmet = "tue_4_p4_predmet";
    final static String wed_1_p4_predmet = "wed_4_p4_predmet";
    final static String thu_1_p4_predmet = "thu_4_p4_predmet";
    final static String fri_1_p4_predmet = "fri_4_p4_predmet";
    final static String sat_1_p4_predmet = "sat_4_p4_predmet";

    final static String mon_1_p4_kab = "mon_4_p4_time_kab";
    final static String tue_1_p4_kab = "tue_4_p4_time_kab";
    final static String wed_1_p4_kab = "wed_4_p4_time_kab";
    final static String thu_1_p4_kab = "thu_4_p4_time_kab";
    final static String fri_1_p4_kab = "fri_4_p4_time_kab";
    final static String sat_1_p4_kab = "sat_4_p4_time_kab";

    final static String mon_1_p4_fam = "mon_4_p4_time_fam";
    final static String tue_1_p4_fam = "tue_4_p4_time_fam";
    final static String wed_1_p4_fam = "wed_4_p4_time_fam";
    final static String thu_1_p4_fam = "thu_4_p4_time_fam";
    final static String fri_1_p4_fam = "fri_4_p4_time_fam";
    final static String sat_1_p4_fam = "sat_4_p4_time_fam";





    final static String mon_2_p1_time_start = "mon_1_p1_time_start";
    final static String tue_2_p1_time_start = "tue_1_p1_time_start";
    final static String wed_2_p1_time_start = "wed_1_p1_time_start";
    final static String thu_2_p1_time_start = "thu_1_p1_time_start";
    final static String fri_2_p1_time_start = "fri_1_p1_time_start";
    final static String sat_2_p1_time_start = "sat_1_p1_time_start";

    final static String mon_2_p1_time_finish = "mon_1_p1_time_finish";
    final static String tue_2_p1_time_finish = "tue_1_p1_time_finish";
    final static String wed_2_p1_time_finish = "wed_1_p1_time_finish";
    final static String thu_2_p1_time_finish = "thu_1_p1_time_finish";
    final static String fri_2_p1_time_finish = "fri_1_p1_time_finish";
    final static String sat_2_p1_time_finish = "sat_1_p1_time_finish";

    final static String mon_2_p1_predmet = "mon_1_p1_predmet";
    final static String tue_2_p1_predmet = "tue_1_p1_predmet";
    final static String wed_2_p1_predmet = "wed_1_p1_predmet";
    final static String thu_2_p1_predmet = "thu_1_p1_predmet";
    final static String fri_2_p1_predmet = "fri_1_p1_predmet";
    final static String sat_2_p1_predmet = "sat_1_p1_predmet";

    final static String mon_2_p1_kab = "mon_1_p1_time_kab";
    final static String tue_2_p1_kab = "tue_1_p1_time_kab";
    final static String wed_2_p1_kab = "wed_1_p1_time_kab";
    final static String thu_2_p1_kab = "thu_1_p1_time_kab";
    final static String fri_2_p1_kab = "fri_1_p1_time_kab";
    final static String sat_2_p1_kab = "sat_1_p1_time_kab";

    final static String mon_2_p1_fam = "mon_1_p1_time_fam";
    final static String tue_2_p1_fam = "tue_1_p1_time_fam";
    final static String wed_2_p1_fam = "wed_1_p1_time_fam";
    final static String thu_2_p1_fam = "thu_1_p1_time_fam";
    final static String fri_2_p1_fam = "fri_1_p1_time_fam";
    final static String sat_2_p1_fam = "sat_1_p1_time_fam";

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

    final static String mon_2_p3_time_start = "mon_3_p3_time_start";
    final static String tue_2_p3_time_start = "tue_3_p3_time_start";
    final static String wed_2_p3_time_start = "wed_3_p3_time_start";
    final static String thu_2_p3_time_start = "thu_3_p3_time_start";
    final static String fri_2_p3_time_start = "fri_3_p3_time_start";
    final static String sat_2_p3_time_start = "sat_3_p3_time_start";

    final static String mon_2_p3_time_finish = "mon_3_p3_time_finish";
    final static String tue_2_p3_time_finish = "tue_3_p3_time_finish";
    final static String wed_2_p3_time_finish = "wed_3_p3_time_finish";
    final static String thu_2_p3_time_finish = "thu_3_p3_time_finish";
    final static String fri_2_p3_time_finish = "fri_3_p3_time_finish";
    final static String sat_2_p3_time_finish = "sat_3_p3_time_finish";

    final static String mon_2_p3_predmet = "mon_3_p3_predmet";
    final static String tue_2_p3_predmet = "tue_3_p3_predmet";
    final static String wed_2_p3_predmet = "wed_3_p3_predmet";
    final static String thu_2_p3_predmet = "thu_3_p3_predmet";
    final static String fri_2_p3_predmet = "fri_3_p3_predmet";
    final static String sat_2_p3_predmet = "sat_3_p3_predmet";

    final static String mon_2_p3_kab = "mon_3_p3_time_kab";
    final static String tue_2_p3_kab = "tue_3_p3_time_kab";
    final static String wed_2_p3_kab = "wed_3_p3_time_kab";
    final static String thu_2_p3_kab = "thu_3_p3_time_kab";
    final static String fri_2_p3_kab = "fri_3_p3_time_kab";
    final static String sat_2_p3_kab = "sat_3_p3_time_kab";

    final static String mon_2_p3_fam = "mon_3_p3_time_fam";
    final static String tue_2_p3_fam = "tue_3_p3_time_fam";
    final static String wed_2_p3_fam = "wed_3_p3_time_fam";
    final static String thu_2_p3_fam = "thu_3_p3_time_fam";
    final static String fri_2_p3_fam = "fri_3_p3_time_fam";
    final static String sat_2_p3_fam = "sat_3_p3_time_fam";

    final static String mon_2_p4_time_start = "mon_4_p4_time_start";
    final static String tue_2_p4_time_start = "tue_4_p4_time_start";
    final static String wed_2_p4_time_start = "wed_4_p4_time_start";
    final static String thu_2_p4_time_start = "thu_4_p4_time_start";
    final static String fri_2_p4_time_start = "fri_4_p4_time_start";
    final static String sat_2_p4_time_start = "sat_4_p4_time_start";

    final static String mon_2_p4_time_finish = "mon_4_p4_time_finish";
    final static String tue_2_p4_time_finish = "tue_4_p4_time_finish";
    final static String wed_2_p4_time_finish = "wed_4_p4_time_finish";
    final static String thu_2_p4_time_finish = "thu_4_p4_time_finish";
    final static String fri_2_p4_time_finish = "fri_4_p4_time_finish";
    final static String sat_2_p4_time_finish = "sat_4_p4_time_finish";

    final static String mon_2_p4_predmet = "mon_4_p4_predmet";
    final static String tue_2_p4_predmet = "tue_4_p4_predmet";
    final static String wed_2_p4_predmet = "wed_4_p4_predmet";
    final static String thu_2_p4_predmet = "thu_4_p4_predmet";
    final static String fri_2_p4_predmet = "fri_4_p4_predmet";
    final static String sat_2_p4_predmet = "sat_4_p4_predmet";

    final static String mon_2_p4_kab = "mon_4_p4_time_kab";
    final static String tue_2_p4_kab = "tue_4_p4_time_kab";
    final static String wed_2_p4_kab = "wed_4_p4_time_kab";
    final static String thu_2_p4_kab = "thu_4_p4_time_kab";
    final static String fri_2_p4_kab = "fri_4_p4_time_kab";
    final static String sat_2_p4_kab = "sat_4_p4_time_kab";

    final static String mon_2_p4_fam = "mon_4_p4_time_fam";
    final static String tue_2_p4_fam = "tue_4_p4_time_fam";
    final static String wed_2_p4_fam = "wed_4_p4_time_fam";
    final static String thu_2_p4_fam = "thu_4_p4_time_fam";
    final static String fri_2_p4_fam = "fri_4_p4_time_fam";
    final static String sat_2_p4_fam = "sat_4_p4_time_fam";


    @Override
    protected void onStart() {
        super.onStart();
        MainActivity.fri_1.fam1 = "test";
    }


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

        mMo = (Button) findViewById(R.id.mo);
        mTu = (Button) findViewById(R.id.tu);
        mWe = (Button) findViewById(R.id.we);
        mTh = (Button) findViewById(R.id.th);
        mFr = (Button) findViewById(R.id.fr);
        mSa = (Button) findViewById(R.id.sa);

        p1_predmet = (EditText) findViewById(R.id.p1_predmet);
        p1_fam = (EditText) findViewById(R.id.p1_fam);
        p1_kab = (EditText) findViewById(R.id.p1_kab);
        p1_time_start = (EditText) findViewById(R.id.p1_time_start);
        p1_time_finish = (EditText) findViewById(R.id.p1_time_finish);

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

            switch (view.getId()) {


                case R.id.close:
                    //  Intent intent = new Intent(EditActivity.this, MainActivity.class);
                    //  startActivity(intent);
                    Toast.makeText(EditActivity.this, "ntcn", Toast.LENGTH_SHORT).show();
                    onBackPressed();
                    break;
                case R.id.mo:
                    Toast.makeText(EditActivity.this, "1", Toast.LENGTH_SHORT).show();
                    a = 1;
                    Toast.makeText(EditActivity.this, MainActivity.SAVED_TEXT, Toast.LENGTH_SHORT).show();
                    loadText();
                    break;

                case R.id.tu:
                    Toast.makeText(EditActivity.this, "2", Toast.LENGTH_SHORT).show();
                    a = 2;
                    break;

                case R.id.we:
                    Toast.makeText(EditActivity.this, "3", Toast.LENGTH_SHORT).show();
                    a = 3;
                    break;

                case R.id.th:
                    Toast.makeText(EditActivity.this, "4", Toast.LENGTH_SHORT).show();
                    a = 4;
                    break;

                case R.id.fr:
                    Toast.makeText(EditActivity.this, "5", Toast.LENGTH_SHORT).show();
                    a = 5;
                    break;

                case R.id.sa:
                    Toast.makeText(EditActivity.this, "6", Toast.LENGTH_SHORT).show();
                    a = 6;
                    break;

                case R.id.save:
                    saveText(mon_1_p1_time_start, p1_time_start.getText().toString());
                    Toast.makeText(EditActivity.this, p1_fam.getText().toString(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(EditActivity.this, MainActivity.SAVED_TEXT, Toast.LENGTH_SHORT).show();
                    break;
            }


        }


    };

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
//        ed.apply();
        ed.commit();
//        Toast.makeText(this, SAVED_TEXT, Toast.LENGTH_SHORT).show();

    }

    void loadText() {
        sPref = getSharedPreferences("MyPref", MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        Toast.makeText(this, "a tut text" + savedText, Toast.LENGTH_SHORT).show();
    }

}
