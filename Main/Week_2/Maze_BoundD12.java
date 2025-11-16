package Week_2;

import java.util.Scanner;
import java.util.Random;

public class Maze_BoundD12  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int playerRow=1;
        int playerCol=1;
        int monsterRow=1;
        int monsterCol=11;

        int rightCount = 0;
        int leftCount = 0;
        int upCount = 0;
        int downCount = 0;
        int round = 1;
        int moveCount = 0;

        boolean live = true;

        char[][] map = {
                {'#','#','#','#','#','#','#','#','#','#','#','#','#'},
                {'#','P',' ',' ',' ','#',' ',' ',' ',' ',' ','M','#'},
                {'#',' ','#','#','#',' ','#','#','#',' ',' ',' ','#'},
                {'#',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ','#'},
                {'#','#','#',' ','#',' ','#','#','#',' ','#',' ','#'},
                {'#',' ',' ',' ',' ','#',' ',' ',' ',' ',' ',' ','#'},
                {'#','#','#','#','#','#','#','#','#','#','#','#','#'}
        };
        while(live){
            for (int i = 0;i< map.length;i++){
                for(int j = 0;j < map.length;j++){
                    System.out.println(map[i][j]);
                }
            }

            System.out.println("Start moving (w/a/s/d): ");
            String input = sc.nextLine();

            map[playerCol][playerRow] = ' ';

            if(input.equalsIgnoreCase("w") && map[playerCol-1][playerRow] != '#'){
                playerCol--;
                upCount++;
            }
        }
        }

    }

}
