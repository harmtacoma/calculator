package nl.harmtacoma.autorunservices.calculator.persistence;

import nl.harmtacoma.autorunservices.calculator.common.IModificationType;

/**
 * Created by harm on 16-12-14.
 */
public interface ICalculatorConfig {

    public int getNumberOne();

    public void setNumberOne(int value);

    public int getNumberTwo();

    public void setNumberTwo(int value);

    public IModificationType getModType();

    public void setModType(IModificationType type);
}
