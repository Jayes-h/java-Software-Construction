//class demo{
//    public static void main (String ar[]){
//        for(int i=0; i<9; i++){
//            for(int j=0; j<9; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//BREAK STATEMENTS IN LOOP
class demo{
    public static void main (String ar[]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(i==5)break;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}