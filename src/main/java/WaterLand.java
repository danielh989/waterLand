public class WaterLand {

    public static final int LAND = 1;

    public static int countElementsInMap(int[][] map, LandIdentifier landIdentifier) {
        if (null == map) return 0;
        int lands = 0;
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (landIdentifier.identifyMethod(x, y, map) && map[y][x] == LAND) {
                    lands++;
                }
            }
        }
        return lands;
    }

    public static int countAdjacentLandInMap(int[][] map) {
        return countElementsInMap(map, WaterLand::hasAdjacentLand);
    }

    public static int countIslandsInMap(int[][] map) {
        return countElementsInMap(map, WaterLand::isIsland);
    }

    private static boolean hasAdjacentLand(int x, int y, int[][] map) {
        int next = x + 1;
        int prev = x - 1;
        int up = y - 1;
        int down = y + 1;
        return isLand(y, prev, map) || isLand(y, next, map)
                || isLand(up, x, map) || isLand(down, x, map);
    }

    static boolean isLand(int x, int y, int[][] map) {
        boolean outsideY = y <= -1 || y >= map.length;
        if (outsideY) return false; //X is null if Y is negative, return immediately
        boolean outsideX = x <= -1 || x >= map[y].length;
        return !outsideX && map[y][x] == LAND;
    }

    private static boolean isIsland(int x, int y, int[][] map) {
        return !hasAdjacentLand(x, y, map);
    }

};
