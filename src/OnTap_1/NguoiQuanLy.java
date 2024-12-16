package OnTap_1;

public class NguoiQuanLy extends Nguoi {
    private String soCanCuocCongDan;

    public NguoiQuanLy(String hoTen, String soDienThoai, String emai, String soCanCuocCongDan){
        super(hoTen,soDienThoai,emai);
        this.soCanCuocCongDan=soCanCuocCongDan;
    }

    public String getSoCanCuocCongDan(){
        return soCanCuocCongDan;
    }

    public void setSoCanCuocCongDan(String soCanCuocCongDan){
        this.soCanCuocCongDan=soCanCuocCongDan;
    }

    @Override
    public void print(){
        System.out.println("Người quản lý: "+ super.getHoTen()+",Số căn cước"+ soCanCuocCongDan);
    }
}
