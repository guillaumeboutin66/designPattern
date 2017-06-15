package PackageAdapteur;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class AdapterSamsoule implements IChargeable {
    PortableSamSaoule portable;

    public AdapterSamsoule(PortableSamSaoule p) {
        portable = p;
    }

    @Override
    public void Recharger(int volts) {
        portable.ChargerPortable(volts);
    }
}
