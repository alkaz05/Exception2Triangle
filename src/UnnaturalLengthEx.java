public class UnnaturalLengthEx extends GeometryException{
    double number;

    public UnnaturalLengthEx(String message, double number) {
        super(message);
        this.number = number;
    }
}
