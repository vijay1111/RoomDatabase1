package com.example.vijay.roomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDataAccessObject {

    @Insert
    public void addUser(User user);

    @Query("select * from users")
    public List<User> getUser();
}
