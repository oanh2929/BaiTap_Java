package OnTap_1;


import java.time.LocalDate;

public class NguoiDoc extends Nguoi {
    private String maSinhVien;
    private String ngayMuon;
    private String ngayTra;

    // Constructor
    public NguoiDoc(String hoTen, String soDienThoai, String email, String maSinhVien, String ngayMuon, String ngayTra) {
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

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    @Override
    public void print() {
        System.out.println("Mã sinh viên: "+maSinhVien);
        System.out.println("Ngày mượn: "+ngayMuon);
        System.out.println("Ngày trả: "+ngayTra);

    }
}