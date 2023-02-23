package com.example.tablesync

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NexttableActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nexttable)
        supportActionBar?.hide()

        val schedule1 = findViewById<TextView>(R.id.schedule1)
        val schedule2 = findViewById<TextView>(R.id.schedule2)
        val schedule3 = findViewById<TextView>(R.id.schedule3)
        val schedule4 = findViewById<TextView>(R.id.schedule4)
        val schedule5 = findViewById<TextView>(R.id.schedule5)
        val schedule6 = findViewById<TextView>(R.id.schedule6)

        val ParityOfWeek = parity()
        val day = altdaysofweek()
        val sum = day + " " + ParityOfWeek


        when(sum) {
            "Понедельник Четная" -> {
                schedule1.text = EvenMonday[0]
                schedule2.text = EvenMonday[1]
                schedule3.text = EvenMonday[2]
                schedule4.text = EvenMonday[3] + "\nБ-6"
                schedule5.text = EvenMonday[4] + "\n4-312"
                schedule6.text = EvenMonday[5]
            }
            "Вторник Четная" -> {
                schedule1.text = EvenTuesday[0]
                schedule2.text = EvenTuesday[1] + "\nУ-406"
                schedule3.text = EvenTuesday[2] + "\nУ-401"
                schedule4.text = EvenTuesday[3] + "\nБ-1"
                schedule5.text = EvenTuesday[4]
                schedule6.text = EvenTuesday[5]
            }
            "Среда Четная" -> {
                schedule1.text = EvenWednesday[0] + "\nБ-2"
                schedule2.text = EvenWednesday[1] + "\n4-102"
                schedule3.text = EvenWednesday[2] + "\n4-309"
                schedule4.text = EvenWednesday[3] + "\n4-523"
                schedule5.text = EvenWednesday[4]
                schedule6.text = EvenWednesday[5]
            }
            "Четверг Четная" -> {
                schedule1.text = EvenThursday[0]
                schedule2.text = EvenThursday[1]
                schedule3.text = EvenThursday[2]
                schedule4.text = EvenThursday[3] + "\nБ-4"
                schedule5.text = EvenThursday[4] + "\nБ-4"
                schedule6.text = EvenThursday[5] + "\nУ-416"
            }
            "Пятница Четная" -> {
                schedule1.text = EvenFriday[0]
                schedule2.text = EvenFriday[1] + "\nУ-416"
                schedule3.text = EvenFriday[2] + "\nБ-5"
                schedule4.text = EvenFriday[3] + "\nБ-5"
                schedule5.text = EvenFriday[4]
                schedule6.text = EvenFriday[5]
            }
            "Суббота Четная" -> {
                schedule1.text = EvenSaturday[0] + "\nУ-406"
                schedule2.text = EvenSaturday[1]
                schedule3.text = EvenSaturday[2]
                schedule4.text = EvenSaturday[3]
                schedule5.text = EvenSaturday[4]
                schedule6.text = EvenSaturday[5]
            }
            "Воскресенье Четная" -> {
                schedule1.text = EvenSunday[0]
                schedule2.text = EvenSunday[1]
                schedule3.text = EvenSunday[2]
                schedule4.text = EvenSunday[3]
                schedule5.text = EvenSunday[4]
                schedule6.text = EvenSunday[5]
            }
            "Понедельник Нечетная" -> {
                schedule1.text = OddMonday[0]
                schedule2.text = OddMonday[1] + "\n4-102"
                schedule3.text = OddMonday[2] + "\nУ-412"
                schedule4.text = OddMonday[3] + "\nБ-6"
                schedule5.text = OddMonday[4] + "\n4-312"
                schedule6.text = OddMonday[5]
            }
            "Вторник Нечетная" -> {
                schedule1.text = OddTuesday[0]
                schedule2.text = OddTuesday[1] + "\nУ-406"
                schedule3.text = OddTuesday[2] + "\n4-516"
                schedule4.text = OddTuesday[3] + "\nБ-1"
                schedule5.text = OddTuesday[4] + "\n4-522"
                schedule6.text = OddTuesday[5]
            }
            "Среда Нечетная" -> {
                schedule1.text = OddWednesday[0] + "\nБ-2"
                schedule2.text = OddWednesday[1] + "\n4-102"
                schedule3.text = OddWednesday[2] + "\n4-309"
                schedule4.text = OddWednesday[3] + "\n4-523"
                schedule5.text = OddWednesday[4]
                schedule6.text = OddWednesday[5]
            }
            "Четверг Нечетная" -> {
                schedule1.text = OddThursday[0]
                schedule2.text = OddThursday[1]
                schedule3.text = OddThursday[2]
                schedule4.text = OddThursday[3] + "\nБ-4"
                schedule5.text = OddThursday[4] + "\nБ-4"
                schedule6.text = OddThursday[5] + "\nУ-416"
            }
            "Пятница Нечетная" -> {
                schedule1.text = OddFriday[0]
                schedule2.text = OddFriday[1] + "\nУ-406"
                schedule3.text = OddFriday[2] + "\nБ-5"
                schedule4.text = OddFriday[3] + "\nБ-5"
                schedule5.text = OddFriday[4]
                schedule6.text = OddFriday[5]
            }
            "Суббота Нечетная" -> {
                schedule1.text = OddSaturday[0]
                schedule2.text = OddSaturday[1]
                schedule3.text = OddSaturday[2]
                schedule4.text = OddSaturday[3]
                schedule5.text = OddSaturday[4]
                schedule6.text = OddSaturday[5]
            }
            "Воскресенье Нечетная" -> {
                schedule1.text = OddSunday[0]
                schedule2.text = OddSunday[1]
                schedule3.text = OddSunday[2]
                schedule4.text = OddSunday[3]
                schedule5.text = OddSunday[4]
                schedule6.text = OddSunday[5]
            }
            else -> { "Nothing"}
        }
    }
}