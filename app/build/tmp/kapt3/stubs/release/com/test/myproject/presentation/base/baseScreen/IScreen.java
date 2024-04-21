package com.test.myproject.presentation.base.baseScreen;

import androidx.compose.runtime.Composable;
import com.test.myproject.presentation.base.ViewEvent;
import com.test.myproject.presentation.base.ViewState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/test/myproject/presentation/base/baseScreen/IScreen;", "STATE", "Lcom/test/myproject/presentation/base/ViewState;", "Event", "Lcom/test/myproject/presentation/base/ViewEvent;", "", "SetScreen", "", "state", "(Lcom/test/myproject/presentation/base/ViewState;)V", "app_release"})
public abstract interface IScreen<STATE extends com.test.myproject.presentation.base.ViewState<Event>, Event extends com.test.myproject.presentation.base.ViewEvent> {
    
    @androidx.compose.runtime.Composable
    public abstract void SetScreen(@org.jetbrains.annotations.NotNull
    STATE state);
}