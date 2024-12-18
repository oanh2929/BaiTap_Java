package OnTap_2;

public class NguoiQuanLy extends Nguoi {

    public NguoiQuanLy(String hoTen, String soDienThoai, String soCanCuoc){
        super(hoTen, soDienThoai, soCanCuoc);
    }

    public void print(){
        System.out.println("Người quản lý: "+hoTen);
        System.out.println("Số điện thoại: "+soDienThoai);
        System.out.println("Số căn cước: "+ soCanCuoc);
    }
}
