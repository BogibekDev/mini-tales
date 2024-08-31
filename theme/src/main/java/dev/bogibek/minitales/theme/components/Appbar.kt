package dev.bogibek.minitales.theme.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Appbar(
    title: String,
    navIcon: ImageVector? = null,
    onNav: () -> Unit = {}
) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = { Text(text = title) },
        navigationIcon = {
            navIcon?.let {
                IconButton(
                    onClick = onNav,
                ) {
                    Icon(
                        imageVector = navIcon,
                        contentDescription = "onNav",
                    )
                }
            }
        }
    )

}


@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun Preview() {
    Appbar(
        title = "Mini Tales",
        navIcon = Icons.AutoMirrored.Filled.ArrowBack
    ) {}
}