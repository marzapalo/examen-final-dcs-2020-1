package pregunta_04;

public class Beef extends SandwichDecorator {

    public Beef(Sandwich sandwich) {
        super(sandwich);
        this.description = "Peppers" + " [" + 2.00+"]";
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", sandwich.getDescription(), this.description);
    }

    @Override
    public double calculateCost() {
        return this.sandwich.calculateCost() + 2.00;
    }
}