package KhachSan;

import java.util.Scanner;

public class KhachSan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyKhachSan quanLyKhachSan = new QuanLyKhachSan();

        System.out.println("----------Menu---------");
        System.out.println("1. Thuê phòng");
        System.out.println("2. Xóa khách theo cmt");
        System.out.println("3. Thanh toán");
        System.out.println("4. Thoat");
        int choice = -1;
        while (choice != 4){
            System.out.printf("Mời nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    quanLyKhachSan.thuePhong(scanner);
                    quanLyKhachSan.hienThi();
                    break;
                case 2:
                    quanLyKhachSan.xoaNguoiThue(scanner);
                    break;
                case 3:
                    quanLyKhachSan.thanhToan(scanner);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Không hiểu yêu cầu!");
                    break;
            }
        }
    }
}
