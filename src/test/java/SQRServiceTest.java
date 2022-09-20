import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.untitled4.cervice.SQRService;


public class SQRServiceTest {


    @Test
    public void ShoulA() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calc(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShoulB() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.calc(100, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShoulC() {
        SQRService service = new SQRService();
        int expected = 11;
        int actual = service.calc(100, 400);
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void ShoulD() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.calc(200, 400);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShoulE() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calc(100, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShoulF() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calc(0, 50);
        Assertions.assertEquals(expected, actual);
    }
}


