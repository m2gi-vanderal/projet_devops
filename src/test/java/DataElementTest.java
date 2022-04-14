import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DataElementTest {
    @Test
    public void shouldCreateDataElementInteger() {
        ArrayList<Integer> arrayTest = generateIntegerArrayTest();
        DataElement<Integer> dataElementTest = new DataElement<>("IntegerTest", arrayTest);
        assertNotNull("DataElement not null Integer", dataElementTest);
        assertEquals(dataElementTest.getElements(), arrayTest);
    }


    private ArrayList<Integer> generateIntegerArrayTest() {
        ArrayList<Integer> arrayTest = new ArrayList<>();
        arrayTest.add(1);
        arrayTest.add(199);
        arrayTest.add(23);
        return arrayTest;
    }
}