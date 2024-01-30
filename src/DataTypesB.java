public class DataTypesB {
    public static void main(String[] args) {
        var salary = 1000; //int
        // pension es el 0.03% de lo que gane
        var pension = salary*0.0003; //double
        System.out.println(salary);
        System.out.println(pension);

        var totalSalary = salary - pension;
        System.out.println(totalSalary);

        var employeeName = "Basim Ibn Ishaq";
        System.out.println("Employee's name is: " + employeeName + " and his total salary is: $" + totalSalary);

    }
}
