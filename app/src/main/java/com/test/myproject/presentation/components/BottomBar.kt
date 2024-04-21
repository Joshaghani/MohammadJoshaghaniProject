package com.test.myproject.presentation.components

import android.annotation.SuppressLint
import android.health.connect.datatypes.AppInfo
import android.os.Build
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.test.myproject.presentation.base.GlobalProperties
import com.test.myproject.presentation.base.Navigator


class BottomBar {

    @Composable
    fun Show() {
        if (Navigator.currentScreen.value?.showBottombar() == true) {
            BottomBar()
        }
    }

    @SuppressLint("NotConstructor")
    @Composable
    private fun BottomBar() {

        Card(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp)
                .height(80.dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surfaceVariant),
            shape = MaterialTheme.shapes.extraLarge
        ) {

            Column(
                Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text("پروژه محمد جوشقانی")
                Text("پروژه تستی اسکار - 2024", style = MaterialTheme.typography.labelMedium)
                Row {

                    val manager = GlobalProperties.currentActivity.packageManager
                    val info =
                        manager?.getPackageInfo(GlobalProperties.currentActivity.packageName, 0)

                    Text("نسخه ")
                    Text(info!!.versionName, color = MaterialTheme.colorScheme.primary)

                }
            }

        }

    }

}