import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    JFrame frame;
    JTextField aField, bField, epsilonField;
    JComboBox functionCombo, methodCombo;
    JTextArea resultArea;

    public static void main(String[] args) {
        int n;
        int m;
        double a;
        double b;
        double e;

        do {
            function f = new function();
            Scanner sc = new Scanner(System.in);
            System.out.println("Выбери подынтегральную функцию: ");
            System.out.println("1 - x^2+cos(x) ; 2 - (sin(x))/(1+x^2) ; 3 - графический интерфейс");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    do {
                        System.out.println("Выбери Формулу: ");
                        System.out.println("1 - формула левых прямоугольников; 2 - формула правых прямоугольников");
                        m = sc.nextInt();

                        switch (m) {
                            case 1:
                                sc = new Scanner(System.in);
                                System.out.print("Введи a: ");
                                a = sc.nextDouble();
                                System.out.print("Введи b: ");
                                b = sc.nextDouble();
                                System.out.print("Введи e: ");
                                e = sc.nextDouble();
                                System.out.println("Интеграл равен: " + f.leftRectangleMethod(a, b, e, 1));
                                System.out.println();
                                break;
                            case 2:
                                sc = new Scanner(System.in);
                                System.out.print("Введи a: ");
                                a = sc.nextDouble();
                                System.out.print("Введи b: ");
                                b = sc.nextDouble();
                                System.out.print("Введи e: ");
                                e = sc.nextDouble();
                                System.out.println("Интеграл равен: " + f.rightRectangleMethod(a, b, e, 1));
                                System.out.println();
                                break;
                        }
                    } while ((m == 1) || (m == 2));
                    break;

                case 2:
                    do {
                        System.out.println("Выбери Формулу: ");
                        System.out.println("1 - формула левых прямоугольников; 2 - формула правых прямоугольников");
                        m = sc.nextInt();

                        switch (m) {
                            case 1:
                                sc = new Scanner(System.in);
                                System.out.print("Введи a: ");
                                a = sc.nextDouble();
                                System.out.print("Введи b: ");
                                b = sc.nextDouble();
                                System.out.print("Введи e: ");
                                e = sc.nextDouble();
                                System.out.println("Интеграл равен: " + f.leftRectangleMethod(a, b, e, 2));
                                System.out.println();
                                break;
                            case 2:
                                sc = new Scanner(System.in);
                                System.out.print("Введи a: ");
                                a = sc.nextDouble();
                                System.out.print("Введи b: ");
                                b = sc.nextDouble();
                                System.out.print("Введи e: ");
                                e = sc.nextDouble();
                                System.out.println("Интеграл равен: " + f.rightRectangleMethod(a, b, e, 2));
                                System.out.println();
                                break;
                        }
                    } while ((m == 1) || (m == 2));
                    break;
                case 3:
                    new Main().initialize();
                    break;
            }
        } while ((n == 1) || (n == 2) || (n == 3));
    }
    public void initialize() {
        // Создание основного окна
        frame = new JFrame("Численное интегрирование");
        function f = new function();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout(10, 10));

        // Панель ввода параметров
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Элементы ввода
        inputPanel.add(new JLabel("Нижний предел интегрирования (a):"));
        aField = new JTextField("0.0", 10);
        inputPanel.add(aField);

        inputPanel.add(new JLabel("Верхний предел интегрирования (b):"));
        bField = new JTextField("1.0", 10);
        inputPanel.add(bField);

        inputPanel.add(new JLabel("Точность (ε):"));
        epsilonField = new JTextField("0.0001", 10);
        inputPanel.add(epsilonField);

        inputPanel.add(new JLabel("Выберите функцию:"));
        functionCombo = new JComboBox<>(new String[]{"x^2+cos(x)", "(sin(x))/(1+x^2)"});
        inputPanel.add(functionCombo);

        inputPanel.add(new JLabel("Выберите метод:"));
        methodCombo = new JComboBox<>(new String[]{"Метод правых прямоугольников", "Метод левых прямоугольников"});
        inputPanel.add(methodCombo);

        // Кнопка вычисления
        JButton calculateButton = new JButton("Вычислить интеграл");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ((Objects.equals(String.valueOf(functionCombo.getSelectedItem()), "x^2+cos(x)") && ((Objects.equals(String.valueOf(methodCombo.getSelectedItem()), "Метод правых прямоугольников"))))){
                    resultArea.setText("Интеграл равен = " + f.rightRectangleMethod(Double.valueOf(aField.getText()),Double.valueOf(bField.getText()),Double.valueOf(epsilonField.getText()),1 ));
                }
                if ((Objects.equals(String.valueOf(functionCombo.getSelectedItem()), "(sin(x))/(1+x^2)") && ((Objects.equals(String.valueOf(methodCombo.getSelectedItem()), "Метод правых прямоугольников"))))){
                    resultArea.setText("Интеграл равен = " + f.rightRectangleMethod(Double.valueOf(aField.getText()),Double.valueOf(bField.getText()),Double.valueOf(epsilonField.getText()),2 ));
                }
                if ((Objects.equals(String.valueOf(functionCombo.getSelectedItem()), "x^2+cos(x)") && ((Objects.equals(String.valueOf(methodCombo.getSelectedItem()), "Метод левых прямоугольников"))))){
                    resultArea.setText("Интеграл равен = " + f.leftRectangleMethod(Double.valueOf(aField.getText()),Double.valueOf(bField.getText()),Double.valueOf(epsilonField.getText()),1 ));
                }
                if ((Objects.equals(String.valueOf(functionCombo.getSelectedItem()), "(sin(x))/(1+x^2)") && ((Objects.equals(String.valueOf(methodCombo.getSelectedItem()), "Метод левых прямоугольников"))))){
                    resultArea.setText("Интеграл равен = " + f.leftRectangleMethod(Double.valueOf(aField.getText()),Double.valueOf(bField.getText()),Double.valueOf(epsilonField.getText()),2 ));
                }
            }
        });

        // Панель результатов
        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        resultArea = new JTextArea(10, 40);
        resultArea.setEditable(false);
        resultPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);
        resultPanel.add(calculateButton, BorderLayout.SOUTH);

        // Добавление компонентов в основное окно
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(resultPanel, BorderLayout.CENTER);

        // Отображение окна
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }





}