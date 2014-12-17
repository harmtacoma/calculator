package nl.harmtacoma.autorunservices.calculator.common;

/**
 * Created by Harm Tacoma on 17-12-2014.
 */
public class DivideMod implements IModificationType {

    private static final String TYPENAME = "Divide";
    @Override
    public String getTypeName() {
        return TYPENAME;
    }

    @Override
    public Result calculate(float valueOne, float valueTwo) {
        float answer = divide(valueOne,valueTwo);
        String result = "Dividing "+valueOne+" by "+valueTwo+" gave "+answer;
        return new Result(valueOne,valueTwo,answer,getTypeName(),result);
    }

    private float divide(float one, float two) {
        return one/two;
    }
}
