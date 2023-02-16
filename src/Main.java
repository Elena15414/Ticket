public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 25_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}



 //Консоль
// "C:\Program Files\Eclipse Adoptium\jdk-11.0.17.8-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=65204:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Татьяна\ticket\out\production\ticket Main
//1250
//
//Process finished with exit code 0