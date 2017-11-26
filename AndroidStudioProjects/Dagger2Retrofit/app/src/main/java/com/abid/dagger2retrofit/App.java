package com.abid.dagger2retrofit;

import android.app.Application;

import com.abid.dagger2retrofit.dagger.component.DaggerNetComponent;
import com.abid.dagger2retrofit.dagger.component.NetComponent;
import com.abid.dagger2retrofit.dagger.module.AppModule;
import com.abid.dagger2retrofit.dagger.module.NetModule;

/**
 * Created by abid on 11/26/17.
 */

public class App extends Application{
    private NetComponent mNetComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent= DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://www.jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
