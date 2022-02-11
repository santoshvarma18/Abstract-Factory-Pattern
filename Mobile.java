interface Mobile{
    void modelName();
}

interface Color{
    void color();
}

class Black implements Color{

    @Override
    public void color() {
        System.out.println("The color is black");
    }
}

class Blue implements Color{

    @Override
    public void color() {
        System.out.println("The color is blue");
    }
}

class Iphone8 implements Mobile{
    @Override
    public void modelName() {
        System.out.println("Iphone8 price: $800");
    }
}

class SamsungM31s implements Mobile{
    @Override
    public void modelName() {
        System.out.println("SamsungM31s price: $500");
    }
}

class Iphone10 implements Mobile{
    @Override
    public void modelName() {
        System.out.println("Iphone10 price: $1000");
    }
}

class RedmiNote10 implements Mobile{
    @Override
    public void modelName() {
        System.out.println("RedmiNote10 price: $700");
    }
}



