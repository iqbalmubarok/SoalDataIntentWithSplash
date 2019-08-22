package com.example.soaldataintentwithsplash;

import android.os.Parcel;
import android.os.Parcelable;

public class DataOrder implements Parcelable {

    private String nama;

    protected DataOrder(Parcel in) {
        nama = in.readString();
        alamat = in.readString();
        pesanan = in.readString();
    }

    public static final Creator<DataOrder> CREATOR = new Creator<DataOrder>() {
        @Override
        public DataOrder createFromParcel(Parcel in) {
            return new DataOrder(in);
        }

        @Override
        public DataOrder[] newArray(int size) {
            return new DataOrder[size];
        }
    };

    public DataOrder() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    private String alamat;
    private String pesanan;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(alamat);
        parcel.writeString(pesanan);
    }
}
