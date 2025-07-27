package com.tca.entities;

public class Student
{
    private int rno;
    private String name;
    private Double per;

    Student(){}

    public Student(int rno, String name, Double per)
    {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }

    public void setRno(int rno)
    {
        this.rno = rno;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPer(Double per)
    {
        this.per = per;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public Double getPer() {
        return per;
    }
    public void display()
    {
        System.out.println("Rno  : " + rno);
        System.out.println("Name : " + name);
        System.out.println("Per  : " + per);
    }
}
