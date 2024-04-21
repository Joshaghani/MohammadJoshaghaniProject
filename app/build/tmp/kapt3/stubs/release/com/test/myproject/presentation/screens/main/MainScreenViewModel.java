package com.test.myproject.presentation.screens.main;

import com.test.myproject.data.managers.MainService;
import com.test.myproject.presentation.base.BaseViewModel;
import com.test.myproject.presentation.utilities.LoginState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/test/myproject/presentation/screens/main/MainScreenViewModel;", "Lcom/test/myproject/presentation/base/BaseViewModel;", "Lcom/test/myproject/presentation/screens/main/MainScreenContract$Event;", "Lcom/test/myproject/presentation/screens/main/MainScreenContract$State;", "Lcom/test/myproject/presentation/screens/main/MainScreenContract$Effect;", "service", "Lcom/test/myproject/data/managers/MainService;", "(Lcom/test/myproject/data/managers/MainService;)V", "loginState", "Lcom/test/myproject/presentation/utilities/LoginState;", "getLoginState", "()Lcom/test/myproject/presentation/utilities/LoginState;", "setLoginState", "(Lcom/test/myproject/presentation/utilities/LoginState;)V", "handleEvents", "", "event", "initViewModel", "setInitialState", "TypeRequests", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainScreenViewModel extends com.test.myproject.presentation.base.BaseViewModel<com.test.myproject.presentation.screens.main.MainScreenContract.Event, com.test.myproject.presentation.screens.main.MainScreenContract.State, com.test.myproject.presentation.screens.main.MainScreenContract.Effect> {
    @org.jetbrains.annotations.NotNull
    private final com.test.myproject.data.managers.MainService service = null;
    @javax.inject.Inject
    public com.test.myproject.presentation.utilities.LoginState loginState;
    
    @javax.inject.Inject
    public MainScreenViewModel(@org.jetbrains.annotations.NotNull
    com.test.myproject.data.managers.MainService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.utilities.LoginState getLoginState() {
        return null;
    }
    
    public final void setLoginState(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.utilities.LoginState p0) {
    }
    
    @java.lang.Override
    public void initViewModel() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.test.myproject.presentation.screens.main.MainScreenContract.State setInitialState() {
        return null;
    }
    
    @java.lang.Override
    public void handleEvents(@org.jetbrains.annotations.NotNull
    com.test.myproject.presentation.screens.main.MainScreenContract.Event event) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/test/myproject/presentation/screens/main/MainScreenViewModel$TypeRequests;", "", "type", "Lcom/test/myproject/presentation/screens/main/MainScreenContract$Event;", "(Ljava/lang/String;ILcom/test/myproject/presentation/screens/main/MainScreenContract$Event;)V", "getType", "()Lcom/test/myproject/presentation/screens/main/MainScreenContract$Event;", "app_release"})
    public static enum TypeRequests {
;
        @org.jetbrains.annotations.NotNull
        private final com.test.myproject.presentation.screens.main.MainScreenContract.Event type = null;
        
        TypeRequests(com.test.myproject.presentation.screens.main.MainScreenContract.Event type) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.test.myproject.presentation.screens.main.MainScreenContract.Event getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.test.myproject.presentation.screens.main.MainScreenViewModel.TypeRequests> getEntries() {
            return null;
        }
    }
}