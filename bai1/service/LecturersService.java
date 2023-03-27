package bai1.service;

import bai1.Lecturers;

import java.util.ArrayList;

public class LecturersService {
    Lecturers lecturers = new Lecturers();
    private static ArrayList<Lecturers> list = new ArrayList<>();

    public void Create(Lecturers lecturers) {
        list.add(lecturers);

    }

    public ArrayList<Lecturers> xem() {
        if (list != null) {
            Lecturers lt = new Lecturers("12", "Lan", "Văn", "10A3");
            Lecturers lt2 = new Lecturers("13", "Phượng", "Toán", "10A4");
            Lecturers lt3 = new Lecturers("15", "Ngọc", "Anh", "10A5");
            Lecturers lt4 = new Lecturers("18", "Nam", "ly", "10A8");
            Lecturers lt5 = new Lecturers("20", "thiếp", "địa", "10A11");
            list.add(lt);
            list.add(lt2);
            list.add(lt3);
            list.add(lt4);
            list.add(lt5);
        }
        return list;
    }

    public void update(Lecturers lecturers) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).equals(lecturers.getMgv())) {
                list.add(lecturers);

            }
        }
    }

    public void delele(Lecturers lecturers) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).equals(lecturers.getMgv())) {
                list.remove(lecturers);
            }
        }
    }
    public void timKhiemMgv(String tk2){
        for (Lecturers lt2:list){
            if (lt2.getMgv().indexOf(tk2)>=0){
                System.out.println(lt2);
            }
        }

    }
    public void timKiemTenGV(String tk){
        for (Lecturers lt1:list){
            if (lt1.getTenGv().indexOf(tk)>=0){
                System.out.println(lt1);
            }
        }

    }
}