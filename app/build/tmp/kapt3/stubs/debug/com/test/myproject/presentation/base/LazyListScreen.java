package com.test.myproject.presentation.base;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.graphics.painter.Painter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/test/myproject/presentation/base/LazyListScreen;", "State", "Lcom/test/myproject/presentation/base/ViewState;", "Event", "Lcom/test/myproject/presentation/base/ViewEvent;", "", "FooterUI", "", "state", "(Lcom/test/myproject/presentation/base/ViewState;)V", "ItemUI", "index", "", "item", "(Lcom/test/myproject/presentation/base/ViewState;ILjava/lang/Object;)V", "getItemsList", "", "(Lcom/test/myproject/presentation/base/ViewState;)Ljava/util/List;", "app_debug"})
public abstract interface LazyListScreen<State extends com.test.myproject.presentation.base.ViewState<Event>, Event extends com.test.myproject.presentation.base.ViewEvent> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.Object> getItemsList(@org.jetbrains.annotations.NotNull
    State state);
    
    @androidx.compose.runtime.Composable
    public abstract void ItemUI(@org.jetbrains.annotations.NotNull
    State state, int index, @org.jetbrains.annotations.NotNull
    java.lang.Object item);
    
    @androidx.compose.runtime.Composable
    public abstract void FooterUI(@org.jetbrains.annotations.NotNull
    State state);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.compose.runtime.Composable
        public static <State extends com.test.myproject.presentation.base.ViewState<Event>, Event extends com.test.myproject.presentation.base.ViewEvent>void FooterUI(@org.jetbrains.annotations.NotNull
        com.test.myproject.presentation.base.LazyListScreen<State, Event> $this, @org.jetbrains.annotations.NotNull
        State state) {
        }
    }
}