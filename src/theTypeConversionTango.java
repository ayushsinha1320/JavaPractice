public class theTypeConversionTango {
    public static void main(String[] args){
        int theIntegerNumber = 79;
        double theDoubleNumber = 13.56;

        double intToDouble = (double) theIntegerNumber;
        int doubleToInt = (int) theDoubleNumber;

        System.out.println(intToDouble);
        System.out.println(doubleToInt);
    }
}
