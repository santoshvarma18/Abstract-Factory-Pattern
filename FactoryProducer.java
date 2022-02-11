public class FactoryProducer {
    public static MobileAbstractFactory getMobileFactory(String osName){
        if (osName.equals("iOS")){
            return new iOS();
        }
        else if (osName.equals("Andriod")){
            return new Andriod();
        }
        return null;
    }

    public static ColorAbstractFactory getColorFactory(){
        return new ColorFactory();
    }
}
