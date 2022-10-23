package di;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerServiceTest {

    @Test
    public void bookRepository() {
        BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
        Assertions.assertNotNull(bookRepository);
    }

    @Test
    void bookService() {
        BookService bookService = ContainerService.getObject(BookService.class);
        System.out.println(bookService.getNameFromRepository());
        Assertions.assertNotNull(bookService);
        Assertions.assertNotNull(bookService.bookRepository);
        bookService.bookRepository = new BookRepository();
    }
}

