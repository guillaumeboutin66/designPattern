package DessertPackage;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public abstract class DecoDessertIngredient extends Dessert {
    protected Dessert dessert;

    abstract void setLibelle();

    abstract void setPrix();

    // Cela est pas joli, mais dans mon Main :
    // gauffre = new Chocolat(gauffre)
    // me resortait null en libelle et prix ...
     Dessert getDessert(){
        return dessert;
    }

}
