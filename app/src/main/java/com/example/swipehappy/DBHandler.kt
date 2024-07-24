package com.example.swipehappy
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHandler(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){

    override fun onCreate(db: SQLiteDatabase?) {
        val query = (" CREATE TABLE ")
    }
    companion object {
        private const val DATABASE_NAME = ""
        private const val DATABASE_NAME = ""
        private const val DATABASE_NAME = ""
        private const val DATABASE_NAME = ""
        private const val DATABASE_NAME = ""
    }

    //Variables for handling Users table
    public var user_id,
    public var f_name,
    public var l_name,
    public var dob,
    public var email,
    public var phone_no,
    public var password,
    public var bio,
    public var gender,
    public var country,
    public var city,



}