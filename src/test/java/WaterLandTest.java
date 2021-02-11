import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
    int[][] test_island_case3 = new int[][]
            {
                    {
                            1, 1, 0, 0, 0, 1},
                    {
                            1, 1, 0, 0, 0, 0},
                    {
                            0, 0, 1, 0, 0, 0},
                    {
                            0, 0, 0, 1, 1, 0}
            };

    @Test
    void countAdjacentLandInNullMap() {
        assertEquals(0, WaterLand.countAdjacentLandInMap(null));
    }

    @Test
    void countAdjacentLandInMap() {
        assertNotEquals(0, WaterLand.countAdjacentLandInMap(test_island_case1));
        assertEquals(9, WaterLand.countAdjacentLandInMap(test_island_case1));

        assertNotEquals(0, WaterLand.countAdjacentLandInMap(test_island_case2));
        assertEquals(6, WaterLand.countAdjacentLandInMap(test_island_case2));

    }

    @Test
    void countIslandsInNullMap() {
        assertEquals(0, WaterLand.countIslandsInMap(null));
    }

    @Test
    void countIslandsInMap() {
        assertEquals(1, WaterLand.countIslandsInMap(test_island_case2));
        assertNotEquals(0, WaterLand.countIslandsInMap(test_island_case2));

        assertEquals(2, WaterLand.countIslandsInMap(test_island_case3));
        assertNotEquals(3, WaterLand.countIslandsInMap(test_island_case3));
        assertNotEquals(0, WaterLand.countIslandsInMap(test_island_case3));
    }


}