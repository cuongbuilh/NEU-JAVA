package ex1;

public class Box<T>{
    private T t;

    Box(){
        t=null;
    }

    Box(T t) {
        this.t=t;
    }
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }

}
