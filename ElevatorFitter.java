import static java.lang.System.out;

class ElevatorFitter{
    public static void main(String args[]) {
        
        int weightOfAPerson;
        int elevatorWeightLimit;
        int numberOfPeople;
        
        weightOfAPerson = 150;
        elevatorWeightLimit = 1400;
        numberOfPeople = elevatorWeightLimit / weightOfAPerson;
        out.print("You can fit ");
        out.print(numberOfPeople);
        out.println(" people on the elevator. ");
    }
}