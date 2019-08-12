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
                        //   LoadingManager.getInstance().hideSuccess("loading success");
                        loadingManager.hideError("loading error", new LoadingDialog.OnDialogDismissedListener() {
                            @Override
                            public void onDialogDismissed() {
                                finish();
                            }
                        });

                    }
                }, 3000);
                break;
        }
    }
}
