package OnTap_1;

import  java.util.*;
import  java.time.LocalDate;
import  java.util.ArrayList;
import  java.util.Comparator;


public class QuanLyThuVien {

        private List<NguoiDoc>danhSachNguoiDoc = new ArrayList<>();
        private List<Sach> danhSachSach = new ArrayList<>();

        // Nhập thông tin người đọc
        public void nhapThongTinNguoiDoc(String hoTen, String soDienThoai, String email, String maSinhVien, LocalDate ngayMuon, LocalDate ngayTra) {
            NguoiDoc nguoiDoc = new NguoiDoc(hoTen, soDienThoai, email, maSinhVien, ngayMuon, ngayTra);
            danhSachNguoiDoc.add(nguoiDoc);
        }

        public void timNguoiDoc(LocalDate ngay) {
            boolean found = false;
            for (NguoiDoc nguoi : danhSachNguoiDoc) {
                if (ngay.equals(nguoi.getNgayMuon()) || ngay.equals(nguoi.getNgayTra())) {
                    nguoi.print();
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy người đọc nào mượn hoặc trả sách vào ngày: " + ngay);
            }
        }

        public void sapXepDanhSachNguoiDoc() {
            Collections.sort(danhSachNguoiDoc, new Comparator<NguoiDoc>() {
                @Override
                public int compare(NguoiDoc o1, NguoiDoc o2) {
                    return o1.getNgayMuon().compareTo(o2.getNgayMuon());
                }
            });
        }

        public void inDanhSachNguoiDoc() {
            for (NguoiDoc nguoi : danhSachNguoiDoc) {
                nguoi.print();
            }
        }

        // Kiểm tra và in ra tên các cuốn sách đã mượn và còn lại
        public void kiemTraSach() {
            System.out.println("Sách đã được mượn:");
            for (Sach sach : danhSachSach) {
                if (sach.isTrangThai()) {
                    System.out.println("-" + sach.getTenSach());
                }
            }
            System.out.println("Sách còn lại trong thư viện:");
            for (Sach sach : danhSachSach) {
                if (!sach.isTrangThai()) {
                    System.out.println("-" + sach.getTenSach());
                }
            }
        }

        public void themSach(Sach sach) {
            danhSachSach.add(sach);
        }

        public void thoat() {
            System.out.println("Thoát chương trình.");
        }
    }



