// Issa
// The 2021 Triad Programming Contest Problems
// Locating an Antenna

import java.util.*;
import java.io.*;

public class AntennaLocation {
    //Main method and throws FileNotFoundException if antenna.txt not found 
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner that reads from file antenna.txt
        Scanner scanner = new Scanner(new File("antenna.txt"));
        int n = scanner.nextInt();  // n as number of points
        
        // Arrays x, y initialized with n to store points coordonnates and d distance
        double[] x = new double[n]; // x and y as coordonnates points
        double[] y = new double[n];
        double[] d = new double[n]; // d is distance between points and antenna
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
            y[i] = scanner.nextDouble();
            d[i] = 0.0;
        }
        scanner.close();

        double Inc = 0.1; // Increment to search for optimal location
        double tol = 1e-6; // Tolerance to check the convergence of the algorithm
        double Rate = 0.1; // Rate
        double minDist = Double.MAX_VALUE; // Minimum distance
        double minX = 0.0, minY = 0.0;  // minX and minY to store optimal antenna location found

        // Gradient descent algorithm
        // First two for loops(Nested) iterate all possible antenna locations
        for (double cx = 0.0; cx <= 1000.0; cx += Inc) {
            for (double cy = 0.0; cy <= 1000.0; cy += Inc) {
                double dist = 0.0;
                for (int i = 0; i < n; i++) { // Calculate the distance current antenna locations 
                    double dx = cx - x[i];    // and each of the number of points
                    double dy = cy - y[i];
                    d[i] = dx*dx + dy*dy;
                    dist += d[i]*d[i]*d[i]; // dist total distance
                }
                if (dist < minDist) {
                    minDist = dist;
                    minX = cx;
                    minY = cy;
                }
            }
        }

        System.out.printf("Optimal antenna location is %.1f %.1f\n", minX, minY);
    }
}
