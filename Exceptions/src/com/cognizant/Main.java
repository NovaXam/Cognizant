package com.cognizant;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
	    int [] num = new int[3];
	    int i = 0;
        num[0] = 10;

        try {
            i = num[0] / i;
            System.out.println(num[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        };
        String str = readFile();
        System.out.println(str + " - " + "this is text from file");

        String newStr = "Hello room#5";
        printText(newStr);

        urlFlow();
    };

    public static String readFile() {
        String str = "";
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
            str = read.readLine();
            while(read.readLine() != null) {
                str = read.readLine();
                read.close();
            }
        } catch (IOException io) {
            io.getMessage();
        };
        return str;
    };

    public static void urlFlow() {
        try {
            URL ulr = new URL("http://google.com");
            HttpURLConnection urlConnection = (HttpURLConnection) ulr.openConnection();
        }catch (MalformedURLException io) {
            io.getMessage();
        } catch (IOException co) {
            co.getMessage();
        }
    };

    public static void printText(String args) {
        try {
            PrintWriter pw = new PrintWriter("text.txt");
            pw.write(args);
            pw.close();
        } catch (FileNotFoundException nf) {
            nf.getMessage();
        };
    };
};