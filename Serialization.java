package com.university;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        try{
            Employee1 emp1 = new Employee1(201,"Atif");
            Employee1 emp2 = new Employee1(202,"Roshaan");
            Employee1 emp3 = new Employee1(203,"Hashim");

            FileOutputStream fout = new FileOutputStream("ser.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(emp1);
            out.writeObject(emp2);
            out.writeObject(emp3);
            out.flush();

            out.close();
            System.out.println("Serialization and DeSerialization successfully executed");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
