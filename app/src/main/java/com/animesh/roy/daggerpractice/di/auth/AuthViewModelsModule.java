package com.animesh.roy.daggerpractice.di.auth;

import androidx.lifecycle.ViewModel;

import com.animesh.roy.daggerpractice.di.ViewModelKey;
import com.animesh.roy.daggerpractice.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindsAuthViewModel(AuthViewModel viewModel);
}
