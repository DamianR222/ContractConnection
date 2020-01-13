package com.roberts222.damian.contractconnection;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "first_name")
    public String firstName;

    @ColumnInfo(name = "last_name")
    public String lastName;

    @ColumnInfo(name = "address")
    private
    String address;

    @ColumnInfo(name = "phone")
    private
    String phone;

    @ColumnInfo(name = "availability")
    private
    String availability;

    @ColumnInfo(name = "qualifications")
    private
    String qualifications;

    @ColumnInfo(name = "services_offered")
    private
    String servicesOffered;

    User(String firstName, String lastName, String address, String phone, String availability, String qualifications, String servicesOffered) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.availability = availability;
        this.qualifications = qualifications;
        this.servicesOffered = servicesOffered;
    }


}