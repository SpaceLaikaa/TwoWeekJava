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
                {'#',' ','#','#','#',' ','#',' ','#',' ','#',' ','#'},
                {'#',' ','#',' ',' ',' ','#',' ',' ',' ','#',' ','#'},
                {'#',' ','#',' ','#','#','#',' ','#','#','#',' ','#'},
                {'#',' ',' ',' ',' ',' ','#',' ','#',' ',' ',' ','#'},
                {'#',' ','#','#','#',' ',' ',' ','#',' ','#','G','#'},
                {'#',' ',' ',' ',' ',' ','#',' ',' ',' ',' ',' ','#'},
                {'#','#','#','#','#','#','#','#','#','#','#','#','#'}
        };
        while(live){
            if(map[playerRow][playerCol]== map[monsterRow][monsterCol]){
                System.out.println("Monster caught you.");
                break;
            }

            //Map
            for (int i = 0;i< map.length;i++){
                for(int j = 0;j < map[i].length;j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }

            //Player
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

            map[playerRow][playerCol] = 'P';

            if(map[playerRow][playerCol] == 'G'){
                System.out.println("Yes!! You reach the end.");
            }
            // Monster

            map[monsterRow][monsterCol] = monsterOld;

            int mr = r.nextInt(4); // mr means monsterRandom

            int newMonsterRow = monsterRow;
            int newMonsterCol = monsterCol;

            if (mr == 0) newMonsterRow--;
            else if (mr == 1) newMonsterRow++;
            else if (mr == 2) newMonsterCol--;
            else if (mr == 3) newMonsterCol++;

            if (map[newMonsterRow][newMonsterCol] != '#') {

                if (newMonsterRow == playerRow && newMonsterCol == playerCol) {
                    System.out.println("Monster caught you.");
                    break;
                }

                monsterOld = map[newMonsterRow][newMonsterCol];

                monsterRow = newMonsterRow;
                monsterCol = newMonsterCol;
            }

            map[monsterRow][monsterCol] = 'M';
        }
        }
        }



