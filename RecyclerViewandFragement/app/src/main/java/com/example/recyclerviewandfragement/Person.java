package com.example.recyclerviewandfragement;

public class Person {
    private String Name;
    private String tel_nr;

    public Person(String name, String tel_nr) {
        this.Name = name;
        this.tel_nr = tel_nr;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTel_nr() {
        return tel_nr;
    }

    public void setTel_nr(String tel_nr) {
        this.tel_nr = tel_nr;
    }
}
