package Week_2;

import java.util.Scanner;
import java.util.Random;

public class Maze_BoundD12andD13  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int playerRow=1;
        int playerCol=1;
        int monsterRow=1;
        int monsterCol=11;
        char monsterOld=' ';


        int rightCount = 0;
        int leftCount = 0;
        int upCount = 0;
        int downCount = 0;
        int round = 1;
        int moveCount = 0;

        boolean live = true;
        boolean lost = false;

        char[][] map = {
                {'#','#','#','#','#','#','#','#','#','#','#','#','#'},
                {'#','P',' ',' ',' ',' ',' ',' ','#',' ',' ','M','#'},
                {'#',' ','#','#','#',' ','#',' ','#',' ',' ',' ','#'},
                {'#',' ','#',' ',' ',' ','#',' ',' ',' ',' ',' ','#'},
                {'#',' ','#',' ','#',' ',' ',' ','#','#',' ',' ','#'},
                {'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#'},
                {'#',' ','#','#','#',' ',' ',' ','#',' ','#','G','#'},
                {'#',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ','#'},
                {'#','#','#','#','#','#','#','#','#','#','#','#','#'}
        };
        while(live){
            if(map[playerRow][playerCol]== map[monsterRow][monsterCol]){
                System.out.println("Monster caught you.");
                break;
            }

            for (int i = 0;i< map.length;i++){
                for(int j = 0;j < map[i].length;j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }

            System.out.println("Start moving (w/a/s/d): ");
            String input = sc.nextLine();

            map[playerRow][playerCol] = ' ';

            if(input.equalsIgnoreCase("w") && map[playerRow-1][playerCol] != '#'){
                playerRow--;
                upCount++;
            }
            else if(input.equalsIgnoreCase("a")&& map[playerRow][playerCol-1] != '#') {
                playerCol--;
                leftCount++;
            }
            else if (input.equalsIgnoreCase("d")&& map[playerRow][playerCol+1] != '#') {
                playerCol++;
                rightCount++;
            }
            else if (input.equalsIgnoreCase("s")&& map[playerRow+1][playerCol]!='#') {
                playerRow++;
                downCount++;
            }
            else{
                System.out.println("Invalid input");
            }

            if(map[playerRow][playerCol] == 'G'){
                System.out.println("Yes!! You reach the end.");
                live = false;
                break;
            }
            map[playerRow][playerCol] = 'P';

            map[monsterRow][monsterCol] = monsterOld;

            int newMonsterRow = monsterRow;
            int newMonsterCol = monsterCol;

            int dRow = playerRow - monsterRow;
            int dCol = playerCol - monsterCol;

            if(dRow > 0 && map[monsterRow+1][monsterCol] != '#') newMonsterRow++;
            else if(dRow < 0 && map[monsterRow-1][monsterCol] != '#') newMonsterRow--;
            else if(dCol > 0 && map[monsterRow][monsterCol+1] != '#') newMonsterCol++;
            else if(dCol < 0 && map[monsterRow][monsterCol-1] != '#') newMonsterCol--;

            if(newMonsterRow == playerRow && newMonsterCol == playerCol) {
                System.out.println("Monster caught you.");
                break;
            }

            monsterOld = map[newMonsterRow][newMonsterCol];

            monsterRow = newMonsterRow;
            monsterCol = newMonsterCol;

            map[monsterRow][monsterCol] = 'M';
        }
    }
}
