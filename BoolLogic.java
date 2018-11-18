class BoolLogic{
    public static void main (String [] args){
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = !a;
        boolean g = !b;
        
        System.out.println("This is a | b " + c);
        System.out.println("This is a & b " + d);
        System.out.println("This is !a " + f);
        System.out.println("This is !b " + g);
        
    }
}