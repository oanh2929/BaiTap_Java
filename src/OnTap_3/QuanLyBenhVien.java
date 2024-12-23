package OnTap_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class QuanLyBenhVien {
        private List<Khoa> danhSachKhoa;
        private List<Phong> danhSachPhong;
        private List<BacSi> danhSachBacSi;
        private List<BenhNhan> danhSachBenhNhan;
        Scanner sc = new Scanner(System.in);

    public QuanLyBenhVien() {
        this.danhSachKhoa = new ArrayList<>();
        this.danhSachBacSi = new ArrayList<>();
        this.danhSachBenhNhan = new ArrayList<>();
        this.danhSachPhong = new ArrayList<>();
    }


    public void menu() {
        while (true) {
            System.out.println("\n--- QUẢN LÝ BỆNH VIỆN ---");
            System.out.println("1. Thêm khoa");
            System.out.println("2. Thêm bác sĩ");
            System.out.println("3. Thêm phòng");
            System.out.println("4. Thêm bệnh nhân");
            System.out.println("5. Bệnh nhân nhập/xuất viện");
            System.out.println("6. Đổi phòng bệnh nhân");
            System.out.println("7. Đổi bác sĩ đảm nhiệm");
            System.out.println("8. Hiển thị danh sách bệnh nhân theo bệnh");
            System.out.println("9. Hiển thị danh sách bệnh nhân theo phòng");
            System.out.println("10. Hiển thị danh sách bác sĩ theo khoa");
            System.out.println("11. Hiển thị danh sách bệnh nhân theo thứ tự năm sinh");
            System.out.println("12. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    themKhoa(sc);
                    break;
                case 2:
                    themBacSi(sc);
                    break;
                case 3:
                    themPhong(sc);
                    break;
                case 4:
                    themBenhNhan(sc);
                    break;
                case 5:
                    benhNhanNhapXuatVien(sc);
                    break;
                case 6:
                    doiPhongBenhNhan(sc);
                    break;
                case 7:
                    doiBacSiDamNhiem(sc);
                    break;
                case 8:
                    hienThiBenhNhanTheoBenh(sc);
                    break;
                case 9:
                    hienThiBenhNhanTheoPhong(sc);
                    break;
                case 10:
                    hienThiBacSiTheoKhoa(sc);
                    break;
                case 11:
                    hienThiBenhNhanTheoNamSinh();
                    break;
                case 12:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chức năng chưa được triển khai hoặc không hợp lệ!");
            }
        }
    }

    private void themKhoa(Scanner sc) {
        System.out.print("Nhập ID khoa: ");
        String idKhoa = sc.nextLine();
        System.out.print("Nhập tên khoa: ");
        String tenKhoa = sc.nextLine();
        Khoa khoa = new Khoa(idKhoa, tenKhoa);
        danhSachKhoa.add(khoa);
        System.out.println("Thêm khoa thành công!");
    }

    private void themBacSi(Scanner sc) {
        System.out.print("Nhập tên bác sĩ: ");
        String ten = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        int namSinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhập ID bác sĩ: ");
        String idBacSi = sc.nextLine();
        System.out.print("Nhập ID khoa đảm nhiệm: ");
        String idKhoa = sc.nextLine();
        BacSi bacSi = new BacSi(ten, namSinh, diaChi, idBacSi, idKhoa);
        danhSachBacSi.add(bacSi);
        System.out.println("Thêm bác sĩ thành công!");
    }

    private void themPhong(Scanner sc) {
        System.out.print("Nhập ID phòng: ");
        String Idphong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        String tenPhong = sc.nextLine();
        System.out.print("Nhập số lượng giường: ");
        int soLuongGiuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng giường: ");
        int soLuongBenhNhan = Integer.parseInt(sc.nextLine());
        Phong phong = new Phong(Idphong,tenPhong,soLuongGiuong,soLuongBenhNhan);
        danhSachPhong.add(phong);
        System.out.println("Thêm phòng thành công!");
    }

    private void themBenhNhan(Scanner sc) {
        System.out.print("Nhập tên bệnh nhân: ");
        String ten = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        int namSinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhập ID bệnh nhân: ");
        String idbenhNhan = sc.nextLine();
        System.out.print("Nhập ID bệnh: ");
        String idbenh = sc.nextLine();
        System.out.print("Nhập ID phòng: ");
        String idsoPhong = sc.nextLine();
        System.out.print("Nhập ngày nhập viện (dd/MM/yyyy): ");
        String ngayNhapVien = sc.nextLine();
        System.out.print("Nhập ID bác sĩ: ");
        String idbacSi = sc.nextLine();
        BenhNhan benhNhan = new BenhNhan(ten, namSinh, diaChi, idbenhNhan, idbenh, idsoPhong, ngayNhapVien, idbacSi);
        danhSachBenhNhan.add(benhNhan);
        System.out.println("Thêm bệnh nhân thành công!");
    }

    private void benhNhanNhapXuatVien(Scanner sc) {
        System.out.print("Nhập ID bệnh nhân: ");
        String idBenhNhan = sc.nextLine();
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getIdbenhNhan().equals(idBenhNhan)) {
                System.out.print("Nhập ngày xuất viện (dd/MM/yyyy): ");
                String ngayXuatVien = sc.nextLine();
                try {
                    bn.setNgayXuatVien(ngayXuatVien); // Sửa ở đây
                    System.out.println("Cập nhật ngày xuất viện thành công!");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID đã nhập!");
    }


    private void doiPhongBenhNhan(Scanner sc) {
        System.out.print("Nhập ID bệnh nhân: ");
        String idBenhNhan = sc.nextLine();
        System.out.print("Nhập ID phòng mới: ");
        String idPhongMoi = sc.nextLine();
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getIdbenhNhan().equals(idBenhNhan)) {
                bn.setIdsoPhong(idPhongMoi);
                System.out.println("Đổi phòng thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID đã nhập!");
    }

    private void doiBacSiDamNhiem(Scanner sc) {
        System.out.print("Nhập ID bệnh nhân: ");
        String idBenhNhan = sc.nextLine();
        System.out.print("Nhập ID bác sĩ mới: ");
        String idBacSiMoi = sc.nextLine();
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getIdbenhNhan().equals(idBenhNhan)) {
                bn.setIdbacSi(idBacSiMoi);
                System.out.println("Đổi bác sĩ đảm nhiệm thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân với ID đã nhập!");
    }

    private void hienThiBenhNhanTheoBenh(Scanner sc) {
        System.out.print("Nhập ID bệnh: ");
        String idBenh = sc.nextLine();
        System.out.println("Danh sách bệnh nhân theo bệnh: ");
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getIdbenhNhan().equals(idBenh)) {
                System.out.println(bn);
            }
        }
    }

    private void hienThiBenhNhanTheoPhong(Scanner sc) {
        System.out.print("Nhập ID phòng: ");
        String idPhong = sc.nextLine();
        System.out.println("Danh sách bệnh nhân theo phòng: ");
        for (BenhNhan bn : danhSachBenhNhan) {
            if (bn.getIdbenhNhan().equals(idPhong)) {
                System.out.println(bn);
            }
        }
    }

    private void hienThiBacSiTheoKhoa(Scanner sc) {
        System.out.print("Nhập ID khoa: ");
        String idKhoa = sc.nextLine();
        System.out.println("Danh sách bác sĩ theo khoa: ");
        for (BacSi bs : danhSachBacSi) {
            if (bs.toString().contains(idKhoa)) {
                System.out.println(bs);
            }
        }
    }

    private void hienThiBenhNhanTheoNamSinh() {
        danhSachBenhNhan.sort(Comparator.comparingInt(BenhNhan::getNamSinh));
        System.out.println("Danh sách bệnh nhân theo thứ tự năm sinh: ");
        for (BenhNhan bn : danhSachBenhNhan) {
            System.out.println(bn);
        }
    }
}


