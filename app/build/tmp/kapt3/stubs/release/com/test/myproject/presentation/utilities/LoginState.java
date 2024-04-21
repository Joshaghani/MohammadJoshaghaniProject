package com.test.myproject.presentation.utilities;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.test.myproject.presentation.base.GlobalProperties;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/test/myproject/presentation/utilities/LoginState;", "", "()V", "editor", "Landroid/content/SharedPreferences$Editor;", "key", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "isLogin", "Lcom/test/myproject/presentation/utilities/LoginModel;", "logout", "", "setLogin", "username", "password", "app_release"})
public final class LoginState {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String key = "LoginUser";
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    private android.content.SharedPreferences.Editor editor;
    
    public LoginState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.test.myproject.presentation.utilities.LoginModel isLogin() {
        return null;
    }
    
    public final void setLogin(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void logout() {
    }
}