package ru.mirea.krekova18;
import java.util.Scanner;
public class Exception1 {
    public void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            try{
                int i = Integer.parseInt(intString);
                System.out.println( 2/i );
            }catch(Exception e){
                System.err.println("Error");
            }finally {
                System.out.println("End");
            }
        }
    }
