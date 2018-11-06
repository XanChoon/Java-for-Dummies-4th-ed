class IfSample{
    public static void main (String [] args){
    int a,b;
    a = 10;
    b = 20;
    
    System.out.println("Your A number is " + a);
    System.out.println("Your B number is " + b);
    
    if (a < b){
        System.out.println("B is bigger than A");
    }
    
    a = a * 2;
    if (a == b){
        System.out.println("B is equal to A");
    }
    
    b = b/4;
    if(b < a){
        System.out.println("B is less than A");
    }
    }
}