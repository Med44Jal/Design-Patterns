package test.Bridge;

public class BookView extends View {
    public BookView(Ressource ressource) {
        super(ressource);
    }

    @Override
    public String show() {
        return ressource.getTitle() + "--->" + ressource.getDomain();
    }
}
