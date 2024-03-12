package HomeTusk6;

public class NewBook<B> extends Book {
    private String language;

    public NewBook(B book, Integer numbering, String language) {
        super(book, numbering);
    }
}
