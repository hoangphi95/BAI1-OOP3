package bai1;

import bai1.controller.Controller;
import bai1.controller.ControllerStuddent;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Controller ct=new Controller();
        ControllerStuddent cs=new ControllerStuddent();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("1: Vào quản lý giảng viên");
            System.out.println("2: để vào quản lý sinh viên");
            System.out.println("3: Để tìm kiếm cả sinh viên và giảng viên");
            int luaChon= sc.nextInt();
            if (luaChon==1) {
                System.out.println("1. Để xem danh sách giảng viên");
                System.out.println("2. Để thêm giảng viên ");
                System.out.println("3. Để sửa thôn tin giảng viên");
                System.out.println("4. Để xóa giảng viên ");
                System.out.println("5. Để tìm kiếm theo mã giảng viên ");
                System.out.println("6. Để tìm kiếm theo tên ");

                int chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        ct.xem();
                        break;
                    case 2:
                        ct.them();
                        break;
                    case 3:
                        ct.update();
                        break;
                    case 4:
                        ct.delete();
                        break;
                    case 5:
                        ct.searchMgv();
                        break;
                    case 6:
                        ct.searchTenGv();
                        break;

                }
            }else if (luaChon==2) {
                System.out.println("1. Để xem danh sách sinh viên");
                System.out.println("2. Để thêm sinh viên");
                System.out.println("3. Để sửa thông tin sinh viên");
                System.out.println("4. Để xóa sinh viên");
                System.out.println("5. Để tìm kiếm theo mã sinh viên ");
                System.out.println("6. Để tìm kiếm theo tên ");
                int chon = sc.nextInt();
                switch (chon) {
                    case 1:
                        cs.xem();
                        break;
                    case 2:
                        cs.them();
                        break;
                    case 3:
                        cs.update();
                        break;
                    case 4:
                        cs.delete();
                        break;
                    case 5:
                        cs.searchMsv();
                        break;
                    case 6:
                        cs.searchTensv();
                        break;
                }
            }

        }while(true);

    }

}
