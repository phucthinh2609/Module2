package Project.planeTicket;

import java.io.*;
import java.util.*;

public class QuanLyBay {
    static List<VeMayBay> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        list.add(new VeMayBay("VJ100", "VietjetAir", "05/07/2022", "3.5kg", 30000));
        list.add(new VeMayBay("VN2512", "VietnamAirline", "15/07/2022", "4.5kg", 40000));
        list.add(new VeMayBay("JS255", "JestarAirline", "05/08/2022", "5.2kg", 60000));

        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    inputTicket(list);
                    break;
                case 2:
                    saveTicket(list, "DuLieuBay.dat");
                    break;
                case 3:
                    readTicketList(list,"DuLieuBay.dat");
                    break;
                case 4:
                    sortTicket(list);
                    break;
                case 5:
                    saveByAirline(list);
                    break;
                case 6:
                    System.exit(6);
                    break;
                default:
                    System.out.println("Nhập sai!!!");

            }

        }while (choose != 7);

    }


    private static void inputTicket(List<VeMayBay> list) {
        System.out.println("Nhập số vé máy bay");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<n; i++){
            VeMayBay veMayBay = new VeMayBay();
            veMayBay.input();

            list.add(veMayBay);
        }
    }

    private static void saveTicket(List<VeMayBay> list, String filename) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(filename);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(list);

        } catch (Exception e) {
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void readTicketList(List<VeMayBay> list, String filename) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(filename);
            ois = new ObjectInputStream(fis);

            list = (List<VeMayBay>) ois.readObject();

        } catch (Exception e) {
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int i=0; i< list.size(); i++){
            list.get(i).display();
        }
    }

    private static void sortTicket(List<VeMayBay> list) {
        Collections.sort(list, new Comparator<VeMayBay>() {
            @Override
            public int compare(VeMayBay o1, VeMayBay o2) {
                if (o1.getPrice() > o2.getPrice())
                    return 1;
                else
                    return -1;
            }
        });

        for (int i=0; i< list.size(); i++){
            list.get(i).display();
        }
    }

    private static void saveByAirline(List<VeMayBay> list) {
        List<VeMayBay> vietjetAirList = getAirLine(list, "VJ");
        saveTicket(vietjetAirList, "VietjetAir.dat");

        List<VeMayBay> vietnamAirList = getAirLine(list, "VN");
        saveTicket(vietnamAirList, "VietnamAirLine.dat");

        List<VeMayBay> jetstarList = getAirLine(list, "JS");
        saveTicket(jetstarList, "JetstarAirline.dat");
    }
    static List<VeMayBay> getAirLine (List<VeMayBay>list, String prex){
        List<VeMayBay> airlineList = new ArrayList<>();

        for (VeMayBay veMayBay: list){
            if (veMayBay.getId().startsWith(prex)){
                airlineList.add(veMayBay);
            }
        }
        return airlineList;
    }

    static void showMenu(){
        System.out.println("\n1. Nhập thông tin N chuyến bay");
        System.out.println("2. Lưu thông tin");
        System.out.println("3. Đọc thông tin từ file và hiển thị");
        System.out.println("4. Sắp xếp theo giá");
        System.out.println("5. In thông tin mỗi hãng bay ra 1 file");
        System.out.println("0. Thoát");
        System.out.println("Chọn");
        System.out.print("==> ");
    }
}
