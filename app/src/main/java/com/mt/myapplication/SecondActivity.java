package com.mt.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.mt.mtloadingmanager.LoadingDialog;
import com.mt.mtloadingmanager.LoadingManager;

public class SecondActivity extends Activity implements View.OnClickListener {

    private LoadingManager loadingManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_second);
        loadingManager = new LoadingManager(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button:
                loadingManager.show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadingManager.changeText("显示加载过程...");

                    }
                }, 1000);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //   LoadingManager.getInstance().hideSuccess("loading success");
                        loadingManager.hideError("加载失败", new LoadingDialog.OnDialogDismissedListener() {
                            @Override
                            public void onDialogDismissed() {
                                finish();
                            }
                        });

                    }
                }, 2000);
                break;
        }
    }
}
