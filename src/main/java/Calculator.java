public class Calculator {
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
