package OnTap_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyBenhVien {
        private List<Khoa> danhSachKhoa;
        private List<Phong> danhSachPhong;
        private List<BacSi> danhSachBacSi;
        private List<BenhNhan> danhSachBenhNhan;
        Scanner sc = new Scanner(System.in);

        // Hàm tạo
        public QuanLyBenhVien() {
            this.danhSachKhoa = new ArrayList<>();
            this.danhSachPhong = new ArrayList<>();
            this.danhSachBacSi = new ArrayList<>();
            this.danhSachBenhNhan = new ArrayList<>();
        }

        // Thêm khoa
        public void themKhoa(Khoa khoa) {
            danhSachKhoa.add(khoa);
        }

        // Thêm phòng
        public void themPhong(Phong phong) {
            danhSachPhong.add(phong);
        }

        // Thêm bác sĩ
        public void themBacSi(BacSi bacSi) {
            danhSachBacSi.add(bacSi);
        }

        // Thêm bệnh nhân
        public void themBenhNhan(BenhNhan benhNhan) {
            danhSachBenhNhan.add(benhNhan);
        }

        // Tìm bệnh nhân theo ID
        public BenhNhan timBenhNhan(String idBenhNhan) {
            for (BenhNhan bn : danhSachBenhNhan) {
                if (bn.getIdbenhNhan().equals(idBenhNhan)) {
                    return bn;
                }
            }
            return null;
        }

        // Tìm bác sĩ theo ID
        public BacSi timBacSi(String idBacSi) {
            for (BacSi bs : danhSachBacSi) {
                if (bs.getIdbacSi().equals(idBacSi)) {
                    return bs;
                }
            }
            return null;
        }

        // Hiển thị danh sách bệnh nhân
        public void hienThiDanhSachBenhNhan() {
            for (BenhNhan bn : danhSachBenhNhan) {
                System.out.println(bn);
            }
        }

        // Hiển thị danh sách bác sĩ
        public void hienThiDanhSachBacSi() {
            for (BacSi bs : danhSachBacSi) {
                System.out.println(bs);
            }
        }

        // Hiển thị danh sách khoa
        public void hienThiDanhSachKhoa() {
            for (Khoa khoa : danhSachKhoa) {
                System.out.println(khoa);
            }
        }

        // Hiển thị danh sách phòng
        public void hienThiDanhSachPhong() {
            for (Phong phong : danhSachPhong) {
                System.out.println(phong);
            }
        }
    }

