package tmp;

public enum ETest {
    STONEi("stone"),
    PAPERi("paper"),
    SCISSIONi("SCISSIONi");

    private String symbol;

    ETest(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }

}
