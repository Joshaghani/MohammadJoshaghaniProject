package com.test.myproject.presentation.screens.main;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.test.myproject.R;
import com.test.myproject.presentation.base.BaseHandler;
import com.test.myproject.presentation.base.FabModel;
import com.test.myproject.presentation.base.GlobalProperties;
import com.test.myproject.presentation.base.ShowBottombar;
import com.test.myproject.presentation.base.ShowFab;
import com.test.myproject.presentation.base.ShowTopbar;
import com.test.myproject.presentation.base.baseScreen.BaseScreen;
import com.test.myproject.presentation.components.ISampleDialog;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u00062\u00020\u00072\u00020\bB\r\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0017J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0017J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\r8\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/test/myproject/presentation/screens/main/MainScreen;", "Lcom/test/myproject/presentation/base/baseScreen/BaseScreen;", "Lcom/test/myproject/presentation/screens/main/MainScreenContract$State;", "Lcom/test/myproject/presentation/screens/main/MainScreenContract$Event;", "Lcom/test/myproject/presentation/screens/main/MainScreenContract$Effect;", "Lcom/test/myproject/presentation/screens/main/MainScreenViewModel;", "Lcom/test/myproject/presentation/base/ShowBottombar;", "Lcom/test/myproject/presentation/base/ShowTopbar;", "Lcom/test/myproject/presentation/base/ShowFab;", "email", "", "(Ljava/lang/String;)V", "handler", "Lcom/test/myproject/presentation/base/BaseHandler;", "getHandler", "()Lcom/test/myproject/presentation/base/BaseHandler;", "setHandler", "(Lcom/test/myproject/presentation/base/BaseHandler;)V", "ComposeView", "", "state", "IconFab", "Lcom/test/myproject/presentation/base/FabModel;", "onFabButtonPressed", "titleTopBar", "app_release"})
public final class MainScreen extends com.test.myproject.presentation.base.baseScreen.BaseScreen<com.test.myproject.presentation.screens.main.MainScreenContract.State, com.test.myproject.presentation.screens.main.MainScreenContract.Event, com.test.myproject.presentation.screens.main.MainScreenContract.Effect, com.test.myproject.presentation.screens.main.MainScreenViewModel> implements com.test.myproject.presentation.base.ShowBottombar, com.test.myproject.presentation.base.ShowTopbar, com.test.myproject.presentation.base.ShowFab {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = null;
    @javax.inject.Inject
    public com.test.myproject.presentation.base.BaseHandler<com.test.myproject.presentation.screens.main.MainScreenViewModel, com.test.myproject.presentation.screens.main.MainScreenContract.Effect> handler;
    
    public MainScreen(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.test.myproject.presentation.base.BaseHandler<com.test.myproject.presentation.screens.main.MainScreenViewModel, com.test.myproject.presentation.screens.main.MainScreenContract.Effect> getHandler() {
        return null;
    }
    
    @java.lang.Override
    public void setHandler(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.base.BaseHandler<com.test.myproject.presentation.screens.main.MainScreenViewModel, com.test.myproject.presentation.screens.main.MainScreenContract.Effect> p0) {
    }
    
    @java.lang.Override
    @androidx.compose.runtime.Composable
    public void ComposeView(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.screens.main.MainScreenContract.State state) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String titleTopBar() {
        return null;
    }
    
    @java.lang.Override
    public void onFabButtonPressed() {
    }
    
    @java.lang.Override
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.Nullable
    public com.test.myproject.presentation.base.FabModel IconFab() {
        return null;
    }
}