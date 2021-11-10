package test.Bridge;

public class BookRessource extends Ressource {
    private Book book;

    public BookRessource(Book book) {
        this.book = book;
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public String getDomain() {
        return book.getAuthor();
    }
}
