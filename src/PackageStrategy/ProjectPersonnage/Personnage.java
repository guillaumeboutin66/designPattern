package PackageStrategy.ProjectPersonnage;

/**
 * Created by guillaumeboutin on 01/06/2017.
 */
public abstract class Personnage {
    Combat monTypeDeCombat;

    public abstract void afficheToi();

    public void batsToi(){
        monTypeDeCombat.executeToi();
    };

    public Combat getMonTypeDeCombat() {
        return monTypeDeCombat;
    }

    public void setMonTypeDeCombat(Combat monTypeDeCombat) {
        this.monTypeDeCombat = monTypeDeCombat;
    }
}
