package com.tca.comparator;
import com.tca.entities.Student;
import java.util.Comparator;

public class RnoComparator implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        Integer rno1=s1.getRno();
        Integer rno2=s2.getRno();

        return -rno1.compareTo(rno2);
    }
}
