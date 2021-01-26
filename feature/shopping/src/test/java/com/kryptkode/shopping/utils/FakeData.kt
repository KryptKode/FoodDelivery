package com.kryptkode.shopping.utils

import java.util.Calendar
import java.util.Date
import java.util.TimeZone


object FakeData {

    const val SAMPLE_DATE = "Mar 12, 1974"
    const val SAMPLE_DATE_TIME = "Mar 12, 1974 21:15 PM"
    const val FAKE_ID = 2

    val defaultTimeZone: TimeZone = TimeZone.getTimeZone("UTC")

    val fakeDate: Date = Calendar.getInstance().apply {
        timeZone = defaultTimeZone
        set(Calendar.YEAR, 1974)
        set(Calendar.MONTH, 2)
        set(Calendar.DAY_OF_MONTH, 12)
        set(Calendar.HOUR_OF_DAY, 21)
        set(Calendar.MINUTE, 15)
        set(Calendar.SECOND, 8)
        set(Calendar.MILLISECOND, 878)
    }.time

}
