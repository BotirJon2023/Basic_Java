package Practice2;

import java.sql.SQLOutput;

public enum Enum_Tast1 {
    WINTER("snow"),
    SPRING("birds come back"),
    SUMMER("holidays"),
    AUTUMN("harvest");

    private String weather;

    Enum_Tast1(String weather) {

        this.weather = weather;


    }

    public String getWeather() {

        return weather;
    }

        public static void main(String[] args) {
            Enum_Tast1[] seasons = Enum_Tast1.values();
            for (Enum_Tast1 season : seasons) {

                System.out.println(season);
                System.out.println(season.getWeather()+ "\n");
                System.out.println(Enum_Tast1.valueOf("WINTER"));
            }
            for (int i = 0; i < seasons.length; i++) {

                System.out.println(i);
            }



        }
    }

