//class Test {
//    void meth(int I, int j) {
//        I *= 2;
//        j /= 2;
//    }
//}
//    class demo {
//        public static void main (String args[]) {
//            Test ob = new Test();
//            int a = 15, b = 20;
//            System.out.println("a and b before call: " + a + " " + b);
//            ob.meth(a, b);
//            System.out.println("a and b after call: " + a + " " + b);
//        }
//    }


class StaticDemo {
    static int a = 42;
    static int b = 99;
    static void callme() {
        System.out.println("a = " + a);
    }
}
class demo {
    public static void main(String args[]) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}
