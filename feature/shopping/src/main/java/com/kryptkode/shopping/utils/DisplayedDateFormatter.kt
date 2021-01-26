package com.kryptkode.shopping.utils

import timber.log.Timber
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

class DisplayedDateFormatter constructor(
    private val displayTimeZone: TimeZone = TimeZone.getDefault()
) {
    private val displayedDateFormatter = SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH).apply {
        timeZone = displayTimeZone
    }

    fun formatToDisplayedDate(date: Date?): String {
        return if (date == null) {
            ""
        } else {
            displayedDateFormatter.format(date)
        }
    }

    fun parseDisplayedDate(date: String): Date? {
        return try {
            displayedDateFormatter.parse(date)
        } catch (ex: ParseException) {
            Timber.w(ex, "Error parsing date")
            return null
        }
    }
}
