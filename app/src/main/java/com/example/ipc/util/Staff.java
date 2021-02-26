package com.example.ipc.util;

import android.os.Parcel;
import android.os.Parcelable;

public class Staff implements Parcelable {
    private String name;
    private int age;
    private int sex;

    public Staff(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    protected Staff(Parcel in) {
        name = in.readString();
        age = in.readInt();
        sex = in.readInt();
    }

    public static final Creator<Staff> CREATOR = new Creator<Staff>() {
        @Override
        public Staff createFromParcel(Parcel in) {
            return new Staff(in);
        }

        @Override
        public Staff[] newArray(int size) {
            return new Staff[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(age);
        parcel.writeInt(sex);
    }
}
