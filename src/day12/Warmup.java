package day12;

public class Warmup {
    public static void main(String[] args) {
        String weather = "rainy";

        if(weather.equalsIgnoreCase("Sunny")){
            System.out.println("Sunny Weather");
        }else if(weather.equalsIgnoreCase("Rainy")){
            System.out.println("Rainy weather");
        }else if(weather.equalsIgnoreCase("Cloudy")) {
            System.out.println("Cloudy weather");
        }else if(weather.equalsIgnoreCase("Snowy")) {
            System.out.println("Snowy weather");
        }else{
            System.out.println("keep coding");
        }
    }
}
