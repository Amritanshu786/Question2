package com.amritanshu.question2

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.view.WindowManager
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var radioButton: RadioButton
    private lateinit var java: CheckBox
    private lateinit var cpp: CheckBox
    private lateinit var kotlin: CheckBox
    private lateinit var php: CheckBox
    private lateinit var ml: CheckBox
    private lateinit var ds: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        java = findViewById(R.id.checkBox1)
        cpp = findViewById(R.id.checkBox2)
        kotlin = findViewById(R.id.checkBox3)
        php = findViewById(R.id.checkBox4)
        ml = findViewById(R.id.checkBox5)
        ds = findViewById(R.id.checkBox6)

        btnSubmit.setOnClickListener {
            val messageRadioButton = StringBuilder()
            val messageCheckBox = StringBuilder()
            val rdGroup = findViewById<RadioGroup>(R.id.rdGroup)
            val selectId:Int = rdGroup.checkedRadioButtonId
            if (selectId != -1)
            {
                radioButton = findViewById(selectId)
                messageRadioButton.append("Gender: " + radioButton.text.toString() + "\n")
            }

            if(java.isChecked)
                messageCheckBox.append("Java ")
            if(cpp.isChecked)
                messageCheckBox.append("C++ ")
            if(kotlin.isChecked)
                messageCheckBox.append("Kotlin ")
            if(php.isChecked)
                messageCheckBox.append("PHP ")
            if(ml.isChecked)
                messageCheckBox.append("Machine Learning ")
            if(ds.isChecked)
                messageCheckBox.append("Data Science")

            if(messageCheckBox.isNotEmpty())
                Toast.makeText(this, "$messageRadioButton Technical Skills: $messageCheckBox", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, messageRadioButton, Toast.LENGTH_LONG).show()
        }

    }

}