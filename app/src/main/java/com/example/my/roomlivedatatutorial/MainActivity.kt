package com.example.my.roomlivedatatutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            Toast.makeText(applicationContext, "Processing", Toast.LENGTH_SHORT).show()

            val context = applicationContext;
            var db = Room.databaseBuilder(context, AppDatabase::class.java, "db-tutorial").allowMainThreadQueries().build()
            var userDao = db.getUserDao()
            editText.setText(editText.text.toString() + "db created ; ")

            var usersAlreadyInDb = userDao.getAllUsers()
            var nbUsers = usersAlreadyInDb.size
            editText.setText(editText.text.toString() + "nb users in db = " + nbUsers + " ; ")

            val user = User(0,"Didier","Reuniware")
            userDao.insertUsers(user)
            editText.setText(editText.text.toString() + "data inserted ; ")

            //userDao.deleteAllUsers()

            db.close()
            editText.setText(editText.text.toString() + "db closed ; ")

        }
    }
}
