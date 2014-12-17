package nl.harmtacoma.autorunservices.calculator.common;

/**
 * Created by harm on 16-12-14.
 */
public class MultiplyMod implements IModificationType {
    private static final String TYPENAME = "Multiply";

    @Override
    public String getTypeName() {
        return TYPENAME;
    }

    @Override
    public Result calculate(int valueOne, int valueTwo) {
        float answer = multiply(valueOne,valueTwo);
        String stringresult = "Multiplying "+valueOne+" and "+valueTwo+" gave "+answer;
        return new Result(valueOne,valueTwo,answer,getTypeName(),stringresult);
    }

    private float multiply(int one, int two) {
        return one*two;
    }
}
