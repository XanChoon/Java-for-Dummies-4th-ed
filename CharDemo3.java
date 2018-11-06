class CharDemo3{
    public static void main (String [] args){
        char ch2 = 'z';
        int count = 1;
        for (char ch1 = 'a'; ch1 <= ch2; ch1++){
            System.out.println("This is " + count + " character ");
            System.out.println("This is character " + ch1);
            count = count + 1;
        }
    }
}