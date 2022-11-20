package xyz.teamgravity.custommodifier

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

/**
 * Makes the composable circle shape filled with red color.
 */
fun Modifier.redBall(): Modifier {
    return clip(CircleShape)
        .background(Color.Red)
}