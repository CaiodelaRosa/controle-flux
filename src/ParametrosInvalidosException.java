
public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(){
        super("Parametro dois maior do que parametro um!");
    }

    public ParametrosInvalidosException(String e){
        super(e);
    }

}
