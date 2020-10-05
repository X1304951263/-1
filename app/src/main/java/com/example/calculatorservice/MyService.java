package com.example.calculatorservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    private static final String TAG="myServicetag";
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public int jia(int x,int y){
        return x+y;
    }
    public int jian(int x,int y){
        return x-y;
    }
    public int cheng(int x,int y){
        return x*y;
    }
    public int chu(int x,int y){
        return x/y;
    }
}
