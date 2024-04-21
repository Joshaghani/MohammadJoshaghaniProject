package com.test.myproject.presentation.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0016\b\u0000\u0010\u0001*\u0010\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/test/myproject/presentation/base/BaseHandler;", "VM", "Lcom/test/myproject/presentation/base/BaseViewModel;", "Effect", "Lcom/test/myproject/presentation/base/ViewSideEffect;", "", "()V", "handleEffects", "", "effect", "viewModel", "(Lcom/test/myproject/presentation/base/ViewSideEffect;Lcom/test/myproject/presentation/base/BaseViewModel;)V", "app_release"})
public abstract class BaseHandler<VM extends com.test.myproject.presentation.base.BaseViewModel<?, ?, Effect>, Effect extends com.test.myproject.presentation.base.ViewSideEffect> {
    
    public BaseHandler() {
        super();
    }
    
    public abstract void handleEffects(@org.jetbrains.annotations.NotNull
    Effect effect, @org.jetbrains.annotations.NotNull
    VM viewModel);
}