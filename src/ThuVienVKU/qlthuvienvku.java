package ThuVienVKU;


import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class qlthuvienvku {
    private ArrayList<nguoidoc> danhsachnguoidoc = new ArrayList<>();
    private ArrayList<sach> danhsachsach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public qlthuvienvku(){
        danhsachsach.add(new sach("java","b00",false));
        danhsachsach.add(new sach("csdl","c00",false));
        danhsachsach.add(new sach("python","d00",false));
        danhsachsach.add(new sach("c++","h00",true));
        danhsachsach.add(new sach("ttnt","g00",true));
    }

    public void menu(){
        while(true){
            System.out.println("==Quản lý thư viện VKU==");
            System.out.println("1.Nhập vào thông tin người đọc.");
            System.out.println("2.Tìm người đọc theo ngày.");
            System.out.println("3.Sắp xếp danh sách người đọc.");
            System.out.println("4.In danh sách.");
            System.out.println("5.Kiểm tra sách.");
            System.out.println("Thoát chương trình.");
            System.out.println("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    nhapthongtinnguoidoc();
                    break;
                case 2:
                    timnguoidoc();
                    break;
                case 3:
                    sapxepdanhsach();
                    break;
                case 4:
                    indanhsach();
                    break;
                case 5:
                    kiemtrasach();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Chọn lại");
            }
        }
    }

    public void nhapthongtinnguoidoc(){
        System.out.println("Họ tên: ");
        String hoten = sc.nextLine();
        System.out.println("Số điện thoại: ");
        String sodienthoai = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Mã sinh viên: ");
        String masinhvien = sc.nextLine();
        System.out.println("Ngày mượn: ");
        String ngaymuon = sc.nextLine();
        System.out.println("Ngày trả: ");
        String ngaytra = sc.nextLine();

        danhsachnguoidoc.add(new nguoidoc(hoten,sodienthoai,email,masinhvien,ngaymuon,ngaytra));
        System.out.println(" đã thêm người đọc thành công.");
    }

    public void timnguoidoc(){
        System.out.println("Nhập ngày cần tìm: ");
        String ngay = sc.nextLine();
        boolean found = false;

        for(nguoidoc nguoidoc : danhsachnguoidoc){
            if(nguoidoc.getNgaymuon().equals(ngay)||nguoidoc.getNgaytra().equals(ngay)){
                nguoidoc.print();
                found=true;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy.");
        }

    }

    public void sapxepdanhsach(){
        Collections.sort(danhsachnguoidoc, Comparator.comparing(nguoidoc::getNgaymuon));
        System.out.println("Đã sắp xếp danh sách nguoi doc theo ngay.");
    }

    public void indanhsach(){
        if(danhsachnguoidoc.isEmpty()){
            System.out.println("danh sách trống.");
        } else {
            for(nguoidoc nguoidoc : danhsachnguoidoc){
                nguoidoc.print();
                System.out.println("\n");
            }
        }
    }

    public void kiemtrasach(){
        System.out.println("Danh sách sách trong thư viện");
        for(sach sach : danhsachsach){
            sach.print();
            System.out.println("\n");
        }
    }
}
