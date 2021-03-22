package Aptech;

public class NegativeAmountException extends Exception{
    public NegativeAmountException(){
        super();
    }
    public NegativeAmountException(String msg){
        super(msg);
    }
}
