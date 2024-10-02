public class Rover {
    private int x, y;
    private char direction; // N, E, S, W
    private Grid grid;

    public Rover(int x, int y, char direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        int nextX = x, nextY = y;

        switch (direction) {
            case 'N':
                nextY += 1;
                break;
            case 'E':
                nextX += 1;
                break;
            case 'S':
                nextY -= 1;
                break;
            case 'W':
                nextX -= 1;
                break;
        }

        // Check for obstacles and grid bounds
        if (grid.isWithinBounds(nextX, nextY) && !grid.isObstacle(nextX, nextY)) {
            this.x = nextX;
            this.y = nextY;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    public String getStatus() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction;
    }
}
