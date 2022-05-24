package productManager.model;

public class Product  {
    private Long id;
    private String title;
    private Double price;

    public Product() {
    }

    public Product(Long id, String title, Double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public static Product parse(String record) {
        String[] field = record.split(",");
        Product product = new Product();

        product.id = Long.parseLong(field[0]);
        product.title = field[1];
        product.price = Double.parseDouble(field[2]);

        return product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s",
                id,
                title,
                price
        );
    }
}

