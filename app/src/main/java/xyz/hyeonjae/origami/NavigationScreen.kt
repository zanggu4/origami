package xyz.hyeonjae.origami

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import xyz.hyeonjae.origami.features.paper.cards.ui.PaperCardsScreen
import xyz.hyeonjae.origami.features.splash.ui.SplashRouterInterface
import xyz.hyeonjae.origami.features.splash.ui.SplashScreen

@Composable
internal fun NavigationScreen() {
    val navController = rememberNavController()

    // NavHost 설정
    NavHost(navController = navController, startDestination = "Splash") {
        composable("Splash") {
            SplashScreen(SplashRouter(navController))
        }
        composable("PaperCards") {
            PaperCardsScreen()
        }
    }
}

/**
 * 스플래시 라우터
 */
class SplashRouter(private val navController: NavController) : SplashRouterInterface {
    override fun startPaperCards() {
        navController.navigate("PaperCards") {
            popUpTo("Splash") { inclusive = true }
        }
    }
}