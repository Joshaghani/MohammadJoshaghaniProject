package com.test.myproject.presentation.base;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.graphics.painter.Painter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/test/myproject/presentation/base/ShowFab;", "", "IconFab", "Lcom/test/myproject/presentation/base/FabModel;", "onFabButtonPressed", "", "app_debug"})
public abstract interface ShowFab {
    
    public abstract void onFabButtonPressed();
    
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.Nullable
    public abstract com.test.myproject.presentation.base.FabModel IconFab();
}