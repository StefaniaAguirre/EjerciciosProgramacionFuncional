package Punto4;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ExecutePunto4 {


    public static void main(String[] args) {

        Supplier<List<Book>> supplierBooks = () -> {
            List<Book> booksList = new ArrayList<>();
            booksList.add(new Book("Cien años de soledad", "Gabriel García Márquez", 9));
            booksList.add(new Book("1984", "George Orwell", 8));
            booksList.add(new Book("El principito", "Antoine de Saint-Exupéry", 5));
            booksList.add(new Book("Don Quijote de la Mancha", "Miguel de Cervantes", 7));
            booksList.add(new Book("Matar a un ruiseñor", "Harper Lee", 6));
            return booksList;
        };

        List<Book> books = supplierBooks.get();

        Consumer<List<Book>> consumerHelper = (bookOne) -> {
            Predicate<Double> isRecommended = value -> value >= 7;

            UnaryOperator<Book> showRecommendation = book -> {
                if(isRecommended.test(book.getRating())){
                    System.out.println("El libro " + book.getName()+ " es recomendado.");
                }
                return book;
            };
            bookOne.forEach(showRecommendation::apply);
        };

        consumerHelper.accept(books);
    }
}
