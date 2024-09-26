// given points of the cars in a 2D plain, find the nearest cars to the origin

import java.util.PriorityQueue;

public class NearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSqr;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
            // the distance of a point from the origin is square root of x^2+y^2
            this.distSqr = (x * x + y * y);
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSqr - p2.distSqr;
        }
    }

    public static void main(String[] args) throws Exception {
        int[][] carPoints = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int totalCars = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < carPoints.length; i++) {
            pq.add(new Point(carPoints[i][0], carPoints[i][1]));
        }

        for (int i = 0; i < totalCars; i++) {
            System.out.println(pq.peek().x + " " + pq.peek().y);
            pq.remove();
        }
    }
}
