public class ModNewtonMethod {
    public static double function(double x, double a) {
        return Math.pow(x, 2) + Math.cos(x) - a;
    }
    public static double derivative(double x) {
        return 2 * x - Math.sin(x);
    }
    public static double modifiedNewton(double x, double a) {
        double fx0 = function(x, a);
        double dfx0 = derivative(x);
        x = x - fx0 / dfx0;
        return x;
    }
    public static double simpleIteration(double x, double a) {
        double prev=a;
        double next=prev;
        for (int i = 0; i < x; i++) {
            double M=0;
            for (int j = 0; j < x; j++) {
                if (derivative(j)>M){
                    M=derivative(j);
                }
            }
            next=prev-derivative(prev)/(M+0.1);
            prev=next;
        }
        return next;
    }
}
