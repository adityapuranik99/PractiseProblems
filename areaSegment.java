public class areaSegment {

    // void areaSeg(){
    // // At an instant, your selected area = A
    // for(int i = 0; i<n; i++)
    // {
    // int area = pi*radius*radius;
    // slices += (area/A);
    // }
    // }

    // no of slices = r^2[0]/A + r^2[1]/A + ... + r^2[n-1]/A

    double solve(int n, double r[], int k) {
        double l = 0;
        double r = INT_MAX;
        double max_area = 0;
        while (l <= r) {
            double mid = (l + r) / 2;
            int slices = 0;
            for (int i = 0; i < n; i++) {
                slices += (pi * r[i] * r[i]) / mid;
            }
            if (slices >= k) {
                max_area = mid;
                l = mid + (0.0001);
            } else {
                r = mid - (0.0001);
            }
        }
        return max_area;
    }

}