package com.example.baicuoiky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener{
            if(edUsername.text.toString() == "lecongtu" || this.edPassword.text.toString() == "12345"){
                val intent : Intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Input provided", Toast.LENGTH_SHORT).show()
            }
        }
        tvRegister.setOnClickListener{
            val intent : Intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }
    }
}