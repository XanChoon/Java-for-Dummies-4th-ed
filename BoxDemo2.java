class Box{
    double width;
    double height;
    double depth;
}

class BoxDemo2{
    public static void main (String args []){
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double total;
        
        mybox1.width = 1;
        mybox1.height = 2;
        mybox1.depth = 3;
        
        mybox2.width = 10;
        mybox2.height = 20;
        mybox2.depth = 30;
        
        
        total = mybox1.width + mybox1.height + mybox1.depth;
        System.out.println (" This is box 1 total " + total);
        
        total = mybox2.width + mybox2.height + mybox2.depth;
        System.out.println (" This is box 2 total " + total);
    }
}