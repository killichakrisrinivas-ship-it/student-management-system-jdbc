package org.example;

public class Student {
    private int sid;
    private String name;
    private int age;
    private String branch;
    private String email;

    public Student(int sid, int age,String name , String branch, String email){
        this.sid = sid;
        this.age = age;
        this.name = name;
        this.branch= branch;
        this.email = email;
    }
    public int getId(){
        return sid;
    }
    public void setId(int sid){
        this.sid = sid;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

