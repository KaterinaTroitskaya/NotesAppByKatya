package com.example.notesappbykatya.domain;

import androidx.annotation.StringRes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Note {
    @StringRes
    private String name;

    @StringRes
    private  String noteDate;


    @StringRes
    private String text;

    public Note(String name, String text) {
        this.name = name;
        this.text = text;
        this.noteDate = new Date().toString();
    }

    public String getName() {
        return name;
    }

    public String getNoteDate() {
        return noteDate;
    }

    public String getText() {
        return text;
    }
   
}
