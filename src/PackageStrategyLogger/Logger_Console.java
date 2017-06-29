package PackageStrategyLogger;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class Logger_Console extends Logger {

    public Logger_Console(Formater f){
        super(f);
    }

    @Override
    void write(String s) {
        super.getFormater().write(s);
    }


}
