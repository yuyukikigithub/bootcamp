package bank;
public interface Transferable {
    boolean transfer(Transferable to, int amount); // not only Account type
    // boolean transfer(Account to, int amount);

    public static void batchTransfer (Transferable[] from, Transferable[] to, int value){
        // from[0].transfer(null, value);
    }
}
