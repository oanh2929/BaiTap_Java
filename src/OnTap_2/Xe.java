package OnTap_2;

import java.time.LocalDate;

public class Xe implements Printable {
    private String tenXe;
    private String maSoXe;
    private String maSoThue;
    private String giaTien;
    private String ngayNhap;
    private boolean trangThai;

    public Xe(String tenXe, String maSoXe, String maSoThue, String giaTien, String ngayNhap, boolean trangThai){
        this.tenXe=tenXe;
        this.maSoThue=maSoThue;
        this.maSoXe=maSoXe;
        this.giaTien=giaTien;
        this.ngayNhap=ngayNhap;
        this.trangThai=true;
    }

    public String getTenXe(){
        return tenXe;
    }

    public void setTenXe(String tenXe){
        this.tenXe=tenXe;
    }

    public String getMaSoXe(){
        return maSoXe;
    }

    public void setMaSoXe(String maSoXe){
        this.maSoXe=maSoXe;
    }

    public String getMaSoThue(){
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue){
        this.maSoThue=maSoThue;
    }

    public String getGiaTien(){
        return giaTien;
    }

    public void setGiaTien(String giaTien){
        this.giaTien=giaTien;
    }

    public String getNgayNhap(){
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap){
        this.ngayNhap=ngayNhap;
    }

    public boolean isTrangThai(){
        return trangThai;
    }

    public void setTrangThai(boolean trangThai){
        this.trangThai=trangThai;
    }

    public void print(){
        System.out.println("Xe:"+tenXe);
        System.out.println("Giá: "+giaTien);
        System.out.println("Trạng thái: "+ (trangThai?"Đã bán":"Chưa bán"));
    }
}
