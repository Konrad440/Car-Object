public class CalculatorDriver {

    public static void main(String[] args){
        BasicCalculator bs = new BasicCalculator();
        System.out.println("5 + 7 = " + bs.add(5,7));
        System.out.println("5 - 7 = " + bs.subtract(5,7));
        System.out.println("5 * 7 = " + bs.multiply(5,7));
        System.out.println("5 / 7 = " + bs.divide(5,7));

        ScientificCalculator sc = new ScientificCalculator();
        System.out.println("Exponent of 20 = " + sc.exp(20));
        System.out.println("Logarithm of 100 = " + sc.log(100));
        sc.putValueInMemory(23.5);
        System.out.println("Putted value in memory module is = " + sc.getValueFromMemory());

        TrigonometricCalculator tc = new TrigonometricCalculator();
        System.out.println("Sine of .523 is " + tc.sine(.523));
        System.out.println("Cosine of .523 is " + tc.cosine(.523));
        System.out.println("Tangent of .523 is " + tc.tangent(.523));
        System.out.println("Arcsine of .5 is " + tc.arcsine(.5));
        System.out.println("Arccosine of .5 is " + tc.arccosine(.5));
        System.out.println("Arctangent of .5 is " + tc.arctangent(.5));

    }

}
