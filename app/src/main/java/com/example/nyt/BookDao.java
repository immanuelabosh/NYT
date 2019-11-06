package com.example.nyt;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.nyt.model.Book;

import java.util.List;

@Dao
public interface BookDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insert(List<Book> books);

    @Update
    public void update(Book... books);

    @Delete
    public void delete(Book books);

    @Query("SELECT * FROM Book")
    public List<Book> getAllBooks();

    @Query("SELECT * FROM Book WHERE isbn = :isbnID")
    public Book getBook (long isbnID);
}
