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

        IChargeable telSam = new AdapterSamsoule(new PortableSamSaoule());
        telSam.Recharger(10);

        IChargeable telSonny = new AdapterSonneEricSonne(new PortableSonneEricSonne());
        telSam.Recharger(5);
    }
}
