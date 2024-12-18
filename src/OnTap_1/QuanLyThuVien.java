package OnTap_1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
    ArrayList<NguoiDoc> danhSachNguoiDoc = new ArrayList<>();
    ArrayList<Sach> danhSachSach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhapThongTinNguoiDoc() {
        System.out.println("Họ tên: ");
        String hoTen = sc.nextLine();
        System.out.println("Số điện thoại: ");
        String soDienThoai = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Mã sinh viên: ");
        String maSinhVien = sc.nextLine();
        System.out.println("Nhập ngày mượn: ");
        String ngayMuon = sc.nextLine();
        System.out.println("NHập ngày trả: ");
        String ngayTra = sc.nextLine();

        danhSachNguoiDoc.add(new NguoiDoc(hoTen, soDienThoai, email, maSinhVien, ngayMuon, ngayTra));
        System.out.println("Đã thêm người đọc thành công!");
    }

    public void inDanhSachSach(){
        for( Sach sach: danhSachSach){
            sach.print();
        }
    }

    public void menu(){
        danhSachSach.add(new Sach("Java Programming","B02",false));
        danhSachSach.add(new Sach("Python","B04",false));

        while(true){
            System.out.println("\n--QUẢN LÝ THƯ VIỆN---");
            System.out.println("1.Nhập thông tin người đọc");
            System.out.println("2.Tìm người đọc và trả sách");
            System.out.println("3.In danh sách");
            System.out.println("4.Thoát");
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    nhapThongTinNguoiDoc();
                    break;
                case 2:
                    timNguoiDocVaTraSach();
                    break;
                case 3:
                    inDanhSachSach();
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Chọn lại");
            }
        }

    }

    public void timNguoiDocVaTraSach() {
        System.out.println("Chức năng tìm người đọc và trả sách chưa được triển khai.");
    }

}

