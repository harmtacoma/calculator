package nl.harmtacoma.autorunservices.calculator.common;

/**
 * Created by Harm Tacoma on 17-12-2014.
 */
public class SubtractMod implements IModificationType {

    private static final String TYPENAME = "Subtract";

    @Override
    public String getTypeName() {
        return TYPENAME;
    }

    @Override
    public Result calculate(float valueOne, float valueTwo) {
        float answer = subtract(valueOne,valueTwo);
        String result = "Subtracting "+valueTwo+" from "+valueOne+" gave "+answer;
        return new Result(valueOne,valueTwo,answer,getTypeName(),result);
    }

    private float subtract(float one, float two) {
        return one-two;
    }
}
