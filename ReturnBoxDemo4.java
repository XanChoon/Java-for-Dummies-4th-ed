class Box{
    double width;
    double weigth;
    double depth;
    
    double volume(){
        return width * weigth * depth;
    }
}

class ReturnBoxDemo4{
    public static void main (String args []){
        Box mybox1 = new Box ();
        Box mybox2 = new Box ();
        double vol;
        
        mybox1.width = 10;
        mybox1.weigth = 20;
        mybox1.depth = 30;
        
        mybox2.width = 3;
        mybox2.weigth = 6;
        mybox2.depth = 9;
        
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}