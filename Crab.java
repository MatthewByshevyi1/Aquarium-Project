public class Crab extends SeaCreature {
    
    private String symbol;
    
    public Crab (String name, int position, int speed, int direction, String s) {
        super(name, position, speed, direction);
        symbol = "\u001B[31m" + s + "\u001B[97m";
    }
// "\u001B[38;2;255;127;0m" + + "\u001B[97m"
    @Override
    public void move(int tankWidth) {
        if ( (int)(Math.random() * 10) != 0) {
            position += speed * direction;
            keepInsideTank(tankWidth);
            if ( (int)(Math.random() * 4) == 0 )
                direction *= -1;
        } else {
            dash(tankWidth);
        }
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    public void dash(int tankWidth) {
        position += speed * direction * 5;
        keepInsideTank(tankWidth);
    }
}
// ʚ„[•ᴗ•]„ɞ
