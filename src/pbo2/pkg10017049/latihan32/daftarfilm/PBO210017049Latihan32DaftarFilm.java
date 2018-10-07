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
public class PBO210017049Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film film1 = new Film();

        film1.name = "Venom";
        film1.genre = "Action, Horror, Scifi";
        film1.rating = 8.5;
        film1.duration = 120;
        film1.nowPlaying(film1.name, film1.genre, film1.rating, film1.duration);

        Film film2 = new Film();

        film2.name = "Small Foot";
        film2.genre = "Animation";
        film2.rating = 9.0;
        film2.duration = 96;
        film2.nowPlaying(film2.name, film2.genre, film2.rating, film2.duration);

        Film film3 = new Film();

        film3.name = "Crazy Rich Asian";
        film3.genre = "Comedy";
        film3.rating = 7.8;
        film3.duration = 119;
        film3.nowPlaying(film3.name, film3.genre, film3.rating, film3.duration);

        Film film4 = new Film();

        film4.name = "Asih";
        film4.genre = "Horror";
        film4.rating = 6.0;
        film4.duration = 100;
        film4.nowPlaying(film4.name, film4.genre, film4.rating, film4.duration);
    }

}
