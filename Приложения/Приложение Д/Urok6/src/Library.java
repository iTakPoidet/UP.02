public class Library {
    private int score = 0;
    static boolean proverka(int n){
        if (n <= 0){
            System.out.println("Введи число больше 0");
            return false;
        }else {
            return true;}}
    static int[] generationMass(int min, int max, int n){
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * (max - min) + min);
        }
        return  mas;}
    int volume(int[] a, int[] b, int[] c){
        int max = a[0] * b[0] * c[0];
        for (int i = 0; i < a.length; i++){
            int q = a[i] * b[i] * c[i];
            if (q > max) max = q;}
        return max;}
    void sumOst(int[] a, int[] b, int[] c){
        int sum = 0;
        for (int j : a) {
            if (j % 3 != 0) {
                sum += j % 4;}}
        for (int j : b) {
            if (j % 3 != 0) {
                sum += j % 4;}}
        for (int j : c) {
            if (j % 3 != 0) {
                sum += j % 4;}}
        score = sum;}
    public int getScore() {
        return score;}}
