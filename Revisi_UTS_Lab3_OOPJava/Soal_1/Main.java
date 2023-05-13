package Soal_1;


//-------------------------------------------PENGERTIAN----------------------------------------//

//         ~ Class yaitu blueprint atau cetakan untuk membuat object.

//         ~ Object adalah sebuah instance atau wujud nyata dari sebuah
//           class yang bisa lebih dari satu dan dengan property yang bisa berbeda-beda.

//         ~ Constructor adalah sebuah method khusus yang digunakan untuk menginisialisasi
//           sebuah object ketika object tersebut pertama kali dibuat. Constructor ini biasanya
//           memiliki nama yang sama dengan nama class dan tidak memiliki nilai kembalian.

//         ~ Method overloading yaitu memungkinkan sebuah class untuk memiliki beberapa method
//           dengan nama yang sama namun dengan parameter yang berbeda.

//         ~ Method setter dan getter adalah method khusus dalam class yang digunakan untuk
//           mengatur (setter) dan mendapatkan (getter) nilai dari atribut dalam object.
//           Setter digunakan untuk mengubah nilai dari atribut sedangkan getter digunakan
//           untuk mendapatkan nilai dari atribut. Setter dan getter sering digunakan untuk
//           menjaga keamanan dan kekonsistenan dari data dalam object.

//----------------------------------------------------------------------------------------------//
//----------------------------------------------------------------------------------------------//

import Soal_1.Drakor;

public class Main {
    public static void main(String[] args) {
//      contoh object
        Drakor drakor1 = new Drakor();

        drakor1.setTitle("Crash Landing on You");
        drakor1.setEpisode(16);
        drakor1.setMainActor("Hyun Bin");

        System.out.println("Title: " + drakor1.getTitle());
        System.out.println("Episode: " + drakor1.getEpisode());
        System.out.println("Main Actor: " + drakor1.getMainActor());


        drakor1.watch();
        System.out.println();
        Drakor drakor2 = new Drakor("Itaewon Class", 16, "Park Seo Joon");

        System.out.println("Title: " + drakor2.getTitle());
        System.out.println("Episode: " + drakor2.getEpisode());
        System.out.println("Main Actor: " + drakor2.getMainActor());

        drakor2.watch(8);
    }
}
