package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.content.Intent
import android.provider.ContactsContract
import android.widget.Button
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts

const val EXTRA_MESSAGE = "com.example.labor_4.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Contact name as username

        val contactButton=findViewById<Button>(R.id.button2)

        val name=findViewById<EditText>(R.id.editTextTextPersonName)

        val returnContacts=registerForActivityResult(ActivityResultContracts.PickContact(), ActivityResultCallback{
                val contactList=listOf(ContactsContract.Contacts.DISPLAY_NAME).toTypedArray()
                val cursor=contentResolver.query(it,contactList,null,null,null)
                if(cursor!=null) {
                    if (cursor.moveToFirst()) {
                        name.setText(cursor.getString(0))
                    }
                    cursor.close()
                }
            })

        contactButton.setOnClickListener{
            returnContacts.launch(null)
        }
    }

    // Show username given in EditText

    fun sendMessage(view: View) {
        // Do something in response to button
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}