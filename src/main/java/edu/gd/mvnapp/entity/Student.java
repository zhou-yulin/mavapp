package edu.gd.mvnapp.entity;

public class Student {

    private String id;
    private String name;
    //private String password;
    private String sex;
    //private String schoolDate;
    //private String major;
    private String phone;
    private String mail;

    public Student() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }






    public String getMail() {
        return mail;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                //", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                //", schoolDate='" + schoolDate + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }


}