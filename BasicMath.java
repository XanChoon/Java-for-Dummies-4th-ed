class BasicMath{
    public static void main (String [] args){
        int a = 1 + 1;
        int b = a * 3;
        int c = b / b;
        int d = c - a;
        int e = c;
        
        System.out.println("This is a integer math results");
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        System.out.println("d " + d);
        System.out.println("e " + e);
        
        double da = 1 + 1;
        double db = 2 * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = da - dc;
        
        System.out.println("\nThis is a double math results");
        System.out.println("da " + da);
        System.out.println("db " + db);
        System.out.println("dc " + dc);
        System.out.println("dd " + dd);
        System.out.println("de " + de);
    }
}