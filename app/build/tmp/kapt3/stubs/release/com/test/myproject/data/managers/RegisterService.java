package com.test.myproject.data.managers;

import com.test.myproject.data.network.ApiResult;
import com.test.myproject.domain.IApiResponse;
import com.test.myproject.domain.register.RegisterInput;
import com.test.myproject.domain.IResponse;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/test/myproject/data/managers/RegisterService;", "", "register", "Lkotlinx/coroutines/flow/Flow;", "Lcom/test/myproject/data/network/ApiResult;", "Lcom/test/myproject/domain/IResponse;", "input", "Lcom/test/myproject/domain/register/RegisterInput;", "flow", "", "(Lcom/test/myproject/domain/register/RegisterInput;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerApi", "Lcom/test/myproject/domain/IApiResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface RegisterService {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object registerApi(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.test.myproject.data.network.ApiResult<com.test.myproject.domain.IApiResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull
    com.test.myproject.domain.register.RegisterInput input, @org.jetbrains.annotations.NotNull
    java.lang.String flow, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.test.myproject.data.network.ApiResult<com.test.myproject.domain.IResponse>>> $completion);
}