package HomeTusk6;

import java.util.ArrayList;
import java.util.List;

public class Library implements AddLibraryCard {
    private List<LibraryCard<Integer, Book>> library;

    public List<LibraryCard<Integer, Book>> getLibrary() {
        return library;
    }

    // private List<>
    private int CardNum = 1;

    public Library() {
        library = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "№= " + CardNum + library;
    }

    @Override
    public void addProd() {
        library.add(new LibraryCard<Integer, Book>(CardNum++));

    }

    @Override
    public void addCard() {

    }

    public void addCard(Integer n, Book book) {

        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getNumberLibCard() == n) {
                library.get(i).setListBook(book);
            }
        }
    }

}