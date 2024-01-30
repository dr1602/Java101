public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 2000;

        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //pension: $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        // 2 horas extra $30 c/u
        // comida: $45
        salary = salary + (2*30 - 45);
        System.out.println(salary);

        // Actualizando cadenas de texto
        String employeeName = "David González";
        employeeName = employeeName + " de la Cruz y Vega";
        System.out.println(employeeName);

        employeeName = "Leonardo " + employeeName;
        System.out.println(employeeName);
        System.out.println("Tu nombres es: " + employeeName + " y tu salario es: $" + salary + ".");

    }
}
