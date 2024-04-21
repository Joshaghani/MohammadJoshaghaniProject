package com.test.myproject.presentation.base.baseScreen;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.ViewModelProvider;
import com.test.myproject.presentation.base.BaseHandler;
import com.test.myproject.presentation.base.BaseViewModel;
import com.test.myproject.presentation.base.GlobalProperties;
import com.test.myproject.presentation.base.Navigator;
import com.test.myproject.presentation.base.ShowBottombar;
import com.test.myproject.presentation.base.ViewEvent;
import com.test.myproject.presentation.base.ViewSideEffect;
import com.test.myproject.presentation.base.ViewState;
import com.test.myproject.presentation.components.ISampleDialog;
import com.test.myproject.presentation.screens.login.LoginScreen;
import com.test.myproject.presentation.screens.main.MainScreen;
import com.test.myproject.presentation.screens.register.RegisterScreen;
import com.test.myproject.presentation.screens.splash.SplashScreen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u0006*\u001a\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00050\b2\u00020\tB\u0013\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00030\u000b\u00a2\u0006\u0002\u0010\fJ\u0015\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00028\u0000H\u0007\u00a2\u0006\u0002\u0010(J\u0015\u0010)\u001a\u00020\u00152\u0006\u0010\'\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010(J\b\u0010*\u001a\u00020\u0015H\u0007J\b\u0010+\u001a\u00020\u0015H\'J\u001c\u0010+\u001a\u00020\u00152\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-H\u0007J\u0010\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/J\u0006\u00101\u001a\u00020\u0015J\u0010\u00102\u001a\u00020\u00152\b\b\u0002\u00103\u001a\u00020/J\u0006\u00104\u001a\u00020/R$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\u000eX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00030\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00028\u00038FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#\u00a8\u00065"}, d2 = {"Lcom/test/myproject/presentation/base/baseScreen/RootScreen;", "State", "Lcom/test/myproject/presentation/base/ViewState;", "Event", "Lcom/test/myproject/presentation/base/ViewEvent;", "Effect", "Lcom/test/myproject/presentation/base/ViewSideEffect;", "VM", "Lcom/test/myproject/presentation/base/BaseViewModel;", "", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "handler", "Lcom/test/myproject/presentation/base/BaseHandler;", "getHandler", "()Lcom/test/myproject/presentation/base/BaseHandler;", "setHandler", "(Lcom/test/myproject/presentation/base/BaseHandler;)V", "onEventSent", "Lkotlin/Function1;", "", "getOnEventSent", "()Lkotlin/jvm/functions/Function1;", "setOnEventSent", "(Lkotlin/jvm/functions/Function1;)V", "scrollPosition", "Landroidx/compose/runtime/MutableState;", "", "getScrollPosition", "()Landroidx/compose/runtime/MutableState;", "setScrollPosition", "(Landroidx/compose/runtime/MutableState;)V", "viewModel", "getViewModel", "()Lcom/test/myproject/presentation/base/BaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "ComposeUI", "state", "(Lcom/test/myproject/presentation/base/ViewState;)V", "ComposeView", "ResetApp", "ShowCompose", "screen", "Lcom/test/myproject/presentation/base/baseScreen/IScreen;", "onBackPressed", "", "backFromDialog", "onRestart", "show", "replace", "showBottombar", "app_debug"})
public abstract class RootScreen<State extends com.test.myproject.presentation.base.ViewState<Event>, Event extends com.test.myproject.presentation.base.ViewEvent, Effect extends com.test.myproject.presentation.base.ViewSideEffect, VM extends com.test.myproject.presentation.base.BaseViewModel<Event, State, Effect>> {
    @org.jetbrains.annotations.NotNull
    private final java.lang.Class<VM> modelClass = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.Integer> scrollPosition;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super Event, kotlin.Unit> onEventSent;
    
    public RootScreen(@org.jetbrains.annotations.NotNull
    java.lang.Class<VM> modelClass) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.test.myproject.presentation.base.BaseHandler<VM, Effect> getHandler();
    
    public abstract void setHandler(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.base.BaseHandler<VM, Effect> p0);
    
    @androidx.compose.runtime.Composable
    public abstract void ComposeView(@org.jetbrains.annotations.NotNull
    State state);
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getScrollPosition() {
        return null;
    }
    
    public final void setScrollPosition(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final VM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<Event, kotlin.Unit> getOnEventSent() {
        return null;
    }
    
    public final void setOnEventSent(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super Event, kotlin.Unit> p0) {
    }
    
    @androidx.compose.runtime.Composable
    public abstract void ShowCompose();
    
    @androidx.compose.runtime.Composable
    public final void ShowCompose(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.base.baseScreen.IScreen<State, Event> screen) {
    }
    
    @androidx.compose.runtime.Composable
    public final void ComposeUI(@org.jetbrains.annotations.NotNull
    State state) {
    }
    
    public final void show(boolean replace) {
    }
    
    public final void onRestart() {
    }
    
    public final boolean onBackPressed(boolean backFromDialog) {
        return false;
    }
    
    public final boolean showBottombar() {
        return false;
    }
    
    @androidx.compose.runtime.Composable
    public final void ResetApp() {
    }
}