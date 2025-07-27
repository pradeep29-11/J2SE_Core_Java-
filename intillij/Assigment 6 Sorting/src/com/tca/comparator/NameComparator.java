package com.tca.comparator;

import com.tca.entities.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        String name1 = s1.getName();
        String name2 = s2.getName();

        return -name1.compareTo(name2);
    }
}
