package OnTap_3;

import java.util.ArrayList;
import java.util.List;

public class Khoa {
    private String idKhoa;
    private String tenKhoa;
    private List<String> danhSachBacSi;

    public Khoa(String idKhoa, String tenKhoa){
        this.idKhoa=idKhoa;
        this.tenKhoa=tenKhoa;
        this.danhSachBacSi=new ArrayList<>();
    }

    public String getIdKhoa(){
        return idKhoa;
    }

    public void setIdKhoa(String idKhoa){
        this.idKhoa=idKhoa;
    }

    public String getTenKhoa(){
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa){
        this.tenKhoa=tenKhoa;
    }

    public List<String> getDanhSachBacSi(){
        return danhSachBacSi;
    }


    //Thêm bác sĩ
    public void themBacSi(String idBacsi){
        danhSachBacSi.add(idBacsi);
    }
    //Xóa bác sĩ
    public void xoaBacSi(String idBacsi){
        danhSachBacSi.remove(idBacsi);
    }


    public String toString(){
        return "ID Khoa: "+idKhoa+"Tên Khoa: "+tenKhoa+"Danh sách bác sĩ: "+danhSachBacSi;
    }
}
