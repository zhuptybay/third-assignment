package task10.builders;

import task10.PizzaType;
import task10.Recipe;

public class PizzaRecipeBuilder implements Builder {
    private PizzaType type;
    private String dough;
    private String sauce;
    private String topping;

    public void setType(PizzaType type) {
        this.type = type;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public Recipe getResult() {
        return new Recipe(type, dough, sauce, topping);
    }
}
