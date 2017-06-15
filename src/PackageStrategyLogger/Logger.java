package PackageStrategyLogger;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public abstract class Logger {
    private Formater formater;

    public Logger(Formater f){
        formater = f;
    }


    abstract void write(String s);
}
