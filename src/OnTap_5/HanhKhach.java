package OnTap_5;

public class HanhKhach implements IHanhKhach {
    // Thuộc tính
    private String id; // VD: KH001
    private String tenHanhKhach;
    private int namSinh;
    private String soHoChieu; // 8 ký tự chữ và số
    private String idHangBay;
    private String maTheThanhVien;
    private double soDamBayTichLuy;
    private char hangTheThanhVien; // B-Basic, S-Silver, G-Gold
    private Ticket[] danhSachVe;
    private String diaChi;
    private static final int soVeToiDa = 5;

    // Constructor
    public HanhKhach(String id, String ten, int namSinh, String soHoChieu, String diaChi) {
        this.id = id;
        this.tenHanhKhach = ten;
        this.namSinh = namSinh;
        this.soHoChieu = soHoChieu;
        this.diaChi = diaChi;
        this.soDamBayTichLuy = 0;
        this.hangTheThanhVien = 'B';
        this.danhSachVe = new Ticket[soVeToiDa];
    }

    // Getter và Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenHanhKhach() {
        return tenHanhKhach;
    }

    public void setTenHanhKhach(String tenHanhKhach) {
        this.tenHanhKhach = tenHanhKhach;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getIdHangBay() {
        return idHangBay;
    }

    public void setIdHangBay(String idHangBay) {
        this.idHangBay = idHangBay;
    }

    public String getMaTheThanhVien() {
        return maTheThanhVien;
    }

    public void setMaTheThanhVien(String maTheThanhVien) {
        this.maTheThanhVien = maTheThanhVien;
    }

    public double getSoDamBayTichLuy() {
        return soDamBayTichLuy;
    }

    public void setSoDamBayTichLuy(double soDamBayTichLuy) {
        this.soDamBayTichLuy = soDamBayTichLuy;
    }

    public char getHangTheThanhVien() {
        return hangTheThanhVien;
    }

    public void setHangTheThanhVien(char hangTheThanhVien) {
        this.hangTheThanhVien = hangTheThanhVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    // Implement các phương thức từ interface IHanhKhach
    @Override
    public boolean datVe(String maChuyenBay, char hangGhe) {
        if (demSoVeDaDat() >= soVeToiDa) {
            System.out.println("Đã đạt số vé tối đa!");
            return false;
        }

        Ticket veMoi = taoVeMoi(maChuyenBay, hangGhe);
        if (veMoi == null) {
            return false;
        }

        return themVaoDS(veMoi);
    }

    @Override
    public boolean huyVe(String maVe) {
        for (int i = 0; i < danhSachVe.length; i++) {
            if (danhSachVe[i] != null && danhSachVe[i].getMaVe().equals(maVe)) {
                danhSachVe[i].setTrangThai('C');
                System.out.println("Hủy vé thành công.");
                return true;
            }
        }
        System.out.println("Không tìm thấy vé để hủy.");
        return false;
    }

    @Override
    public boolean doiVe(String maVeCu, String maChuyenBayMoi) {
        for (Ticket ve : danhSachVe) {
            if (ve != null && ve.getMaVe().equals(maVeCu)) {
                ve.setMaChuyenBay(maChuyenBayMoi);
                System.out.println("Đổi vé thành công.");
                return true;
            }
        }
        System.out.println("Không tìm thấy vé để đổi.");
        return false;
    }

    @Override
    public String kiemTraTrangThaiVe(String maVe) {
        for (Ticket ve : danhSachVe) {
            if (ve != null && ve.getMaVe().equals(maVe)) {
                return "Trạng thái vé: " + ve.getTrangThai();
            }
        }
        return "Không tìm thấy vé.";
    }

    @Override
    public void tinhToanDamBay(double damBay) {
        this.soDamBayTichLuy += damBay;
        if (soDamBayTichLuy >= 50000) {
            hangTheThanhVien = 'G';
        } else if (soDamBayTichLuy >= 20000) {
            hangTheThanhVien = 'S';
        }
    }

    private int demSoVeDaDat() {
        int count = 0;
        for (Ticket ve : danhSachVe) {
            if (ve != null && ve.getTrangThai() == 'B') {
                count++;
            }
        }
        return count;
    }

    private Ticket taoVeMoi(String maChuyenBay, char hangGhe) {
        // Logic tạo vé mới dựa trên thông tin chuyến bay và hạng ghế
        String maVe = "V" + String.format("%05d", (int) (Math.random() * 100000));
        Ticket veMoi = new Ticket(maVe, maChuyenBay, hangGhe);
        return veMoi;
    }

    private boolean themVaoDS(Ticket veMoi) {
        for (int i = 0; i < danhSachVe.length; i++) {
            if (danhSachVe[i] == null) {
                danhSachVe[i] = veMoi;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append(", Tên: ").append(tenHanhKhach).append(", Năm sinh: ").append(namSinh)
                .append(", Số hộ chiếu: ").append(soHoChieu).append(", Địa chỉ: ").append(diaChi).append(", Hạng thẻ: ").append(hangTheThanhVien)
                .append(", Số dặm tích lũy: ").append(soDamBayTichLuy);
        return sb.toString();
    }
}