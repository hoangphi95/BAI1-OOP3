package bai1.service;

import bai1.Student;

import java.util.ArrayList;

public class StudentService {
    Student student=new Student();
    ArrayList <Student> list1=new ArrayList<>();
    public void Create(Student student) {
        list1.add(student);

    }

    public ArrayList<Student> xem() {
        if (list1 != null) {
            Student sv = new Student("131", "hoàng", "10A3");
            Student sv1 = new Student("133", "Chiến", "10A6");
            Student sv2 = new Student("136", "Danh", "10A4");
            Student sv3 = new Student("138", "Hưng", "10A7");
            Student sv4 = new Student("139", "Minh", "10A8");
            Student sv5 = new Student("231", "Xuyên", "10A1");
            Student sv6 = new Student("254", "Nam", "10A2");
            list1.add(sv);
            list1.add(sv1);
            list1.add(sv2);
            list1.add(sv3);
            list1.add(sv4);
            list1.add(sv5);
            list1.add(sv6);



        }
        return list1;
    }

    public void update(Student student) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != null && list1.get(i).equals(student.getMsv())) {
                list1.add(student);

            }
        }
    }

    public void delele(Student student) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != null && list1.get(i).equals(student.getMsv())) {
                list1.remove(student);
            }
        }
    }

    public void timKiemTensv(String tk) {
        for (Student sv:list1){
            if (sv.getTenSv().indexOf(tk)>=0){
                System.out.println(sv);
            }


            
        }
            }

    public void timKiemMsv(String tk2) {
        for (Student sv1:list1){
            if (sv1.getMsv().indexOf(tk2)>=0){
                System.out.println(sv1);
            }



        }
    }

    }

