package test.Bridge;

public class MagazineRessource extends Ressource {
    private Magazine magazine;

    public MagazineRessource(Magazine magazine) {
        this.magazine = magazine;
    }

    @Override
    public String getTitle() {
        return magazine.getTitle();
    }

    @Override
    public String getDomain() {
        return magazine.getDomain();
    }
}
