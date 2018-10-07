/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10017049.latihan32.daftarfilm;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program yang memiliki 1 class tambahan
 * untuk memperlihatkan daftar pemutaran film
 */
public class Film {

    public String name;
    public String genre;
    public double rating;
    public int duration;

    public void nowPlaying(String parName, String parGenre, double parRating, 
            int parDuration) {
        System.out.println("Judul Film : " + parName);
        System.out.println("Genre Film : " + parGenre);
        System.out.println("Rating Film : " + parRating);
        System.out.println("Duration Film : " + parDuration + " Menit");
        System.out.println("");

    }

}
