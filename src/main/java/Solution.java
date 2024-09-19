import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>(numRows);

        for (int row = 0; row < numRows; row++) {
            generateLine(row, pascalTriangle);
        }

        return pascalTriangle;
    }

    private static void generateLine(int row, List<List<Integer>> pascalTriangle) {
        List<Integer> line = new ArrayList<>(row + 1);
        line.add(1);
        for (int i = 1; i < row + 1; i++) {
            if (i == row) line.add(1);
            else {
                line.add(pascalTriangle.get(row - 1).get(i) + pascalTriangle.get(row - 1).get(i - 1));
            }
        }
        pascalTriangle.add(line);
    }
}