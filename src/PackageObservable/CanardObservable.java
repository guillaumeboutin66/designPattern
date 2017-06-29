package PackageObservable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guillaumeboutin on 29/06/2017.
 */
public class CanardObservable implements EmissionSonore, Observable {
    static List<Observateur> listObs= new ArrayList<>();

    EmissionSonore esDécoré;

    public CanardObservable(EmissionSonore e){
        esDécoré = e;
    }

    @Override
    public void enregistrerObservateur(Observateur o) {
        System.out.println("j'enregiste");
        listObs.add(o);
    }

    @Override
    public void notifierObservateur() {
        System.out.println("je notifie");
        for(Observateur o : listObs){
            o.reagis(this);
        }
    }

    @Override
    public void emetSon() {
        esDécoré.emetSon();
        this.notifierObservateur();
    }
}
