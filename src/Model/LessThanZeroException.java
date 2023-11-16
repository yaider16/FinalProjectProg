package Model;

public class LessThanZeroException extends Exception{
    public LessThanZeroException() {
        super("La cantidad no puede ser menor a zero");
    }
}
