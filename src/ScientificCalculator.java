public class ScientificCalculator {
    public static final double PI = 3.14159;

    private double holdValue;

    public double exp(double value){
        return(Math.exp(value));
    }
    public double log(double value) {
        return (Math.log(value));
    }
    public final void putValueInMemory(double value){
        holdValue = value;
    }
    public final double getValueFromMemory(){
        return (holdValue);
    }
}
