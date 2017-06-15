package TerminalDecorateur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class FileController {

    public static void main(String[] args){

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader("/Users/guillaumeboutin/IdeaProjects/CanardProject/src/TerminalDecorateur/test.txt"));

            File file = new File(br);
            System.out.println(file.imprimeToi());

            file = new UpperDecorator(file);
            System.out.println(file.imprimeToi());

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
