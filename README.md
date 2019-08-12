# AndroidLoading
##简单的Loading 加载库

![预览](https://github.com/miaotaoii/AndroidLoading/blob/master/show.gif?raw=true)
## 添加依赖: 
gradle

	dependencies {
	        implementation 'com.github.miaotaoii:AndroidLoading:v1.0'
	}

## 使用方法：

    private LoadingManager loadingManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         loadingManager = new LoadingManager(this);
    }
    ...
           
     loadingManager.show();
            
     loadingManager.hideSuccess("加载完成！", new LoadingDialog.OnDialogDismissedListener() {
                        @Override
                        public void onDialogDismissed() {
                            finish();
                        }
                    });
                    
##接口说明：
 


    /**
     * 显示loading 并带默认字符串信息（"加载中..."）
     */
    void show();
    
     /**
     * 显示loading 并带字符串信息
     *
     * @param showText
     */
    void show(String showText);

    /**
     * 加载失败时隐藏loading
     *
     * @param hideText                  底部文字
     * @param onDialogDismissedListener 隐藏后的回调，如不需要传入null
     */
    void hideError(String hideText, LoadingDialog.OnDialogDismissedListener onDialogDismissedListener);


    /**
     * 加载成功时隐藏loading
     *
     * @param hideText 底部文字
     * @param listener 隐藏后的回调，如果不需要传入null
     */
    void hideSuccess(String hideText, LoadingDialog.OnDialogDismissedListener listener);

    /**
     * 不显示加载结果动画，直接隐藏
     *
     * @param listener 隐藏后的回调，如果不需要传入null
     */
    void hide(LoadingDialog.OnDialogDismissedListener listener);

    /**
     * 更新加载中的文字
     *
     * @param newText 更新的文字
     */
    void changeText(String newText);

