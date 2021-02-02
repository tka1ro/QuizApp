package com.kairat.quizapp.data.local.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.kairat.quizapp.data.models.Result;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface QuizDao {

    @Insert(onConflict = REPLACE)
    void addResult(Result result);

    @Delete
    void delete(Result result);

    @Query("DELETE FROM resultTable")
    void clearHistory();

    @Query("SELECT * FROM resultTable")
    List<Result> getHistoryList();
}
