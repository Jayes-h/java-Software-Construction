//class A{
//    A() {
//        System.out.println("Inside A's constructor.");
//    }
//}
//class B extends A{
//    B() {
//        System.out.println("Inside B's constructor.");
//    }
//}
//class C extends B{
//    C() {
//        System.out.println("Inside C's constructor.");
//    }
//}
//class demo {
//    public static void main(String arg[]) {
//        C c = new C();
//    }
//}


//class A{
//    int i,j;
//    A(int a, int b) {
//        i = a;
//        j = b;
//    }
//    void show() {
//        System.out.println("i and j:  "+i + " " +j);
//    }
//}
//class B extends A{
//    int k;
//    B(int a, int b, int c) {
//        super(a,b);
//        k = c;
//    }
//        void show() {
//            System.out.println("k:  "+ k);
//        }
//    }
//    class demo {
//        public static void main(String arg[]) {
//            A subOb = new B(1, 2, 3);
//            subOb.show(); // B show()
//        }
//    }

class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    double area() {
        System.out.println(" Area for Figure is undefined.");
        return 0;
    }
}
class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a,b);
    }
    double area() {
        System.out.println(" Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

class demo {
    public static void main (String arg[] ) {
        Figure f = new Figure(10,0);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;
        figref = r; //Rectangle area()
        System.out.println("Area is "+ figref.area() );
        figref = t; //Triangle area()
        System.out.println("Area is "+ figref.area() );
        figref = f; //Figure area()
        System.out.println("Area is "+ figref.area() );
    }
}