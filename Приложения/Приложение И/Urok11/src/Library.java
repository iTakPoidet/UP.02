class Library {
    public double calculateY(double x) {
        if (x < 2) {
            return (2.56 * x + 2) / Math.tan(2 + x);
        } else if (x >= 2 && x <= 4) {
            return Math.log(x * x - 1);
        } else if (x > 10) {
            return Math.tan(2.78 * x + 2);
        } else {
            throw new IllegalArgumentException("x должен быть < 2, между 2 и 4 включительно, или > 10");
        }
    }
}