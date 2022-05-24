package io;
/**
 * 3. What is a file? Why are files necessary?
 *
 * 4. What is the point of the following statement?
 * out = new PrintWriter( new FileWriter("data.dat") );
 * Why would you need a statement that involves two different stream classes, PrintWriter and FileWriter?
 * https://math.hws.edu/eck/cs124/javanotes8/c11/quiz_answers.html
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class LineCounts {

    public static void main(String[] args) {
        for(String filename : args){
            System.out.println("filename = " + filename);
            try{

                File file = new File(filename);
                int counter = 0;
                if(file.isFile()){
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    while(br.readLine() != null) counter++;
                    System.out.println("The number of lines in the file is " + counter);
                    br.close();
                }


            }catch (Exception ignore){}
        }

        System.out.println("Below is Scanner class");
        for(String filename : args){
            System.out.println("filename = " + filename);
            try{
                File file = new File(filename);
                int counter = 0;
                if(file.isFile()){
                    Scanner sc = new Scanner(file);
                    while(sc.hasNext()) {
                        sc.nextLine();
                        counter++;}
                    System.out.println("The number of lines in the file is " + counter);
                }

            }catch (Exception ignore){}
        }

        System.out.println("Below uses stream");
        for(String filename : args){
            System.out.println("filename = " + filename);
            try{

                File file = new File(filename);
                if(file.isFile()){
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    System.out.println("The number of lines in the file is " + br.lines().count());
                    br.close();
                }


            }catch (Exception ignore){}
        }
    }
}
