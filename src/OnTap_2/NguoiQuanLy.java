package OnTap_2;

public class NguoiQuanLy extends Nguoi implements Printable {

    public NguoiQuanLy(String hoTen, String soDienThoai, String soCanCuoc){
        super(hoTen, soDienThoai, soCanCuoc);
    }

    public void print(){
        System.out.println("Người quản lý: "+hoTen+", Số điện thoai: "+soDienThoai+", Số căn cước:"+soCanCuoc);
    }
}
