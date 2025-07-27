package com.tca.enteties.student;

import java.io.Serializable;

public class student implements Serializable
{
    int rno;
    String name;
    double percetage;
    student()
    {

    }
    student(int rno, String name, double percetage)
    {
        this.rno = rno;
        this.name = name;
        this.percetage = percetage;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercetage(double percetage) {
        this.percetage = percetage;
    }

    public double getPercetage() {
        return percetage;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }
    public String toString()
    {
        return "Student [rno : "+rno+", name : "+name+" percetage : "+percetage+"]";
    }
}
