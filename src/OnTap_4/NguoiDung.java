package OnTap_4;

import java.util.ArrayList;
import java.util.List;

public class NguoiDung {
    private String id;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String lop;
    private String maSinhVien;
    private List<Sach> sachDangMuon = new ArrayList<>();

    public NguoiDung(){
        this.id=id;
        this.ten=ten;
        this.gioiTinh=gioiTinh;
        this.ngaySinh=ngaySinh;
        this.lop=lop;
        this.maSinhVien=maSinhVien;
    }
    public String getId(){
        return id;
    }

    public void setId(String id) {
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
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


    public void kiemTraSachDangMuon() {
        if (sachDangMuon.isEmpty()) {
            System.out.println("Không có sách nào đang mượn");
        } else {
            System.out.println("Danh sách sách đang mượn:");
            for (Sach sach : sachDangMuon) {
                System.out.println(sach);
            }
        }
    }

    public void themSachDangMuon(Sach sach) {
        if (sachDangMuon.size() < 5) {
            sachDangMuon.add(sach);
        } else {
            System.out.println("Người dùng đã mượn tối đa 5 sách.");
        }
    }

    // Phương thức xóa sách khỏi danh sách sách đang mượn
    public void xoaSachDangMuon(Sach sach) {
        sachDangMuon.remove(sach);
    }




    @Override
    public String toString() {
        return super.toString() + ",Id:"+id+",Tên: "+ten+",Giới tính:"+gioiTinh+",Ngày sinh: "+ngaySinh+",Lớp: "+lop+",Mã sinh viên: "+maSinhVien+"Sách đang mượn: "+sachDangMuon;

    }
}
