package com.tca.comparator;

import com.tca.entities.Student;

import java.util.Comparator;

public class PerComparator implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return -s1.getPer().compareTo(s2.getPer());
    }
}
