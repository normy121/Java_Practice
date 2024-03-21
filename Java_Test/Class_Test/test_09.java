public class test_09 {
    int modelYear;
    String modelName;
    public test_09(int year, String name){  // Constructor與一般的Method不同之處為可以改變class裡面屬性的值。
        modelYear = year;   //通常用來初始化class內的屬性
        modelName = name;
    }

    public static void main(String[] args) {
        test_09 myCar = new test_09(1969, "Mustang"); // 在宣告object的時候，指定值給class
        System.out.println("Car name is " + myCar.modelName + ".");
        System.out.println("The year is " + myCar.modelYear + ".");
    }
}
