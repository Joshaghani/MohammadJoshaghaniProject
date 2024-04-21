package com.test.myproject.presentation.base;

import androidx.compose.runtime.MutableState;
import com.test.myproject.presentation.base.baseScreen.RootScreen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005J\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u000e\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005R2\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/test/myproject/presentation/base/Navigator;", "", "()V", "currentScreen", "Landroidx/compose/runtime/MutableState;", "Lcom/test/myproject/presentation/base/baseScreen/RootScreen;", "getCurrentScreen", "()Landroidx/compose/runtime/MutableState;", "setCurrentScreen", "(Landroidx/compose/runtime/MutableState;)V", "stack", "", "add", "", "screen", "clear", "isMainScreen", "", "remove", "app_debug"})
public final class Navigator {
    @org.jetbrains.annotations.NotNull
    private static java.util.List<com.test.myproject.presentation.base.baseScreen.RootScreen<?, ?, ?, ?>> stack;
    @org.jetbrains.annotations.NotNull
    private static androidx.compose.runtime.MutableState<com.test.myproject.presentation.base.baseScreen.RootScreen<?, ?, ?, ?>> currentScreen;
    @org.jetbrains.annotations.NotNull
    public static final com.test.myproject.presentation.base.Navigator INSTANCE = null;
    
    private Navigator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.test.myproject.presentation.base.baseScreen.RootScreen<?, ?, ?, ?>> getCurrentScreen() {
        return null;
    }
    
    public final void setCurrentScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<com.test.myproject.presentation.base.baseScreen.RootScreen<?, ?, ?, ?>> p0) {
    }
    
    public final boolean isMainScreen() {
        return false;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.base.baseScreen.RootScreen<?, ?, ?, ?> screen) {
    }
    
    public final boolean remove(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.base.baseScreen.RootScreen<?, ?, ?, ?> screen) {
        return false;
    }
    
    public final void clear() {
    }
}