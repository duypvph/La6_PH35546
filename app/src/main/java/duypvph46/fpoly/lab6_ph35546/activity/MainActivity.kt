package duypvph46.fpoly.lab6_ph35546.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import duypvph46.fpoly.lab6_ph35546.ui.components.CinemaSeatBookingScreen
import duypvph46.fpoly.lab6_ph35546.utils.createTheaterSeating

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            MovieScreen(movies = Movie.getSampleMovies())

            CinemaSeatBookingScreen(
                createTheaterSeating(
                    12,
                    9,
                    4,
                    5
                ), 9
            )
        }
    }
}