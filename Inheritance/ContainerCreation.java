import java.util.ArrayList;
import java.util.List;

class ListContainer<X> {
    List<X> list;

    ListContainer() {
        list = new ArrayList<>();
    }

    void add(X element) {
        list.add(element);
    }
    // boolean delete(int index){
    // return list.remove(index);
    // }
}

public class ContainerCreation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.remove(33);
        list.forEach(null);
    }
}
