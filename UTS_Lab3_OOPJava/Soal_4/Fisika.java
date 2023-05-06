package Soal_4;

public class Fisika {
    private double massa;
    private double percepatan;


//  Ini untuk menghitung rumus Fisika yiatu Hukum Newton
    public Fisika(double massa, double percepatan) {
        this.massa = massa;
        this.percepatan = percepatan;
    }

    public double hitungResult() {
        return massa * percepatan;
    }
}