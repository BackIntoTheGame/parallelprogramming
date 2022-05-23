package networks;

import java.io.File;
import java.util.Scanner;

/**
 * This program lists the files in a directory specified by
 * the user.  The user is asked to type in a directory name.
 * If the name entered by the user is not a directory, a
 * message is printed and the program ends.
 *
 * Chp 11
 * exercise 1 adding subdirectory
 *
 * quiz
 *
 1. In Java, input/output is done using I/O streams. I/O streams are an abstraction. Explain what this means and why it is important.
 [An I/O stream represents a source from which data can be read or a destination to which data can be written. A stream is an abstraction because it represents the abstract idea of a source or destination of data, as opposed to specific, concrete sources and destinations such as a particular file or network connection. The I/O stream abstraction is important because it allows programmers to do input/output using the same methods for a wide variety of data sources and destinations. It hides the details of working with files, networks, and the screen and keyboard.]
 2. Java has two types of I/O stream: character streams and byte streams. Why? What is the difference between the two types of streams?
 Character streams is for human-readable data and byte streams are for machine-formatted data. Byte streams can be used for machine-to-machine communication and are efficient in storing data, but they are fragile in the sense that its meaning is not self-evident.
 [Character streams are for working with data in human-readable format, that is, data expressed as sequences of characters. Byte streams are for data expressed in the machine-readable format that is used internally in the computer to represent the data while a program is running. It is very efficient for a computer to read and write data in machine format, since no translation of the data is necessary. However, if a person must deal directly with the data, then character streams should be used so that the data is presented in human-readable form.]
 *
 */
public class DirectoryList {


    public static void main(String[] args) {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        String directoryName;  // Directory name entered by the user.
        File directory;        // File object referring to the directory.
        String[] files;        // Array of file names in the directory.
        Scanner scanner;       // For reading a line of input from the user.

        scanner = new Scanner(System.in);  // scanner reads from standard input.

        System.out.print("Enter a directory name: ");
        directoryName = scanner.nextLine().trim();
        directory = new File(directoryName);

        if (directory.isDirectory() == false) {
            if (directory.exists() == false)
                System.out.println("There is no such directory!");
            else
                System.out.println("That file is not a directory.");
        }
        else {
          /*  files = directory.list();
            System.out.println("Files in directory \"" + directory + "\":");
            for (int i = 0; i < files.length; i++)

                System.out.println("   " + files[i]);*/
            recurseDir(directory);
        }

    } // end main()

    public static void recurseDir(File dir){
        if(dir.isDirectory()){
            String[] files = dir.list();
            for (int i = 0; i < files.length; i++) {
                File sub = new File(dir, files[i]);
                System.out.println("   " + files[i]);
                if(sub.isDirectory())
                    recurseDir(sub);
            }
        }
    }

} // end class DirectoryList