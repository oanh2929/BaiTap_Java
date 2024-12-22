package OnTap_2;

import OnTap_1.NguoiDoc;
import OnTap_1.Sach;

import  java.util.*;
import  java.time.LocalDate;
import  java.util.ArrayList;
import  java.util.Comparator;
import  java.util.List;


public class QuanLyXe {
        private List<NguoiMuaXe> danhSachNguoiMua = new ArrayList<>();
        private List<Xe> danhSachXe = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        public QuanLyXe(){
            danhSachXe.add(new Xe("Honda","B01","121","20000000","19/11/2024",false));
            danhSachXe.add(new Xe("SH","B02","122","100000000","18/11/2024",false));
            danhSachXe.add(new Xe("Yamaha","B03","123","30000000","18/11/2024",false));
            danhSachXe.add(new Xe("Vison","B04","124","35000000","14/11/2024",true));
        }

        // Nhập thông tin người mua xe
        public void nhapThongTinNguoiMua(){
            System.out.println("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.println("Số điện thoại: ");
            String soDienThoai = sc.nextLine();
            System.out.println("Số căn cước công dân: ");
            String soCanCuoc = sc.nextLine();
            System.out.println("Số tích điểm: ");
            double soTichDiem = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập ngày mua: ");
            String ngayMua = sc.nextLine();
            System.out.println("Tên xe mua: ");
            String tenXe = sc.nextLine();
            System.out.println("Giá xe: ");
            double giaXe = Double.parseDouble(sc.nextLine());

            double tienPhaiTra = giaXe-((soTichDiem*10)*giaXe/100);
            double tongTien = tienPhaiTra+tienPhaiTra*0.1;
            double diemMoi = soTichDiem+1;

            danhSachNguoiMua.add(new NguoiMuaXe(hoTen,soDienThoai,soCanCuoc,soTichDiem,ngayMua,tenXe));
            System.out.println("Đã thêm người mua thành công!");
            System.out.println("Tổng tiền phải trả: "+tongTien+"VND");
            System.out.println("Số tích điểm mới: "+diemMoi);
        }

    public void timNguoiMuaXe() {
        System.out.println("Nhập ngày cần tìm (dd/MM/yyyy): ");
        String ngay = sc.nextLine();
        boolean found = false;

        for (NguoiMuaXe nguoiMuaXe : danhSachNguoiMua) {
            if (nguoiMuaXe.getNgayMua().equals(ngay)) {
                nguoiMuaXe.print();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy người mua xe nào với ngày này.");
        }
    }

    public void sapXeNguoiMuaXeTheoNgay() {
        Collections.sort(danhSachNguoiMua, Comparator.comparing(NguoiMuaXe::getNgayMua));
        System.out.println("Đã sắp xếp danh sách người mua theo ngày.");
    }


    public void inDanhSachNguoiMua() {
        if (danhSachNguoiMua.isEmpty()) {
            System.out.println("Danh sách người mua xe trống.");
        } else {
            for (NguoiMuaXe nguoiMuaXe : danhSachNguoiMua) {
                nguoiMuaXe.print();
                System.out.println("-------------------------");
            }
        }
    }

    public void kiemTraXe() {
        System.out.println("Danh sách xe trong cửa hàng:");
        for (Xe xe : danhSachXe) {
            xe.print();
            System.out.println("-------------------------");
        }
    }


        public void menu(){

            while(true){
                System.out.println("\n--QUẢN LÝ XE---");
                System.out.println("1. Nhập thông tin người mua xe");
                System.out.println("2. Tìm người mua xe");
                System.out.println("3. Sắp xếp danh sách người mua theo ngày");
                System.out.println("4. In danh sách");
                System.out.println("5. Kiểm tra và in trạng thái xe");
                System.out.println("6. Thoát");
                System.out.println("Chọn chức năng");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice){
                    case 1:
                        nhapThongTinNguoiMua();
                        break;
                    case 2:
                        timNguoiMuaXe();
                        break;
                    case 3:
                        sapXeNguoiMuaXeTheoNgay();
                        break;
                    case 4:
                        inDanhSachNguoiMua();
                        break;
                    case 5:
                        kiemTraXe();
                        break;
                    case 6:
                        System.out.println("Thoát chương trình");
                        return;
                    default:
                        System.out.println("Chọn lại");
                }
            }

        }

}







