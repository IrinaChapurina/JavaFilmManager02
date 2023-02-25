
import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test

    public void testFindLastLess() {
        String film1 = "Movie I";
        String film2 = "Movie II";
        String film3 = "Movie III";


        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {film3, film2, film1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        String film1 = "Movie I";
        String film2 = "Movie II";
        String film3 = "Movie III";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {film1, film2, film3};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLastEqual() {
        String film1 = "Movie I";
        String film2 = "Movie II";
        String film3 = "Movie III";
        String film4 = "Movie IV";
        String film5 = "Movie V";
        String film6 = "Movie VI";
        String film7 = "Movie VII";
        String film8 = "Movie VIII";
        String film9 = "Movie IX";
        String film10 = "Movie X";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLastMore() {
        String film1 = "Movie I";
        String film2 = "Movie II";
        String film3 = "Movie III";
        String film4 = "Movie IV";
        String film5 = "Movie V";
        String film6 = "Movie VI";
        String film7 = "Movie VII";
        String film8 = "Movie VIII";
        String film9 = "Movie IX";
        String film10 = "Movie X";
        String film11 = "Movie XI";


        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);


        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testFindLastMoreLimit10() {
        String film1 = "Movie I";
        String film2 = "Movie II";
        String film3 = "Movie III";
        String film4 = "Movie IV";
        String film5 = "Movie V";
        String film6 = "Movie VI";


        FilmManager manager = new FilmManager(10);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);


        String[] expected = {film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
