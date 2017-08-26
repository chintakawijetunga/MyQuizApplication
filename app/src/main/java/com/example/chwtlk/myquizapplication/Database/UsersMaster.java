package com.example.chwtlk.myquizapplication.Database;

import android.provider.BaseColumns;

public final class UsersMaster {
    // To prevent someone from accidentally instantiating the UsersMaster class,
    // make the constructor private.
    private UsersMaster() {}

    /* Inner class that defines the table contents */
    public static class Users implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_NAME_PASSWORD = "password";
    }
}
