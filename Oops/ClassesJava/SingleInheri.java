package Oops.ClassesJava;

class SingleInheri<T> {
    T data;
    int rollno;
    String name;
    float marks;

    SingleInheri() {
        name = "Pradnyesh";
        marks = 34.4f;
        rollno = 11;
    }

    SingleInheri(T data){
        this.data =  data;
    }

    SingleInheri(float marks,int roll) {
        this.marks = marks;
        this.rollno = roll;
    }
}
