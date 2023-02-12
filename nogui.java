package dev.rvye.fileDeleter;

import java.io.File;
import java.util.Scanner;

@SuppressWarnings({"ResultOfMethodCallIgnored", "unused"})
public class fileDeleterNOGUI {
    public static void main(String[] args) {
        // scanner
        System.out.println("File or Folder to Delete");

        Scanner scr = new Scanner(System.in);
        scr.nextLine();

        // deletes the file
        File file = new File(String.valueOf(scr));

        try {
            file.delete();
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }

    }
}
