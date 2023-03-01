package com.example.tablesync

val subject = mutableListOf<String>(
    "СП", "Иностранный язык", "Физ-ра", //0-2
    "Метрология, Стандартизация...", "Метрология, Стандартизация... Лекция", //3-4
    "ОС", "ОС Лекция", //5-6
    "Правовое обеспечение проф. деятельности", "Правовое обеспечение проф. деятельности Лекция", //7-8
    "Теория вероятностей и мат. статистика", "Теория вероятностей и мат. статистика Лекция", //9-10
    "Информационная безопасность на предприятии", "Информационная безопасность на предприятии Лекция", //11-12
    "Элементы мат. логики", "Элементы мат. логики Лекция", //13-14
    "Эксплуатация ИС", "Эксплуатация ИС Лекция", //15-16
    "Основы алгоритмизации(ОАП)", "Основы алгоритмизации(ОАП) Лекция", //17-18
    "Web-Технологии", "Web-Технологии Лекция", //19-20
)

val EvenMonday = listOf<String>(subject[0], subject[0], subject[0], subject[6], subject[9], subject[0])
val EvenTuesday = listOf<String>(subject[0], subject[11], subject[15], subject[12], subject[0], subject[0])
val EvenWednesday = listOf<String>(subject[10], subject[1], subject[4], subject[11], subject[0], subject[0])
val EvenThursday = listOf<String>(subject[0], subject[0], subject[0], subject[16], subject[8], subject[17])
val EvenFriday = listOf<String>(subject[2], subject[5], subject[18], subject[20], subject[0], subject[0])
val EvenSaturday = listOf<String>(subject[15], subject[0], subject[0], subject[0], subject[0], subject[0])
val EvenSunday = listOf<String>(subject[0], subject[0], subject[0], subject[0], subject[0], subject[0])
val OddMonday = listOf<String>(subject[0], subject[3], subject[5], subject[6], subject[7], subject[0])
val OddTuesday = listOf<String>(subject[0], subject[11], subject[13], subject[12], subject[15], subject[0])
val OddWednesday = listOf<String>(subject[10], subject[1], subject[14], subject[11], subject[0], subject[0])
val OddThursday = listOf<String>(subject[0], subject[0], subject[0], subject[16], subject[8], subject[17])
val OddFriday = listOf<String>(subject[2], subject[19], subject[18], subject[20], subject[0], subject[0])
val OddSaturday = listOf<String>(subject[0], subject[0], subject[0], subject[0], subject[0], subject[0])
val OddSunday = listOf<String>(subject[0], subject[0], subject[0], subject[0], subject[0], subject[0])
