package com.example.chz.activitycollector;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chz on 2018/11/6.
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
