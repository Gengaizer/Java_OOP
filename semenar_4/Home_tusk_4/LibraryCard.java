package semenar_4.Home_tusk_4;

import java.util.ArrayList;
import java.util.List;

public class LibraryCard<N, RanBook> {
    private N numberLibCard;
    private RanBook book;
    private List<RanBook> listBook;

    public LibraryCard(N numberLibCard, RanBook book) {
        this.numberLibCard = numberLibCard;

        this.listBook = new ArrayList<>();

    }

    public LibraryCard(N nunumberLibCard) {
        this(nunumberLibCard, null);
    }

    public N getNumberLibCard() {
        return numberLibCard;
    }

    public RanBook getBook() {
        return book;
    }

    public void setListBook(RanBook book) {
        listBook.add(book);
    }

    @Override
    public String toString() {
        return "Карточка № " + numberLibCard + ", Список книг " + listBook;
    }

}
