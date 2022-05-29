package com.a_ches.studyhalper


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.navigation.compose.rememberNavController
import com.a_ches.studyhalper.ui.BottomBar
import com.a_ches.studyhalper.ui.NavigationGraph
import com.a_ches.studyhalper.ui.TopBar
import com.a_ches.studyhalper.ui.theme.StudyHelperTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudyHelperTheme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = { TopBar() },
                    bottomBar = { BottomBar(navController = navController) }) {
                    NavigationGraph(navController = navController)
                }
            }
        }
    }
}