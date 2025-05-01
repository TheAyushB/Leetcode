public class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) return points.length;

        int max = 0;

        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slopeMap = new HashMap<>();
            int duplicates = 1; // count the point itself

            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0 && dy == 0) {
                    // duplicate point
                    duplicates++;
                } else {
                    int gcd = gcd(dx, dy);
                    dx /= gcd;
                    dy /= gcd;

                    // normalize slope: keep dx positive
                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }

                    String slope = dx + "/" + dy;
                    slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                }
            }

            int localMax = 0;
            for (int count : slopeMap.values()) {
                localMax = Math.max(localMax, count);
            }

            max = Math.max(max, localMax + duplicates);
        }

        return max;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
