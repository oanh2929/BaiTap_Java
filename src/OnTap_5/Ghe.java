package OnTap_5;

public class Ghe {

        private String maGhe;
        private char hangGhe;
        private boolean trangThai;
        private double giaCoBan;

        public Ghe(String maGhe, char hangGhe, double giaCoBan) {
            this.maGhe = maGhe;
            this.hangGhe = hangGhe;
            this.trangThai = true;  // Mặc định ghế là trống
            this.giaCoBan = giaCoBan;
        }

        // Getter và Setter
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
        }

        public boolean isTrong() {
            return trangThai;
        }

        public boolean getTrangThai() {
            return trangThai;
        }

        public void setTrangThai(char trangThai) {
            if (trangThai == 'T') {
                this.trangThai = true;  // Trạng thái trống
            } else if (trangThai == 'D') {
                this.trangThai = false;  // Trạng thái đã đặt
            }
        }

        public double getGiaCoBan() {
            return giaCoBan;
        }

        public void setGiaCoBan(double giaCoBan) {
            this.giaCoBan = giaCoBan;
        }

        @Override
        public String toString() {
            return "Mã ghế: " + maGhe + ", Hạng ghế: " + hangGhe + ", Trạng thái: " + (trangThai ? "Trống" : "Đã đặt") + ", Giá cơ bản: " + giaCoBan + " VND";
        }


}
