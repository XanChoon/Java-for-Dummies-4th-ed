class SandwichOrder{
    public static void main (String [] args){
        
        String input = "Vegetarian";
        String input1 = "Tomato and Mozzarella"; 
        //Tomato and Mozzarella filling,Eggplant and Parmesan filling,Cucumber and Swiss Cheese filling
        
        if (input == "Chicken"){
            System.out.println("Chicken Sandwich");
        }else if(input == "Beef"){
            System.out.println("Beef Sandwich");
        }else if(input == "Pork"){
            System.out.println("Pork Burger");
        }else if(input == "Vegetarian"){
            System.out.println("You choice Vegetarian Burger");
            System.out.println("What kind of filling would you like?");
                switch (input1){
                    case "Tomato and Mozzarella":
                    System.out.println("Tomato and Mozzarella filling");
                    break;
                    case "Eggplant and Parmesan":
                    System.out.println("Eggplant and Parmesan filling");
                    break;
                    case "Cucumber and Swiss Cheese":
                    System.out.println("Cucumber and Swiss Cheese filling");
                    break;
                    default:
                    System.out.println("Choice was not any of the above.");
                }    
        }else{
            System.out.println("Choice was not Chicken, Beef, Pork, or Vegetarian");
        }     
    }
}
