package OnTap_4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NguoiDung {
    private int id;
    private String ten;
    private String gioiTinh;
    private LocalDate ngaySinh;
    private String lop;
    private String maSinhVien;
    private List<Sach> sachDangMuon = new ArrayList<>();

    public NguoiDung(int id, String ten, String gioiTinh, LocalDate ngaySinh, String lop, String maSinhVien){
        this.id=id;
        this.ten=ten;
        this.gioiTinh=gioiTinh;
        this.ngaySinh=ngaySinh;
        this.lop=lop;
        this.maSinhVien=maSinhVien;
    }
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public List<Sach> getSachDangMuon() {
        return sachDangMuon;
    }

    public void setSachDangMuon(List<Sach> sachDangMuon) {
        this.sachDangMuon = sachDangMuon;
    }

    public void themSach(Sach sach) {
        if (sachDangMuon.size() < 5) {
            sachDangMuon.add(sach);
        } else {
            System.out.println("Không thể mượn quá 5 quyển sách.");
        }
    }

    public void hienThiSachDangMuon() {
        System.out.println("Danh sách sách đang mượn:");
        for (Sach sach : sachDangMuon) {
            System.out.println(sach);
        }
    }


    public void xoaSach(Sach sach) {
        sachDangMuon.remove(sach);
    }

    @Override
    public String toString() {
        return super.toString() + ",Id:"+id+",Tên: "+ten+",Giới tính:"+gioiTinh+",Ngày sinh: "+ngaySinh+",Lớp: "+lop+",Mã sinh viên: "+maSinhVien+"Sách đang mượn: "+sachDangMuon;

    }
}
