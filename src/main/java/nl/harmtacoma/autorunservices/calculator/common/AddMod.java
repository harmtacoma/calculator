package nl.harmtacoma.autorunservices.calculator.common;

/**
 * Created by Harm Tacoma on 17-12-2014.
 */
public class AddMod implements IModificationType {

    private static final String TYPENAME = "Add";

    @Override
    public String getTypeName() {
        return TYPENAME;
    }

    @Override
    public Result calculate(float valueOne, float valueTwo) {
        float answer = add(valueOne,valueTwo);
        String result = "Adding "+valueOne+" and "+valueTwo+" gave "+answer;
        return new Result(valueOne,valueTwo,answer,getTypeName(),result);
    }

    private float add(float one, float two) {
        return one+two;
    }
}
