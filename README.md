# AndroidLoading


![预览](https://github.com/miaotaoii/AndroidLoading/blob/master/show.gif?raw=true)
## 添加依赖: 
gradle

	dependencies {
	        implementation 'com.github.miaotaoii:AndroidLoading:v1.0'
	}

## Usage：

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
                    
### 显示默认Loading：
    loadingManager.show();
### 显示Loading并设置底部文字：
    loadingManager.show("客官稍等呀...");
### 隐藏Loading Dialog并设置隐藏后的回调，如不需要传入null：
     loadingManager.hide(null);
### 加载成功时隐藏Loading Dialog并设置隐藏后的回调，如不需要传入null：
     loadingManager.hideSuccess("加载成功", new LoadingDialog.OnDialogDismissedListener() {
     		 @Override
      		public void onDialogDismissed() {
              Intent intent = new Intent(MainActivity.this, SecondActivity.class);
              startActivity(intent);
              }
      });
### 加载失败时隐藏Loading Dialog并设置隐藏后的回调，如不需要传入null：
     loadingManager.hideError("加载失败", new LoadingDialog.OnDialogDismissedListener() {
          @Override
          public void onDialogDismissed() {
                finish();
          }
          });
### 加载Loading时改变文字：
     loadingManager.changeText("加载进度50%...");








 
