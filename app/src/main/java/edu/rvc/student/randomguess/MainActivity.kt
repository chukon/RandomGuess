package edu.rvc.student.randomguess

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get random number 1-100000
        var number = ((Math.random () * 100001) + 1) .toInt ()
        //Get random number 0-100000
        //var number = (Math.random () * 100001) .toInt ()
        //Toast is an easy way to alert user. Shows up on bottom of app
        Toast.makeText (this, "Number to remember: ${number}", Toast.LENGTH_LONG) .show ()
        val txtGuess = findViewById<EditText>(R.id.txtGuess)
        val btnGuess = findViewById<Button>(R.id.btnGuess)
        val btnToast = findViewById<Button>(R.id.btnToast)
        btnGuess.setOnClickListener {
            if (number == txtGuess.text.toString (). toInt ()){
                Toast.makeText (this, "Correct, Great Job Remembering.", Toast.LENGTH_LONG) .show ()
                txtGuess.setText("")
            }
            else{
                Toast.makeText (this, "InCorrect,  it's not the number shown.", Toast.LENGTH_LONG) .show ()
                txtGuess.setText("")
            }
        }
        btnToast.setOnClickListener{
            number = ((Math.random () * 100001) + 1) .toInt ()
            println(number)
            Toast.makeText (this, "Number to remember: ${number}", Toast.LENGTH_LONG) .show ()
        }
    }
}
