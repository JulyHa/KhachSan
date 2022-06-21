package KhachSan;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachSan {
        static Room A = new Room("A", 500);
        static Room B = new Room("B", 300);
        static Room C = new Room("C", 100);

        static ArrayList<QuanLyPhong> quanly = new ArrayList<>();

        public static boolean checkCardID(String cmt){
                for (QuanLyPhong q: quanly ) {
                        if(q.getPerson().getCardID().equals(cmt)){
                                return false;
                        }
                }
                return true;
        }
        public static Person createPerson(Scanner scanner){
                System.out.println("Nhập tên người thuê: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi: ");
                int age = scanner.nextInt();
                System.out.println("Nhập số CMT: ");
                scanner.nextLine();
                String cmt = scanner.nextLine();
                while (true){
                        boolean check = checkCardID(cmt);
                        if(!check){
                                System.out.println("CMT đã tồn tại! Yêu cầu nhập lại");
                                cmt = scanner.nextLine();
                        }
                        else {
                                break;
                        }
                }

                Person person = new Person(name, age, cmt);
                return person;
        }

        public static void thuePhong(Scanner scanner){
                Person person = createPerson(scanner);
                System.out.println("Nhập số ngày thuê: ");
                int soNgayThue = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập tên phòng(A/ B,/ C): ");
                String room = scanner.nextLine();
                QuanLyPhong quanLyPhong;
                if(room.equals("A")){
                        quanLyPhong = new QuanLyPhong(soNgayThue, A, person );
                }
                else if(room.equals("B")){
                        quanLyPhong = new QuanLyPhong(soNgayThue, B, person);
                }
                else {
                        quanLyPhong = new QuanLyPhong(soNgayThue, C, person);
                }
                quanly.add(quanLyPhong);
        }
        public static void hienThi(){
                for (QuanLyPhong q: quanly) {
                        System.out.println(q);
                }

        }

        public static void xoaNguoiThue(Scanner scanner){

                System.out.println("Nhập cmt của người thuê phòng: ");
                String cmt = scanner.nextLine();
                if(!checkCardID(cmt)){
                        System.out.println("Xóa người này");
                }
                else {
                        System.out.println("Không tồn tại người có cmt là "+ cmt);
                }
        }
        public static void thanhToan(Scanner scanner){
                System.out.println("Nhap cmt cua nguoi can than toan ");
                String cmt = scanner.nextLine();
                if(!checkCardID(cmt)){
                        System.out.println("Thanh nguoi này");
                }
                else {
                        System.out.println("Khong  ton tai nguoi co cmt la "+ cmt);
                }
        }

}
