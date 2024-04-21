package com.test.myproject.presentation.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 \'2\u00020\u0001:\u0001\'Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ&\u0010\u0018\u001a\u00020\b2\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f\u00a2\u0006\u0002\b\u0011\u00a2\u0006\u0002\b\u0012H\u0003J\b\u0010\u001a\u001a\u00020\bH\u0003J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00172\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f\u00a2\u0006\u0002\b\u0011\u00a2\u0006\u0002\b\u0012H\u0007J*\u0010\u001d\u001a\u00020\b2 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0011\u00a2\u0006\u0002\b\u0012H\u0007J\u0016\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J \u0010 \u001a\u00020\u00002\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J \u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\fJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\bRN\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0011\u00a2\u0006\u0002\b\u00122\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u00a2\u0006\u0002\b\u0011\u00a2\u0006\u0002\b\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/test/myproject/presentation/components/ISampleDialog;", "", "title", "", "message", "buttonAction", "Lkotlin/Pair;", "Lkotlin/Function0;", "", "buttonCancelTitle", "buttonCancelBlock", "setCanceledOnTouchOutside", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V", "<set-?>", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "SampleDialogContent", "getSampleDialogContent", "()Lkotlin/jvm/functions/Function1;", "paddingCustomUi", "", "CustomUi", "content", "SampleUi", "SetCustomContent", "padding", "ShowDialog", "onDismissRequest", "block", "setButtonAction", "value", "setButtonCancelTitle", "cancellable", "setMessage", "setTitle", "show", "Companion", "app_debug"})
public final class ISampleDialog {
    @org.jetbrains.annotations.Nullable
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable
    private kotlin.Pair<java.lang.String, ? extends kotlin.jvm.functions.Function0<kotlin.Unit>> buttonAction;
    @org.jetbrains.annotations.Nullable
    private java.lang.String buttonCancelTitle;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.Unit> buttonCancelBlock;
    private boolean setCanceledOnTouchOutside;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> SampleDialogContent;
    private int paddingCustomUi = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.test.myproject.presentation.components.ISampleDialog.Companion Companion = null;
    
    public ISampleDialog(@org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.Nullable
    kotlin.Pair<java.lang.String, ? extends kotlin.jvm.functions.Function0<kotlin.Unit>> buttonAction, @org.jetbrains.annotations.Nullable
    java.lang.String buttonCancelTitle, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> buttonCancelBlock, boolean setCanceledOnTouchOutside) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> getSampleDialogContent() {
        return null;
    }
    
    public final void show() {
    }
    
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.components.ISampleDialog SetCustomContent(int padding, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> content) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.components.ISampleDialog setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.components.ISampleDialog setMessage(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.components.ISampleDialog setCanceledOnTouchOutside(boolean cancellable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.components.ISampleDialog setButtonAction(@org.jetbrains.annotations.NotNull
    kotlin.Pair<java.lang.String, ? extends kotlin.jvm.functions.Function0<kotlin.Unit>> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.components.ISampleDialog setButtonCancelTitle(@org.jetbrains.annotations.NotNull
    java.lang.String value, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public final void ShowDialog(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    private final void CustomUi(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable
    private final void SampleUi() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.test.myproject.presentation.components.ISampleDialog onDismissRequest(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        return null;
    }
    
    public ISampleDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/test/myproject/presentation/components/ISampleDialog$Companion;", "", "()V", "getDialog", "Lcom/test/myproject/presentation/components/ISampleDialog;", "isShow", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isShow() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.test.myproject.presentation.components.ISampleDialog getDialog() {
            return null;
        }
    }
}