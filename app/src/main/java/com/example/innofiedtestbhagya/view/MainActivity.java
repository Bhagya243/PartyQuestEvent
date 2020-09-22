package com.example.innofiedtestbhagya.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.innofiedtestbhagya.R;
import com.example.innofiedtestbhagya.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setMainActivityView(this);
    }

    public void ivCharitisClick(){
        nextActivity();
    }

    public void ivIdeasClick(){
        nextActivity();
    }
    public void ivOrgClick(){
        nextActivity();
    }

    public void ivCandidatesClick(){
        nextActivity();
    }

    private void nextActivity(){
        Intent intent = new Intent(MainActivity.this, EventListActivity.class);
        startActivity(intent);
    }
}