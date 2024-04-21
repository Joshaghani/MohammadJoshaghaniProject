package com.test.myproject.presentation.base.baseScreen;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.CardDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import com.test.myproject.presentation.base.BaseViewModel;
import com.test.myproject.presentation.base.LazyListScreen;
import com.test.myproject.presentation.base.ViewEvent;
import com.test.myproject.presentation.base.ViewSideEffect;
import com.test.myproject.presentation.base.ViewState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u0006*\u001a\b\u0003\u0010\u0007*\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00050\b2\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00070\t2\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\n2\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u000bB\u0013\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00030\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0019H\u0017J\b\u0010\u001e\u001a\u00020\u0019H\u0016R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001f"}, d2 = {"Lcom/test/myproject/presentation/base/baseScreen/BaseScreenLazyList;", "State", "Lcom/test/myproject/presentation/base/ViewState;", "Event", "Lcom/test/myproject/presentation/base/ViewEvent;", "Effect", "Lcom/test/myproject/presentation/base/ViewSideEffect;", "VM", "Lcom/test/myproject/presentation/base/BaseViewModel;", "Lcom/test/myproject/presentation/base/baseScreen/RootScreen;", "Lcom/test/myproject/presentation/base/baseScreen/IScreen;", "Lcom/test/myproject/presentation/base/LazyListScreen;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "isStickyHeader", "", "()Z", "listLazyState", "Landroidx/compose/foundation/lazy/LazyListState;", "getListLazyState", "()Landroidx/compose/foundation/lazy/LazyListState;", "setListLazyState", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "LoadMoreProgressbar", "", "SetScreen", "state", "(Lcom/test/myproject/presentation/base/ViewState;)V", "ShowCompose", "lazyColumnScrolledEnd", "app_release"})
public abstract class BaseScreenLazyList<State extends com.test.myproject.presentation.base.ViewState<Event>, Event extends com.test.myproject.presentation.base.ViewEvent, Effect extends com.test.myproject.presentation.base.ViewSideEffect, VM extends com.test.myproject.presentation.base.BaseViewModel<Event, State, Effect>> extends com.test.myproject.presentation.base.baseScreen.RootScreen<State, Event, Effect, VM> implements com.test.myproject.presentation.base.baseScreen.IScreen<State, Event>, com.test.myproject.presentation.base.LazyListScreen<State, Event> {
    private final boolean isStickyHeader = false;
    public androidx.compose.foundation.lazy.LazyListState listLazyState;
    
    public BaseScreenLazyList(@org.jetbrains.annotations.NotNull
    java.lang.Class<VM> modelClass) {
        super(null);
    }
    
    @java.lang.Override
    @androidx.compose.runtime.Composable
    public void ShowCompose() {
    }
    
    public boolean isStickyHeader() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.foundation.lazy.LazyListState getListLazyState() {
        return null;
    }
    
    public final void setListLazyState(@org.jetbrains.annotations.NotNull
    androidx.compose.foundation.lazy.LazyListState p0) {
    }
    
    @java.lang.Override
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable
    public void SetScreen(@org.jetbrains.annotations.NotNull
    State state) {
    }
    
    @androidx.compose.runtime.Composable
    public final void LoadMoreProgressbar() {
    }
    
    public void lazyColumnScrolledEnd() {
    }
    
    @java.lang.Override
    @androidx.compose.runtime.Composable
    public void FooterUI(@org.jetbrains.annotations.NotNull
    State state) {
    }
}