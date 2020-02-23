package day40;
                                    //has 3 attributes name, xcordinates y cordinates
                                    // few bahaviours: move1Block, accept no parameter and change the pisition
public class ScapeShip_2 {
    String name;
    String currentDirection;
    int x;
    int y;

    public void setInitialPosition(int newX, int newY) {
        x = newX;
        y = newY;
    }
    /**
     * Accept 1 String parameter to set the direction to either up , down , right , left
                                                                                  */
    public void setDirection(String newDirection) {

        // direction can only be up , down , right , left
        if (newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")) {

            currentDirection = newDirection;
        } else {
            System.out.println("Invalid Direction");
        }
    }

    /**
     * move the spaceship to 1 block accrding to the currect direction
     */
    public void move1Block() {

        switch (currentDirection) {
            case "right":
                x += 1;  // increasing x coordinate by 1 if spaceship move right
                break;
                case "left":
                    x -= 1; // decreasing x coordinate by 1 if spaceship move left
                    break;
                    case "up":
                        y += 1;  // increasing y coordinate by 1 if spaceship move up
                        break;
                        case "down":
                            y -= 1;  // decreasing y coordinate by 1 if spaceship move down
                            break;
                            default:
                                break;
        }

    }

    // right click in your class anywhere
    // select generate
    // select toString -->> Hit enter
    // Delete @override
    public String toString() {
        return "SpaceShip{" + "name='" + name + '\'' + ", currentDirection='" + currentDirection + '\'' + ", x=" + x + ", y=" + y + '}';
    }

    //add a functionality to move1Block with direction provided in 1 shot
public void move1Block(String newDirection){

}
}
/*public void moveAnyBlock(String direction ,int count){
     currentDirection=direction;
    if(direction.equals("right")){xCoordinate=xCoordinate+count;}
    else if(direction.equals("left")){xCoordinate=xCoordinate-count;}
    else if(direction.equals("up")){yCoordinate=xCoordinate+count;}
    else if(direction.equals("down")){yCoordinate=xCoordinate-count;}
    else{
        System.out.println("Invalid direction!!!");}
}*/