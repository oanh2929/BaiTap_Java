package OnTap_1;

import java.time.LocalDate;

public class TestMain {
        public static void main(String[] args) {
            QuanLyThuVien quanLyThuVien = new QuanLyThuVien();


            quanLyThuVien.themSach(new Sach("Java Programming", "S001", false));
            quanLyThuVien.themSach(new Sach("Data Structures", "S002", false));
            quanLyThuVien.themSach(new Sach("Algorithms", "S003", false));
            quanLyThuVien.themSach(new Sach("Design Patterns", "S004", false));
            quanLyThuVien.themSach(new Sach("System Design", "S005", false));

            // Nhập thông tin người đọc
            quanLyThuVien.nhapThongTinNguoiDoc(
                    "Nguyen Van A",
                    "0123456789",
                    "nguyenvana@example.com",
                    "SV001",
                    LocalDate.of(2024, 11, 23),
                    LocalDate.of(2024, 11, 30)
            );

            // In danh sách người đọc
            quanLyThuVien.inDanhSachNguoiDoc();
        }
}



