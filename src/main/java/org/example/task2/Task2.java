package org.example.task2;

public class Task2 {

    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        printInfo(pizza);

        pizza = new WithChicken(pizza);
        printInfo(pizza);

        pizza = new WithSausage(pizza);
        printInfo(pizza);

        pizza = new WithArugula(pizza);
        printInfo(pizza);
    }

    public static void printInfo(Pizza c) {
        System.out.println("Итого: " + c.getCost() + "; Состав: " + c.getIngredients());
    }
}

interface Pizza {
    double getCost();
    String getIngredients();
}

class SimplePizza implements Pizza {

    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getIngredients() {
        return "тесто, помидоры, сыр";
    }
}

abstract class PizzaDecorator implements Pizza {
    private final Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratedPizza.getIngredients();
    }
}

class WithChicken extends PizzaDecorator {

    public WithChicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", курица";
    }
}

class WithSausage extends PizzaDecorator {

    public WithSausage(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", колбаса";
    }
}

class WithArugula extends PizzaDecorator {

    public WithArugula(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 15;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", руккола";
    }
}
