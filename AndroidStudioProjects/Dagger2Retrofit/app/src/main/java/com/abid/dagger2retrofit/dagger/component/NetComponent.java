package com.abid.dagger2retrofit.dagger.component;

import com.abid.dagger2retrofit.MainActivity;
import com.abid.dagger2retrofit.dagger.module.AppModule;
import com.abid.dagger2retrofit.dagger.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by abid on 11/26/17.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}
