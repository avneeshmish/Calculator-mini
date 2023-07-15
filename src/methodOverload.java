public class methodOverload {
    public static void main(String[] args) {
        int x = add(1,2 ,3);
        System.out.println(x);
    }
    static int add( int a , int b ){
        System.out.println("This is #1 overload");
        return a + b ;
    }
    static int add(int a , int b , int c ){
        System.out.println("This is #2 overloading");
        return  a + b + c;
    }
}
