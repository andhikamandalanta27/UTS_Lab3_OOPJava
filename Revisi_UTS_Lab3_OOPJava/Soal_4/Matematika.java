package Soal_4;

public class Matematika {
    private double a;
    private double b;
    private double c;

    // Ini untuk menghitung rumus Matematika yaitu Persamaan Kuadrat
    public Matematika(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] hitungResult() {
        double d = b * b - 4 * a * c;
        if (a == 0) {
            return null;
        } else if (d < 0) {
            return null;
        } else if (d == 0) {
            double[] result = { -b / (2 * a) };
            return result;
        } else {
            double[] result = { (-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a) };
            return result;
        }
    }
}