public class WaterLand {

    public static final int LAND = 1;

    public static int countAdjacentLandInMap(int[][] map) {

        int lands = 0;
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (hasAdjacentLand(x, y, map) && map[y][x] == LAND) {
                    lands++;
                }
            }
        }
        return lands;
    }

    public static int countIslandsInMap(int[][] map) {

        int lands = 0;
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (isIsland(x, y, map) && map[y][x] == LAND) {
                    lands++;
                }
            }
        }
        return lands;
    }

    private static boolean hasAdjacentLand(int x, int y, int[][] map) {
        int next = x + 1;
        int prev = x - 1;
        int up = y - 1;
        int down = y + 1;
        return isLand(y, next, map)
                || isLand(y, prev, map)
                || isLand(up, x, map)
                || isLand(down, x, map);
    }

    static boolean isLand(int x, int y, int[][] map) {
        if (y < 0 || y >= map.length) return false;
        if (x < 0 || x >= map[y].length) return false;
        return map[y][x] == LAND;
    }

    private static boolean isIsland(int x, int y, int[][] map) {
        return !hasAdjacentLand(x, y, map);
    }
}
