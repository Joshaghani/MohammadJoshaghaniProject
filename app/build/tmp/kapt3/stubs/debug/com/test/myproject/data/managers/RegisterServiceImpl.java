package com.test.myproject.data.managers;

import com.test.myproject.data.network.ApiConnection;
import com.test.myproject.data.network.ApiResult;
import com.test.myproject.data.network.ApiRoute;
import com.test.myproject.domain.IApiResponse;
import com.test.myproject.domain.IResponse;
import com.test.myproject.domain.register.RegisterInputEmail;
import com.test.myproject.domain.register.RegisterInputUsername;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00a2\u0006\u0002\u0010\tJ*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/test/myproject/data/managers/RegisterServiceImpl;", "Lcom/test/myproject/data/managers/RegisterService;", "client", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;)V", "registerApi", "Lkotlinx/coroutines/flow/Flow;", "Lcom/test/myproject/data/network/ApiResult;", "Lcom/test/myproject/domain/IApiResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWithEmail", "Lcom/test/myproject/domain/IResponse;", "input", "Lcom/test/myproject/domain/register/RegisterInputEmail;", "flow", "", "(Lcom/test/myproject/domain/register/RegisterInputEmail;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWithUsername", "Lcom/test/myproject/domain/register/RegisterInputUsername;", "(Lcom/test/myproject/domain/register/RegisterInputUsername;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RegisterServiceImpl implements com.test.myproject.data.managers.RegisterService {
    @org.jetbrains.annotations.NotNull
    private final io.ktor.client.HttpClient client = null;
    
    public RegisterServiceImpl(@org.jetbrains.annotations.NotNull
    io.ktor.client.HttpClient client) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object registerApi(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.test.myproject.data.network.ApiResult<com.test.myproject.domain.IApiResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object registerWithEmail(@org.jetbrains.annotations.NotNull
    com.test.myproject.domain.register.RegisterInputEmail input, @org.jetbrains.annotations.NotNull
    java.lang.String flow, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.test.myproject.data.network.ApiResult<com.test.myproject.domain.IResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object registerWithUsername(@org.jetbrains.annotations.NotNull
    com.test.myproject.domain.register.RegisterInputUsername input, @org.jetbrains.annotations.NotNull
    java.lang.String flow, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.test.myproject.data.network.ApiResult<com.test.myproject.domain.IResponse>>> $completion) {
        return null;
    }
}