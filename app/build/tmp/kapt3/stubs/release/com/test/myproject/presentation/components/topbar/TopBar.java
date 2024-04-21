package com.test.myproject.presentation.components.topbar;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.CardDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.test.myproject.presentation.base.Navigator;
import com.test.myproject.presentation.base.ShowTopbar;
import com.test.myproject.presentation.base.baseScreen.BaseScreenLazyList;
import com.test.myproject.presentation.screens.main.MainScreen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/test/myproject/presentation/components/topbar/TopBar;", "", "()V", "height", "", "screen", "Lcom/test/myproject/presentation/base/baseScreen/RootScreen;", "getScreen", "()Lcom/test/myproject/presentation/base/baseScreen/RootScreen;", "speed", "", "getSpeed", "()D", "Show", "", "TopBar", "ShowBodyTopbar", "ShowNavigationIcon", "app_release"})
public final class TopBar {
    @org.jetbrains.annotations.Nullable
    private final com.test.myproject.presentation.base.baseScreen.RootScreen<?, ?, ?, ?> screen = null;
    private final double speed = 0.8;
    private final int height = 0;
    
    public TopBar() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.test.myproject.presentation.base.baseScreen.RootScreen<?, ?, ?, ?> getScreen() {
        return null;
    }
    
    public final double getSpeed() {
        return 0.0;
    }
    
    @androidx.compose.runtime.Composable
    public final void Show() {
    }
    
    @android.annotation.SuppressLint(value = {"NotConstructor"})
    @androidx.compose.runtime.Composable
    private final void TopBar() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/components/topbar/TopBar$ShowBodyTopbar;", "", "heightTopBar", "", "(Lcom/test/myproject/presentation/components/topbar/TopBar;I)V", "getHeightTopBar", "()I", "isMainScreen", "", "Show", "", "app_release"})
    final class ShowBodyTopbar {
        private final int heightTopBar = 0;
        private boolean isMainScreen;
        
        public ShowBodyTopbar(int heightTopBar) {
            super();
        }
        
        public final int getHeightTopBar() {
            return 0;
        }
        
        @androidx.compose.runtime.Composable
        public final void Show() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0003J\b\u0010\u0007\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/test/myproject/presentation/components/topbar/TopBar$ShowNavigationIcon;", "", "(Lcom/test/myproject/presentation/components/topbar/TopBar;)V", "show", "", "IconBack", "", "Show", "app_release"})
    final class ShowNavigationIcon {
        private boolean show;
        
        public ShowNavigationIcon() {
            super();
        }
        
        @androidx.compose.runtime.Composable
        public final void Show() {
        }
        
        @androidx.compose.runtime.Composable
        private final void IconBack() {
        }
    }
}