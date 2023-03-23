public class methodAreaOne {
    //S = π × r2
    public double result1, result2, result3, result4;

    public methodAreaOne (double input) {
        neg(input);
        pow();
        sum();
        div();

    }

    private void neg(double p) { result1 = p * (10);}

    private void pow() { result2 = Math.pow(Math.E,result1); }

    private void sum () { result3 = 1 + result2; }

    private void div () { result4 = 1 / result3; }

}
