package OnTap_3;

import java.util.ArrayList;
import java.util.List;

public class BacSi extends Person{
    private String idbacSi;
    private String idkhoaDamNhiem;
    private List<String>danhSachBenhNhan;

    public BacSi(String ten, int namSinh, String diaChi, String idbacSi, String idkhoaDamNhiem){
        super(ten,namSinh,diaChi);
        this.idbacSi=idbacSi;
        this.idkhoaDamNhiem=idkhoaDamNhiem;
        this.danhSachBenhNhan=new ArrayList<>();
    }

    public String getIdbacSi(){
        return idbacSi;
    }

    public void setIdbacSi(String idbacSi){
        this.idbacSi=idbacSi;
    }

    public String getIdkhoaDamNhiem(){
        return idkhoaDamNhiem;
    }

    public void setIdkhoaDamNhiem(String idkhoaDamNhiem) {
        this.idkhoaDamNhiem = idkhoaDamNhiem;
    }

    public List<String>getDanhSachBenhNhan(){
        return danhSachBenhNhan;
    }

    public void themBenhNhan(String idbenhNhan){
        danhSachBenhNhan.add(idbenhNhan);
    }

    public void xoaBenhNhan(String idbenhNhan){
        danhSachBenhNhan.remove(idbenhNhan);
    }
    public String toString(){
        return super.toString()+ ",ID Bác sĩ: "+idbacSi+",ID Khoa đảm nhiệm: "+idkhoaDamNhiem+",Danh sách bệnh nhân: "+danhSachBenhNhan;
    }
}
