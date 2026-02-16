import java.util.List;
import java.util.ArrayList;

import FactoryMethod.BasicExample.CreatorA;
import FactoryMethod.BasicExample.CreatorB;
import FactoryMethod.BasicExample.Product;
import FactoryMethod.UIExample.Application;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // NodeInstance nodeInstance = new NodeInstance();
        // Referenceable obj = nodeInstance.creatReferenceable();
        // System.out.println(obj);

        factoryMethodExmplample();
    }

    public static void factoryMethodExmplample() {
        // Basic Example
        CreatorA creatorA = new CreatorA();
        CreatorB creatorB = new CreatorB();

        List<Product> products = new ArrayList<Product>();
        products.add(creatorA.createProduct());
        products.add(creatorB.createProduct());

        products.forEach(p -> p.doSomething()); // print: ProductA ProductB

        // UI Example
        Application uiApp = new Application();

        try {
            uiApp.initialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
