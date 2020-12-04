import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StringManipulationTest {

    @Test
    public void reverseTest(){
        StringManipulator stringManipulator = new StringManipulator();

        Assert.assertEquals(stringManipulator.reverse("Automation"), "noitamotuA");
    }

    @Test
    public void frameTest(){
        StringManipulator stringManipulator = new StringManipulator();

        stringManipulator.printPhraseInPhrame("Hello word in a frame");
    }

    @Test
    public void listTest(){
        ListManipulator listManipulator = new ListManipulator();

        List<String> inputList = new ArrayList<String>();

        inputList.add("Entry One.mp4");
        inputList.add("Entry Two.wav");
        inputList.add("Entry Three.jpg");
        inputList.add("Entry Four.mng");
        inputList.add("Entry Five.png");
        inputList.add("Entry Six.csv");

        Map<String, String> result = listManipulator.filterFileTypes(inputList);

        System.out.print(result);

        Assert.assertEquals(result.get("Video").trim(), "Entry One.mp4");
        Assert.assertEquals(result.get("Audio").trim(), "Entry Two.wav");
        Assert.assertTrue(result.get("Other").trim().contains("Entry Three.jpg"));
        Assert.assertTrue(result.get("Other").trim().contains("Entry Four.mng"));
        Assert.assertTrue(result.get("Other").trim().contains("Entry Five.png"));
        Assert.assertTrue(result.get("Other").trim().contains("Entry Six.csv"));

    }
}
