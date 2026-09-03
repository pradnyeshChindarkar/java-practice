import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Something{
    boolean testing(String s);
}
public class LLProblem {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (t)-> t%2==0;
        System.out.println(isEven.test(34));

        Function<String,Integer> func = t -> t.length();
        System.out.println(func.apply("Abscois").getClass().getName());

        List<Object> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        names.forEach(t -> System.out.println(t));
        int arr = 2/0;
        System.out.println(arr);
    }
}
