package Course;

public class ComplexOpr {
    static class ComplexNum {
        float real;
        float imag;

        ComplexNum(float r, float i) {
            real = r;
            imag = i;
        }

        void display() {
            if (imag > 0) {
                System.out.println(real + " + " + imag + "i");
            } else {
                System.out.println(real + " - " + (-imag) + "i");
            }
        }
    }

    static ComplexNum multiply(ComplexNum c1, ComplexNum c2) {
        
        float num1 = (c1.real * c2.real) - (c1.imag * c2.imag);
        float num2 = (c1.real * c2.imag) + (c2.real * c1.imag);
        ComplexNum newNum = new ComplexNum(num1, num2);
        return newNum;
    }

    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(2, 3);
        ComplexNum num2 = new ComplexNum(4, 5);
        ComplexNum res = multiply(num1, num2);
        res.display();
    }
}
