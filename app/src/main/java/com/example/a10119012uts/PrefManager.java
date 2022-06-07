package com.example.a10119012uts;
/*
NIM : 10119012
NAMA : DAMAI SAPUTRA LAOLI
KELAS : IF-1
E-MAIL : damailaoli123@gmail.com
 */
import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "myself-app";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setlauchedFirstTime(boolean lauchedFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, lauchedFirstTime);
        editor.commit();
    }

    public boolean lauchedFirstTime() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
