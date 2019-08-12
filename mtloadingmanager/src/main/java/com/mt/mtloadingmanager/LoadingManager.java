package com.mt.mtloadingmanager;

import android.content.Context;

public class LoadingManager implements ILoadingDialog {
    private LoadingDialog mLoadingDialog;

    private void bind(Context context) {
        mLoadingDialog = new LoadingDialog(context);
    }

    public LoadingManager(Context context) {
        bind(context);
    }


    @Override
    public void show(String showText) {
        mLoadingDialog.showLoadingDialog(showText);
    }

    @Override
    public void show() {
        mLoadingDialog.showLoadingDialog("");
    }

    @Override
    public void hideError(String hideText, LoadingDialog.OnDialogDismissedListener onDialogDismissedListener) {
        mLoadingDialog.setOnDialogDismissed(onDialogDismissedListener);

        mLoadingDialog.hideError(hideText);
    }

    @Override
    public void hideSuccess(String hideText, LoadingDialog.OnDialogDismissedListener listener) {
        mLoadingDialog.setOnDialogDismissed(listener);

        mLoadingDialog.hideSuccess(hideText);

    }

    @Override
    public void hide(LoadingDialog.OnDialogDismissedListener listener) {
        mLoadingDialog.setOnDialogDismissed(listener);

        mLoadingDialog.hideNow();

    }


    @Override
    public void changeText(String newText) {
        mLoadingDialog.refreshLoadingText(newText);
    }
}
