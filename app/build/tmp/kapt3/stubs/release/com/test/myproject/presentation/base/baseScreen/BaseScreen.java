package com.test.myproject.presentation.base.baseScreen;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Dp;
import com.test.myproject.presentation.base.BaseViewModel;
import com.test.myproject.presentation.base.ViewEvent;
import com.test.myproject.presentation.base.ViewSideEffect;
import com.test.myproject.presentation.base.ViewState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u0006*\u001a\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00050\b2\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00070\t2\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\nB\u0013\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00030\f\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0017R\"\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u001a"}, d2 = {"Lcom/test/myproject/presentation/base/baseScreen/BaseScreen;", "State", "Lcom/test/myproject/presentation/base/ViewState;", "Event", "Lcom/test/myproject/presentation/base/ViewEvent;", "Effect", "Lcom/test/myproject/presentation/base/ViewSideEffect;", "VM", "Lcom/test/myproject/presentation/base/BaseViewModel;", "Lcom/test/myproject/presentation/base/baseScreen/RootScreen;", "Lcom/test/myproject/presentation/base/baseScreen/IScreen;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "maxHeightScreen", "Landroidx/compose/ui/unit/Dp;", "getMaxHeightScreen-D9Ej5fM", "()F", "setMaxHeightScreen-0680j_4", "(F)V", "F", "SetScreen", "", "state", "(Lcom/test/myproject/presentation/base/ViewState;)V", "ShowCompose", "app_release"})
public abstract class BaseScreen<State extends com.test.myproject.presentation.base.ViewState<Event>, Event extends com.test.myproject.presentation.base.ViewEvent, Effect extends com.test.myproject.presentation.base.ViewSideEffect, VM extends com.test.myproject.presentation.base.BaseViewModel<Event, State, Effect>> extends com.test.myproject.presentation.base.baseScreen.RootScreen<State, Event, Effect, VM> implements com.test.myproject.presentation.base.baseScreen.IScreen<State, Event> {
    private float maxHeightScreen;
    
    public BaseScreen(@org.jetbrains.annotations.NotNull
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