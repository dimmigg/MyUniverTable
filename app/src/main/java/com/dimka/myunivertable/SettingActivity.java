package com.dimka.myunivertable;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;


public class SettingActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.layout.activity_setting);

}
}
