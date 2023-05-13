package Soal_4;

public class Fisika {
    private double massa;
    private double percepatan;

    // Ini untuk menghitung rumus Fisika yaitu Hukum Newton
    public Fisika(double massa, double percepatan) {
        if (massa < 0) {
            System.out.println("Invalid input for mass. Mass cannot be less than 0.");
            this.massa = 0;
        } else {
            this.massa = massa;
        }
        if (percepatan < 0) {
            System.out.println("Invalid input for acceleration. Acceleration cannot be less than 0.");
            this.percepatan = 0;
        } else {
            this.percepatan = percepatan;
        }
    }

    public double hitungResult() {
        return massa * percepatan;
    }
}