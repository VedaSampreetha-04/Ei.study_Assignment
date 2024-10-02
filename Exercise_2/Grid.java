public class Grid {
    private int width, height;
    private boolean[][] obstacles;

    public Grid(int width, int height, int[][] obstacleCoordinates) {
        this.width = width;
        this.height = height;
        this.obstacles = new boolean[width][height];

        // Place obstacles
        for (int[] obstacle : obstacleCoordinates) {
            obstacles[obstacle[0]][obstacle[1]] = true;
        }
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    public boolean isObstacle(int x, int y) {
        return obstacles[x][y];
    }
}
