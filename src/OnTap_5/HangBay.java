package OnTap_5;

public class HangBay {

        private String id;                  // Mã ID của hãng bay (VD: HB001)
        private String tenHangBay;          // Tên hãng bay
        private ChuyenBay[] danhSachChuyenBay;  // Danh sách chuyến bay
        private HanhKhach[] danhSachHanhKhach;  // Danh sách hành khách
        private double[] bangGiaCoBan;      // Bảng giá cơ bản cho các hạng ghế (Economy, Business, First)

        // Constructor
        public HangBay(String id, String tenHangBay, double[] bangGiaCoBan) {
            this.id = id;
            this.tenHangBay = tenHangBay;
            this.bangGiaCoBan = bangGiaCoBan;
            this.danhSachChuyenBay = new ChuyenBay[100];  // Giả sử tối đa 100 chuyến bay
            this.danhSachHanhKhach = new HanhKhach[100]; // Giả sử tối đa 100 hành khách
        }

        // Getter và Setter
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTenHangBay() {
            return tenHangBay;
        }

        public void setTenHangBay(String tenHangBay) {
            this.tenHangBay = tenHangBay;
        }

        public double[] getBangGiaCoBan() {
            return bangGiaCoBan;
        }

        public void setBangGiaCoBan(double[] bangGiaCoBan) {
            this.bangGiaCoBan = bangGiaCoBan;
        }

        // Thêm chuyến bay vào danh sách
        public boolean themChuyenBay(ChuyenBay chuyenBay) {
            for (int i = 0; i < danhSachChuyenBay.length; i++) {
                if (danhSachChuyenBay[i] == null) {
                    danhSachChuyenBay[i] = chuyenBay;
                    return true;
                }
            }
            return false; // Không thể thêm chuyến bay, danh sách đã đầy
        }

        // Xóa chuyến bay khỏi danh sách
        public boolean xoaChuyenBay(String maChuyenBay) {
            for (int i = 0; i < danhSachChuyenBay.length; i++) {
                if (danhSachChuyenBay[i] != null && danhSachChuyenBay[i].getMaChuyenBay().equals(maChuyenBay)) {
                    danhSachChuyenBay[i] = null;
                    return true;
                }
            }
            return false; // Không tìm thấy chuyến bay để xóa
        }

        // Tìm chuyến bay theo mã chuyến bay
        public ChuyenBay timChuyenBay(String maChuyenBay) {
            for (ChuyenBay chuyenBay : danhSachChuyenBay) {
                if (chuyenBay != null && chuyenBay.getMaChuyenBay().equals(maChuyenBay)) {
                    return chuyenBay;
                }
            }
            return null; // Không tìm thấy chuyến bay
        }

        // Thêm hành khách vào danh sách
        public boolean themHanhKhach(HanhKhach hanhKhach) {
            for (int i = 0; i < danhSachHanhKhach.length; i++) {
                if (danhSachHanhKhach[i] == null) {
                    danhSachHanhKhach[i] = hanhKhach;
                    return true;
                }
            }
            return false; // Không thể thêm hành khách, danh sách đã đầy
        }

        // Xóa hành khách khỏi danh sách
        public boolean xoaHanhKhach(String idHanhKhach) {
            for (int i = 0; i < danhSachHanhKhach.length; i++) {
                if (danhSachHanhKhach[i] != null && danhSachHanhKhach[i].getId().equals(idHanhKhach)) {
                    danhSachHanhKhach[i] = null;
                    return true;
                }
            }
            return false; // Không tìm thấy hành khách để xóa
        }

        // Tìm hành khách theo ID
        public HanhKhach timHanhKhach(String idHanhKhach) {
            for (HanhKhach hanhKhach : danhSachHanhKhach) {
                if (hanhKhach != null && hanhKhach.getId().equals(idHanhKhach)) {
                    return hanhKhach;
                }
            }
            return null; // Không tìm thấy hành khách
        }

        // Tính tổng doanh thu của hãng bay
        public double tinhTongDoanhThu() {
            double doanhThu = 0;
            for (ChuyenBay chuyenBay : danhSachChuyenBay) {
                if (chuyenBay != null) {
                    for (Ticket ve : chuyenBay.getDanhSachVe()) {
                        if (ve != null && ve.getTrangThai() == 'B') {  // Chỉ tính vé đã đặt (B)
                            // Tính giá vé tùy theo hạng ghế
                            char hangGhe = ve.getHangGhe();
                            if (hangGhe == 'E') {
                                doanhThu += bangGiaCoBan[0];  // Giá Economy
                            } else if (hangGhe == 'B') {
                                doanhThu += bangGiaCoBan[1];  // Giá Business
                            } else if (hangGhe == 'F') {
                                doanhThu += bangGiaCoBan[2];  // Giá First
                            }
                        }
                    }
                }
            }
            return doanhThu;
        }

        // Phương thức toString để hiển thị thông tin về hãng bay
        @Override
        public String toString() {
            return "ID Hãng bay: " + id + ", Tên hãng bay: " + tenHangBay;
        }
    }


