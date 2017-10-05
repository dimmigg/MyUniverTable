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
    EditText p1_prepod;
    EditText p1_kab;
    EditText p1_time_start;
    EditText p1_time_finish;

    EditText p2_predmet;
    EditText p2_prepod;
    EditText p2_kab;
    EditText p2_time_start;
    EditText p2_time_finish;

    EditText p3_predmet;
    EditText p3_prepod;
    EditText p3_kab;
    EditText p3_time_start;
    EditText p3_time_finish;

    EditText p4_predmet;
    EditText p4_prepod;
    EditText p4_kab;
    EditText p4_time_start;
    EditText p4_time_finish;

    CheckBox mChkBox; //Чекбокс какая неделя
    TextView day;


    SharedPreferences sPref;
    final String SAVED_TEXT = "saved_text";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // Отображение только портретный режим

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        save = (Button) findViewById(R.id.save);
        close = (Button) findViewById(R.id.close);

        mMo = (Button) findViewById(R.id.mo);
        mTu = (Button) findViewById(R.id.tu);
        mWe = (Button) findViewById(R.id.we);
        mTh = (Button) findViewById(R.id.th);
        mFr = (Button) findViewById(R.id.fr);
        mSa = (Button) findViewById(R.id.sa);

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

    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, p1_prepod.getText().toString());
        ed.commit();
        Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

}
