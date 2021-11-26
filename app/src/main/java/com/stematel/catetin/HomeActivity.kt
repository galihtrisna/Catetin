package com.stematel.catetin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val buttonNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        buttonNavigationView.selectedItemId = R.id.home

        buttonNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.pesanan -> {
                    startActivity(
                        Intent(
                            //applicationContext, PesananActivity::class.java
                        )
                    )
                    finish()
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.akun -> {
                    startActivity(
                        Intent(
                            //applicationContext, SettingsActivity::class.java
                        )
                    )
                    finish()
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.home -> return@OnNavigationItemSelectedListener true
            }
            false
        })
    }
}