package com.example.recyclerview2;

public class Students {

    public Students(String name, int age, int imageID, String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.imageID = imageID;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    private String name;
    private int age;
    private String address;
    private String gender;

    private int imageID;
}
