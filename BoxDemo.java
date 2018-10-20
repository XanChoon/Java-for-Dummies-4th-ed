class Box{
    double width;
    double height;
    double depth;
}

class BoxDemo{
    public static void main (String [] args){
        Box mybox = new Box();
        double total;
        
        mybox.width = 10.5;
        mybox.height = 10.5;
        mybox.depth = 10.5;
        
        total = mybox.width + mybox.height + mybox.depth;
        
    System.out.println (" The box total is " + total);   
    }
}