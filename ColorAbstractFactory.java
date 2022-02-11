public abstract class ColorAbstractFactory {
    abstract Color getColor(String colorName);
}

class ColorFactory extends ColorAbstractFactory{
    @Override
    Color getColor(String colorName) {
        if (colorName.equals("Black")){
            return new Black();
        }
        else if (colorName.equals("Blue")){
            return new Blue();
        }
        return null;
    }
}
