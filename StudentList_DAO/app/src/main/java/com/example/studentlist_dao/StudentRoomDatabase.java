package com.example.studentlist_dao;

//import android.arch.persistence.db.SupportSQLiteDatabase;
//import android.arch.persistence.room.Database;
//import android.arch.persistence.room.Room;
//import android.arch.persistence.room.RoomDatabase;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {StudentEntity.class}, version = 1,  exportSchema = false)
public class StudentRoomDatabase extends RoomDataBase{
}
