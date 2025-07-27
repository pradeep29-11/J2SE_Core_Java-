package com.tca;

import com.tca.entitites.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialize
{
    public static void main(String args[])
    {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try
        {
            fis = new FileInputStream("Resource/a.txt");
            ois = new ObjectInputStream(fis);
            Student sb = (Student) ois.readObject();
            System.out.println("Name: " + sb.getName());
            System.out.println("Age: " + sb.getAge());
            System.out.println("Class: " + sb.getClass());

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try
            {
                fis.close();
                ois.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
