package com.test.myproject.presentation.screens.splash;

import android.os.Handler;
import android.os.Looper;
import com.test.myproject.data.managers.SplashService;
import com.test.myproject.presentation.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenViewModel;", "Lcom/test/myproject/presentation/base/BaseViewModel;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Event;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$State;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect;", "service", "Lcom/test/myproject/data/managers/SplashService;", "(Lcom/test/myproject/data/managers/SplashService;)V", "handleEvents", "", "event", "initViewModel", "setInitialState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SplashScreenViewModel extends com.test.myproject.presentation.base.BaseViewModel<com.test.myproject.presentation.screens.splash.SplashScreenContract.Event, com.test.myproject.presentation.screens.splash.SplashScreenContract.State, com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect> {
    @org.jetbrains.annotations.NotNull
    private final com.test.myproject.data.managers.SplashService service = null;
    
    @javax.inject.Inject
    public SplashScreenViewModel(@org.jetbrains.annotations.NotNull
    com.test.myproject.data.managers.SplashService service) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.test.myproject.presentation.screens.splash.SplashScreenContract.State setInitialState() {
        return null;
    }
    
    @java.lang.Override
    public void initViewModel() {
    }
    
    @java.lang.Override
    public void handleEvents(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.screens.splash.SplashScreenContract.Event event) {
    }
}