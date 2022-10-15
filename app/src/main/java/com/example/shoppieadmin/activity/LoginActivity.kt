package com.example.shoppieadmin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.shoppieadmin.MainActivity
import com.example.shoppieadmin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


binding.button3.setOnClickListener {
    if(binding.password.text.toString().equals("")){
        Toast.makeText(this,"Enter Password",Toast.LENGTH_SHORT).show()
    }
    else if(binding.password.text.toString().equals("Shivu Boy")){
        startActivity(
            Intent(
                this@LoginActivity,
                MainActivity::class.java
            ).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        )
        finish()
    }
    else{
        Toast.makeText(this,"Wrong Password",Toast.LENGTH_SHORT).show()

    }
}



    }
}