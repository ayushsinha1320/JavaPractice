public class ConstructorConnoisseur {
    static class PrintNumber{
        public PrintNumber(int number){
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber(5);
    }
}
