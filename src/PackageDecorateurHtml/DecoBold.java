package PackageDecorateurHtml;

/**
 * Created by guillaumeboutin on 14/06/2017.
 */
public class DecoBold extends DecorateurBalise{

    public DecoBold(Chaine deco) {
        super(deco);
    }

    @Override
    public String imprimeToi(){
        return "<b>"+super.imprimeToi()+"</b>";
    }
}
