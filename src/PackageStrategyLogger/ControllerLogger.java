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
        Logger log = new Logger_Console(new Formater_XML());
        log.write("Mon log XML");
        log.setFormater(new Formater_HTML());
        log.write("Mon log HTML");
    }
}
