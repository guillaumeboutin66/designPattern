package PackageAdapteur;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class AdapterSonneEricSonne implements IChargeable {
    PortableSonneEricSonne portable;


    public AdapterSonneEricSonne(PortableSonneEricSonne p) {
        portable = p;
    }

    @Override
    public void Recharger(int volts) {
        portable.ChargerBatteries(volts);
    }
}
