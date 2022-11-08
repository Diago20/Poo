package Fecha;

public class Fecha {

    int day;
    String month;

    public Fecha(int _day) {

        this.day = _day;
    }

    public Fecha(String month) {
        this.month = month;
    }

    public void result() {
        System.out.print("La fecha es: " + day + "/");
    }

    public void Result() {
        System.out.print(month + "/");
    }

    public void result(int year) {
        System.out.println(year);
    }
}
