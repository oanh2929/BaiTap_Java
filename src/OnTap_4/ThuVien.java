package OnTap_4;

import java.util.ArrayList;
import java.util.List;

public class ThuVien {
    private int id;
    private String tenThuVien;
    private List<Sach> danhSachSach = new ArrayList<>();
    private List<NguoiDung> danhSachNguoiDung = new ArrayList<>();

    public ThuVien(int id, String tenThuVien){
        this.id=id;
        this.tenThuVien=tenThuVien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenThuVien() {
        return tenThuVien;
    }

    public void setTenThuVien(String tenThuVien) {
        this.tenThuVien = tenThuVien;
    }

    public List<Sach> getDanhSachSach() {
        return danhSachSach;
    }

    public void setDanhSachSach(List<Sach> danhSachSach) {
        this.danhSachSach = danhSachSach;
    }

    public List<NguoiDung> getDanhSachNguoiDung() {
        return danhSachNguoiDung;
    }

    public void setDanhSachNguoiDung(List<NguoiDung> danhSachNguoiDung) {
        this.danhSachNguoiDung = danhSachNguoiDung;
    }

    public void themSach(Sach sach){
        danhSachSach.add(sach);
    }

    public  void xoaSach(Sach sach){
        danhSachSach.remove(sach);
    }

    public void themNguoiDung(NguoiDung nguoiDung){
        danhSachNguoiDung.add(nguoiDung);
    }

    public void xoaNguoiDung(NguoiDung nguoiDung){
        danhSachNguoiDung.add(nguoiDung);
    }

    public void hienThiDanhSachNguoiDung(){
        System.out.println("Danh sách người dùng: ");
        for(NguoiDung nguoiDung : danhSachNguoiDung){
            System.out.println(nguoiDung);
        }
    }

    public void hienThiDanhSachSach(){
        System.out.println("Danh sách sách: ");
        for(Sach sach : danhSachSach){
            System.out.println(sach);
        }
    }

    @Override
    public String toString() {
        return super.toString() +",Thư viện {" +",ID:"+id+",Tên thư viện:"+tenThuVien+",Tổng số sách:"+danhSachSach.size()+",Tổng số người dùng: "+danhSachSach.size()+'}';
    }
}

