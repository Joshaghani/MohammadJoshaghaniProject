package com.test.myproject.presentation.base;

import com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R \u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/test/myproject/presentation/base/ViewState;", "Event", "Lcom/test/myproject/presentation/base/ViewEvent;", "", "errorScreen", "Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;", "getErrorScreen", "()Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;", "setErrorScreen", "(Lcom/test/myproject/presentation/components/errorScreen/ErrorScreenMessage;)V", "isLoading", "", "()Z", "setLoading", "(Z)V", "toastMessage", "", "getToastMessage", "()Ljava/lang/String;", "setToastMessage", "(Ljava/lang/String;)V", "app_release"})
public abstract interface ViewState<Event extends com.test.myproject.presentation.base.ViewEvent> {
    
    @org.jetbrains.annotations.Nullable
    public abstract com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<Event> getErrorScreen();
    
    public abstract void setErrorScreen(@org.jetbrains.annotations.Nullable
    com.test.myproject.presentation.components.errorScreen.ErrorScreenMessage<Event> p0);
    
    public abstract boolean isLoading();
    
    public abstract void setLoading(boolean p0);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getToastMessage();
    
    public abstract void setToastMessage(@org.jetbrains.annotations.Nullable
    java.lang.String p0);
}