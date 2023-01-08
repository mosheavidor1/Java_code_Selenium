package Constructors;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesScanner {

  String name;

    File file = new File(NameConst.path);

    Scanner scanner;

    FindTheNames userName = new FindTheNames(name);
    PrintTheUserName userPrint = new PrintTheUserName(userName.name);




    public FilesScanner() {
            try {
                scanner = new Scanner(file);
                while (scanner.hasNext()) {
                   name= scanner.next();
                   userPrint.print(name);

                }

            } catch (FileNotFoundException e) {

            }
        }


    }





