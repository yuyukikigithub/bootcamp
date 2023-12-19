public enum Direction {

    NORTH(1),
    EAST(2),
    WEST(-2),
    SOUTH(-1),
    ;

    private int direction;

    private Direction(int dir){
        this.direction=dir;
    } 

    public int getDirection(){
        return this.direction;
    }

    public static Direction opposite(Direction direction){
        
        return Direction.fromValue(direction.getDirection()*-1);
    }

    public Direction opposite(){
        // return this.opposite(); // cannot call yourself
        return Direction.fromValue(this.direction*-1);
    }

    public boolean isOpposite(Direction direction){
        return this == Direction.fromValue(direction.getDirection()*-1);
    }

    private static Direction fromValue(int direction){
        for (Direction d:values()) {
            if (d.getDirection()==direction) {
                return d;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // .name() to get string --> = toString()
        System.out.println(Direction.EAST.opposite());
        System.out.println(Direction.EAST.opposite().name());
        System.out.println(Direction.EAST.opposite().toString());
        System.out.println(Direction.EAST.opposite().hashCode());
        System.out.println(Direction.opposite(Direction.NORTH));
    }
}
