package com.test.bahasapemrograman;

import android.os.Parcel;
import android.os.Parcelable;

public class Pemrograman implements Parcelable {
    private String judul,desc,foto;

    public Pemrograman() {

    }

    public String getJudul()
    {
        return judul;
    }

    public void setJudul(String judul)
    {
        this.judul = judul;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {

        this.desc = desc;
    }

    public String getFoto()
    {
        return foto;
    }

    public void setFoto(String foto)
    {
        this.foto = foto;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.desc);
        dest.writeString(this.foto);
    }


    protected Pemrograman (Parcel in){
        this.judul = in.readString();
        this.desc = in.readString();
        this.foto = in.readString();
    }

    public static final Parcelable.Creator<Pemrograman> CREATOR = new Parcelable.Creator<Pemrograman>(){
        @Override
        public  Pemrograman createFromParcel (Parcel source){
            return new Pemrograman(source);
        }

        @Override
        public Pemrograman[] newArray (int size) {
            return new Pemrograman[size];
        }
    };
}
