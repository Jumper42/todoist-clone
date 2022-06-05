package com.bawp.todoister.util;

import androidx.room.TypeConverter;

import com.bawp.todoister.model.Priorty;

import java.util.Date;

public class Converter {

    //Kullanıcıdan Long tipinde gelecek datanın date'e dönüşümü
    @TypeConverter
    public static Date fromTimestamp(Long value){
        return value == null ? null : new Date(value);
    }

    //Database'den date tipinde gelecek datanın timestape'e(Long'a) dönüşüöü
    @TypeConverter
    public static Long dateToTimestamp(Date date){
        return date == null ? null : date.getTime();
    }

    //Database'den priotrty tipinde gelecek datanın stringe dönüşümü
    @TypeConverter
    public static String fromPriorty(Priorty priorty){
        return priorty == null ? null : priorty.name();
    }

    //Kullanıcıdan string tipinde gelecek datanın priorty dönüşümü
    @TypeConverter
    public static Priorty toPriorty(String string){
        return string == null ? null : Priorty.valueOf(string);
    }

}
