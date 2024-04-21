package com.test.myproject.presentation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.test.myproject.R

val iranSands = FontFamily(Font(R.font.iransanse_font))

@Composable
fun Typography() = Typography(
    headlineLarge = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.Black,
        fontSize = 23.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.Black,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.Black,
        fontSize = 13.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    titleLarge = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    titleMedium = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 16.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleSmall = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 13.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),


    bodyLarge = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    bodySmall = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.Bold,
        fontSize = 8.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    displayLarge = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    displayMedium = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.SemiBold,
        fontSize = 10.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.SemiBold,
        fontSize = 8.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    labelLarge = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelMedium = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    labelSmall = TextStyle(
        fontFamily = iranSands,
        fontWeight = FontWeight.Medium,
        fontSize = 8.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
)