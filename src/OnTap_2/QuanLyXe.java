package OnTap_2;

import  java.util.*;
import  java.time.LocalDate;
import  java.util.ArrayList;
import  java.util.Comparator;
import  java.util.List;


public class QuanLyXe {
        private List<NguoiMuaXe> danhSachNguoiMua = new ArrayList<>();
        private List<Xe> danhSachXe = new ArrayList<>();

        // Nhập thông tin người mua xe
        public void nhapThongTinNguoiMua(String hoTen, String soDienThoai, String soCanCuocCongDan, String tenXeMua) {
            Xe xeMua = null;
            for (Xe xe : danhSachXe) {
                if (xe.getTenXe().equalsIgnoreCase(tenXeMua) && !xe.isTrangThai()) {
                    xeMua = xe;
                    xe.setTrangThai(true); // Đánh dấu xe đã được mua
                    break;
                }
            }
            if (xeMua == null) {
                System.out.println("Xe không có sẵn!");
                return;
            }

            NguoiMuaXe nguoiMua = new NguoiMuaXe(hoTen, soDienThoai, soCanCuocCongDan, 0, LocalDate.now(), tenXeMua);
            danhSachNguoiMua.add(nguoiMua);
            System.out.println("Thêm người mua thành công!");
        }

        // Tìm người mua theo ngày mua
        public void timNguoiMuaTheoNgay(LocalDate ngay) {
            for (NguoiMuaXe nguoi : danhSachNguoiMua) {
                if (nguoi.getNgayMua().equals(ngay)) {
                    nguoi.print();
                }
            }
        }

        // Sắp xếp danh sách người mua
        public void sapXepDanhSachNguoiMua() {
            // Sắp xếp theo ngày mua
            danhSachNguoiMua.sort(Comparator.comparing(NguoiMuaXe::getNgayMua));
        }

        // In danh sách người mua
        public void inDanhSachNguoiMua() {
            for (NguoiMuaXe nguoi : danhSachNguoiMua) {
                nguoi.print();
            }
        }

        // Kiểm tra và in danh sách xe
        public void kiemTraXe() {
            System.out.println("Xe còn lại trong cửa hàng:");
            for (Xe xe : danhSachXe) {
                if (!xe.isTrangThai()) {
                    System.out.println(xe.getTenXe());
                }
            }
        }

        // Thêm xe vào danh sách
        public void themXe(Xe xe) {
            danhSachXe.add(xe);
        }

        public void thoat() {
            System.out.println("Thoát chương trình.");
        }
    }


