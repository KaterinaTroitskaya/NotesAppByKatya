package com.example.notesappbykatya.domain;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.StringRes;

import java.util.Date;

public class Note implements Parcelable {
    @StringRes
    private int name;


    private  String noteDate;


    @StringRes
    private int text;

    public Note(int name, int text) {
        this.name = name;
        this.text = text;
        this.noteDate = new Date().toString();
    }

    public int getName() {
        return name;
    }

    public String getNoteDate() {
        return noteDate;
    }

    public int getText() {
        return text;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
    // protected City(Parcel in) {
    //        name = in.readInt();
    //        coat = in.readInt();
    //    }
    //
    //    public static final Creator<City> CREATOR = new Creator<City>() {
    //        @Override
    //        public City createFromParcel(Parcel in) {
    //            return new City(in);
    //        }
    //
    //        @Override
    //        public City[] newArray(int size) {
    //            return new City[size];
    //        }
    //    };
    //

    //
    //    @Override
    //    public int describeContents() {
    //        return 0;
    //    }
    //
    //    @Override
    //    public void writeToParcel(Parcel dest, int flags) {
    //        dest.writeInt(name);
    //        dest.writeInt(coat);
    //    }
}
