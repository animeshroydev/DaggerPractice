package com.animesh.roy.daggerpractice.di;

import com.animesh.roy.daggerpractice.di.auth.AuthViewModelsModule;
import com.animesh.roy.daggerpractice.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();


}
