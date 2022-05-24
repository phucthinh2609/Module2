package productManager.views;

import productManager.utils.AppUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductViewLauncher {

    public static void launch() {
        int choose;
        do {
            menuProduct();
            Scanner scanner = new Scanner(System.in);
            ProductView productView = new ProductView();

            try {
                choose = AppUtils.retryChoose(0,7);
                switch (choose) {
                    case 1:
                        productView.add();
                        break;
                    case 2:
                        productView.update();
                        break;
                    case 3:
                        productView.delete();
                        break;
                    case 4:
                        productView.showProduct(InputOption.SHOW);
                        break;
                    case 5:
                        productView.findProductByName();
                        break;
                    case 6:
                        productView.sortByPriceOrderByASC();
                        break;
                    case 7:
                        productView.sortByPriceOrderByDESC();
                        break;
                    case 0:
                        AppUtils.exit();
                        break;
                    default:
                        System.err.println("Chọn sai. Chọn lại!!!");
                }

            } catch (InputMismatchException ex) {
                System.err.println("Nhập sai. Nhập lại!!!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } while (true);
    }

    public static void menuProduct() {
        System.out.println("\n=================================================");
        System.out.println("|                PRODUCT MANAGER                |");
        System.out.println("=================================================");
        System.out.println("|                                               |");
        System.out.println("|        1. Thêm sản phẩm                       |");
        System.out.println("|        2. Sửa thông tin sản phẩm theo id      |");
        System.out.println("|        3. Xoá sản phẩm theo id                |");
        System.out.println("|        4. Hiển thị danh sách sản phẩm         |");
        System.out.println("|        5. Tìm kiếm sản phẩm theo tên          |");
        System.out.println("|        6. Sắp xếp sản phẩm tăng dần           |");
        System.out.println("|        7. Sắp xếp sản phẩm giảm dần           |");
        System.out.println("|                                               |");
        System.out.println("=================================================");
        System.out.println(" 0: Thoát");
        System.out.println("\nChọn chức năng ");
    }
}
