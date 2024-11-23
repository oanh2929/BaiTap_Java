package OnTap_2;

import java.time.LocalDate;

public class Xe {
    private String tenXe;
    private String maSoXe;
    private String maSoThue;
    private String giaTien;
    private LocalDate ngayNhap;
    private boolean trangThai;

    public Xe(String tenXe, String maSoXe, String maSoThue, String giaTien, LocalDate ngayNhap, boolean trangThai){
        this.tenXe=tenXe;
        this.maSoThue=maSoThue;
        this.maSoXe=maSoXe;
        this.giaTien=giaTien;
        this.ngayNhap=ngayNhap;
        this.trangThai=trangThai;
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

    public LocalDate getNgayNhap(){
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap){
        this.ngayNhap=ngayNhap;
    }

    public boolean getTrangThai(){
        return trangThai;
    }

    public void setTrangThai(boolean trangThai){
        this.trangThai=trangThai;
    }
}
