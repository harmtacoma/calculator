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
    public Result calculate(float valueOne, float valueTwo) {
        float answer = multiply(valueOne,valueTwo);
        String result = "Multiplying "+valueOne+" and "+valueTwo+" gave "+answer;
        return new Result(valueOne,valueTwo,answer,getTypeName(),result);
    }

    private float multiply(float one, float two) {
        return one*two;
    }
}
