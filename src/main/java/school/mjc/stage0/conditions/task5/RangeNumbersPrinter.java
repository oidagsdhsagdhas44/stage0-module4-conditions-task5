package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
//    Create that will be printing if number is between 1 and 5("number is between 1 and 5"), 6 and 10("number is between 6 and 10") or "out of range"
//    using switch statement. Number to be defined will be passed to method arguments:
    public void printRange(int number) {
        switch(number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("number is between 1 and 5");
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("number is between 6 and 10");
            default:
                System.out.println("out of range");
        }
    }
}
