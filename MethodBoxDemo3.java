class Box{
    double width;
    double weight;
    double depth;
    
    void volume(){
        System.out.print("Volume is ");
        System.out.println(width * weight * depth);        
    }
}

class MethodBoxDemo3{
    public static void main(String args []){
        
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        mybox1.width = 10;
        mybox1.weight = 20;
        mybox1.depth = 30;
        
        mybox2.width = 1;
        mybox2.weight = 2;
        mybox2.depth = 3;
        
        mybox1.volume();
        
        mybox2.volume();
    }    
}