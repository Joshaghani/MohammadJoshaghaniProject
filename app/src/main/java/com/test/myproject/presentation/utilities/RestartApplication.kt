package com.test.myproject.presentation.utilities

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager


fun restartApplication(context: Context, resetApplication: Boolean = false) {
    val packageManager: PackageManager = context.packageManager
    val intent = packageManager.getLaunchIntentForPackage(context.packageName)
    val componentName = intent!!.component
    val mainIntent = Intent.makeRestartActivityTask(componentName)
    mainIntent?.putExtra("resetApplication", resetApplication)
    context.startActivity(mainIntent)
    Runtime.getRuntime().exit(0)
}