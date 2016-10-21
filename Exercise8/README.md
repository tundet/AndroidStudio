# Exercise 8
Add the lines corresponding to all the methods of an Activity’s lifecycle to all the
activities created (Activity2, Activity3 and Activity4), including the call to the super
class (super.methodName();) and the call to the log (Log.d(“activityName”,
“methodName”);), and change the first parameter of the Log.d method to the
corresponding activity in each case. For instance, the onDestroy method of Activity2
should include this: Log.d("Activity2", "onDestroy");
Check (see the Logcat tab) the life cycle of an activity when:
1. A new activity is opened without closing the first one.
2. A new activity is opened by destroying the previous activity.
3. The application closes.
4. The application minimizes using the “Home” ( , o ) button of the
device.
5. The device changes its orientation (*).
In order to check that you performed this exercise, you must upload the project you
have created as well as a text document explaining briefly the example you executed
and the behavior detected in each of the cases.
