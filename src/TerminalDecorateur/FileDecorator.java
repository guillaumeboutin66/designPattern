package TerminalDecorateur;

import java.io.IOException;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class FileDecorator extends File {
    private File decore;

    public FileDecorator(File dec) {
        super();
        super.setFile(dec.getFile());
        decore = dec;
    }

    public String imprimeToi() throws IOException {
        String sCurrentLine;
        String complete = "";

        while ((sCurrentLine = super.getFile().readLine()) != null) {
            complete= complete+(sCurrentLine);
        }
        return complete;
    }
}
