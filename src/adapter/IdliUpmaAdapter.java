package adapter;

import adapter.Idli.Idli;
import adapter.upma.Upma;

/**
 * Adapter class that makes Upma out of Idli.
 */
public class IdliUpmaAdapter implements Upma {
    Idli idli;

    public IdliUpmaAdapter(Idli idli) {
        this.idli = idli;
    }

    @Override
    public void roastRequiredIngredients() {
        idli.createBatter();
        idli.steamCook();
    }

    @Override
    public void fryTheContents() {
        idli.prepare();
        System.out.println("Break the Idli into very small pieces.");
        System.out.println("Fry the broken Idli in oil and water by adding required ingredients.");
    }

    @Override
    public void prepareUpma() {
        roastRequiredIngredients();
        fryTheContents();
        System.out.println("Cook the Idli-Upma, and serve it.");
    }
}
