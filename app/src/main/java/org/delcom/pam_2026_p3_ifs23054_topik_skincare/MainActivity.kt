package org.delcom.pam_2026_p3_ifs23054_topik_skincare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import org.delcom.pam_2026_p3_ifs23054_topik_skincare.ui.UIApp
import org.delcom.pam_2026_p3_ifs23054_topik_skincare.ui.theme.DelcomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DelcomTheme {
                UIApp()
            }
        }
    }
}