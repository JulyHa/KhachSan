package KhachSan;

import java.util.Scanner;

public class KhachSan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyKhachSan quanLyKhachSan = new QuanLyKhachSan();


        int choice = -1;
        boolean res;
        while (choice != 5){
            System.out.println("----------Menu---------");
            System.out.println("1. Thuê phòng");
            System.out.println("2. Xóa khách theo cmt");
            System.out.println("3. Thanh toán");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Thoát");
            System.out.print("Mời nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    res = quanLyKhachSan.thuePhong(scanner);
                    if(res){
                        System.out.println("Thêm thành công!");
                    }
                    break;
                case 2:
                    res = quanLyKhachSan.xoaNguoiThue(scanner);
                    if(res){
                        System.out.println("Xóa thành công!");
                    }
                    break;
                case 3:
                    quanLyKhachSan.thanhToan(scanner);
                    break;
                case 4:
                    quanLyKhachSan.hienThi();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Không hiểu yêu cầu!");
                    break;
            }
        }
    }
}
