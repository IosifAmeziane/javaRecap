package advanced.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Library {

    private Map<Genre, HashSet<Book>> booksByGenre;

    public Library() {
        initWithDefaultValues();
    }

    public Map<Genre, HashSet<Book>> getBooksByGenre() {
        return booksByGenre;
    }

    public void setBooksByGenre(Map<Genre, HashSet<Book>> booksByGenre) {
        this.booksByGenre = booksByGenre;
    }

    public Library(Map<Genre, HashSet<Book>> booksByGenre) {
        this.booksByGenre = booksByGenre;
    }

    private void initWithDefaultValues() {

        booksByGenre = new HashMap<Genre, HashSet<Book>>();

        booksByGenre.put(Genre.DRAMA, new HashSet<Book>() {{
            add(new Book("Scott Fitzgerald", "Great Gatsby", Genre.DRAMA, 2001));
            add(new Book("Dzenisa Jas", "Taken", Genre.DRAMA, 1989));
        }});
        booksByGenre.put(Genre.SCIFI, new HashSet<Book>() {{
            add(new Book("Frank Herbert", "Dune", Genre.SCIFI, 1996));
            add(new Book("Margaret Cavendish", "The Blazing World", Genre.SCIFI, 1666));
            add(new Book("Isaac Asimov", "Foundation", Genre.SCIFI, 1951));
            add(new Book("Stanislaw Lem", "Solaris", Genre.SCIFI, 1961));
        }});
        booksByGenre.put(Genre.HORROR, new HashSet<Book>() {{
            add(new Book("Mary Shelley", "Frankenstein", Genre.HORROR, 1897));
        }});
    }

    public void addBook(Book book) {
        HashSet<Book> books = booksByGenre.get(book.getGenre());
        if (books == null) {
            booksByGenre.put(book.getGenre(), new HashSet<Book>() {{
                add(book);
            }});
        } else {
            //booksByGenre.get(book.getGenre()).add(book);
            books.add(book);
        }
    }

    public HashSet<Book> getAllBooksByGenre(Genre genre) {
        return booksByGenre.get(genre);
    }

   /* public HashSet<Book> getAllBooksByGenre(Genre genre) {
        return booksByGenre.get(genre);
    }*/

    public Set<Genre> getAllGenres() {
        return booksByGenre.keySet();
    }

    public void buyBook(Book book) throws Exception {
        if (book == null) {
            throw new NoSuchBookException();
        }
        if (!booksByGenre.containsKey(book.getGenre())) {
            throw new Exception("Genre: " + book.getGenre() + " does not exist");
        }
        booksByGenre.get(book.getGenre()).remove(book);
    }


    public Book findBookByTitle(String title, Genre genre) {
        HashSet<Book> allBooks = booksByGenre.get(genre);
        for (Book book : allBooks) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Map<Genre, Integer> getAllGenreWithNoOfBooks() {
        System.out.println(booksByGenre.entrySet());

        // return booksByGenre.entrySet().stream().collect(Collectors.toMap(g-> g.getKey(), v -> v.getValue().size()));

        // cu method reference
        return booksByGenre.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, v -> v.getValue().size()));
    }

    public int getNumberOfAllBooks() {

        //  return booksByGenre.values().stream().map(m-> m.size()).reduce(0, (a,b)->a+b);

        // prin method reference
        // return booksByGenre.values().stream().map(m-> m.size()).reduce(0, Integer::sum);

        //return booksByGenre.entrySet().stream().map(v -> v.getValue().size()).reduce(0, Integer::sum);

        // return booksByGenre.values().stream().mapToInt(Collection::size).sum();

        return booksByGenre.values().stream().mapToInt(m -> m.size()).sum();

    }

    public Set<Book> getAllBooksWithYearGreaterThanForGenre(Genre genre, int year) {

       return booksByGenre.get(genre).stream().filter(p -> p.getYear() > year).collect(Collectors.toSet());

    }

    public String getAllBooksTitle() {
       /* return booksByGenre
                .values()
                .stream().map(t -> t.stream().map(b -> b.getTitle()))
                .collect(Collectors.joining(" , "));*/

        return booksByGenre
                .values()
                .stream()
                .flatMap(t -> t.stream())
                .map(b -> b.getTitle())
                .collect(Collectors.joining(" , ", "(", ")"));
    }

    public void printAllTitleBooksWithYearBetween(int startYear, int endYear) {

        booksByGenre
                .values()
                .stream()
                .flatMap(b -> b.stream())
                .filter(book -> book.getYear()>startYear && book.getYear()<endYear)
                .map(book -> book.getTitle())
                .forEach(book -> System.out.println(book));


        booksByGenre
                .values()
                .stream()
                .flatMap(b -> b.stream())
                .filter(book -> book.getYear()>startYear && book.getYear()<endYear)
                .map(Book::getTitle)
                .forEach(System.out::println);

        booksByGenre
                .values()
                .stream()
                .flatMap(b -> b.stream())
                .filter(book -> book.getYear()>startYear && book.getYear()<endYear)
                .map(book -> book.getTitle())
                .forEach(System.out::println);

        booksByGenre
                .values()
                .stream()
                .flatMap(b -> b.stream())
                .filter(book -> book.getYear()>startYear && book.getYear()<endYear)
                .forEach(book -> System.out.println(book.getTitle()));

        booksByGenre
                .values()
                .stream()
                .flatMap(b -> b.stream())
                .filter(book -> book.getYear()>startYear && book.getYear()<endYear)
                .forEach(System.out::println);
    }


}
