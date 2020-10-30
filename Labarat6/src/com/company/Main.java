package com.company;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
public class Main {
            public static void main(String[] args) throws IOException {
                Reader in=null;
                Writer out=null;
                try {
                    in = new FileReader("E:\\MyFile11.txt");
                    out= new FileWriter("E:\\MyFile22.txt", true);
                    int oneByte;
                    while ((oneByte = in.read()) != -1) {
                        out.append((char)oneByte);
                        System.out.print((char)oneByte);
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка!!!! ");
                }
                finally{
                    in.close();
                    out.close();
                } }}




