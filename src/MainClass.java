import adapter.Idli.PlainIdli;
import adapter.IdliUpmaAdapter;
import adapter.upma.PlainUpma;
import adapter.upma.Upma;

/**
 * Class containing the main method.
 */
public class MainClass {

    /**
     * Main method.
     *
     * @param args String arguments.
     */
    public static void main(String args[]) {
        // At first, trying to cook only plain Upma.
        PlainUpma plainUpma = new PlainUpma();

        System.out.println("1> Cooking only plain Upma...\n");
        cookUpmaSomething(plainUpma);

        // Later, cooking Idli-Upma using IdliUpmaAdapter.
        PlainIdli plainIdli = new PlainIdli();
        IdliUpmaAdapter idliUpmaAdapter = new IdliUpmaAdapter(plainIdli);

        System.out.println("\n2> Cooking Idli-Upma using IdliUpmaAdapter...\n");
        cookUpmaSomething(idliUpmaAdapter);
    }

    /**
     * Cooking some kind of Upma.
     *
     * @param upma Type of upma to be prepared.
     */
    private static void cookUpmaSomething(Upma upma) {
        upma.prepareUpma();
    }
}
