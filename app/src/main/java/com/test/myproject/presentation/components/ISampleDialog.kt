package com.test.myproject.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp


var showSampleDialog: MutableState<ISampleDialog?> = mutableStateOf(null)


class ISampleDialog(
    private var title: String? = null,
    private var message: String? = null,
    private var buttonAction: Pair<String, () -> Unit>? = null,
    private var buttonCancelTitle: String? = null,
    private var buttonCancelBlock: (() -> Unit)? = null,
    private var setCanceledOnTouchOutside: Boolean = true,
) {

    var SampleDialogContent: (@Composable ColumnScope.() -> Unit)? = null
        private set

    private var paddingCustomUi = 0

    init {
        SampleDialogContent = null
    }

    fun show() {
        showSampleDialog.value = this
    }


    @Composable
    fun SetCustomContent(
        padding: Int = 0,
        content: @Composable ColumnScope.() -> Unit,
    ): ISampleDialog {
        SampleDialogContent = content
        paddingCustomUi = padding
        return this
    }

    fun setTitle(value: String): ISampleDialog {
        title = value
        return this
    }

    fun setMessage(value: String): ISampleDialog {
        message = value
        return this
    }

    fun setCanceledOnTouchOutside(cancellable: Boolean): ISampleDialog {
        setCanceledOnTouchOutside = cancellable
        return this
    }

    fun setButtonAction(value: Pair<String, () -> Unit>): ISampleDialog {
        buttonAction = value
        return this
    }

    fun setButtonCancelTitle(value: String, block: (() -> Unit)? = null): ISampleDialog {
        buttonCancelTitle = value
        buttonCancelBlock = block
        return this
    }


    // it should only be called from the App Functions
    @Composable
    fun ShowDialog(content: (@Composable ColumnScope.() -> Unit)? = null) {

        if (!isShow()) return

        if (content != null) {
            CustomUi(content)
        } else {
            SampleUi()
        }

    }

    @Composable
    private fun CustomUi(content: @Composable ColumnScope.() -> Unit) {

        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Column(modifier = Modifier.background(Color.Black.copy(0.78f))
                .padding(horizontal = paddingCustomUi.dp).fillMaxSize().clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null
                ) {
                    if (setCanceledOnTouchOutside) {
                        onDismissRequest()
                    }
                }) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    if (paddingCustomUi == 0) Card(shape = RoundedCornerShape(0.dp)) {
                        Column(
                            content = content
                        )
                    }
                    else Card { Column(content = content) }
                }
            }
        }
    }

    @Composable
    private fun SampleUi() {
        Column(modifier = Modifier.background(Color.Black.copy(0.78f))
            .fillMaxSize().clickable(
                interactionSource = remember { MutableInteractionSource() }, indication = null
            ) {
                if (setCanceledOnTouchOutside) {
                    onDismissRequest()
                }
            }) {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp).fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Card {
                    Column(modifier = Modifier.padding(16.dp)) {


                        Row(
                            modifier = Modifier.height(56.dp).fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            title?.let {
                                Text(
                                    it, style = MaterialTheme.typography.headlineMedium
                                )
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            message?.let {
                                Text(
                                    it, style = MaterialTheme.typography.bodyMedium
                                )
                            }
                        }

                        Row(
                            modifier = Modifier.padding(top = 32.dp).fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            var clickOnActionButton by remember {
                                mutableStateOf(false)
                            }

                            buttonAction?.let {
                                PrimaryButton(paddingTop = 0.dp,
                                    modifier = Modifier.padding(horizontal = 16.dp).weight(1f),
                                    title = it.first,
                                    onClick = {
                                        clickOnActionButton = true
                                    })
                            }

                            buttonCancelTitle?.let {
                                TextButton(modifier = Modifier.padding(end = 16.dp).weight(1f),
                                    onClick = {
                                        onDismissRequest()
                                    }) {
                                    Text(it)
                                }
                            }

                            if (clickOnActionButton) {
                                onDismissRequest()
                                buttonAction!!.second()
                                buttonCancelBlock?.invoke()
                            }

                        }


                    }
                }


            }
        }
    }


    fun onDismissRequest(block: () -> Unit = {}): ISampleDialog {
        showSampleDialog.value = null
        block.invoke()
        return this
    }


    companion object {

        fun isShow() = showSampleDialog.value != null

        fun getDialog() = showSampleDialog.value
    }
}