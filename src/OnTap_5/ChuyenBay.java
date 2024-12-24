package OnTap_5;

public class ChuyenBay {

        // Thuộc tính
        private String maChuyenBay;
        private String sanBayDi;
        private String sanBayDen;
        private String ngayBay;
        private String gioBay;
        private int soGheEconomy;
        private int soGheBusiness;
        private int soGheFirst;
        private Ghe[] danhSachGhe;
        private char trangThai;
        private Ticket[] danhSachVe;
        private double khoangCachBay;

        // Constructor
        public ChuyenBay(String maChuyenBay, String sanBayDi, String sanBayDen,
                         String ngayBay, String gioBay, double khoangCachBay) {
            this.maChuyenBay = maChuyenBay;
            this.sanBayDi = sanBayDi;
            this.sanBayDen = sanBayDen;
            this.ngayBay = ngayBay;
            this.gioBay = gioBay;
            this.khoangCachBay = khoangCachBay;
            this.soGheEconomy = 120;  // 20 dãy × 6 ghế
            this.soGheBusiness = 40;  // 10 dãy × 4 ghế
            this.soGheFirst = 10;     // 5 dãy × 2 ghế
            this.danhSachGhe = new Ghe[soGheEconomy + soGheBusiness + soGheFirst];
            this.danhSachVe = new Ticket[soGheEconomy + soGheBusiness + soGheFirst];
            this.trangThai = 'S';     // Mặc định là Scheduled
        }

        // Getter và Setter
        public String getMaChuyenBay() {
            return maChuyenBay;
        }

        public void setMaChuyenBay(String maChuyenBay) {
            this.maChuyenBay = maChuyenBay;
        }

        public String getSanBayDi() {
            return sanBayDi;
        }

        public void setSanBayDi(String sanBayDi) {
            this.sanBayDi = sanBayDi;
        }

        public String getSanBayDen() {
            return sanBayDen;
        }

        public void setSanBayDen(String sanBayDen) {
            this.sanBayDen = sanBayDen;
        }

        public String getNgayBay() {
            return ngayBay;
        }

        public void setNgayBay(String ngayBay) {
            this.ngayBay = ngayBay;
        }

        public String getGioBay() {
            return gioBay;
        }

        public void setGioBay(String gioBay) {
            this.gioBay = gioBay;
        }

        public int getSoGheEconomy() {
            return soGheEconomy;
        }

        public void setSoGheEconomy(int soGheEconomy) {
            this.soGheEconomy = soGheEconomy;
        }

        public int getSoGheBusiness() {
            return soGheBusiness;
        }

        public void setSoGheBusiness(int soGheBusiness) {
            this.soGheBusiness = soGheBusiness;
        }

        public int getSoGheFirst() {
            return soGheFirst;
        }

        public void setSoGheFirst(int soGheFirst) {
            this.soGheFirst = soGheFirst;
        }

        public Ticket[] getDanhSachVe() {
            return danhSachVe;
        }

         public void setDanhSachVe(Ticket[] danhSachVe) {
            this.danhSachVe = danhSachVe;
        }

        public char getTrangThai() {
            return trangThai;
        }

        public void setTrangThai(char trangThai) {
            this.trangThai = trangThai;
        }

        public double getKhoangCachBay() {
            return khoangCachBay;
        }

        public void setKhoangCachBay(double khoangCachBay) {
            this.khoangCachBay = khoangCachBay;
        }

        // Phương thức kiểm tra ghế trống theo hạng ghế
        public boolean kiemTraGheTrong(char hangGhe) {
            int soGheTrong = 0;
            for (Ghe ghe : danhSachGhe) {
                if (ghe != null && ghe.getHangGhe() == hangGhe && ghe.isTrong()) {
                    soGheTrong++;
                }
            }
            return soGheTrong > 0;
        }

        // Phương thức đặt ghế (dựa trên mã ghế)
        public boolean datGhe(String maGhe) {
            for (Ghe ghe : danhSachGhe) {
                if (ghe != null && ghe.getMaGhe().equals(maGhe) && ghe.isTrong()) {
                    ghe.setTrangThai('D');  // Đặt ghế, đổi trạng thái thành "Đã đặt"
                    return true;
                }
            }
            return false;  // Không tìm thấy ghế trống hoặc ghế đã được đặt
        }

        // Phương thức hủy ghế (dựa trên mã ghế)
        public boolean huyGhe(String maGhe) {
            for (Ghe ghe : danhSachGhe) {
                if (ghe != null && ghe.getMaGhe().equals(maGhe) && !ghe.isTrong()) {
                    ghe.setTrangThai('T');  // Hủy ghế, đổi trạng thái thành "Trống"
                    return true;
                }
            }
            return false;  // Không tìm thấy ghế đã đặt để hủy
        }

        // Phương thức chuyển đổi trạng thái chuyến bay
        public void thayDoiTrangThai(char trangThai) {
            this.trangThai = trangThai;
        }

        // Phương thức toString để hiển thị thông tin chuyến bay
        @Override
        public String toString() {
            return "Mã chuyến bay: " + maChuyenBay + ", Sân bay đi: " + sanBayDi + ", Sân bay đến: " + sanBayDen +
                    ", Ngày bay: " + ngayBay + ", Giờ bay: " + gioBay + ", Khoảng cách bay: " + khoangCachBay +
                    " km, Trạng thái: " + trangThai;
        }
    }


