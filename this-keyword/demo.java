class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}
class demo {
    public static void main(String args[]) {
        Box mybox1 = new Box(10,10,10);
        Box mybox2 = new Box(10,10,20);
        double vol;

        vol = mybox1.volume();
        System.out.println("volume is  "+ vol);
        vol = mybox2.volume();
        System.out.println("volume is  "+ vol);
    }
}