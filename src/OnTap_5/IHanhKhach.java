package OnTap_5;

public interface IHanhKhach {

        // Phương thức đặt vé, yêu cầu tham số là mã chuyến bay và hạng ghế
        boolean datVe(String maChuyenBay, char hangGhe);

        // Phương thức hủy vé, yêu cầu tham số là mã vé
        boolean huyVe(String maVe);

        // Phương thức đổi vé, yêu cầu tham số là mã vé cũ và mã chuyến bay mới
        boolean doiVe(String maVeCu, String maChuyenBayMoi);

        // Phương thức kiểm tra trạng thái vé, yêu cầu tham số là mã vé
        String kiemTraTrangThaiVe(String maVe);

        // Phương thức tính toán dặm bay và cập nhật số dặm bay tích lũy
        void tinhToanDamBay(double damBay);
    }






