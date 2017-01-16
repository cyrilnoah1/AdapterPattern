package adapter.Idli;

/**
 * Class for preparing plain Idli.
 */
public class PlainIdli implements Idli {
    @Override
    public void createBatter() {
        System.out.println("Make Idli batter.");
    }

    @Override
    public void steamCook() {
        System.out.println("Steam bake the Idli");
    }

    @Override
    public void prepare() {
        System.out.println("Take out Idli from Cooker");
    }
}
