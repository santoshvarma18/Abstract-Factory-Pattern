public abstract class MobileAbstractFactory {
    abstract Mobile getMobile(String modelName);
}

class iOS extends MobileAbstractFactory {
    @Override
    Mobile getMobile(String modelName) {
        if (modelName.equals("Iphone8")){
            return new Iphone8();
        }
        else if (modelName.equals("Iphone10")){
            return new Iphone10();
        }
        return null;
    }
}

class Andriod extends MobileAbstractFactory {

    @Override
    Mobile getMobile(String modelName) {
        if (modelName.equals("SamsungM31s")){
            return new SamsungM31s();
        }
        else if (modelName.equals("RedmiNote10")){
            return new RedmiNote10();
        }
        return null;
    }
}
