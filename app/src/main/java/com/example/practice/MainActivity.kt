package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var name: EditText? = null
    private var weight: EditText? = null
    private var height: EditText? = null
    private var age: EditText? = null
    private var button: Button? = null
    private var answer: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nameField = findViewById<EditText>(R.id.et_name).text
        val weightField = findViewById<EditText>(R.id.et_weight).text
        val heightField = findViewById<EditText>(R.id.et_heiht).text
        val ageField = findViewById<EditText>(R.id.et_age).text
        val answer: TextView = findViewById(R.id.tv_answer)
        val button: Button = findViewById(R.id.btn_calculate)

        button.setOnClickListener() {
            var name = nameField.toString();
            var weight = weightField.toString().toFloatOrNull();
            var height = heightField.toString().toIntOrNull();
            var age = ageField.toString().toIntOrNull();

            if (name.isEmpty()
                || name.length >= 50
                || height == null
                || weight == null
                || age == null
                || height < 0
                || height > 250
                || weight < 0
                || weight > 250
                || age < 0
                || age > 150
            ) {
                answer.text = "Данные введены некорректно"
            } else {
                val result: Double =
                    weight / height / 3.14 - age / age - name.length / name.length + 2
                answer.text = "Примерный обхват вашей $name талии $result"
            }
        }

    }
}