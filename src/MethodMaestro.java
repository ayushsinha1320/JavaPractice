public class MethodMaestro {
    static class Calculation{
        public void square(int n){
            System.out.println(n*n);
        }
    }

    public static void main(String[] args) {
        Calculation c1 = new Calculation();
        c1.square(5);
    }

}
