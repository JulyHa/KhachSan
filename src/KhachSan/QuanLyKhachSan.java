package KhachSan;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachSan {
         Room A = new Room("A", 500);
         Room B = new Room("B", 300);
         Room C = new Room("C", 100);

        ArrayList<QuanLyPhong> quanly = new ArrayList<>();

        public int checkCardID(String cmt){
                for (int i = 0; i< quanly.size(); i++ ) {
                        if(quanly.get(i).getPerson().getCardID().equals(cmt)){
                                return i;
                        }
                }
                return -1;
        }
        public Person createPerson(Scanner scanner){
                System.out.println("Nhập tên người thuê: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi: ");
                int age = scanner.nextInt();
                System.out.println("Nhập số CMT: ");
                scanner.nextLine();
                String cmt = scanner.nextLine();
                while (true){
                        int check = checkCardID(cmt);
                        if(check != -1){
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

        public boolean thuePhong(Scanner scanner){
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
                return true;
        }
        public void hienThi(){
                for (QuanLyPhong q: quanly) {
                        System.out.println(q);
                }

        }

        public boolean xoaNguoiThue(Scanner scanner){

                System.out.println("Nhập cmt của người thuê phòng: ");
                String cmt = scanner.nextLine();
                int index = checkCardID(cmt);
                if(index == -1){
                         System.out.println("Không tồn tại người có cmt là "+ cmt);
                         return false;
                }
                else {
                       quanly.remove(index);
                }
                return true;
        }
        public void thanhToan(Scanner scanner){
                System.out.println("Nhap cmt cua nguoi can than toan ");
                String cmt = scanner.nextLine();
                int index = checkCardID(cmt);
                if(index == -1){
                          System.out.println("Khong  ton tai nguoi co cmt la "+ cmt);
                }
                else {
                      int soNgayThue =  quanly.get(index).getSoNgayThue();
                      int giaTien = quanly.get(index).getRoom().getPrice();
                      int money = soNgayThue * giaTien;
                      System.out.println("Tổng tiền là: " + money);
                }
        }

}
