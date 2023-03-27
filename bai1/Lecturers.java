package bai1;

public class Lecturers {
    private String mgv;
    private String tenGv;
    private String monDay;
    private String lopCN;
    public Lecturers(){

    }

    public Lecturers(String mgv, String tenGv, String monDay, String lopCN) {
        this.mgv = mgv;
        this.tenGv = tenGv;
        this.monDay = monDay;
        this.lopCN = lopCN;
    }

    public String getMgv() {
        return mgv;
    }

    public void setMgv(String mgv) {
        this.mgv = mgv;
    }

    public String getTenGv() {
        return tenGv;
    }

    public void setTenGv(String tenGv) {
        this.tenGv = tenGv;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getLopCN() {
        return lopCN;
    }

    public void setLopCN(String lopCN) {
        this.lopCN = lopCN;
    }

    @Override
    public String toString() {
        return "Lecturers{" +
                "mgv='" + mgv + '\'' +
                ", tenGv='" + tenGv + '\'' +
                ", monDay='" + monDay + '\'' +
                ", lopCN='" + lopCN + '\'' +
                '}';
    }
}
