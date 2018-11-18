import java.util.Scanner;

    class Test5{
        public static void main (String [] args){
            
            Scanner input = new Scanner (System.in);
            System.out.println("Please input your multiple ");
            int num1 = input.nextInt();
            
            for(int a = 0; a<=10; a++){
                System.out.println("This is " + (num1 * (a+1)));
            }
        } 
    }