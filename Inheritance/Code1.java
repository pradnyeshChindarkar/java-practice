// class A {
//     int num = 1;

//     public void getNum() {
//         System.out.println(num);
//     }
// }

// class C {
//     int num = 1;

//     public void getNum() {
//         System.out.println(num);
//     }
// }

interface A {
    int num = 1;
    public void getNum();
}

interface C {
    final int a = 10;
    public void getNum(int num);
}

class B implements A,C{
    public void add() {
        System.out.println();
    }

    @Override
    public void getNum() {
        System.out.println(num);
    }

    @Override
    public void getNum(int num) {
        System.out.println(a+num);
    }
}

public class Code1 {
    public static void main(String[] args) {
        B bb = new B();
        bb.getNum(90);
        bb.getNum();
    }
}
