public class MA {
    public static double function(double x){
        return Math.log(x);
    }
    public static double leftRectangleMethod(double a, double b, double n) {
        double h = (b - a) / n;
        double integral = 0.0;

        for (int i = 0; i < n; i++) {
            double xi = a + i * h;
            integral += function(xi);
        }

        integral *= h;
        return integral;
    }
    public static double rightRectangleMethod(double a, double b, double n) {
        double h = (b - a) / n;
        double result = 0.0;

        for (int i = 1; i <= n; i++) {
            double xi = a + i * h;
            result += function(xi);
        }

        result *= h;
        return result;
    }
}