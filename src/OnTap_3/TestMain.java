package OnTap_3;

import java.time.LocalDate;

public class TestMain {
    public static void main(String[] args){
        QuanLyBenhVien quanLyBenhVien = new QuanLyBenhVien();

        // Thêm khoa
        Khoa khoa1 = new Khoa("T01","Khoa Nội");
        Khoa khoa2 = new Khoa("T02","Khoa Ngoại");
        quanLyBenhVien.themKhoa(khoa1);
        quanLyBenhVien.themKhoa(khoa2);

        // Thêm phòng
        Phong phong1 = new Phong("BO1","B",5,5);
        Phong phong2 = new Phong("B02","B",7,7);
        quanLyBenhVien.themPhong(phong1);
        quanLyBenhVien.themPhong(phong2);

        //Thêm bác sĩ
        BacSi bacsi1 = new BacSi("Nguyễn Văn A",1976,"Quảng Trị","D01","T01");
        BacSi bacsi2 = new BacSi("Nguyễn Văn B",1975,"Quảng Trị","D02","T02");
        quanLyBenhVien.themBacSi(bacsi1);
        quanLyBenhVien.themBacSi(bacsi2);

        // Thêm bệnh nhân
        BenhNhan benhNhan1 = new BenhNhan("Hồ Thị C",1998,"Quảng Bình","X02","AA","B01","12/12/2024","19/12/2024",true,"D01");
        BenhNhan benhNhan2 = new BenhNhan("Hồ Thị D",1992,"Quảng Bình","X03","CC","B02","12/12/2024","19/12/2024",true,"D01");
        quanLyBenhVien.themBenhNhan(benhNhan1);
        quanLyBenhVien.themBenhNhan(benhNhan2);

        // Hiển thị danh sách khoa
        System.out.println("Danh sách Khoa:");
        quanLyBenhVien.hienThiDanhSachKhoa();

        // Hiển thị danh sách phòng
        System.out.println("\nDanh sách Phòng:");
        quanLyBenhVien.hienThiDanhSachPhong();

        // Hiển thị danh sách bác sĩ
        System.out.println("\nDanh sách Bác sĩ:");
        quanLyBenhVien.hienThiDanhSachBacSi();

        // Hiển thị danh sách bệnh nhân
        System.out.println("\nDanh sách Bệnh nhân:");
        quanLyBenhVien.hienThiDanhSachBenhNhan();

        // Thực hiện một số chức năng khác
        System.out.println("\nThêm bệnh nhân vào phòng đã đầy:");
        phong1.themBenhNhan("BN03");
        phong1.themBenhNhan("BN04"); // Phòng sẽ đầy ở đây

        System.out.println("\nDanh sách bệnh nhân sau khi thêm:");
        quanLyBenhVien.hienThiDanhSachBenhNhan();

        System.out.println("\nXóa bệnh nhân với ID BN01:");
        phong1.xoaBenhNhan("BN01");
        quanLyBenhVien.hienThiDanhSachBenhNhan();

        System.out.println("\nXuất viện bệnh nhân BN02:");
        benhNhan2.xuatVien("10/12/2024");
        System.out.println(benhNhan2);




    }
}
