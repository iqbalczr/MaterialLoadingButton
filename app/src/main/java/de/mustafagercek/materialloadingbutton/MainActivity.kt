package de.mustafagercek.materialloadingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import de.mustafagercek.materialloadingbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.presenter = this

        binding.loadingButton2.setButtonEnabled(false)

    }


    fun doStuff(view: View) {
        binding.loadingButton.onStartLoading()
        Handler().postDelayed({
            binding.loadingButton.onStopLoading()
        }, 500)
    }

    fun doStuff2(view: View) {
        binding.loadingButton2.onStartLoading()
        Handler().postDelayed({
            binding.loadingButton2.onStopLoading()
        }, 500)
    }

    fun doStuff3(view: View) {
        binding.loadingButton3.onStartLoading()
        Handler().postDelayed({
            binding.loadingButton3.onStopLoading()
        }, 500)
    }
}
