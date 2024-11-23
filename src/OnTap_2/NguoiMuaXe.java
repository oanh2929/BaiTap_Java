package OnTap_2;

import java.time.LocalDate;

public class NguoiMuaXe extends Nguoi implements Printable {
    private int soTichDiem;
    private LocalDate ngayMua;
    private String tenXeMua;

    public NguoiMuaXe(String hoTen, String soDienThoai, String soCanCuoc, int soTichDiem, LocalDate ngayMua, String tenXeMua){
        super(hoTen, soDienThoai, soCanCuoc);
        this.soTichDiem=soTichDiem;
        this.ngayMua=ngayMua;
        this.tenXeMua=tenXeMua;
    }

    public int getSoTichDiem(){
        return soTichDiem;
    }

    public void setSoTichDiem(int soTichDiem){
        this.soTichDiem=soTichDiem;
    }

    public LocalDate getNgayMua(){
        return ngayMua;
    }

    public void setNgayMua(LocalDate ngayMua){
        this.ngayMua=ngayMua;
    }

    public String getTenXeMua(){
        return tenXeMua;
    }

    public void setTenXeMua(String tenXeMua){
        this.tenXeMua=tenXeMua;
    }

    public void print(){
        System.out.println("Người mua xe: "+hoTen+",Số điện thoại: "+soDienThoai+",Số tích điểm: "+soTichDiem+",Ngày mua: "+ngayMua+",Tên xe: "+tenXeMua);
    }

}
