class nested{
    public static void main (String ar[]){
        int i=7;
        if(i<8){
            System.out.println("smaller than 8");
            if(i<6){
                System.out.println("smaller than 6");
            }else{
                System.out.println("greater than 6");
            }
        }else{
            System.out.println("grester than 8");
        }
    }
}