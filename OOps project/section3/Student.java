package section3;

import java.util.Scanner;

public class Student {
    String name;
    int id;
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        Student s=new Student("jyothi",67);
        System.out.println(s.id);
        System.out.println(s.name);


    }

}
