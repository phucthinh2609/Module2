package productManager.views;

import productManager.model.Product;
import productManager.service.IProductService;
import productManager.service.ProductService;
import productManager.utils.AppUtils;

import java.util.List;
import java.util.Scanner;

public class ProductView {

    private final IProductService productService;
    private final Scanner scanner = new Scanner(System.in);

    public ProductView() {
        productService = ProductService.getInstance();
    }


    public void add() {
        do {
            long id = System.currentTimeMillis() / 1000;
            String title = inputTitle(InputOption.ADD);
            Double price = inputPrice(InputOption.ADD);
            Product product = new Product(id, title, price);
            productService.add(product);
            System.out.println("Thêm sản phẩm thành công!!!");

        } while (AppUtils.isRetry(InputOption.ADD));
    }

    public void delete() {
        showProduct(InputOption.DELETE);
        Long id;
        while (!productService.exist(id = inputId(InputOption.DELETE))) {
            System.err.println("Không tìm thấy sản phẩm cần xóa");
            System.out.println("Nhấn 'y' để thêm tiếp \t|\t 'q' để quay lại \t|\t 't' để thoát chương trình");
            System.out.print(" ⭆ ");
            String option = scanner.nextLine();
            switch (option) {
                case "y":
                    break;
                case "q":
                    return;
                case "t":
                    AppUtils.exit();
                    break;
                default:
                    System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                    break;
            }
        }

        System.out.println("\n❄ ❄ ❄ ❄ REMOVE COMFIRM ❄ ❄ ❄");
        System.out.println("❄  1. Nhấn 1 để xoá        ❄");
        System.out.println("❄  2. Nhấn 2 để quay lại   ❄");
        System.out.println("❄ ❄ ❄ ❄ ❄ ❄ ❄  ❄ ❄ ❄ ❄ ❄ ❄ ❄");
        int option = AppUtils.retryChoose(1, 2);
        if (option == 1) {
            productService.deleteById(id);
            System.out.println("\nĐã xoá sản phẩm thành công! \uD83C\uDF8A");
            AppUtils.isRetry(InputOption.DELETE);
        }
    }

    public void update() {
        boolean isRetry;
        do {
            showProduct(InputOption.UPDATE);
            long id = inputId(InputOption.UPDATE);
            System.out.println("=================================================");
            System.out.println("|                                               |");
            System.out.println("|        1. Sửa tên sản phẩm                    |");
            System.out.println("|        2. Sửa giá sản phẩm                    |");
            System.out.println("|                                               |");
            System.out.println("=================================================");
            System.out.println("<== 3: Quay lại                       0: Thoát");
            System.out.println("\nChọn chức năng ");

            Product newProduct = new Product();
            newProduct.setId(id);
            int choose = AppUtils.retryChoose(0, 3);
            switch (choose) {
                case 1:
                    String title = inputTitle(InputOption.UPDATE);
                    newProduct.setTitle(title);
                    productService.update(newProduct);
                    System.out.println("Cập nhật tên sản phẩm thành công!");
                    break;
                case 2:
                    Double price = inputPrice(InputOption.UPDATE);
                    newProduct.setPrice(price);
                    productService.update(newProduct);
                    System.out.println("Cập nhật mô tả thành công!");
                    break;
                case 3:
                    ProductViewLauncher.launch();
                    break;
                case 0:
                    AppUtils.exit();
                    break;
            }
            isRetry = choose != 4 && AppUtils.isRetry(InputOption.UPDATE);
        } while (isRetry);


    }

