package bai1;

public class Student {
    private String msv;
    private String tenSv;
    private String lopHoc;
    public Student(){

    }

    public Student(String msv, String tenSv, String lopHoc) {
        this.msv = msv;
        this.tenSv = tenSv;
        this.lopHoc = lopHoc;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "msv='" + msv + '\'' +
                ", tenSv='" + tenSv + '\'' +
                ", lopHoc='" + lopHoc + '\'' +
                '}';
    }
}
