class Factorial { // Page. 230
    int fact ( int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n-1)*n;
        return result;
    }
}
class demo{
    public static void main(String ar[]){
        Factorial f = new Factorial();
         int factorial = f.fact(5);
        System.out.println("factorial " +factorial);
    }
}