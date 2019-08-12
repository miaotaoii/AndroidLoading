package com.mt.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mt.mtloadingmanager.LoadingDialog;
import com.mt.mtloadingmanager.LoadingManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LoadingManager loadingManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadingManager = new LoadingManager(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dismiss:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.show:
                loadingManager.show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                         loadingManager.hideSuccess("加载成功", new LoadingDialog.OnDialogDismissedListener() {
                            @Override
                            public void onDialogDismissed() {
                                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                startActivity(intent);
                            }
                        });

                    }
                }, 1000);
                break;
        }
    }
}
