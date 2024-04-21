package com.test.myproject.presentation.screens.splash;

import com.test.myproject.presentation.base.ViewEvent;
import com.test.myproject.presentation.base.ViewSideEffect;
import com.test.myproject.presentation.base.ViewState;
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract;", "", "()V", "Effect", "Event", "State", "app_release"})
public final class SplashScreenContract {
    
    public SplashScreenContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect;", "Lcom/test/myproject/presentation/base/ViewSideEffect;", "()V", "ErrorPage", "Loading", "Navigation", "Nothing", "ShowToast", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$ErrorPage;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$Loading;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$Navigation;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$Nothing;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$ShowToast;", "app_release"})
    public static abstract class Effect implements com.test.myproject.presentation.base.ViewSideEffect {
        
        private Effect() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$ErrorPage;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect;", "message", "", "event", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Event;", "(Ljava/lang/String;Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Event;)V", "getEvent", "()Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Event;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
        public static final class ErrorPage extends com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            @org.jetbrains.annotations.NotNull
            private final com.test.myproject.presentation.screens.splash.SplashScreenContract.Event event = null;
            
            public ErrorPage(@org.jetbrains.annotations.NotNull
            java.lang.String message, @org.jetbrains.annotations.NotNull
            com.test.myproject.presentation.screens.splash.SplashScreenContract.Event event) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.splash.SplashScreenContract.Event getEvent() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.splash.SplashScreenContract.Event component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect.ErrorPage copy(@org.jetbrains.annotations.NotNull
            java.lang.String message, @org.jetbrains.annotations.NotNull
            com.test.myproject.presentation.screens.splash.SplashScreenContract.Event event) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$Loading;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class Loading extends com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect {
            @org.jetbrains.annotations.NotNull
            public static final com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect.Loading INSTANCE = null;
            
            private Loading() {
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$Navigation;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect;", "()V", "LoginScreen", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$Navigation$LoginScreen;", "app_release"})
        public static abstract class Navigation extends com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect {
            
            private Navigation() {
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$Navigation$LoginScreen;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$Navigation;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
            public static final class LoginScreen extends com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect.Navigation {
                @org.jetbrains.annotations.NotNull
                public static final com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect.Navigation.LoginScreen INSTANCE = null;
                
                private LoginScreen() {
                }
                
                @java.lang.Override
                public boolean equals(@org.jetbrains.annotations.Nullable
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override
                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$Nothing;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class Nothing extends com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect {
            @org.jetbrains.annotations.NotNull
            public static final com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect.Nothing INSTANCE = null;
            
            private Nothing() {
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect$ShowToast;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Effect;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
        public static final class ShowToast extends com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            public ShowToast(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.splash.SplashScreenContract.Effect.ShowToast copy(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Event;", "Lcom/test/myproject/presentation/base/ViewEvent;", "()V", "GoToLoginScreen", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Event$GoToLoginScreen;", "app_release"})
    public static abstract class Event implements com.test.myproject.presentation.base.ViewEvent {
        
        private Event() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Event$GoToLoginScreen;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class GoToLoginScreen extends com.test.myproject.presentation.screens.splash.SplashScreenContract.Event {
            @org.jetbrains.annotations.NotNull
            public static final com.test.myproject.presentation.screens.splash.SplashScreenContract.Event.GoToLoginScreen INSTANCE = null;
            
            private GoToLoginScreen() {
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u00c6\u0003J1\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\bH\u00d6\u0001R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$State;", "Lcom/test/myproject/presentation/base/ViewState;", "Lcom/test/myproject/presentation/screens/splash/SplashScreenContract$Event;", "errorScreen", "Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;", "isLoading", "", "toastMessage", "", "(Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;ZLjava/lang/String;)V", "getErrorScreen", "()Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;", "setErrorScreen", "(Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;)V", "()Z", "setLoading", "(Z)V", "getToastMessage", "()Ljava/lang/String;", "setToastMessage", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_release"})
    public static final class State implements com.test.myproject.presentation.base.ViewState<com.test.myproject.presentation.screens.splash.SplashScreenContract.Event> {
        @org.jetbrains.annotations.Nullable
        private com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.splash.SplashScreenContract.Event> errorScreen;
        private boolean isLoading;
        @org.jetbrains.annotations.Nullable
        private java.lang.String toastMessage;
        
        public State(@org.jetbrains.annotations.Nullable
        com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.splash.SplashScreenContract.Event> errorScreen, boolean isLoading, @org.jetbrains.annotations.Nullable
        java.lang.String toastMessage) {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.Nullable
        public com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.splash.SplashScreenContract.Event> getErrorScreen() {
            return null;
        }
        
        @java.lang.Override
        public void setErrorScreen(@org.jetbrains.annotations.Nullable
        com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.splash.SplashScreenContract.Event> p0) {
        }
        
        @java.lang.Override
        public boolean isLoading() {
            return false;
        }
        
        @java.lang.Override
        public void setLoading(boolean p0) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.Nullable
        public java.lang.String getToastMessage() {
            return null;
        }
        
        @java.lang.Override
        public void setToastMessage(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        public State() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.splash.SplashScreenContract.Event> component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.test.myproject.presentation.screens.splash.SplashScreenContract.State copy(@org.jetbrains.annotations.Nullable
        com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.splash.SplashScreenContract.Event> errorScreen, boolean isLoading, @org.jetbrains.annotations.Nullable
        java.lang.String toastMessage) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}