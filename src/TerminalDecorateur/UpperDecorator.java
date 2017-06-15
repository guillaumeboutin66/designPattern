package TerminalDecorateur;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class UpperDecorator extends FileDecorator{

    public UpperDecorator(File deco) {
        super(deco);
    }

    @Override
    public String imprimeToi() throws IOException {
        String sCurrentLine;
        String complete = "";

        while ((sCurrentLine = super.getFile().readLine()) != null) {
            sCurrentLine = sCurrentLine.toUpperCase();
            complete = complete + sCurrentLine;
        }
        System.err.println("current "+sCurrentLine);
        System.err.println("complete "+complete);
        return complete;
    }
}