    public void showProduct(InputOption option) {
        System.out.println("-----------------------------------------DANH SÁCH SẢN PHẨM-------------------------------------------");
        System.out.printf("%-18s %-20s %-18s", "Id", "Tên sản phẩm", "Giá");
        for (Product product : productService.findAll()) {
            System.out.printf("\n%-18s %-20s %-18s",
                    product.getId(),
                    product.getTitle(),
                    AppUtils.doubleToVND(product.getPrice())

            );
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        if (option == InputOption.SHOW)
            AppUtils.isRetry(InputOption.SHOW);
    }

    public void showProductsSort(InputOption inputOption, List<Product> products) {
        System.out.println("-----------------------------------------DANH SÁCH SẢN PHẨM-------------------------------------------");
        System.out.printf("%-18s %-20s %-18s", "Id", "Tên sản phẩm", "Giá");
        for (Product product : products) {
            System.out.printf("\n%-18s %-20s %-18s",
                    product.getId(),
                    product.getTitle(),
                    AppUtils.doubleToVND(product.getPrice())
            );
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------\n");
        if (inputOption == InputOption.SHOW)
            AppUtils.isRetry(InputOption.SHOW);
    }

    public void showProductsFind(InputOption inputOption, Product product) {
        System.out.println("--------------------------------------DANH SÁCH ỨNG VỚI TÊN SẢN PHẨM----------------------------------------");
        System.out.printf("%-18s %-20s %-18s", "Id", "Tên sản phẩm", "Giá");
        System.out.printf("\n%-18s %-20s %-18s",
                product.getId(),
                product.getTitle(),
                AppUtils.doubleToVND(product.getPrice())
        );

        System.out.println("\n--------------------------------------------------------------------------------------------------\n");
        if (inputOption == InputOption.SHOW)
            AppUtils.isRetry(InputOption.SHOW);
    }

    public void findProductByName() {
        String title = "";
        Product product;
        boolean flag = false;

        do {
            title = inputTitle(InputOption.FIND);
            product = productService.findByName(title);
            if (product == null){
                System.err.println("Nhập sai. Vui lòng nhập lại");
                flag = true;
            }
        } while (flag);

        showProductsFind(InputOption.SHOW, productService.findByName(title));
    }

    public void sortByPriceOrderByASC() {
        showProductsSort(InputOption.SHOW, productService.findAllOrderByPriceASC());
    }

    public void sortByPriceOrderByDESC() {
        showProductsSort(InputOption.SHOW, productService.findAllOrderByPriceDESC());
    }

    private long inputId(InputOption option) {
        Long id;
        switch (option) {
            case ADD:
                System.out.println("Nhập id: ");
                break;
            case UPDATE:
                System.out.println("Nhập id muốn sửa: ");
                break;
            case DELETE:
                System.out.println("Nhập id muốn xoá");
                break;
        }
        boolean isRetry = false;
        do {
            id = AppUtils.retryParseLong();
            boolean exist = productService.existsById(id);
            switch (option) {
                case ADD:
                    if (exist) {
                        System.out.println("Id không tồn tại. Nhập lại!!!");
                    }
                    isRetry = exist;
                    break;
                case UPDATE:
                    if (!exist)
                        System.out.println("Không tìm thấy id. Nhập lại!!!");
                    isRetry = !exist;
                    break;
            }
        } while (isRetry);
        return id;
    }

    private Double inputPrice(InputOption option) {
        Double price;
        switch (option) {
            case ADD:
                System.out.println("Nhập giá sản phẩm: ");
                break;
            case UPDATE:
                System.out.println("Nhập giá bạn muốn sửa: ");
                break;
        }
        do {
            price = AppUtils.retryParseDouble();
            if (price <= 0) System.out.println("Giá phải lớn hơn 0 (giá > 0)");
        } while (price <= 0);
        return price;
    }


    private String inputTitle(InputOption option) {
        switch (option) {
            case ADD:
                System.out.println("Nhập tên sản phẩm: ");
                break;
            case UPDATE:
                System.out.println("Nhập tên sản phẩm muốn sửa: ");
                break;
            case FIND:
                System.out.println("Nhập tên sản phẩm muốn tìm");
        }
        System.out.print("⭆ ");
        String title = AppUtils.retryString();
        return title;
    }
}
