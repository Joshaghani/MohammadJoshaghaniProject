package com.test.myproject.presentation.base;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u001fH&J4\u0010#\u001a\u00020\u001f2\'\u0010$\u001a#\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\'\u0012\u0006\u0012\u0004\u0018\u00010(0%\u00a2\u0006\u0002\b)\u00a2\u0006\u0002\u0010*J\u0014\u0010\u0013\u001a\u00020\u001f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00020,J\u0013\u0010-\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0000\u00a2\u0006\u0002\u0010!J\r\u0010.\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010/\u001a\u00020\u001f2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000101\u00a2\u0006\u0002\b)J\b\u00102\u001a\u00020\u001fH\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00028\u00018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00063"}, d2 = {"Lcom/test/myproject/presentation/base/BaseViewModel;", "Event", "Lcom/test/myproject/presentation/base/ViewEvent;", "UiState", "Lcom/test/myproject/presentation/base/ViewState;", "Effect", "Lcom/test/myproject/presentation/base/ViewSideEffect;", "Landroidx/lifecycle/ViewModel;", "()V", "_effect", "Lkotlinx/coroutines/channels/Channel;", "_event", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_viewState", "Landroidx/compose/runtime/MutableState;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "setEffect", "(Lkotlinx/coroutines/flow/Flow;)V", "initialState", "getInitialState", "()Lcom/test/myproject/presentation/base/ViewState;", "initialState$delegate", "Lkotlin/Lazy;", "viewState", "Landroidx/compose/runtime/State;", "getViewState", "()Landroidx/compose/runtime/State;", "handleEvents", "", "event", "(Lcom/test/myproject/presentation/base/ViewEvent;)V", "initViewModel", "launchOnScope", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "builder", "Lkotlin/Function0;", "setEvent", "setInitialState", "setState", "reducer", "Lkotlin/Function1;", "subscribeToEvents", "app_debug"})
public abstract class BaseViewModel<Event extends com.test.myproject.presentation.base.ViewEvent, UiState extends com.test.myproject.presentation.base.ViewState<Event>, Effect extends com.test.myproject.presentation.base.ViewSideEffect> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy initialState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<UiState> _viewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<UiState> viewState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<Event> _event = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.channels.Channel<Effect> _effect;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<? extends Effect> effect;
    
    public BaseViewModel() {
        super();
    }
    
    public abstract void initViewModel();
    
    @org.jetbrains.annotations.NotNull
    public abstract UiState setInitialState();
    
    public abstract void handleEvents(@org.jetbrains.annotations.NotNull
    Event event);
    
    private final UiState getInitialState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<UiState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<Effect> getEffect() {
        return null;
    }
    
    public final void setEffect(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends Effect> p0) {
    }
    
    public final void launchOnScope(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
    
    private final void subscribeToEvents() {
    }
    
    public final void setEvent(@org.jetbrains.annotations.NotNull
    Event event) {
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super UiState, ? extends UiState> reducer) {
    }
    
    public final void setEffect(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends Effect> builder) {
    }
}