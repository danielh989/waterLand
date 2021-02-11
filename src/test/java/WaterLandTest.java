import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaterLandTest {

    int[][] test_island_case1 = new int[][]
            {
                    {
                            1, 1, 1, 1, 0},
                    {
                            1, 1, 0, 1, 0},
                    {
                            1, 1, 0, 0, 0},
                    {
                            0, 0, 0, 0, 0}
            };
    int[][] test_island_case2 = new int[][]
            {
                    {
                            1, 1, 0, 0, 0},
                    {
                            1, 1, 0, 0, 0},
                    {
                            0, 0, 1, 0, 0},
                    {
                            0, 0, 0, 1, 1}
            };

    @Test
    void countAdjacentLandInMap() {
        assertEquals(9, WaterLand.countAdjacentLandInMap(test_island_case1));
        assertEquals(6, WaterLand.countAdjacentLandInMap(test_island_case2));
    }

    @Test
    void countIslands() {
        assertEquals(1, WaterLand.countIslandsInMap(test_island_case2));
    }
}