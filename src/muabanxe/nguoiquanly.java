package muabanxe;

public class nguoiquanly extends nguoi {
    public nguoiquanly(String hoten,String sodienthoai,String socancuoc){
        super(hoten,sodienthoai,socancuoc);

    }

    public void print(){
        System.out.println("Họ tên:"+hoten);
        System.out.println("Số điện thoại:"+sodienthoai);
        System.out.println("Số căn cước:"+socancuoc);
    }
}
