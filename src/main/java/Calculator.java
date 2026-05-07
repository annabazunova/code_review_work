public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        // Решение системы линейных уравнений:
        // 2x + 3y = 8
        // 4x - y = 2
        // Решение: x = 1, y = 2

        int a1 = 2, b1 = 3, c1 = 8;
        int a2 = 4, b2 = -1, c2 = 2;

        int determinant = dif(times(a1, b2), times(a2, b1));
        int x = div(dif(times(c1, b2), times(c2, b1)), determinant);
        int y = div(dif(times(a1, c2), times(a2, c1)), determinant);

        // Возвращаем x + y = 1 + 2 = 3
        return add(x, y);

    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(double a, double b, double c){
        // Проверка на линейное уравнение
        if (a == 0) {
            if (b == 0) {
                return new double[0]; // Нет решений или бесконечно много
            }
            return new double[] {-c / b}; // Один корень линейного уравнения
        }

        // Вычисление дискриминанта
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return new double[0]; // Нет действительных корней
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return new double[]{x}; // Один корень (кратности 2)
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            return new double[]{x1, x2}; // Два корня
        }
    }
}