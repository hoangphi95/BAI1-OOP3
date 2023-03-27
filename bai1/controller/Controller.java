package bai1.controller;

import bai1.Lecturers;
import bai1.service.LecturersService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc=new Scanner(System.in);
    Lecturers lecturers=new Lecturers();
    LecturersService ls=new LecturersService();
    public void xem(){
        ArrayList<Lecturers> list=ls.xem();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void them(){
        System.out.println("nhập vào mã giáo viên");
        lecturers.setMgv(sc.nextLine());
        System.out.println("Nhập tên giáo viên");
        lecturers.setTenGv(sc.nextLine());
        System.out.println("Nhập vào môn Dạy");
        lecturers.setMonDay(sc.nextLine());
        System.out.println("Nhập lớp chủ nhiệm");
        lecturers.setLopCN(sc.nextLine());
        ls.Create(lecturers);
        System.out.println("Nhập thành công");
    }
    public void update(){

        System.out.println("nhập vào mã giáo viên");
        lecturers.setMgv(sc.nextLine());
        ls.update(lecturers);
        System.out.println("Nhập tên giáo viên");
        lecturers.setTenGv(sc.nextLine());
        System.out.println("Nhập vào môn Dạy");
        lecturers.setMonDay(sc.nextLine());
        System.out.println("Nhập lớp chủ nhiệm");
        lecturers.setLopCN(sc.nextLine());
        ls.Create(lecturers);
        System.out.println("Sử thành công");
    }
    public void delete(){
        System.out.println("nhập vào mã giáo viên");
        lecturers.setMgv(sc.nextLine());
        ls.delele(lecturers);

    }
    public void searchMgv(){
        System.out.println("nhập vào mã giáo viên");
        String tk=sc.nextLine();
        ls.timKhiemMgv(tk);
    }
    public void searchTenGv(){
        System.out.println("nhập vào mã giáo viên");
        String tk2=sc.nextLine();
        ls.timKiemTenGV(tk2);
    }



    }

