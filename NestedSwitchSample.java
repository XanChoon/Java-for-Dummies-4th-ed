class NestedSwitchSample{
    public static void main (String [] args){
        
        String input = "Vegetarian";
        //String input1 = "Tomato and Mozzarella";
        
        switch(input){
            case "Chicken":
            System.out.println("Chicken Sandwich");
            break;
            case "Beef":
            System.out.println("Beef Sandwich");
            break;
            case "Pork":
            System.out.println("Pork Sandwich");
            break;
            
            case "Vegetarian":
            System.out.println("What you want to filling");
            break;
                switch(input1){
                    case "Tomato and Mozzarella":
                    System.out.println("Tomato and Mozzarella Filling");
                    break;
                    case "EggPlant and Parmesan":
                    System.out.println("EggPlant and Parmesan Filling");
                    break;
                    default:
                    System.out.println("Choice was not any of the above");
                    }
        default:
        System.out.println("Choice was not Chicken, Beef, Pork, or Vegetarian");
        }
    }
}