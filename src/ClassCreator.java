public class ClassCreator {
    static class InnerClass{
        public void print(){
            System.out.println("Hello from the inner class!");
        }
    }
    public static void main(String[] args) {
        InnerClass i1 = new InnerClass();
        i1.print();
    }

}
