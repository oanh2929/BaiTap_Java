package OnTap_4;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class QuanLyThuVien {
    private String idThuVien;
    private String tenThuVien;
    private ArrayList<NguoiDung> danhSachNguoiDung = new ArrayList<>();
    private ArrayList<Sach> danhSachSach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);



    public void menu(){
        while (true){
            System.out.println("\n==Quản lý thư viện==");
            System.out.println("1.Xem thông tin thư viện.");
            System.out.println("2.Thêm,sửa,xóa sách.");
            System.out.println("3.Thêm,sửa,xóa người dùng.");
            System.out.println("4.Tìm kiếm sách,người dùng theo tên.");
            System.out.println("5.Mượn sách.");
            System.out.println("6.Trả sách.");
            System.out.println("7.Xem danh sách sách.");
            System.out.println("8.Xem danh sách người dùng.");
            System.out.println("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    xemThongTinThuVien();
                    break;
                case 2:
                    quanLySach();
                    break;
                case 3:
                    quanLyNguoiDung();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    muonSach();
                    break;
                case 6:
                    traSach();
                    break;
                case 7:
                    xemDanhSachSach();
                    break;
                case 8:
                    xemDanhSachNguoiDung();
                    break;
                case 9:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chức năng chưa được triển khai hoặc không hợp lệ!");
            }
        }
    }

    public void xemThongTinThuVien() {
        System.out.println("Thông tin thư viện: ");
        System.out.println("ID thư viện: " + idThuVien);
        System.out.println("Tên thư viện: " + tenThuVien);
        System.out.println("Số lượng sách: " + danhSachSach.size());
        System.out.println("Số lượng người dùng: " + danhSachNguoiDung.size());
    }

    public void quanLySach() {
        System.out.println("\n==Quản lý sách==");
        System.out.println("1. Thêm sách.");
        System.out.println("2. Sửa sách.");
        System.out.println("3. Xóa sách.");
        System.out.println("Chọn chức năng: ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice){
            case 1:
                themSach();
                break;
            case 2:
                suaSach();
                break;
            case 3:
                xoaSach();
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }

    public void quanLyNguoiDung() {
        System.out.println("\n==Quản lý người dùng==");
        System.out.println("1. Thêm người dùng.");
        System.out.println("2. Sửa người dùng.");
        System.out.println("3. Xóa người dùng.");
        System.out.println("Chọn chức năng: ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice){
            case 1:
                themNguoiDung();
                break;
            case 2:
                suaNguoiDung();
                break;
            case 3:
                xoaNguoiDung();
                break;
            default:
                System.out.println("Chức năng không hợp lệ.");
        }
    }

    public void timKiem() {
        System.out.println("\nNhập tên sách hoặc người dùng để tìm kiếm: ");
        String keyword = sc.nextLine();

        // Tìm kiếm sách
        for (Sach sach : danhSachSach) {
            if (sach.getTenSach().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(sach);
            }
        }

        // Tìm kiếm người dùng
        for (NguoiDung nguoiDung : danhSachNguoiDung) {
            if (nguoiDung.getTen().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(nguoiDung);
            }
        }
    }

    public void muonSach() {
        System.out.println("Nhập ID người dùng: ");
        String idNguoiDung = sc.nextLine();

        NguoiDung nguoiDung = null;
        for (NguoiDung n : danhSachNguoiDung) {
            if (n.getId().equals(idNguoiDung)) {
                nguoiDung = n;
                break;
            }
        }

        if (nguoiDung == null) {
            System.out.println("Người dùng không tồn tại.");
            return;
        }

        if (nguoiDung.getSachDangMuon().size() >= 5) {
            System.out.println("Một người dùng chỉ có thể mượn tối đa 5 sách.");
            return;
        }

        System.out.println("Nhập ID sách cần mượn: ");
        String idSach = sc.nextLine();
        Sach sach = null;
        for (Sach s : danhSachSach) {
            if (s.getIdSach().equals(idSach)) {
                sach = s;
                break;
            }
        }

        if (sach == null) {
            System.out.println("Sách không tồn tại.");
            return;
        }

        if (sach.getSoLuongSach() <= sach.getSoLuongDaMuon()) {
            System.out.println("Sách đã hết.");
            return;
        }

        sach.setSoLuongDaMuon(sach.getSoLuongDaMuon() + 1);
        nguoiDung.themSachDangMuon(sach);
        System.out.println("Mượn sách thành công!");
    }

    public void traSach() {
        System.out.println("Nhập ID người dùng: ");
        String idNguoiDung = sc.nextLine();

        NguoiDung nguoiDung = null;
        for (NguoiDung n : danhSachNguoiDung) {
            if (n.getId().equals(idNguoiDung)) {
                nguoiDung = n;
                break;
            }
        }

        if (nguoiDung == null) {
            System.out.println("Người dùng không tồn tại.");
            return;
        }

        System.out.println("Nhập ID sách cần trả: ");
        String idSach = sc.nextLine();
        Sach sach = null;
        for (Sach s : nguoiDung.getSachDangMuon()) {
            if (s.getIdSach().equals(idSach)) {
                sach = s;
                break;
            }
        }

        if (sach == null) {
            System.out.println("Sách không có trong danh sách mượn.");
            return;
        }

        sach.setSoLuongDaMuon(sach.getSoLuongDaMuon() - 1);
        nguoiDung.xoaSachDangMuon(sach);
        System.out.println("Trả sách thành công!");
    }

    public void xemDanhSachSach() {
        System.out.println("Danh sách sách: ");
        for (Sach sach : danhSachSach) {
            System.out.println(sach);
        }
    }

    public void xemDanhSachNguoiDung() {
        System.out.println("Danh sách người dùng: ");
        for (NguoiDung nguoiDung : danhSachNguoiDung) {
            System.out.println(nguoiDung);
        }
    }

    // Các phương thức thêm, sửa, xóa sách và người dùng
    public void themSach() {
        // Thêm sách mới vào danh sách
        System.out.println("Nhập ID sách: ");
        String idSach = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        String tenSach = sc.nextLine();
        System.out.println("Nhập tác giả sách: ");
        String tacGia = sc.nextLine();
        System.out.println("Nhập số lượng sách: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        Sach sach = new Sach(idSach, tenSach, tacGia, soLuong);
        danhSachSach.add(sach);
        System.out.println("Thêm sách thành công!");
    }

    public void suaSach() {
        // Sửa thông tin sách
        System.out.println("Nhập ID sách cần sửa: ");
        String idSach = sc.nextLine();
        Sach sach = null;
        for (Sach s : danhSachSach) {
            if (s.getIdSach().equals(idSach)) {
                sach = s;
                break;
            }
        }

        if (sach == null) {
            System.out.println("Sách không tồn tại.");
            return;
        }

        System.out.println("Nhập tên sách mới: ");
        sach.setTenSach(sc.nextLine());
        System.out.println("Nhập tác giả sách mới: ");
        sach.setTacGia(sc.nextLine());
        System.out.println("Nhập số lượng sách mới: ");
        sach.setSoLuongSach(Integer.parseInt(sc.nextLine()));
        System.out.println("Sửa sách thành công!");
    }

    public void xoaSach() {
        // Xóa sách khỏi danh sách
        System.out.println("Nhập ID sách cần xóa: ");
        String idSach = sc.nextLine();
        Sach sach = null;
        for (Sach s : danhSachSach) {
            if (s.getIdSach().equals(idSach)) {
                sach = s;
                break;
            }
        }

        if (sach == null) {
            System.out.println("Sách không tồn tại.");
            return;
        }

        danhSachSach.remove(sach);
        System.out.println("Xóa sách thành công!");
    }

    public void themNguoiDung() {
        // Thêm người dùng mới vào danh sách
        System.out.println("Nhập ID người dùng: ");
        String idNguoiDung = sc.nextLine();
        System.out.println("Nhập tên người dùng: ");
        String ten = sc.nextLine();
        System.out.println("Nhập giới tính người dùng: ");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhập ngày sinh người dùng: ");
        String ngaySinh = sc.nextLine();
        System.out.println("Nhập lớp người dùng: ");
        String lop = sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        String maSinhVien = sc.nextLine();

        NguoiDung nguoiDung = new NguoiDung();
        danhSachNguoiDung.add(nguoiDung);
        System.out.println("Thêm người dùng thành công!");
    }

    public void suaNguoiDung() {
        // Sửa thông tin người dùng
        System.out.println("Nhập ID người dùng cần sửa: ");
        String idNguoiDung = sc.nextLine();
        NguoiDung nguoiDung = null;
        for (NguoiDung n : danhSachNguoiDung) {
            if (n.getId().equals(idNguoiDung)) {
                nguoiDung = n;
                break;
            }
        }

        if (nguoiDung == null) {
            System.out.println("Người dùng không tồn tại.");
            return;
        }

        System.out.println("Nhập tên người dùng mới: ");
        nguoiDung.setTen(sc.nextLine());
        System.out.println("Nhập giới tính mới: ");
        nguoiDung.setGioiTinh(sc.nextLine());
        System.out.println("Nhập ngày sinh mới: ");
        nguoiDung.setNgaySinh(sc.nextLine());
        System.out.println("Nhập lớp mới: ");
        nguoiDung.setLop(sc.nextLine());
        System.out.println("Nhập mã sinh viên mới: ");
        nguoiDung.setMaSinhVien(sc.nextLine());
        System.out.println("Sửa người dùng thành công!");
    }

    public void xoaNguoiDung() {
        // Xóa người dùng khỏi danh sách
        System.out.println("Nhập ID người dùng cần xóa: ");
        String idNguoiDung = sc.nextLine();
        NguoiDung nguoiDung = null;
        for (NguoiDung n : danhSachNguoiDung) {
            if (n.getId().equals(idNguoiDung)) {
                nguoiDung = n;
                break;
            }
        }

        if (nguoiDung == null) {
            System.out.println("Người dùng không tồn tại.");
            return;
        }

        danhSachNguoiDung.remove(nguoiDung);
        System.out.println("Xóa người dùng thành công!");
    }
}




