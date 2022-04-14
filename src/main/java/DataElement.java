import java.util.ArrayList;

public class DataElement<E> {
    private ArrayList<E> elements;
    private String dataLabel;

    public DataElement(String dataLabel, ArrayList<E> elements) {
        this.dataLabel = dataLabel;
        this.elements = elements;
    }
}
