package nl.harmtacoma.autorunservices.calculator.common;

/**
 * Created by harm on 16-12-14.
 */
public class Result {

    private int value1;
    private int value2;
    private float result;
    private String mode;
    private String stringresult;

    public Result(int value1, int value2, float result, String mode, String stringresult) {
        setMode(mode);
        setStringresult(stringresult);
        setValue1(value1);
        setValue2(value2);
        setResult(result);
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getStringresult() {
        return stringresult;
    }

    public void setStringresult(String stringresult) {
        this.stringresult = stringresult;
    }

}
