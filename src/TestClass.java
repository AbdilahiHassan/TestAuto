import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void TestToEng() {
        //Arrange


        LogicClass Convert = new LogicClass();
        String actual = Convert.toEnglish("*");
        assertEquals("E",actual);
    }
    @Test
    public void TestToMorshe() {
        //Arrange


        LogicClass Convert = new LogicClass();
        String actual = Convert.toMorshe("T");
        assertEquals("-",actual);
    }


    @Test
    public void tesToeNG() {
        //Arrange


        LogicClass Convert = new LogicClass();
        String actual = Convert.tesToeNG("I");
        assertEquals("**",actual);
    }
    @Test
    public void tesToMoshe() {
        //Arrange


        LogicClass Convert = new LogicClass();
        String actual = Convert.tesToMoshe("-*");
        assertEquals("N",actual);
    }


}