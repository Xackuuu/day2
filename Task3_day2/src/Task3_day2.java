import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class ExceptionCatching {

    public static void catchMe() throws FileNotFoundException {
        if (true) throw new NullPointerException();
        if (true) throw new ArithmeticException();
        if (true) throw new FileNotFoundException();
        if (true) throw new URISyntaxException(); // буду честен я даже незнаю что сюда вписать
        //пытался ввести 2 строки как написанно в документации но в итоге метод
        //пытается перехватить исключение что противоречит заданию(
    }

    public static void main(String[] args) {
        try {
            catchMe();
        } catch (FileNotFoundException | NullPointerException e) {
            e.printStackTrace();
        }
    }

}