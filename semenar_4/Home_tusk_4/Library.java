package semenar_4.Home_tusk_4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryCard<Integer, Book>> library;

    public List<LibraryCard<Integer, Book>> getLibrary() {
        return library;
    }

    // private List<>
    private int CardNum = 1;

    public Library() {
        library = new ArrayList<>();
    }

    void addCard(Integer n, Book book) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getNumberLibCard() == n) {
                library.get(i).setListBook(book);
            }
        }
    }

    void addProd() {
        library.add(new LibraryCard<Integer, Book>(CardNum++));
    }

    @Override
    public String toString() {
        return "№= " + CardNum + library;
    }

}
