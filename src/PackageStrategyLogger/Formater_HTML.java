package PackageStrategyLogger;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class Formater_HTML  implements Formater{
    @Override
    public void write(String s) {
        System.out.println("<HTML><div>"+s+"</div></HTML>");
    }
}