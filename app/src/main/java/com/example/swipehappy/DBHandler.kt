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
        getDatabase()
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

}