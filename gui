package dev.rvye.fileDeleter;

import java.io.File;
import javax.swing.*;


@SuppressWarnings({"ResultOfMethodCallIgnored", "unused"})
public class fileDeleter {
        public static void main(String[] args) {

            String jop = JOptionPane.showInputDialog(null, "File or Folder to Delete");
            File file = new File(jop);

            try {
                file.delete();
            } catch(Exception e) {
                System.out.println("Error: " + e);
            }

        }
}
