package com.test.myproject.presentation.screens.login;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.ImeAction;
import com.test.myproject.R;
import com.test.myproject.presentation.base.BaseHandler;
import com.test.myproject.presentation.base.GlobalProperties;
import com.test.myproject.presentation.base.baseScreen.BaseScreen;
import com.test.myproject.presentation.root.Res;
import com.test.myproject.presentation.components.textFieldTheme.TypeInputTextField;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\'\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0017R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/test/myproject/presentation/screens/login/LoginScreen;", "Lcom/test/myproject/presentation/base/baseScreen/BaseScreen;", "Lcom/test/myproject/presentation/screens/login/LoginScreenContract$State;", "Lcom/test/myproject/presentation/screens/login/LoginScreenContract$Event;", "Lcom/test/myproject/presentation/screens/login/LoginScreenContract$Effect;", "Lcom/test/myproject/presentation/screens/login/LoginScreenViewModel;", "email", "", "handler", "Lcom/test/myproject/presentation/base/BaseHandler;", "(Ljava/lang/String;Lcom/test/myproject/presentation/base/BaseHandler;)V", "getHandler", "()Lcom/test/myproject/presentation/base/BaseHandler;", "setHandler", "(Lcom/test/myproject/presentation/base/BaseHandler;)V", "ComposeView", "", "state", "app_debug"})
public final class LoginScreen extends com.test.myproject.presentation.base.baseScreen.BaseScreen<com.test.myproject.presentation.screens.login.LoginScreenContract.State, com.test.myproject.presentation.screens.login.LoginScreenContract.Event, com.test.myproject.presentation.screens.login.LoginScreenContract.Effect, com.test.myproject.presentation.screens.login.LoginScreenViewModel> {
    @org.jetbrains.annotations.NotNull
    private com.test.myproject.presentation.base.BaseHandler<com.test.myproject.presentation.screens.login.LoginScreenViewModel, com.test.myproject.presentation.screens.login.LoginScreenContract.Effect> handler;
    
    public LoginScreen(@org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.base.BaseHandler<com.test.myproject.presentation.screens.login.LoginScreenViewModel, com.test.myproject.presentation.screens.login.LoginScreenContract.Effect> handler) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.test.myproject.presentation.base.BaseHandler<com.test.myproject.presentation.screens.login.LoginScreenViewModel, com.test.myproject.presentation.screens.login.LoginScreenContract.Effect> getHandler() {
        return null;
    }
    
    @java.lang.Override
    public void setHandler(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.base.BaseHandler<com.test.myproject.presentation.screens.login.LoginScreenViewModel, com.test.myproject.presentation.screens.login.LoginScreenContract.Effect> p0) {
    }
    
    @java.lang.Override
    @androidx.compose.runtime.Composable
    public void ComposeView(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.screens.login.LoginScreenContract.State state) {
    }
    
    public LoginScreen() {
        super(null);
    }
}