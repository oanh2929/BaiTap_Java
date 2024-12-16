package OnTap_1;

import java.time.LocalDate;

public class NguoiDoc extends Nguoi implements Printable {
    private String maSinhVien;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    // Constructor
    public NguoiDoc(String hoTen, String soDienThoai, String email, String maSinhVien, LocalDate ngayMuon, LocalDate ngayTra) {
        super(hoTen, soDienThoai, email);
        this.maSinhVien = maSinhVien;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
    }

    // Getter và Setter
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }

    @Override
    public void print() {
        System.out.println("Người đọc: " + hoTen + ", Mã SV: " + maSinhVien + ", Ngày mượn: " + ngayMuon + ", Ngày trả: " + ngayTra);
    }
}