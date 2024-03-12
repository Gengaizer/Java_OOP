package HomeTusk6;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addProd();
        library.addProd();
        library.addProd();

        NewBook<String> book1 = new NewBook<>("War and Peace", 84, "ru");// реализация пункта (Liskov Substitution
                                                                         // Principle - LSP)
        Book<String> book2 = new Book<>("Master and Margarita", 534);
        Book<String> book3 = new Book<>("All about cats", 263);
        Book<String> book4 = new Book<>("Cats as the meaning of life", 123);
        Book<String> book5 = new Book<>("Cats on Baikal", 452);
        Book<String> book6 = new Book<>("Cats are taking over the world", 865);
        // library.addProd(new Book<String>("Master and Margarita", 159));
        // library.addProd(new Book<String>("All about cats", 1219));

        library.addCard(1, book1);
        library.addCard(1, book2);
        library.addCard(2, book3);
        library.addCard(2, book4);
        library.addCard(2, book5);
        library.addCard(2, book6);
        for (LibraryCard count : library.getLibrary()) {
            System.out.println(count);
        }

    }
}
