class AverageExample1{
    public static void main (String [] args){
        double height [] = {161, 162, 163};
        double result = 0;
        int i;
        
        for(i=0; i<3; i++){
            result = result + height[i];
            //System.out.println("Average Height is " + height[i]);//Print all array 
        }
            System.out.println("Average Height is " + result/3);
    }
}