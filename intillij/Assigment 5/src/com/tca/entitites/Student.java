package com.tca.entitites;

import java.io.Serializable;

public class Student implements Serializable
{
    private static final long serialVersionUID = 1L;
    int rno;
    String name;
    int age;

    public Student()
    {

    }
    public Student(int rno, String name, int age) {
        this.rno = rno;
        this.name = name;
        this.age = age;
    }


    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String toString() {

        return "Student{" + "rno=" + rno + ", name=" + name + ", age=" + age + '}';
    }
}
