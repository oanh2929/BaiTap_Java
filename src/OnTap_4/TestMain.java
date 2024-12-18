package OnTap_4;

import java.time.LocalDate;


public class TestMain {
    public static void main(String[] args){
        ThuVien thuVien = new ThuVien(1,"Thư viện trung tâm");

        Sach sach1 = new Sach(111,"Lập trình Java","Nguyễn Văn A",10);
        Sach sach2 = new Sach(112,"Hướng dẫn Python","Nguyễn Văn C",15);

        thuVien.themSach(sach1);
        thuVien.themSach(sach2);

        NguoiDung nguoiDung = new NguoiDung(2,"Hồ Thị C","Nữ", LocalDate.of(1999,11,21),"CNTT","123456789");

        thuVien.themNguoiDung(nguoiDung);

        System.out.println("Người dùng mượn sách: ");
        nguoiDung.themSach(sach1);
        sach1.capNhatSoLuongMuon(1);

        nguoiDung.hienThiSachDangMuon();

        System.out.println("\nNgười dùng trả sách:");
        nguoiDung.xoaSach(sach1);
        sach1.capNhatSoLuongMuon(-1);

        // Hiển thị sách đang mượn sau khi trả
        nguoiDung.hienThiSachDangMuon();

        // Hiển thị danh sách sách trong thư viện
        System.out.println("\nDanh sách sách trong thư viện:");
        thuVien.hienThiDanhSachSach();

        // Hiển thị danh sách người dùng trong thư viện
        System.out.println("\nDanh sách người dùng trong thư viện:");
        thuVien.hienThiDanhSachNguoiDung();
    }
}

