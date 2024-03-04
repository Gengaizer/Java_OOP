package semenar_4.Home_tusk_4;

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
        return book + ", Под номером " + numbering;
    }

    public Integer getNumbering() {
        return numbering;
    }
}
