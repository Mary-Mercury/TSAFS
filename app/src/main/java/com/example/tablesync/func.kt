package com.example.tablesync

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

    //функция для определения четности текущей недели
    fun parity(): String {
        val varible = Calendar.getInstance(TimeZone.getTimeZone("Russia/Moscow")).get(Calendar.WEEK_OF_YEAR)
        val part = if (varible % 2 == 0) { "Четная" } else { "Нечетная" }
        return part
    }

    //функция для определения четности следующей недели
    fun altparity(): String {
        val varible = Calendar.getInstance(TimeZone.getTimeZone("Russia/Moscow")).get(Calendar.WEEK_OF_YEAR)
        val altpart = if (varible % 2 == 0) { "Нечетная" } else { "Четная" }
        return altpart
    }

    //фнукция для определения текущей даты
    fun date(): String {
        val dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("d MMMM"))
        return dateTime
    }

    //перевод недель на русский язык
    fun daysofweek(): String {
        val daysOfWeek: String = when (LocalDate.now().dayOfWeek) {
            DayOfWeek.MONDAY -> "Понедельник"
            DayOfWeek.TUESDAY -> "Вторник"
            DayOfWeek.WEDNESDAY -> "Среда"
            DayOfWeek.THURSDAY -> "Четверг"
            DayOfWeek.FRIDAY -> "Пятница"
            DayOfWeek.SATURDAY -> "Суббота"
            DayOfWeek.SUNDAY -> "Воскресенье"
        }
        return daysOfWeek
    }

    //функция для отображения следующей недели за 2-1 день до ее начала
    fun whennext(): String {
        val daysOfWeek = daysofweek()
        val next = when(daysOfWeek) {
            "Пятница" -> "Начинается через 2 дня"
            "Суббота" -> "Начинается через 1 день"
            "Воскресенье" -> "Начинается завтра"
            else -> { " " }
        }
        return next
    }
