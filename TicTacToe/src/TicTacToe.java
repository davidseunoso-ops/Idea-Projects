import java.util.Scanner;
public class TicTacToe {
    public static void main(String... args) {

        char[][] gameBoard = new char[3][3];


        char player = 'X';
        boolean gameEnded = false;
        Scanner input = new Scanner(System.in);

        while(!gameEnded) {
            theGameBoard(gameBoard);
            System.out.print("Player " + player + " enter: ");
            int row = input.nextInt();
            int column = input.nextInt();

            if(gameBoard[row][column] != 'X' && gameBoard[row][column]!= 'O') {
                gameBoard[row][column] = player;
                gameEnded = won(gameBoard, player);

                if(gameEnded) {
                    System.out.print("Player " + player + " has won: ");
                }
                else {
                    if(player == 'X') {
                        player = 'O';
                    }
                    else {
                        player = 'X';
                    }
                }
            }
            else {
                System.out.println("Invalid. Try Again!");
            }
        }
        theGameBoard(gameBoard);
    }

    public static boolean won(char[][] gameBoard, char player) {
        for(int row = 0; row < gameBoard.length; row++) {
            if(gameBoard[row][0] == player && gameBoard[row][1] == player && gameBoard[row][2] == player) {
                return true;
            }
        }

        for(int column = 0; column < gameBoard.length; column++) {
            if(gameBoard[0][column] == player && gameBoard[1][column] == player && gameBoard[2][column] == player) {
                return true;
            }
        }

        if(gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player) {
            return true;
        }
        if(gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player) {
            return true;
        }
        return false;
    }

    public static void theGameBoard(char[][] gameBoard) {
        for(int row = 0; row < 3; row++) {
            System.out.print(" " + gameBoard[row][0] + " | " + gameBoard[row][1] + " | " + gameBoard[row][2]);
            System.out.println();
            if(row < 2) {
                System.out.println("---+---+---");
            }
        }
    }
}