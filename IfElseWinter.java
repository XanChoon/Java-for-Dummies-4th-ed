class IfElseWinter{
    public static void main (String [] args){
        String a = "November";
        if (a == "December" || a == "January" || a == "Feburary"){
            System.out.print("This is " + a + "in the Winter ");
        }else if(a == "March" ||a ==  "April" ||a ==  "May"){
            System.out.print("This is " + a + " in the Spring ");  
        }else if(a == "June" ||a ==  "July" ||a ==  "Ogos"){
            System.out.print("This is " + a + " in the Summer");
        }else if(a == "September" ||a ==  "October" ||a ==  "November"){
            System.out.print("This is " + a + " in the Autumn");
        }else System.out.println ("This is Bogus Month "); 
    }
}    