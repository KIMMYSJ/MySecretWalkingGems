package at.modoo.mysecretwalkinggems

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.annotation.RequiresApi
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.databinding.DataBindingUtil.setContentView
import at.modoo.mysecretwalkinggems.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val insetsControllerCompat = WindowInsetsControllerCompat(window, window.decorView)
        insetsControllerCompat.hide(WindowInsetsCompat.Type.statusBars())

        val binding:ActivitySplashBinding= setContentView(this,R.layout.activity_splash)
        binding.logoBackground.animate().apply {
            translationY(-2500f)
            duration = 2000
            startDelay = 4000
        }
        val topAnim:Animation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        binding.gem1.animation = topAnim
        binding.gem2.animation = topAnim
        binding.gem3.animation = topAnim


        binding.gem1.animate().apply {
            translationY(2000f)
            duration = 2000
            startDelay = 4000
        }
        binding.gem2.animate().apply {
            translationY(2000f)
            duration = 2000
            startDelay = 4000
        }

        binding.gem3.animate().apply {
            translationY(2000f)
            duration = 2000
            startDelay = 4000
        }

        binding.walking.animate().apply {
            translationY(2000f)
            duration = 2000
            startDelay = 4000
        }

        Handler(Looper.getMainLooper()).postDelayed({
            //in this case we use intent instead of navhost to finish the activity()
            startActivity(Intent(this,HomeActivity::class.java))
        },6000)


    }
}