package TerminalDecorateur;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class File {
    BufferedReader file;


    public File(){}
    public File(BufferedReader f){
        file = f;
    }

    public String imprimeToi() throws IOException {
        String sCurrentLine;
        String complete = "";

        while ((sCurrentLine = getFile().readLine()) != null) {
            complete= complete+(sCurrentLine);
        }
        return complete;
    }

    public BufferedReader getFile() {
        return file;
    }

    public void setFile(BufferedReader file) {
        this.file = file;
    }
}
