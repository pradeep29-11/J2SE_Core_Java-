package com.tca;

import com.tca.entitites.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AppSerialize {

   public static void main(String args[])
   {

       FileOutputStream fos = null;
       ObjectOutputStream oos = null;

       try
       {

           fos = new FileOutputStream("Resource/a.txt");
           oos = new ObjectOutputStream(fos);

           Student s = new Student();
           s.setRno(1);
           s.setName("Pradeep");
           s.setAge(19);
           oos.writeObject(s);

           System.out.println("Object has been Serialized !!");

       }
       catch(Exception ae)
       {
           ae.printStackTrace();
       }
       finally
       {
           try
           {
               oos.close();
               fos.close();
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }
       }
   }


}
