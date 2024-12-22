package OnTap_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

// Lớp quản lý thư viện
public class QuanLyThuVien {
    ArrayList<NguoiDoc> danhSachNguoiDoc = new ArrayList<>();
    ArrayList<Sach> danhSachSach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public QuanLyThuVien() {
        // Thêm sẵn một số sách
        danhSachSach.add(new Sach("Lập trình Java", "S001", false));
        danhSachSach.add(new Sach("Cấu trúc dữ liệu", "S002", false));
        danhSachSach.add(new Sach("Mạng máy tính", "S003", false));
        danhSachSach.add(new Sach("Hệ điều hành", "S004", true));
        danhSachSach.add(new Sach("Trí tuệ nhân tạo", "S005", true));
    }

    public void nhapThongTinNguoiDoc() {
        System.out.println("Họ tên: ");
        String hoTen = sc.nextLine();
        System.out.println("Số điện thoại: ");
        String soDienThoai = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Mã sinh viên: ");
        String maSinhVien = sc.nextLine();
        System.out.println("Nhập ngày mượn (dd/MM/yyyy): ");
        String ngayMuon = sc.nextLine();
        System.out.println("Nhập ngày trả (dd/MM/yyyy): ");
        String ngayTra = sc.nextLine();

        NguoiDoc nguoiDoc = new NguoiDoc(hoTen, soDienThoai, email, maSinhVien, ngayMuon, ngayTra);
        danhSachNguoiDoc.add(nguoiDoc);
        System.out.println("Đã thêm người đọc thành công!");
    }

    public void timNguoiDocTheoNgay() {
        System.out.println("Nhập ngày cần tìm (dd/MM/yyyy): ");
        String ngay = sc.nextLine();
        boolean found = false;

        for (NguoiDoc nguoiDoc : danhSachNguoiDoc) {
            if (nguoiDoc.getNgayMuon().equals(ngay) || nguoiDoc.getNgayTra().equals(ngay)) {
                nguoiDoc.print();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy người đọc nào với ngày này.");
        }
    }

    public void sapXepNguoiDocTheoNgayMuon() {
        Collections.sort(danhSachNguoiDoc, Comparator.comparing(NguoiDoc::getNgayMuon));
        System.out.println("Đã sắp xếp danh sách người đọc theo ngày mượn.");
    }

    public void inDanhSachNguoiDoc() {
        if (danhSachNguoiDoc.isEmpty()) {
            System.out.println("Danh sách người đọc trống.");
        } else {
            for (NguoiDoc nguoiDoc : danhSachNguoiDoc) {
                nguoiDoc.print();
                System.out.println("-------------------------");
            }
        }
    }

    public void kiemTraSach() {
        System.out.println("Danh sách sách trong thư viện:");
        for (Sach sach : danhSachSach) {
            sach.print();
            System.out.println("-------------------------");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n--- QUẢN LÝ THƯ VIỆN ---");
            System.out.println("1. Nhập thông tin người đọc");
            System.out.println("2. Tìm người đọc theo ngày mượn/trả sách");
            System.out.println("3. Sắp xếp danh sách người đọc theo ngày mượn");
            System.out.println("4. In danh sách người đọc");
            System.out.println("5. Kiểm tra và in trạng thái sách");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    nhapThongTinNguoiDoc();
                    break;
                case 2:
                    timNguoiDocTheoNgay();
                    break;
                case 3:
                    sapXepNguoiDocTheoNgayMuon();
                    break;
                case 4:
                    inDanhSachNguoiDoc();
                    break;
                case 5:
                    kiemTraSach();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chọn lại!");
            }
        }
    }
}
