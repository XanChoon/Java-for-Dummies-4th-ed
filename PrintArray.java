class PrintArray{
    public static void main (String [] args){
        int allnumber [] = {10, 20, 30, 40, 50};
        int result = 0;
        int i;
        
        for(i=0; i<5; i++){
            result = result + allnumber[i];
            System.out.println("This is your number " + allnumber[i]);
        }
    }
}