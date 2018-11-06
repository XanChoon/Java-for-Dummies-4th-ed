class ArrayAverage{
    public static void main (String [] args){
        double nums[] = {11.1, 22.2, 33.3};
        double result = 0;
        int i;
        
        for(i=0; i<3; i++){
            result = result + nums[i];
        }
        System.out.println("This is array average result " + result/3);
        
    }
}