package adapter.upma;

/**
 *
 */
public class PlainUpma implements Upma {
    @Override
    public void roastRequiredIngredients() {
        System.out.println("Roast the required ingredients for Upma.");
    }

    @Override
    public void fryTheContents() {
        System.out.println("Add oil and water, and fry the ingredients-mixture.");
    }

    @Override
    public void prepareUpma() {
        roastRequiredIngredients();
        fryTheContents();
        System.out.println("Cook Upma, and take out the prepared Upma.");
    }
}
