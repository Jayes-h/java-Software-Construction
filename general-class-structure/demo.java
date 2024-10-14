//class Box{
//    double width;
//    double height;
//    double depth;
//}
//
//class demo{
//    public static void main(String ar[]){
//
//        Box mybox = new Box();
//        double volume;
//
//        mybox.width= 10;
//        mybox.height= 20;
//        mybox.depth= 15;
//
//        volume = mybox.width*mybox.height*mybox.depth;
//        System.out.println("volume is " +volume);
//    }
//}
//

//class Box{
//    double width;
//    double height;
//    double depth;
//}
//
//class demo{
//    public static void main(String ar[]){
//
//        Box mybox1 = new Box();
//        Box mybox2 = new Box();
//        double volume1;
//        double volume2;
//
//        mybox1.width= 10;
//        mybox1.height= 20;
//        mybox1.depth= 15;
//
//        mybox2.width= 3;
//        mybox2.height= 6;
//        mybox2.depth= 9;
//
//        volume1 = mybox1.width*mybox1.height*mybox1.depth;
//        volume2 = mybox2.width*mybox2.height*mybox2.depth;
//        System.out.println("volume is " +volume1);
//        System.out.println("volume is " +volume2);
//    }
//}


//class Box{
//    double width;
//    double height;
//    double depth;
//
//    void volume(){
//        System.out.println("volume is ");
//        System.out.println(width*height*depth);
//    }
//}
//
//class demo{
//    public static void main(String ar[]){
//
//        Box mybox1 = new Box();
//        Box mybox2 = new Box();
//        double volume1;
//        double volume2;
//
//        mybox1.width= 10;
//        mybox1.height= 20;
//        mybox1.depth= 15;
//
//        mybox2.width= 3;
//        mybox2.height= 6;
//        mybox2.depth= 9;
//
//       mybox1.volume();
//       mybox2.volume();
//    }
//}

//
//class Box{
//    double width;
//    double height;
//    double depth;
//
//    double volume(){
//        return width*height*depth;
//    }
//}
//
//class demo{
//    public static void main(String ar[]){
//
//        Box mybox1 = new Box();
//        Box mybox2 = new Box();
//        double volume;
//
//        mybox1.width= 10;
//        mybox1.height= 20;
//        mybox1.depth= 15;
//
//        mybox2.width= 3;
//        mybox2.height= 6;
//        mybox2.depth= 9;
//
//        volume = mybox1.volume();
//        System.out.println("volume is " +volume);
//        volume = mybox2.volume();
//        System.out.println("volume is " +volume);
//    }
//}


class Box {
    double width;
    double height;
    double depth;
    //
    double volume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class demo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        vol = mybox1.volume();
        System.out.println("volume is  "+ vol);
        vol = mybox2.volume();
        System.out.println("volume is  "+ vol);
    }
}