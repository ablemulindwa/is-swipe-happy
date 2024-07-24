package com.example.swipehappy
import android.content.Context
import android.content.res.AssetManager
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build.VERSION_CODES.O
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream

class DBHandler(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    //Vital to the functioning of the db
    private val mContext = context
    private val mDbName = "swipeHappy.db"

    companion object {
        private const val DATABASE_NAME = "swipeHappy.db"
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun getDatabase(): SQLiteDatabase {
        val assetManager: AssetManager = mContext.assets
        val input: InputStream = assetManager.open(mDbName)
        val output: OutputStream = FileOutputStream("/data/data/${mContext.packageName}/databases/$mDbName")
        val buffer = ByteArray(1024)
        var length: Int
        while (input.read(buffer).also {length = it} > 0) {
            output.write(buffer, O, length)
        }
        output.flush()
        output.close()
        input.close()
        return SQLiteDatabase.openDatabase("/data/data/${mContext.packageName}/databases/$mDbName",null,SQLiteDatabase.OPEN_READWRITE)
    }

    //Variables for handling Users table
    //public var user_id,
    //public var f_name,
    //public var l_name,
    //public var dob,
    //public var email,
    //public var phone_no,
    //public var password,
    //public var bio,
    //public var gender,
    //public var country,
    //public var city,

}