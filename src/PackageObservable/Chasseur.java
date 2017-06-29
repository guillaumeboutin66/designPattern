package PackageObservable;

/**
 * Created by guillaumeboutin on 29/06/2017.
 */
public class Chasseur implements Observateur {
    @Override
    public void reagis(Observable o) {
        System.out.println("je réagis : PAN PAN !");
    }
}
