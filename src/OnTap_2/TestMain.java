package OnTap_2;

import java.time.LocalDate;

public class TestMain {
    public static void main(String[] args) {
        QuanLyXe quanLyXe = new QuanLyXe();

        // Thêm xe
        quanLyXe.themXe(new Xe("Honda Vision", "X001", "T001", 30000000, LocalDate.of(2023, 10, 1), false));
        quanLyXe.themXe(new Xe("Honda SH", "X003", "T003", 80000000, LocalDate.of(2023, 10, 10), false));

        // Nhập người mua
        quanLyXe.nhapThongTinNguoiMua("Nguyen Van A", "0123456789", "123456789", "Honda Vision");

        // Kiểm tra danh sách xe còn lại
        System.out.println("Danh sách xe còn lại:");
        quanLyXe.kiemTraXe();


        // In danh sách người mua
        System.out.println("Danh sách người mua:");
        quanLyXe.inDanhSachNguoiMua();
    }
}

