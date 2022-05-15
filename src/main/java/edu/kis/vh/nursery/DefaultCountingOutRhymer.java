package edu.kis.vh.nursery;

/**
 * Klasa rodzica z ktorej dziedzicza pozostale (podstawowe operacje na FIFO)
 */
public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int ERROR = -1;
    private static final int FULL = 11;
    private final int[] numbers = new int[SIZE];

    /**
     * Zwykły getter dla zmiennej total
     * @return
     */
    public int getTotal() {
        return total;
    }

    private int total = ERROR;

    /**
     * metoda ustawia element tablicy
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * metoda sprawdzajaca
     * @return
     */
    public boolean callCheck() {
        return total == ERROR;
    }

    /**
     * metoda sprawdzajaca czy tablica jest pelna
     * @return
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * metoda zwracajaca zawartosc pola tablicy
     * @return
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    /**
     * metoda usuwa element z tablicy
     * @return
     */
    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
