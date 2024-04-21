package com.test.myproject.presentation.base.baseScreen;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import com.test.myproject.presentation.base.BaseViewModel;
import com.test.myproject.presentation.base.ViewEvent;
import com.test.myproject.presentation.base.ViewSideEffect;
import com.test.myproject.presentation.base.ViewState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u0006*\u001a\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00050\b2\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00070\t2\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\nB\u0013\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\f\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0017\u00a8\u0006\u0013"}, d2 = {"Lcom/test/myproject/presentation/base/baseScreen/BaseScreenUnScrollable;", "State", "Lcom/test/myproject/presentation/base/ViewState;", "Event", "Lcom/test/myproject/presentation/base/ViewEvent;", "Effect", "Lcom/test/myproject/presentation/base/ViewSideEffect;", "VM", "Lcom/test/myproject/presentation/base/BaseViewModel;", "Lcom/test/myproject/presentation/base/baseScreen/RootScreen;", "Lcom/test/myproject/presentation/base/baseScreen/IScreen;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "SetScreen", "", "state", "(Lcom/test/myproject/presentation/base/ViewState;)V", "ShowCompose", "app_release"})
public abstract class BaseScreenUnScrollable<State extends com.test.myproject.presentation.base.ViewState<Event>, Event extends com.test.myproject.presentation.base.ViewEvent, Effect extends com.test.myproject.presentation.base.ViewSideEffect, VM extends com.test.myproject.presentation.base.BaseViewModel<Event, State, Effect>> extends com.test.myproject.presentation.base.baseScreen.RootScreen<State, Event, Effect, VM> implements com.test.myproject.presentation.base.baseScreen.IScreen<State, Event> {
    
    public BaseScreenUnScrollable(@org.jetbrains.annotations.NotNull
    java.lang.Class<VM> modelClass) {
        super(null);
    }
    
    @java.lang.Override
    @androidx.compose.runtime.Composable
    public void ShowCompose() {
    }
    
    @java.lang.Override
    @androidx.compose.runtime.Composable
    public void SetScreen(@org.jetbrains.annotations.NotNull
    State state) {
    }
}