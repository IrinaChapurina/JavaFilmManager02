
import com.sun.nio.sctp.Association;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test

    public void testFindLast() {
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

}
