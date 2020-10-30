package com.company;
import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Primer2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        BufferedWriter out=null;
        try {
            br = new BufferedReader( new FileReader("E:\\MyFile1.txt" ), 1024);
            out = new BufferedWriter( new FileWriter( "E:\\MyFile2.txt" ));
            int lineCount = 0; // счетчик строк
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); // переход на новую строку
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }}

