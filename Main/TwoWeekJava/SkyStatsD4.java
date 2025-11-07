//Actually this is my school lab project but I really some good amount of effort and time to it ,so I
//Wanted to post this for today's task.

package TwoWeekJava;

import java.util.Random;

public class SkyStatsD4 {
    public static String[] weatherPool(){
        int i = 0;
        String[] pool = new String[100];
        for(;i<40;i++){
            pool[i] = "Sunny";
        }
        for(;i<70;i++){
            pool[i] = "Cloudy";
        }
        for (;i<90;i++){
            pool[i] = "Rainy";
        }
        for (;i<100;i++){
            pool[i] = "Stormy";
        }
        return pool;
    }

    public static void main(String[] args) {
        Random r = new Random();
        String[] pool = weatherPool();
        double sunnyCnt = 0;
        double cloudyCnt = 0;
        double rainyCnt = 0;
        double stormyCnt = 0;

        for (int i = 0;i<1000000;i++){
            int index = r.nextInt(100);
            String weather = pool[index];
            if (weather.equals("Sunny")) {
                sunnyCnt++;
            }
            else if(weather.equals("Cloudy")) {
                cloudyCnt++;
            }
            else if(weather.equals("Rainy")) {
                rainyCnt++;
        }
            else {
                stormyCnt++;
            }
        }
        System.out.printf("Sunny: %f (%.2f%%)\n", sunnyCnt, sunnyCnt / 1000000 * 100);
        System.out.printf("Cloudy: %f (%.2f%%)\n", cloudyCnt, cloudyCnt / 1000000 * 100);
        System.out.printf("Rainy: %f (%.2f%%)\n", rainyCnt, rainyCnt / 1000000 * 100);
        System.out.printf("Stormy: %f (%.2f%%)\n", stormyCnt, stormyCnt / 1000000 * 100);
    }
}
