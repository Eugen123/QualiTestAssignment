import java.util.ArrayList;
import java.util.List;

public class GenericListManipulator<T> {

    public List iterate(List<List<T>> genericList){

        List<Integer> numbersList = new ArrayList<Integer>();

        for (List<T> sublist:
             genericList) {
            for (T item:
                 sublist) {
                if (item instanceof Integer){
                    numbersList.add((Integer) item);
                }
            }

        }

        return numbersList;
    }
}
