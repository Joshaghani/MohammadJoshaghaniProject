package com.test.myproject.presentation.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private data class ColorsLightTheme(
    val primary: Color = Color(0xFF007041),
    val onPrimary: Color = Color(0xFF222222),
    val secondary: Color = Color(0xFF454343),
    val onSecondary: Color = Color(0xFF656363),
    val primaryContainer: Color = Color(0xFF00a35f),
//    val background: Color = Color(0xFFffffff),
    val background: Color = Color(0xFFF5F5F7),
    val onBackground: Color = Color(0xFF000000),
    val surface: Color = Color(0xFFadadaa),
//    val surfaceVariant: Color = Color(0xFFf0f0f1),
    val onTertiary: Color = Color(0xFFa5a3a3),
    val surfaceVariant: Color = Color(0xFFffffff),
    val onPrimaryContainer: Color = Color(0xFF0369A1),
)

private data class ColorsDarkTheme(
    val primary: Color = Color(0xFF42b988),
    val onPrimary: Color = Color(0xFFe5e3e3),
    val secondary: Color = Color(0xFF959393),
    val onSecondary: Color = Color(0xFF757373),
    val primaryContainer: Color = Color(0xFF69c9a1),
//    val background: Color = Color(0xFF424242),
    val background: Color = Color(0xFF000000),
    val onBackground: Color = Color(0xFFFFFFFF),
    val surface: Color = Color(0xFF1d1d1d),
//    val surfaceVariant: Color = Color(0xFF000000),
    val surfaceVariant: Color = Color(0xFF424242),
    val onTertiary: Color = Color(0xFF252323),
    val error: Color = Color(0xFFD32240),
    val onPrimaryContainer: Color = Color(0xFF52BAF1),
)


@Composable
fun DarkColors(): ColorScheme {
    val theme = ColorsDarkTheme()
    return darkColorScheme(
        primary = theme.primary,
        onPrimary = theme.onPrimary,
        secondary = theme.secondary,
        onSecondary = theme.onSecondary,
        primaryContainer = theme.primaryContainer,
        onBackground = theme.onBackground,
        background = theme.background,
        surfaceVariant = theme.surfaceVariant,
        onTertiary = theme.onTertiary,
        error = theme.error,
        onPrimaryContainer = theme.onPrimaryContainer
    )
}

@Composable
fun LightColors(): ColorScheme {
    val theme = ColorsLightTheme()
    return lightColorScheme(
        primary = theme.primary,
        onPrimary = theme.onPrimary,
        secondary = theme.secondary,
        onSecondary = theme.onSecondary,
        primaryContainer = theme.primaryContainer,
        onBackground = theme.onBackground,
        background = theme.background,
        surfaceVariant = theme.surfaceVariant,
        onTertiary = theme.onTertiary,
        onPrimaryContainer = theme.onPrimaryContainer,
    )
}