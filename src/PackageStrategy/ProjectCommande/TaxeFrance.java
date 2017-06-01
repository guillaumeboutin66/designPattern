package PackageStrategy.ProjectCommande;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
class TaxeFrance implements Taxe {

    @Override
    public Double calculeTaxe(double m) {
        return m*0.20;
    }

}
