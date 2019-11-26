import org.testng.annotations.Test;

public class MethodInvocationHelper {

    @Test
    public void testMovie() {
        Movie movie = new Movie("Inception", "Nolan", 4.5f);

        movie.release();
        if(movie.isReleased()){
            movie.watch();
        }
    }
}
