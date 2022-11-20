package xyz.teamgravity.custommodifier

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer

/**
 * Makes the composable circle shape filled with red color.
 */
fun Modifier.redBall(): Modifier {
    return clip(CircleShape)
        .background(Color.Red)
}

/**
 * Makes the composable rotate infinitely
 */
fun Modifier.rotating(duration: Int): Modifier {
    return composed {
        val transition = rememberInfiniteTransition()
        val angleRatio by transition.animateFloat(
            initialValue = 0F,
            targetValue = 1F,
            animationSpec = infiniteRepeatable(animation = tween(durationMillis = duration))
        )
        graphicsLayer(rotationZ = 360F * angleRatio)
    }
}