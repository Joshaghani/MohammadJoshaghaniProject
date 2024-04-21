package com.test.myproject.presentation.screens.login;

import com.test.myproject.data.database.repository.LoginRepository;
import com.test.myproject.data.database.room.ResponseDb;
import com.test.myproject.data.managers.LoginService;
import com.test.myproject.presentation.base.BaseViewModel;
import com.test.myproject.presentation.screens.login.dto.LoginInputDto;
import com.test.myproject.presentation.utilities.LoginState;
import com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001 B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0006\u0010\u001f\u001a\u00020\u001bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/test/myproject/presentation/screens/login/LoginScreenViewModel;", "Lcom/test/myproject/presentation/base/BaseViewModel;", "Lcom/test/myproject/presentation/screens/login/LoginScreenContract$Event;", "Lcom/test/myproject/presentation/screens/login/LoginScreenContract$State;", "Lcom/test/myproject/presentation/screens/login/LoginScreenContract$Effect;", "repository", "Lcom/test/myproject/data/database/repository/LoginRepository;", "service", "Lcom/test/myproject/data/managers/LoginService;", "(Lcom/test/myproject/data/database/repository/LoginRepository;Lcom/test/myproject/data/managers/LoginService;)V", "email", "Landroidx/compose/runtime/MutableState;", "", "getEmail", "()Landroidx/compose/runtime/MutableState;", "setEmail", "(Landroidx/compose/runtime/MutableState;)V", "loginState", "Lcom/test/myproject/presentation/utilities/LoginState;", "getLoginState", "()Lcom/test/myproject/presentation/utilities/LoginState;", "setLoginState", "(Lcom/test/myproject/presentation/utilities/LoginState;)V", "password", "getPassword", "setPassword", "handleEvents", "", "event", "initViewModel", "setInitialState", "setLogin", "TypeRequests", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LoginScreenViewModel extends com.test.myproject.presentation.base.BaseViewModel<com.test.myproject.presentation.screens.login.LoginScreenContract.Event, com.test.myproject.presentation.screens.login.LoginScreenContract.State, com.test.myproject.presentation.screens.login.LoginScreenContract.Effect> {
    @org.jetbrains.annotations.NotNull
    private final com.test.myproject.data.database.repository.LoginRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.test.myproject.data.managers.LoginService service = null;
    @javax.inject.Inject
    public com.test.myproject.presentation.utilities.LoginState loginState;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.String> email;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.String> password;
    
    @javax.inject.Inject
    public LoginScreenViewModel(@org.jetbrains.annotations.NotNull
    com.test.myproject.data.database.repository.LoginRepository repository, @org.jetbrains.annotations.NotNull
    com.test.myproject.data.managers.LoginService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.utilities.LoginState getLoginState() {
        return null;
    }
    
    public final void setLoginState(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.utilities.LoginState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    @java.lang.Override
    public void initViewModel() {
    }
    
    public final void setLogin() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.test.myproject.presentation.screens.login.LoginScreenContract.State setInitialState() {
        return null;
    }
    
    @java.lang.Override
    public void handleEvents(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.screens.login.LoginScreenContract.Event event) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/test/myproject/presentation/screens/login/LoginScreenViewModel$TypeRequests;", "", "type", "Lcom/test/myproject/presentation/screens/login/LoginScreenContract$Event;", "(Ljava/lang/String;ILcom/test/myproject/presentation/screens/login/LoginScreenContract$Event;)V", "getType", "()Lcom/test/myproject/presentation/screens/login/LoginScreenContract$Event;", "LOGIN", "LOGIN_API", "app_release"})
    public static enum TypeRequests {
        /*public static final*/ LOGIN /* = new LOGIN(null) */,
        /*public static final*/ LOGIN_API /* = new LOGIN_API(null) */;
        @org.jetbrains.annotations.NotNull
        private final com.test.myproject.presentation.screens.login.LoginScreenContract.Event type = null;
        
        TypeRequests(com.test.myproject.presentation.screens.login.LoginScreenContract.Event type) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.test.myproject.presentation.screens.login.LoginScreenContract.Event getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.test.myproject.presentation.screens.login.LoginScreenViewModel.TypeRequests> getEntries() {
            return null;
        }
    }
}