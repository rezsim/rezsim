package com.project.rezsim.tool

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

object DateHelper {

    private val serverDateTimeFormatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSS")
    private val serverDateFormatter = SimpleDateFormat("yyyy-MM-dd")

    fun now(): Calendar = Calendar.getInstance(Locale.getDefault())

    fun calendarToServerDateTimeString(calendar: Calendar) = serverDateTimeFormatter.format(calendar.time)

    fun calendarToServerDateString(calendar: Calendar) = serverDateFormatter.format(calendar.time)

}