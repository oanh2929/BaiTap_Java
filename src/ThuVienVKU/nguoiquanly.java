package ThuVienVKU;

public class nguoiquanly extends nguoi {
    private String socancuoc;

    public nguoiquanly(String hoten,String sodienthoai,String email,String socancuoc){
        super(hoten,sodienthoai,email);
        this.socancuoc=socancuoc;
    }

    @Override
    public void print() {
        System.out.println("Họ tên: "+hoten);
        System.out.println("Số căn cước: "+socancuoc);
    }
}
