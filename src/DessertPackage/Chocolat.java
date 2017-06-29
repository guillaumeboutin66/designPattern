package DessertPackage;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class Chocolat extends DecoDessertIngredient{

    public Chocolat(Dessert d) {
        super.dessert = d;
        setLibelle();
        setPrix();
    }

    // On met à jour le libelle
    @Override
    void setLibelle() {
        dessert.setNomDessert(dessert.getNomDessert() + ", Chocolat");
    }

    // On met à jour le prix
    @Override
    void setPrix() {
        dessert.setPrix(dessert.getPrix() + 0.20);
    }


}
