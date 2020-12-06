import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericListManipulationTest<T> {

    @Test
    public void filterNumbersFromList(){

        List<Integer> numbersList = new ArrayList<Integer>();
        List<String> stringList = new ArrayList<String>();

        numbersList.add(1);
        numbersList.add(3);
        numbersList.add(67);

        stringList.add("1");
        stringList.add("62");
        stringList.add("Foo");
        stringList.add("3");

        List<T> genericList = new ArrayList<T>();
        genericList.add((T) numbersList);
        genericList.add((T) stringList);


        GenericListManipulator genericListManipulator = new GenericListManipulator();
        List numbersFilteredList = genericListManipulator.iterate(genericList);
        System.out.print(numbersFilteredList);

        Assert.assertEquals(numbersFilteredList.size(), 3);

        for (Object item:
             numbersFilteredList) {
            Assert.assertNotNull(item);
            Assert.assertTrue(item instanceof Integer);
        }

    }
}
