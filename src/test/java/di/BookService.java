package di;

public class BookService {
    @Inject
    BookRepository bookRepository;

    public String getNameFromRepository() {
        return bookRepository.getName();
    }

    public void setNameRepository() {
        bookRepository.setName("he");
    }
}
