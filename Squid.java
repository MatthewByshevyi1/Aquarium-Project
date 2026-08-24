public class Squid extends SeaCreature{
    
    private String symbol;
    private int moveCounter = 0;
    private int inkCounter = 0;
    
    public Squid (String name, int position, int speed, int direction, String s) {
        super(name, position, speed, direction);
        symbol = s;
    }

    @Override
    public void move(int tankWidth) {
        if (moveCounter == 1) {
            position += speed * direction;
            moveCounter = 0;
        }
        else {
            moveCounter++;
        }
        loseTentacles();
    }

    @Override
    public String getSymbol() {
        if (inkCounter != 2)
            return symbol;
        return "\u001B[48;5;244m" + symbol + "\u001B[0m";
    }

    public void loseTentacles() {
        if ((int)(Math.random() * 10) == 1 && symbol.length() > 4) {
            symbol = symbol.substring(0,(symbol.length()-1));
        }
    }

}

// "<☲>≼≼≼"