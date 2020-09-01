package com.app.simplenotetaker;

import android.content.Context;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Note implements Serializable {
    private long mDateTime;
    private String mTitle;
    private String mContent;
    public Note (String content, long dateTime, String title){
        mContent = content;
        mDateTime = dateTime;
        mTitle = title;
    }

    public void setDateTime(long dateTime) {
        mDateTime = dateTime;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public void setmTitle(String title) {
        mTitle = title;
    }

    public long getDateTime() {
        return mDateTime;
    }
    public String getTitle() {
        return mTitle;
    }
    public String getContent() {
        return mContent;
    }

    public String getDateTimeFormatted(Context context){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" , context.getResources().getConfiguration().locale);
        sdf.setTimeZone(TimeZone.getDefault());
        return sdf.format(new Date(mDateTime));
    }







}
