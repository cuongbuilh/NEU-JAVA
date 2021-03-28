package ex2;

public class test {
    public static void main(String[] args) {
        Box<? super B> myBox;
        myBox  = new Box<A>(new A());
        System.out.println(myBox.get().toString());
    }

}
