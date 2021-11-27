package com.stematel.catetin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class PesananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesanan)

        val buttonNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        buttonNavigationView.selectedItemId = R.id.pesanan

        buttonNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(
                        Intent(
                            applicationContext, HomeActivity::class.java
                        )
                    )
                    finish()
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.akun -> {
                    startActivity(
                        Intent(
                            applicationContext, AkunActivity::class.java
                        )
                    )
                    finish()
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.pesanan -> return@OnNavigationItemSelectedListener true
            }
            false
        })
    }
}