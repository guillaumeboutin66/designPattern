package PackageStrategyLogger;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class Formater_STRING  implements Formater{
    @Override
    public void write(String s) {
        System.out.println(s);
    }
}
