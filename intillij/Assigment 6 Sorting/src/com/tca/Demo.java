package com.tca;

import com.tca.comparator.NameComparator;
import com.tca.comparator.PerComparator;
import com.tca.comparator.RnoComparator;
import com.tca.entities.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo
{
    public static void main(String[] args)
    {
        Student ob1 = new Student(15,"Pradeep",12.2);
        Student ob2 = new Student(16,"Aniket",15.23);
        Student ob3 = new Student(17,"Kaushal",27.12);

        List<Student> l = new ArrayList<>();
        l.add(ob1);
        l.add(ob2);
        l.add(ob3);

        Collections.sort(l,new RnoComparator());

        System.out.println("Sorting Liast Using Roll No ");
        for(Student ob : l)
        {
            System.out.println("Roll No    : "+ob.getRno());
            System.out.println("Name       : "+ob.getName());
            System.out.println("Percentage : "+ob.getPer());
            System.out.println("-------------------------");
        }
        System.out.println("Sorting Using Name ");

        Collections.sort(l,new NameComparator());

        for(Student ob : l)
        {
            System.out.println("Roll No    : "+ob.getRno());
            System.out.println("Name       : "+ob.getName());
            System.out.println("Percentage : "+ob.getPer());
            System.out.println("-------------------------");
        }
        Collections.sort(l,new PerComparator());

        System.out.println("Sorting Using Percentage ");

        for(Student ob : l)
        {
            System.out.println("Roll No    : "+ob.getRno());
            System.out.println("Name       : "+ob.getName());
            System.out.println("Percentage : "+ob.getPer());
            System.out.println("-------------------------");
        }
    }
}
