package com.test.myproject.presentation.screens.register;

import com.test.myproject.data.database.room.entities.Person;
import com.test.myproject.domain.IApiResponse;
import com.test.myproject.domain.IResponse;
import com.test.myproject.presentation.base.ViewEvent;
import com.test.myproject.presentation.base.ViewSideEffect;
import com.test.myproject.presentation.base.ViewState;
import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract;", "", "()V", "Effect", "Event", "State", "app_debug"})
public final class RegisterScreenContract {
    
    public RegisterScreenContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect;", "Lcom/test/myproject/presentation/base/ViewSideEffect;", "()V", "ErrorPage", "Loading", "Navigation", "Nothing", "ShowToast", "SuccessGetRegister", "SuccessGetResgisterApi", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$ErrorPage;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Loading;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Nothing;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$ShowToast;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$SuccessGetRegister;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$SuccessGetResgisterApi;", "app_debug"})
    public static abstract class Effect implements com.test.myproject.presentation.base.ViewSideEffect {
        
        private Effect() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$ErrorPage;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect;", "message", "", "event", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event;", "(Ljava/lang/String;Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event;)V", "getEvent", "()Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ErrorPage extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            @org.jetbrains.annotations.NotNull
            private final com.test.myproject.presentation.screens.register.RegisterScreenContract.Event event = null;
            
            public ErrorPage(@org.jetbrains.annotations.NotNull
            java.lang.String message, @org.jetbrains.annotations.NotNull
            com.test.myproject.presentation.screens.register.RegisterScreenContract.Event event) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.register.RegisterScreenContract.Event getEvent() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.register.RegisterScreenContract.Event component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.ErrorPage copy(@org.jetbrains.annotations.NotNull
            java.lang.String message, @org.jetbrains.annotations.NotNull
            com.test.myproject.presentation.screens.register.RegisterScreenContract.Event event) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Loading;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Loading extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect {
            @org.jetbrains.annotations.NotNull
            public static final com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.Loading INSTANCE = null;
            
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect;", "()V", "Back", "LoginScreen", "MainScreen", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation$Back;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation$LoginScreen;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation$MainScreen;", "app_debug"})
        public static abstract class Navigation extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect {
            
            private Navigation() {
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation$Back;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
            public static final class Back extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.Navigation {
                @org.jetbrains.annotations.NotNull
                public static final com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.Navigation.Back INSTANCE = null;
                
                private Back() {
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation$LoginScreen;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
            public static final class LoginScreen extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.Navigation {
                @org.jetbrains.annotations.NotNull
                private final java.lang.String email = null;
                
                public LoginScreen(@org.jetbrains.annotations.NotNull
                java.lang.String email) {
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String getEmail() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.Navigation.LoginScreen copy(@org.jetbrains.annotations.NotNull
                java.lang.String email) {
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation$MainScreen;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Navigation;", "person", "Lcom/test/myproject/data/database/room/entities/Person;", "(Lcom/test/myproject/data/database/room/entities/Person;)V", "getPerson", "()Lcom/test/myproject/data/database/room/entities/Person;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
            public static final class MainScreen extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.Navigation {
                @org.jetbrains.annotations.NotNull
                private final com.test.myproject.data.database.room.entities.Person person = null;
                
                public MainScreen(@org.jetbrains.annotations.NotNull
                com.test.myproject.data.database.room.entities.Person person) {
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.test.myproject.data.database.room.entities.Person getPerson() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.test.myproject.data.database.room.entities.Person component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.Navigation.MainScreen copy(@org.jetbrains.annotations.NotNull
                com.test.myproject.data.database.room.entities.Person person) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$Nothing;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Nothing extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect {
            @org.jetbrains.annotations.NotNull
            public static final com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.Nothing INSTANCE = null;
            
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$ShowToast;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowToast extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect {
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
            public final com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.ShowToast copy(@org.jetbrains.annotations.NotNull
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$SuccessGetRegister;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect;", "IResponse", "Lcom/test/myproject/domain/IResponse;", "(Lcom/test/myproject/domain/IResponse;)V", "getIResponse", "()Lcom/test/myproject/domain/IResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class SuccessGetRegister extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect {
            @org.jetbrains.annotations.NotNull
            private final com.test.myproject.domain.IResponse IResponse = null;
            
            public SuccessGetRegister(@org.jetbrains.annotations.NotNull
            com.test.myproject.domain.IResponse IResponse) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.domain.IResponse getIResponse() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.domain.IResponse component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.SuccessGetRegister copy(@org.jetbrains.annotations.NotNull
            com.test.myproject.domain.IResponse IResponse) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect$SuccessGetResgisterApi;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Effect;", "response", "Lcom/test/myproject/domain/IApiResponse;", "(Lcom/test/myproject/domain/IApiResponse;)V", "getResponse", "()Lcom/test/myproject/domain/IApiResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class SuccessGetResgisterApi extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect {
            @org.jetbrains.annotations.NotNull
            private final com.test.myproject.domain.IApiResponse response = null;
            
            public SuccessGetResgisterApi(@org.jetbrains.annotations.NotNull
            com.test.myproject.domain.IApiResponse response) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.domain.IApiResponse getResponse() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.domain.IApiResponse component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.register.RegisterScreenContract.Effect.SuccessGetResgisterApi copy(@org.jetbrains.annotations.NotNull
            com.test.myproject.domain.IApiResponse response) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event;", "Lcom/test/myproject/presentation/base/ViewEvent;", "()V", "GetRegisterApi", "GoToLoginScreen", "Register", "SetEmailText", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event$GetRegisterApi;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event$GoToLoginScreen;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event$Register;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event$SetEmailText;", "app_debug"})
    public static abstract class Event implements com.test.myproject.presentation.base.ViewEvent {
        
        private Event() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event$GetRegisterApi;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class GetRegisterApi extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Event {
            @org.jetbrains.annotations.NotNull
            public static final com.test.myproject.presentation.screens.register.RegisterScreenContract.Event.GetRegisterApi INSTANCE = null;
            
            private GetRegisterApi() {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event$GoToLoginScreen;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class GoToLoginScreen extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Event {
            @org.jetbrains.annotations.NotNull
            public static final com.test.myproject.presentation.screens.register.RegisterScreenContract.Event.GoToLoginScreen INSTANCE = null;
            
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event$Register;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Register extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Event {
            @org.jetbrains.annotations.NotNull
            public static final com.test.myproject.presentation.screens.register.RegisterScreenContract.Event.Register INSTANCE = null;
            
            private Register() {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event$SetEmailText;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class SetEmailText extends com.test.myproject.presentation.screens.register.RegisterScreenContract.Event {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String email = null;
            
            public SetEmailText(@org.jetbrains.annotations.NotNull
            java.lang.String email) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getEmail() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.test.myproject.presentation.screens.register.RegisterScreenContract.Event.SetEmailText copy(@org.jetbrains.annotations.NotNull
            java.lang.String email) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fH\u00c6\u0003JI\u0010&\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u0010\'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\bH\u00d6\u0001R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006-"}, d2 = {"Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$State;", "Lcom/test/myproject/presentation/base/ViewState;", "Lcom/test/myproject/presentation/screens/register/RegisterScreenContract$Event;", "errorScreen", "Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;", "isLoading", "", "toastMessage", "", "responseRegister", "Lcom/test/myproject/domain/IResponse;", "responseRegisterApi", "Lcom/test/myproject/domain/IApiResponse;", "(Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;ZLjava/lang/String;Lcom/test/myproject/domain/IResponse;Lcom/test/myproject/domain/IApiResponse;)V", "getErrorScreen", "()Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;", "setErrorScreen", "(Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;)V", "()Z", "setLoading", "(Z)V", "getResponseRegister", "()Lcom/test/myproject/domain/IResponse;", "setResponseRegister", "(Lcom/test/myproject/domain/IResponse;)V", "getResponseRegisterApi", "()Lcom/test/myproject/domain/IApiResponse;", "setResponseRegisterApi", "(Lcom/test/myproject/domain/IApiResponse;)V", "getToastMessage", "()Ljava/lang/String;", "setToastMessage", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class State implements com.test.myproject.presentation.base.ViewState<com.test.myproject.presentation.screens.register.RegisterScreenContract.Event> {
        @org.jetbrains.annotations.Nullable
        private com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.register.RegisterScreenContract.Event> errorScreen;
        private boolean isLoading;
        @org.jetbrains.annotations.Nullable
        private java.lang.String toastMessage;
        @org.jetbrains.annotations.Nullable
        private com.test.myproject.domain.IResponse responseRegister;
        @org.jetbrains.annotations.Nullable
        private com.test.myproject.domain.IApiResponse responseRegisterApi;
        
        public State(@org.jetbrains.annotations.Nullable
        com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.register.RegisterScreenContract.Event> errorScreen, boolean isLoading, @org.jetbrains.annotations.Nullable
        java.lang.String toastMessage, @org.jetbrains.annotations.Nullable
        com.test.myproject.domain.IResponse responseRegister, @org.jetbrains.annotations.Nullable
        com.test.myproject.domain.IApiResponse responseRegisterApi) {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.Nullable
        public com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.register.RegisterScreenContract.Event> getErrorScreen() {
            return null;
        }
        
        @java.lang.Override
        public void setErrorScreen(@org.jetbrains.annotations.Nullable
        com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.register.RegisterScreenContract.Event> p0) {
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
        
        @org.jetbrains.annotations.Nullable
        public final com.test.myproject.domain.IResponse getResponseRegister() {
            return null;
        }
        
        public final void setResponseRegister(@org.jetbrains.annotations.Nullable
        com.test.myproject.domain.IResponse p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.test.myproject.domain.IApiResponse getResponseRegisterApi() {
            return null;
        }
        
        public final void setResponseRegisterApi(@org.jetbrains.annotations.Nullable
        com.test.myproject.domain.IApiResponse p0) {
        }
        
        public State() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.register.RegisterScreenContract.Event> component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.test.myproject.domain.IResponse component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.test.myproject.domain.IApiResponse component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.test.myproject.presentation.screens.register.RegisterScreenContract.State copy(@org.jetbrains.annotations.Nullable
        com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<com.test.myproject.presentation.screens.register.RegisterScreenContract.Event> errorScreen, boolean isLoading, @org.jetbrains.annotations.Nullable
        java.lang.String toastMessage, @org.jetbrains.annotations.Nullable
        com.test.myproject.domain.IResponse responseRegister, @org.jetbrains.annotations.Nullable
        com.test.myproject.domain.IApiResponse responseRegisterApi) {
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