package muabanxe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class quanlyxe {
    private ArrayList<nguoimuaxe> danhsachnguoimua = new ArrayList<>();
    private ArrayList<xe> danhsachxe = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public quanlyxe() {
        danhsachxe.add(new xe("Honda", "B00", "123", "19122024", 100000000, false));
        danhsachxe.add(new xe("Honda", "B01", "124", "18122024", 100000000, false));
        danhsachxe.add(new xe("Honda", "B02", "125", "29122024", 30000000, false));
        danhsachxe.add(new xe("SH", "B03", "126", "20122024", 120000000, true));
        danhsachxe.add(new xe("SH", "B00", "132", "19122024", 100000000, true));
    }

    public void menu() {
        while (true) {
            System.out.println("===Quản lý mua bán xe honda===");
            System.out.println("1.Nhập người mua xe.");
            System.out.println("2.Tìm người mua xe theo ngày.");
            System.out.println("3.Sắp xếp danh sách người mua.");
            System.out.println("4.In ra danh sách.");
            System.out.println("5.Kiểm tra lại danh sách.");
            System.out.println("6.Thoát chương trình.");
            System.out.println("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    nhapthongtinnguoimua();
                    break;
                case 2:
                    timnguoimuaxetheongay();
                    break;
                case 3:
                    sapxepdanhsachnguoimua();
                    break;
                case 4:
                    inradanhsach();
                    break;
                case 5:
                    kiemtralaidanhsach();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chọn lại: ");
            }
        }
    }

    public void nhapthongtinnguoimua() {
        System.out.println("Họ tên: ");
        String hoten = sc.nextLine();
        System.out.println("Số điện thoại: ");
        String sodienthoai = sc.nextLine();
        System.out.println("Số căn cước: ");
        String socancuoc = sc.nextLine();
        System.out.println("Số tích điểm: ");
        double sotichdiem = Double.parseDouble(sc.nextLine());
        System.out.println("Ngày mua: ");
        String ngaymua = sc.nextLine();
        System.out.println("Tên xe mua: ");
        String tenxemua = sc.nextLine();
        System.out.println("Giá tiền: ");
        double gia = Double.parseDouble(sc.nextLine());

        double tien = (gia - (sotichdiem * 10) * gia / 100);
        double tongtien = tien + tien * 10 / 100;
        double sotichdiemmoi = sotichdiem + 1;

        danhsachnguoimua.add(new nguoimuaxe(hoten, sodienthoai, socancuoc, sotichdiem, ngaymua, tenxemua));
        System.out.println("Đã thêm người mua xe thành công.");
    }

    public void timnguoimuaxetheongay() {
        System.out.println("Nhập ngày cần tìm: ");
        String ngay = sc.nextLine();
        boolean found = false;

        for (nguoimuaxe nguoimuaxe : danhsachnguoimua) {
            if (nguoimuaxe.getNgaymua().equals(ngay)) {
                nguoimuaxe.print();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy.");
        }
    }

    public void sapxepdanhsachnguoimua(){
        Collections.sort(danhsachnguoimua, Comparator.comparing(nguoimuaxe::getNgaymua));
        System.out.println("Đã sắp xếp người muaxe theo ngày.");
    }

    public void inradanhsach(){
        if(danhsachnguoimua.isEmpty()){
            System.out.println("Danh sách trống.");
        } else {
            for(nguoimuaxe nguoimuaxe : danhsachnguoimua){
                nguoimuaxe.print();
                System.out.println("\n");
            }
        }
    }
    public void kiemtralaidanhsach(){
        for(xe xe : danhsachxe){
            xe.print();
            System.out.println("\n");
        }
    }
}


