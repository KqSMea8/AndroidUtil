package com.zxin.ncalendar.listener;

import org.joda.time.LocalDate;

/**
 * Created by necer on 2017/7/4.
 */

public interface OnCalendarChangedListener {
    void onCalendarChanged(LocalDate date);
}
