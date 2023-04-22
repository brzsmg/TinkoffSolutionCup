package com.swlibs.tsc.mainapp

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.swlibs.tsc.mainapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val nightModeFlags: Int = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        val mode : String = when(nightModeFlags) {
            Configuration.UI_MODE_NIGHT_YES -> getString(R.string.night)
            Configuration.UI_MODE_NIGHT_NO -> getString(R.string.day)
            Configuration.UI_MODE_NIGHT_UNDEFINED -> getString(R.string.undefined)
            else -> getString(R.string.undefined)
        }

        binding.mode.text = mode

        binding.button1.setOnClickListener { showDialog() }
        binding.button2.setOnClickListener { showDialog() }

        setContentView(binding.root)
    }

    fun showDialog() {
        var dialog = SuperDialog(this)
        dialog.show()
    }

}