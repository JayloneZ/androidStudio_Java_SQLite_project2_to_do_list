package com.example.user.tasklist.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.user.tasklist.R;

public class ThemesActivity extends LayoutActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_themes);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.button1:
                Utils.changeToTheme(this, Utils.THEME_DPURPLE);
                break;
            case R.id.button2:
                Utils.changeToTheme(this, Utils.THEME_DRED);
                break;
            case R.id.button3:
                Utils.changeToTheme(this, Utils.THEME_DYELLOW);
                break;
            case R.id.button4:
                Utils.changeToTheme(this, Utils.THEME_LPURPLE);
                break;
            case R.id.button5:
                Utils.changeToTheme(this, Utils.THEME_DONOTCLICK);
                break;
            case R.id.button6:
                Utils.changeToTheme(this, Utils.THEME_PINK);
                break;
        }
    }


}
