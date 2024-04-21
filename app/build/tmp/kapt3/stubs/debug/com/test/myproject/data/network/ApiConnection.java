package com.test.myproject.data.network;

import com.test.myproject.presentation.base.GlobalProperties;
import io.ktor.client.plugins.ClientRequestException;
import io.ktor.client.plugins.RedirectResponseException;
import io.ktor.client.plugins.ServerResponseException;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentType;
import io.ktor.serialization.JsonConvertException;
import kotlinx.coroutines.flow.Flow;
import java.io.Serializable;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001#BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u001e\b\u0002\u0010\t\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u001a0\u0019\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u0001H\u0086H\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001f\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010 \u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010!\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\"\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010\u001cR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\'\u0010\t\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/test/myproject/data/network/ApiConnection;", "", "url", "", "client", "Lio/ktor/client/HttpClient;", "type", "Lcom/test/myproject/data/network/ApiConnection$TypeMethod;", "input", "parameters", "", "Lkotlin/Pair;", "authorization", "(Ljava/lang/String;Lio/ktor/client/HttpClient;Lcom/test/myproject/data/network/ApiConnection$TypeMethod;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;)V", "getClient", "()Lio/ktor/client/HttpClient;", "getInput", "()Ljava/lang/Object;", "getParameters", "()Ljava/util/List;", "getType", "()Lcom/test/myproject/data/network/ApiConnection$TypeMethod;", "getUrl", "()Ljava/lang/String;", "callApi", "Lkotlinx/coroutines/flow/Flow;", "Lcom/test/myproject/data/network/ApiResult;", "T", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "Lio/ktor/client/statement/HttpResponse;", "get", "patch", "post", "put", "TypeMethod", "app_debug"})
public final class ApiConnection {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull
    private final io.ktor.client.HttpClient client = null;
    @org.jetbrains.annotations.NotNull
    private final com.test.myproject.data.network.ApiConnection.TypeMethod type = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object input = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.Object>> parameters = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String authorization = null;
    
    public ApiConnection(@org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    io.ktor.client.HttpClient client, @org.jetbrains.annotations.NotNull
    com.test.myproject.data.network.ApiConnection.TypeMethod type, @org.jetbrains.annotations.Nullable
    java.lang.Object input, @org.jetbrains.annotations.Nullable
    java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.lang.Object>> parameters, @org.jetbrains.annotations.Nullable
    java.lang.String authorization) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.ktor.client.HttpClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.data.network.ApiConnection.TypeMethod getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getInput() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<kotlin.Pair<java.lang.String, java.lang.Object>> getParameters() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object get(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object post(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object put(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object patch(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/test/myproject/data/network/ApiConnection$TypeMethod;", "", "(Ljava/lang/String;I)V", "GET", "POST", "PUT", "DELETE", "PATCH", "app_debug"})
    public static enum TypeMethod {
        /*public static final*/ GET /* = new GET() */,
        /*public static final*/ POST /* = new POST() */,
        /*public static final*/ PUT /* = new PUT() */,
        /*public static final*/ DELETE /* = new DELETE() */,
        /*public static final*/ PATCH /* = new PATCH() */;
        
        TypeMethod() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.test.myproject.data.network.ApiConnection.TypeMethod> getEntries() {
            return null;
        }
    }
}