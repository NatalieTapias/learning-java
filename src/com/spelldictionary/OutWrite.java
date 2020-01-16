package com.spelldictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutWrite {
   public static void main(String[] args) {
       try {
           FileWriter fw = new FileWriter("example2.csv");
           PrintWriter pw = new PrintWriter(fw);

           pw.println("course: 80 credits");
           pw.println("course: 30 credits");
           pw.println("course: 20 credits");
           pw.println("course: 40 credits");
           pw.println("course: 90 credits");



           pw.close();
       } catch (IOException e) {
           System.out.println("Error!");
       }
   }
}
