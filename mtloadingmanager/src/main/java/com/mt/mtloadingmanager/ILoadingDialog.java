package com.mt.mtloadingmanager;

public interface ILoadingDialog {
    void show(String showText);

    void show();

    void hideError(String hideText, LoadingDialog.OnDialogDismissedListener onDialogDismissedListener);

    void hideSuccess(String hideText, LoadingDialog.OnDialogDismissedListener listener);

    void hide(LoadingDialog.OnDialogDismissedListener listener);

    void changeText(String newText);
}

