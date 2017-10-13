package com.dimka.myunivertable;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

//    SharedPreferences sp;
    TextView mText1;
    TextView mText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // Отображение только портретный режим


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        mText1 = (TextView) findViewById(R.id.textWeek1);
        mText2 = (TextView) findViewById(R.id.textWeek2);

        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView1);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {



            @Override
            public void onSelectedDayChange(CalendarView view, int year,
                                            int month, int dayOfMonth) {
                int mYear = year;
                int mMonth = month;
                int mDay = dayOfMonth;




            }

        });

    }


    protected void onResume() {
        super.onResume();
        //проверка чекбокса в настройках и вывод текста
        Boolean chek = MainActivity.sp.getBoolean("cheks", false);
        if (chek) {
            mText1.setText(R.string.chetn1);
            mText2.setText(R.string.nechetn1);
        }else{
            mText1.setText(R.string.nechetn2);
            mText2.setText(R.string.chetn2);
        }
    }
}
