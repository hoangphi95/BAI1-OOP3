package bai1.controller;

import bai1.Student;
import bai1.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerStuddent {
    Scanner sc=new Scanner(System.in);
    StudentService studentService=new StudentService();
    Student sv=new Student();

    public void xem(){
        ArrayList<Student>listSv=studentService.xem();
        for (int i=0;i<listSv.size();i++){
            System.out.println(listSv.get(i));
        }
    }
    public void update(){
        System.out.println("Nhập vào mã sinh viên");
        sv.setMsv(sc.nextLine());
        studentService.update(sv);
        System.out.println("Nhập vào tên sinh viên");
        sv.setTenSv(sc.nextLine());
        System.out.println("Nhập vào lớp học");
        sv.setLopHoc(sc.nextLine());
    }
    public void them(){
        System.out.println("Nhập vào mã sinh viên");
        sv.setMsv(sc.nextLine());
        System.out.println("Nhập vào tên sinh viên");
        sv.setTenSv(sc.nextLine());
        System.out.println("Nhập vào lớp học");
        sv.setLopHoc(sc.nextLine());
        studentService.Create(sv);
        System.out.println("Nhập thành công");
    }
    public void delete(){
        System.out.println("nhập vào mã sinh viên");
        sv.setMsv(sc.nextLine());
        studentService.delele(sv);

    }
    public void searchMsv(){
        System.out.println("nhập vào mã sinh viên");
        String tk=sc.nextLine();
        studentService.timKiemMsv(tk);
    }
    public void searchTensv() {
        System.out.println("nhập vào tên sinh viên");
        String tk1=sc.nextLine();
        studentService.timKiemTensv(tk1);
    }
}
