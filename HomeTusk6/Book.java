package HomeTusk6;

public class Book<B> {
    private B book;
    private Integer numbering;

    public Book(B book, Integer numbering) {
        this.book = book;
        this.numbering = numbering;
    }

    public B getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Книга: " + book + ", № " + numbering;
    }

    public Integer getNumbering() {
        return numbering;
    }
}
