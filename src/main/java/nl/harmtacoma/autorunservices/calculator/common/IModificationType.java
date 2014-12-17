package nl.harmtacoma.autorunservices.calculator.common;

/**
 * Created by harm on 16-12-14.
 */
public interface IModificationType {
    public String getTypeName();

    public Result calculate(int valueOne, int valueTwo);
}
