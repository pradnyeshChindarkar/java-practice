import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

abstract class AbsClass{
    public void metho(){
        System.out.println("ass");
    }
}

class InnerContainerJava extends AbsClass {
}
public class ContainerJava {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        Set setObj = new HashSet<>();
        int b = 35;
        list.add(b);
        InnerContainerJava linn = new InnerContainerJava();
        linn.metho();
    }
}
