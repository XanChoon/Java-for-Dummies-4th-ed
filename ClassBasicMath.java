class IntegerBasicMath{
    int a,b,c;
}

class DoubleBasicMath{
    double d,e,f;
}

class ClassBasicMath{
    public static void main (String args []){
        IntegerBasicMath number = new IntegerBasicMath();
        DoubleBasicMath number1 = new DoubleBasicMath();
        int total;
        double total1;
        
        number.a = 10;
        number.b = 20;
        number.c = 30;
        total = number.a + number.b + number.c;
        System.out.println("Total is " + total );
        
        number1.d = 10;
        number1.e = 20;
        number1.f = 30;
        total1 = number1.d + number1.e + number1.f;
        System.out.println("Total is " + total1 );
    }
}