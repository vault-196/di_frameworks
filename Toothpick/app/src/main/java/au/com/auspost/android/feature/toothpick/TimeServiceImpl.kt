package au.com.auspost.android.feature.toothpick

import java.util.Calendar

class TimeServiceImpl : TimeService {

    override fun getHourOfDay(): Int {
        val cal = Calendar.getInstance()
        return cal.get(Calendar.HOUR_OF_DAY)
    }
}