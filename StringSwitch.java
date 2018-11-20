class StringSwitch{
    public static void main (String [] args){
        String input = "two";
        
        switch(input) {
            case "one":
            System.out.println("one");
            break;
            case "two":
            System.out.println("two");
            break;
            case "three":
            System.out.println("three");
            break;
            default:
            System.out.println("no match");
            break;
        }
    }
}