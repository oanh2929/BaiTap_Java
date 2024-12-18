package OnTap_2;

import java.time.LocalDate;

public class NguoiMuaXe extends Nguoi {
    private double soTichDiem;
    private String ngayMua;
    private String tenXeMua;

    public NguoiMuaXe(String hoTen, String soDienThoai, String soCanCuoc, double soTichDiem, String ngayMua, String tenXeMua){
        super(hoTen, soDienThoai, soCanCuoc);
        this.soTichDiem=soTichDiem;
        this.ngayMua=ngayMua;
        this.tenXeMua=tenXeMua;
    }

    public  double getSoTichDiem(){
        return soTichDiem;
    }

    public void setSoTichDiem(double soTichDiem){
        this.soTichDiem=soTichDiem;
    }

    public String getNgayMua(){
        return ngayMua;
    }

    public void setNgayMua(String ngayMua){
        this.ngayMua=ngayMua;
    }

    public String getTenXeMua(){
        return tenXeMua;
    }

    public void setTenXeMua(String tenXeMua){
        this.tenXeMua=tenXeMua;
    }

    public void print(){
        System.out.println("Người mua xe: "+hoTen);
        System.out.println("Số tích điểm: "+soTichDiem);
        System.out.println("Ngày mua: "+ ngayMua);
        System.out.println("Tên xe mua: "+tenXeMua);
    }
}
