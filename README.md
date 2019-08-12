# AndroidLoading
简单的Loading 加载库

## 添加依赖 
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
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
        
            loadingManager.show();
            
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                
                    loadingManager.hideSuccess("加载完成！", new LoadingDialog.OnDialogDismissedListener() {
                        @Override
                        public void onDialogDismissed() {
                            finish();
                        }
                    });
                    
                }
            }, 3000);
        }
    }


