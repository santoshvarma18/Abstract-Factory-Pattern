import java.util.Scanner;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter OS name: ");
        String osName = input.nextLine();
        System.out.println("Enter model name: ");
        String modelName = input.nextLine();
        System.out.println("Enter color name: ");
        String colorName = input.nextLine();
        MobileAbstractFactory af = FactoryProducer.getMobileFactory(osName);
        Mobile m = af.getMobile(modelName);
        m.modelName();

        ColorAbstractFactory cf = FactoryProducer.getColorFactory();
        Color c = cf.getColor(colorName);
        c.color();
    }
}
