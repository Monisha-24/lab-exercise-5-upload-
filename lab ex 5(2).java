/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

***************************************************************************
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;

import java.util.Scanner;

/**
 *
 * 
 */
public class multilevelinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of Student's records:");
        int size=obj.nextInt();
        Student s[]=new Student[size];        

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter details of Student "+(i+1));
            s[i]=new Student();
            s[i].read();
            System.out.println("=======================");
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("DETAILS OF STUDENT "+(i+1));
            s[i].display();
            System.out.println("=======================");
        }
    }
    
}
class College
{
    String clgname,clgcode;
    Scanner obj=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter College name:");
        clgname=obj.next();
        System.out.println("Enter College code:");
        clgcode=obj.next();
    }
    void display()
    {
        System.out.println("COLLEGE NAME:"+clgname+"\nCOLLEGE CODE:"+clgcode);
    }
}
class Department extends College
{
    String dept;
    @Override
    void read()
    {
        super.read();
        System.out.println("Enter Department:");
        dept=obj.next();
        

    }
    @Override
    void display()
    {
        super.display();
        System.out.println("DEPARTMENT:"+dept);
        
    }
}
class Student extends Department
{
    String name,rollno;
    @Override
    void read()
    {
        
        super.read();
        System.out.println("Enter student's name:");
        name=obj.next();
        System.out.println("Enter roll no.");
        rollno=obj.next();
        
        
    }
    @Override
    void display()
    {
        super.display();
        System.out.println("STUDENT'S NAME:"+name+"\nROLL NO."+rollno);
        
    }
}
