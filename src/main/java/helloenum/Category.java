package helloenum;

public class Category {
    Category1 c1;
    Category2 c2;
    Category3 c3;

    public Category(Category1 c1) {
        this.c1 = c1;
    }

    public Category(Category1 c1, Category2 c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Category(Category1 c1, Category2 c2, Category3 c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
}
