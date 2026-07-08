import java.util.Scanner;

public class Temp_conv {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input -> ");
        float temp = input.nextFloat();

        float result = (temp*9/5)+32;

        System.out.println(result);
        input.close();
    }
}
