package PackageStrategyLogger;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class ControllerLogger {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Logger logXml = new Logger_Console(new Formater_XML());
        logXml.write("Mon log XML");


        Logger logHtml = new Logger_Console(new Formater_HTML());
        logHtml.write("Mon log HTML");
    }
}
