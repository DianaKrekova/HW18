package ru.mirea.krekova18_1;
import java.lang.Exception;
import java.util.Scanner;
public class ThrowsDemo {
    public void getKey() {
        boolean error = true;
        Scanner myScanner = new Scanner(System.in);
        while (error) {
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();

            try {
                printDetails(key);
                error = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}


