package di;

public class BookRepository {

    private String name;

    public BookRepository() {
    }

    public BookRepository(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
