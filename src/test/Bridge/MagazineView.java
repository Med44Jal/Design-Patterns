package test.Bridge;

public class MagazineView extends View {
    public MagazineView(Ressource ressource) {
        super(ressource);
    }

    @Override
    public String show() {
        return ressource.getTitle() + "--->" + ressource.getDomain();
    }
}
