package test.Bridge;

public class Magazine {
    private String title;
    private String domain;

    public Magazine(String title, String domain) {
        this.title = title;
        this.domain = domain;
    }

    public String getTitle() {
        return title;
    }

    public String getDomain() {
        return domain;
    }
}
