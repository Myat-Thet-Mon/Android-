package com.myatthet.hi;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Entity {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String word;

    public Entity(String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

}
