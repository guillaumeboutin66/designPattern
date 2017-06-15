package PackageStrategyLogger;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class Logger_Console extends Logger {
    private Formater formater;

    public Logger_Console(Formater f){
        super(f);
        formater = f;
    }

    @Override
    void write(String s) {
        formater.write(s);
    }
}
