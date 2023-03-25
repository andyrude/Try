package datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueens2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        System.out.println( getNQueens( n));
    }

    public static List<List<String>> getNQueens(int n) {
        List<List<String>> answer = new ArrayList<>();
        char[][] board = new char[n][n];
        for( int i = 0; i < n; i++){
            for( int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        NQueens( board, 0, n, answer);
        return answer;
    }

    public static void NQueens( char[][] board, int row, int n, List<List<String>> answer){

        if( row == n){
            answer.add( new ArrayList<>( getInListForm( board)));
            return;
        }

        for( int i = 0; i < n; i++){
            if( isValid( board, row, i, n)){
                board[row][i] = 'Q';
                NQueens( board, row + 1, i, answer);
                board[row][i] = '.';
            }
        }
        return;
    }

    public static boolean isValid( char[][] board, int row, int col, int n){
        return checkRow( board, row, col, n) && checkCol( board, row, col, n) && checkGrid(board, row, col, n);
    }

    public static boolean checkRow( char[][] board, int row, int  col, int n){
        for( int i = 0; i < n; i++){
            if( board[row][i] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean checkCol( char[][] board,int row,int col,int n){
        for( int i = 0; i < n; i++){
            if( board[i][col] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean checkGrid(char[][] board, int row, int col, int n){
        int x = row;
        int y = col;

        while( x >= 0 && y >= 0){
            if( board[x][y] =='Q'){
                return false;
            }
            x-=1;
            y-=1;
        }

        x = row;
        y = col;

        while( x >= 0 && y < n){
            if( board[x][y] == 'Q'){
                return false;
            }
            x-=1;
            y+=1;
        }

        x = row;
        y = col;

        while( x < n && y >= 0){
            if( board[x][y] == 'Q'){
                return false;
            }
            x += 1;
            y -= 1;
        }
        x = row;
        y = col;

        while( x < n && y < n){
            if( board[x][y] == 'Q'){
                return false;
            }
            x =+ 1;
            y += 1;
        }
        return true;
    }

    public static List<String> getInListForm( char[][] charArray){
        List<String> li = new ArrayList<String>();
        for( int i = 0; i < charArray.length; i++){
            String p = "";
            for( int j = 0; j < charArray.length; j++){
                if( charArray[i][j] == 'Q'){
                    p = p + "Q";
                }else{
                    p = p + ".";
                }
            }
            li.add( p);
        }
        return li;
    }
}
