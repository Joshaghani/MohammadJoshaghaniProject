package com.test.myproject.presentation.utilities.dataTrasnferObject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\r\u0010\u0004\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0005J\'\u0010\u0006\u001a\u00020\u00072\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\u0002\b\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/test/myproject/presentation/utilities/dataTrasnferObject/ValidationService;", "Dto", "Model", "", "mapToDomainModel", "()Ljava/lang/Object;", "validate", "", "block", "Lkotlin/Function1;", "Lcom/test/myproject/presentation/utilities/dataTrasnferObject/ValidationState;", "Lkotlin/ExtensionFunctionType;", "app_debug"})
public abstract interface ValidationService<Dto extends java.lang.Object, Model extends java.lang.Object> {
    
    public abstract void validate(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.test.myproject.presentation.utilities.dataTrasnferObject.ValidationState<? extends Model>, kotlin.Unit> block);
    
    public abstract Model mapToDomainModel();
}