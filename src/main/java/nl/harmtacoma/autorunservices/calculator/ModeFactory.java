package nl.harmtacoma.autorunservices.calculator;

import nl.harmtacoma.autorunservices.calculator.common.*;

/**
 * Created by harm on 16-12-14.
 */
public class ModeFactory {

    public static IModificationType getModifier(String mode) throws IllegalArgumentException {
        Modifiers mods = Modifiers.valueOf(mode.toUpperCase());
        switch(mods) {
            case MULTIPLY: return new MultiplyMod();
            case ADD: return new AddMod();
            case DIVIDE: return new DivideMod();
            case SUBTRACT: return new SubtractMod();
        }
        throw new IllegalArgumentException("The selected mode does not exist");
    }

    public enum Modifiers {
        MULTIPLY,
        ADD,
        DIVIDE,
        SUBTRACT
    }
}
