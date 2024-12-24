package OnTap_5;

public class Ticket {

        // Thuộc tính
        private String maVe; // V + 5 số, VD: V00001
        private String maChuyenBay;
        private String maGhe; // [Hạng ghế][Dãy][Số], VD: Y01A
        private char hangGhe; // Y, B, F
        private double giaVe;
        private char trangThai; // B: Booked, C: Cancelled
        private HanhKhach hanhKhach;
        private String ngayDatVe; // dd/MM/yyyy HH:mm

        // Constructor
        public Ticket(String maVe, String maChuyenBay, char hangGhe) {
            this.maVe = maVe;
            this.maChuyenBay = maChuyenBay;
            this.maGhe = maGhe;
            this.hangGhe = hangGhe;
            this.giaVe = tinhGiaVe(hangGhe);
            this.trangThai = 'B'; // Mặc định trạng thái là Booked
            this.hanhKhach = hanhKhach;
            this.ngayDatVe = ngayDatVe;
        }

        // Getter & Setter
        public String getMaVe() {
            return maVe;
        }

        public void setMaVe(String maVe) {
            this.maVe = maVe;
        }

        public String getMaChuyenBay() {
            return maChuyenBay;
        }

        public void setMaChuyenBay(String maChuyenBay) {
            this.maChuyenBay = maChuyenBay;
        }

        public String getMaGhe() {
            return maGhe;
        }

        public void setMaGhe(String maGhe) {
            this.maGhe = maGhe;
        }

        public char getHangGhe() {
            return hangGhe;
        }

        public void setHangGhe(char hangGhe) {
            this.hangGhe = hangGhe;
            this.giaVe = tinhGiaVe(hangGhe); // Cập nhật giá vé nếu hạng ghế thay đổi
        }

        public double getGiaVe() {
            return giaVe;
        }

        public void setGiaVe(double giaVe) {
            this.giaVe = giaVe;
        }

        public char getTrangThai() {
            return trangThai;
        }

        public void setTrangThai(char trangThai) {
            this.trangThai = trangThai;
        }

        public HanhKhach getHanhKhach() {
            return hanhKhach;
        }

        public void setHanhKhach(HanhKhach hanhKhach) {
            this.hanhKhach = hanhKhach;
        }

        public String getNgayDatVe() {
            return ngayDatVe;
        }

        public void setNgayDatVe(String ngayDatVe) {
            this.ngayDatVe = ngayDatVe;
        }

        // Phương thức tính giá vé
        public double tinhGiaVe(char hangGhe) {
            switch (hangGhe) {
                case 'Y': // Economy
                    return 100.0;
                case 'B': // Business
                    return 200.0;
                case 'F': // First
                    return 300.0;
                default:
                    return 0.0;
            }
        }

        // Phương thức toString()
        @Override
        public String toString() {
            return "Ticket{" +
                    "maVe='" + maVe + '\'' +
                    ", maChuyenBay='" + maChuyenBay + '\'' +
                    ", maGhe='" + maGhe + '\'' +
                    ", hangGhe=" + hangGhe +
                    ", giaVe=" + giaVe +
                    ", trangThai=" + trangThai +
                    ", hanhKhach=" + (hanhKhach != null ? hanhKhach.getTenHanhKhach() : "null") +
                    ", ngayDatVe='" + ngayDatVe + '\'' +
                    '}';
        }
    }

