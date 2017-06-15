package PackageDecorateurHtml;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class ChaineController {
    public static void main(String[] args){

        Chaine chaine = new ChaineSimple("Mon texte ici");
        chaine = new DecoBold(chaine);
        System.out.println(chaine.imprimeToi());
        chaine = new DecoItalic(chaine);
        System.out.println(chaine.imprimeToi());
    }
}
