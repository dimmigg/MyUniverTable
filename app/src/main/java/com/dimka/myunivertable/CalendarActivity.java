package com.dimka.myunivertable;

import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarActivity extends AppCompatActivity {

    SharedPreferences sp;
    TextView mText1;
    TextView mText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // Отображение только портретный режим


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView1);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year,
                                            int month, int dayOfMonth) {
                int mYear = year;
                int mMonth = month;
                int mDay = dayOfMonth;



//                String selectedDate = new StringBuilder().append(mMonth + 1)
//                        .append("-").append(mDay).append("-").append(mYear)
//                        .append(" ").toString();
//                Toast.makeText(getApplicationContext(), selectedDate, Toast.LENGTH_LONG).show();

                mText1 = (TextView) findViewById(R.id.textWeek1);
                mText2 = (TextView) findViewById(R.id.textWeek2);

            }
        });
//
//        int TimeTextSize = sp.getInt("chek", 0);
//        if (TimeTextSize == 1) {
//            mText1.setText(R.string.chetn);
//            mText2.setText(R.string.nechetn);
//        } else {
//            mText1.setText(R.string.nechetn);
//            mText2.setText(R.string.chetn);
//        }

//        boolean chk = Boolean.parseBoolean(sp.getBoolean("chb", true));
    }

}
