package com.pxh.base.core;

import android.content.Context;

public class CoreLibSdk {

    private Context context;

    private CoreLibSdk(){
    }

    private static class SingletonInstance {
        private static final CoreLibSdk coreLibSdk = new CoreLibSdk();
    }

    public synchronized static CoreLibSdk getInstance(){
        return SingletonInstance.coreLibSdk;
    }

    public void init(Context context){
        this.context = context;
    }



}
