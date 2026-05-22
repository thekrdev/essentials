package com.sameerasw.essentials

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FeatureSettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val featureId = intent.getStringExtra("feature")
        val highlightSetting = intent.getStringExtra("highlight_setting")
        val forwardIntent = Intent(this, MainActivity::class.java).apply {
            action = intent.action
            data = intent.data
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            putExtra("feature", featureId)
            putExtra("highlight_setting", highlightSetting)
        }
        startActivity(forwardIntent)
        finish()
    }
}
