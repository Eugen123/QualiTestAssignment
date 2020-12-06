import org.testng.Assert;
import org.testng.annotations.Test;


public class StringManipulationTest {

    @Test
    public void reverseTest(){
        StringManipulator stringManipulator = new StringManipulator();

        Assert.assertEquals(stringManipulator.reverse("Automation"), "noitamotuA");
    }

    @Test
    public void frameTest(){
        StringManipulator stringManipulator = new StringManipulator();

        stringManipulator.printPhraseInFrame("Hello word in a frame");
    }

    @Test
    public void oneWordFrameTest(){
        StringManipulator stringManipulator = new StringManipulator();

        stringManipulator.printPhraseInFrame("Hello");
    }
}
