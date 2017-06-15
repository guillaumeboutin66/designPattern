package PackageAdapteur;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class ChargerController {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Chargeur c = new Chargeur();

        IChargeable telSam = new AdapterSamsoule(new PortableSamSaoule());
        c.brancherPortable(telSam);
        telSam.Recharger(10);

        IChargeable telSonny = new AdapterSonneEricSonne(new PortableSonneEricSonne());
        c.brancherPortable(telSonny);
        telSam.Recharger(5);
    }
}
