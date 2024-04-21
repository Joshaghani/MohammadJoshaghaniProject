package com.test.myproject.presentation.screens.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.test.myproject.R
import com.test.myproject.presentation.base.BaseHandler
import com.test.myproject.presentation.base.FabModel
import com.test.myproject.presentation.base.ShowBottombar
import com.test.myproject.presentation.base.ShowFab
import com.test.myproject.presentation.base.ShowTopbar
import com.test.myproject.presentation.base.baseScreen.BaseScreen
import com.test.myproject.presentation.components.BorderCard
import com.test.myproject.presentation.components.ISampleDialog
import com.test.myproject.presentation.components.ISpacer
import com.test.myproject.presentation.components.PrimaryButton
import com.test.myproject.presentation.components.RowSpaceBetween
import com.test.myproject.presentation.root.showSnackbar
import javax.inject.Inject

class MainScreen(private val loginIdentity: String) :
    BaseScreen<MainScreenContract.State, MainScreenContract.Event, MainScreenContract.Effect, MainScreenViewModel>(
        MainScreenViewModel::class.java
    ), ShowBottombar, ShowTopbar, ShowFab {


    @Inject
    override lateinit var handler: BaseHandler<MainScreenViewModel, MainScreenContract.Effect>

    @Composable
    override fun ComposeView(state: MainScreenContract.State) {

        Spacer(Modifier.size(56.dp))

        Column(Modifier.padding(horizontal = 16.dp)) {

            BorderCard {
//                RowSpaceBetween(
//                    title = "نام و نام خانوادگی",
//                    content = GlobalProperties.personDetails.fullName
//                )

                Box(
                    Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "Welcome",
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                ISpacer(32)

                RowSpaceBetween(
                    title = "شناسه شما",
                    content = loginIdentity
                )

                ISpacer(16)

                PrimaryButton(
                    modifier = Modifier.padding(horizontal = 32.dp),
                    title = "خروج از حساب کاربری",
                    color = MaterialTheme.colorScheme.error
                ) {
                    ISampleDialog()
                        .setTitle("خروج از حساب کاربری")
                        .setMessage("آیا میخواهید از حساب کاربری خود خارج شوید؟")
                        .setButtonAction(Pair("خارج می شوم") {
                            onEventSent(MainScreenContract.Event.Logout)
                        })
                        .setButtonCancelTitle("انصراف")
                        .show()
                }

            }

        }
        Spacer(Modifier.size(56.dp))
    }

    override fun titleTopBar(): String {
        return "" //GlobalProperties.personDetails.fullName
    }

    override fun onFabButtonPressed() {
        showSnackbar("Fab Clicked")
    }

    @Composable
    override fun IconFab(): FabModel? {
        return FabModel(painterResource(id = R.drawable.ic_refresh_circle))
    }


}