public class function {
    public double function1(double x) {
        return Math.pow(x, 2) + Math.cos(x);
    }
    public double function2(double x) {
        return Math.sin(x) / (1 + Math.pow(x, 2));
    }
    public double leftRectangleMethod(double a, double b, double e, int q) {
        double h = (b - a) / e;
        double integral = 0.0;
        if (q == 1) {
            for (int i = 0; i < e; i++) {
                double x = a + i * h;
                integral += function1(x);
            }
        }
        if (q == 2) {
            for (int i = 0; i < e; i++) {
                double x = a + i * h;
                integral += function2(x);
            }
        }
        integral *= h;
        return integral;
    }
    public double rightRectangleMethod(double a, double b, double e, int q) {
        double h = (b - a) / e;
        double integral = 0.0;
        if (q == 1) {
            for (int i = 1; i <= e; i++) {
                double x = a + i * h;
                integral += function1(x);
            }
        }
        if (q == 2) {
            for (int i = 1; i <= e; i++) {
                double x = a + i * h;
                integral += function2(x);
            }
        }
        integral *= h;
        return integral;
    }
}