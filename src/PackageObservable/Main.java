package PackageObservable;

/**
 * Created by guillaumeboutin on 29/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Observateur test = new Chasseur();
        EmissionSonore testCanard = new CanardObservable(new Canard());

        ((Observable) testCanard).enregistrerObservateur(test);

        testCanard.emetSon();
    }
}
