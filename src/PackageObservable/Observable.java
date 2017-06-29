package PackageObservable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guillaumeboutin on 29/06/2017.
 */
public interface Observable {

    void enregistrerObservateur(Observateur o);

    void notifierObservateur();
}
