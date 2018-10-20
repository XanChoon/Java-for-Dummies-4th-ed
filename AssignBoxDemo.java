class Box{
    double width;
    double height;
    double depth;
}

class AssignBoxDemo{
    public static void main (String [] args){
        Box mybox = new Box();
        Box mybox1 = mybox;
        double total;
        
        mybox.width = 10.5;
        mybox.height = 10.5;
        mybox.depth = 10.5;
        
        mybox1.width = 10;
        mybox1.height = 10;
        mybox1.depth = 10;
        
        total = mybox.width + mybox.height + mybox.depth;
        System.out.println (" The box total is " + total);   
        
       total = mybox1.width + mybox1.height + mybox1.depth;
        System.out.println (" The box total is " + total);   
    }
}