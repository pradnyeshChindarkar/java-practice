package DesignPatterns.ObjectCreational.AbstractFactory;

interface Chair {
    void sitOn();
}

interface Sofa {
    void sitOn();
}

interface CoffeeTable {
    void placeItems();
}

class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Art Deco Chair");
    }
}

class ArtDecoSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Art Deco Sofa");
    }
}

class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems() {
        System.out.println("Items placed on Art Deco Coffee Table");
    }
}

class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Chair");
    }
}

class VictorianSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Sofa");
    }
}

class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems() {
        System.out.println("Items placed on Victorian Coffee Table");
    }
}

class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Chair");
    }
}

class ModernSofa implements Sofa {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Sofa");
    }
}

class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems() {
        System.out.println("Items placed on Modern Coffee Table");
    }
}

interface AbstractFactory {

    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}

class ArtDecoFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}

class VictorianFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}

class ModernFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}



public class AbstractFactoryMain {

    public static void main(String[] args) {

        String style = "MODERN";

        AbstractFactory factory;

        if (style.equals("ART_DECO")) {
            factory = new ArtDecoFactory();
        }
        else if (style.equals("VICTORIAN")) {
            factory = new VictorianFactory();
        }
        else {
            factory = new ModernFactory();
        }

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable table = factory.createCoffeeTable();

        chair.sitOn();
        sofa.sitOn();
        table.placeItems();
    }
}