package advanced.collections;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Scott", "Gatsby", Genre.DRAMA, 2002);
        library.addBook(book);
        /*System.out.println(library.getBooksByGenre());


        System.out.println(library.getAllGenres());
        System.out.println(library.getAllBooksByGenre(Genre.DRAMA));

        try {
           // library.buyBook((library.findBookByTitle("Great Gatsby", Genre.DRAMA)));
            library.buyBook(new Book("Frank Herbert", "Dune", Genre.ADVENTURE, 1996));

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(library.getBooksByGenre());

        System.out.println(library.getAllGenreWithNoOfBooks());*/

        System.out.println(library.getNumberOfAllBooks());

        System.out.println(library.getAllBooksWithYearGreaterThanForGenre(Genre.DRAMA ,2000));

        System.out.println(library.getAllBooksTitle());

        library.printAllTitleBooksWithYearBetween(2000, 2010);


    }
}
