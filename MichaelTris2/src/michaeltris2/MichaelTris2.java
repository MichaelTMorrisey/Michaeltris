/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package michaeltris2;

import java.util.Random;

/**
 *
 * @author Mike Morrisey
 */
public class MichaelTris2 {

  
    public static void main(String[] args) {
    
        //create new gameboard
        gameBoard myBoard = new gameBoard();
        //print the board
        myBoard.printBoard();
        //choose next piece
        GamePiece nextPiece = new GamePiece();
//        while (1){
        //Take user input
        //update gamestate
        //redraw gamestate
            
 //       }
    }//end main()
    
    //*****************************************************
    //declare a gamePiece class to use as the next piece
    public static class GamePiece{
        int[] bottomRow;
        int[] firstRow;
        int[] secondRow;
        int[] thirdRow;
        int rotationIndex;

        //write a constructor method that creates the next piece
        public GamePiece (){
        
        //create a Random class object to make random numbers
        Random myRandom = new Random();
        
        //select a random integer between 0-6
        int pieceIndex = myRandom.nextInt(7) + 1;
        //generate the random gamepiece with constructor
        //using random number and 0 as rotateState
        
        switch (pieceIndex) {
            case 1: Z myZ = new Z(0);
                break;
            case 2: S myS = new S(0);
                break;
            case 3: d myd = new d(0);
                break;
            case 4: b myb = new b(0);
                break;
            case 5: o myo = new o(0);
                break;
            case 6: l myl = new l(0);
                break;
            case 7: T myT = new T(0);
                break;
           default: System.out.println("Error creating next piece!");
                break;
        }//end switch(pieceIndex)
        }//end GamePiece constructor
    }//end GamePiece class
//**********************************************************
    //declare a gameboard class to use as a background
    public static class gameBoard{
    //create a pointer that can reference the top of the 
    int topLine;
    //create a 2D array of (22) 10-int-wide arrays
    int[][] screen = new int[22][10];
    
    //a gameBoard constructor method
    //to initialize the board to all zeros
    public gameBoard(){
        topLine = 0;
//        for (int i = 0; i < 22; i++)
//            for (int j = 0; j < 10; j++)
//                screen[i][j] = 0;
    }// end gameBoard() constructor
    
    public void printBoard(){
        for (int i = 0; i < 22; i++){
            for (int j = 0; j < 10; j++)
                System.out.print(screen[i][j] + " ");
            System.out.print("\n");
        }
    }//end printBoard()
    
    }//end class gameBoard

//**********************************************************

//declare 6 classes, one for each of the 6 gamepieces
    
    //declare a class of Z pieces
public class Z{
    public Z(int rotateState){
        if (rotateState == 0){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,0,1,1,0,0,0,0};
            int[] bottomLine = {0,0,0,0,0,1,1,0,0,0};
        }//end rotateState 0
        if (rotateState == 1) {
            int[] thirdLine = new int[10];
            int[] secondLine = {0,0,0,0,0,1,0,0,0,0};   
            int[] firstLine =  {0,0,0,0,1,1,0,0,0,0};
            int[] bottomLine = {0,0,0,0,1,0,0,0,0,0};
        }//end rotateState 1
    }//end constructor Z(rotateState)
}// end class Z

//declare a class of S pieces
public class S{
    public S(int rotateState){
        if(rotateState == 0){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,0,1,1,0,0,0,0};
            int[] bottomLine = {0,0,0,1,1,0,0,0,0,0};            
        }//end rotateState 0
        else if(rotateState == 1){
            int[] thirdLine = new int[10];
            int[] secondLine = {0,0,0,0,1,0,0,0,0,0};   
            int[] firstLine =  {0,0,0,0,1,1,0,0,0,0};
            int[] bottomLine = {0,0,0,0,0,1,0,0,0,0};
        }//end rotateState 1
    }//end constructor S(rotateState)
}// end class S

//declare a class of d pieces
public class d{
    public d(int rotateState){
        if(rotateState == 0){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,0,1,0,0,0,0,0};
            int[] bottomLine = {0,0,0,0,1,1,1,0,0,0};        
        }//end rotateState 0
        else if(rotateState == 1){
            int[] thirdLine = new int[10];
            int[] secondLine = {0,0,0,0,1,1,0,0,0,0}; 
            int[] firstLine =  {0,0,0,0,1,0,0,0,0,0};
            int[] bottomLine = {0,0,0,0,1,0,0,0,0,0}; 
        }//end rotateState 1
        else if(rotateState == 2){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,0,1,1,1,0,0,0};
            int[] bottomLine = {0,0,0,0,0,0,1,0,0,0};         
        }//end rotateState 2
        else if(rotateState == 3){
            int[] thirdLine = new int[10];
            int[] secondLine = {0,0,0,0,0,1,0,0,0,0}; 
            int[] firstLine =  {0,0,0,0,0,1,0,0,0,0};
            int[] bottomLine = {0,0,0,0,1,1,0,0,0,0}; 
        }//end rotateState 3
    }//end constructor d(rotateState)
}//end class d

//declare a class of b pieces
public class b{
    public b(int rotateState){
        if(rotateState == 0){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,0,0,1,0,0,0,0};
            int[] bottomLine = {0,0,0,1,1,1,0,0,0,0};         
        }//end rotateState 0
        else if(rotateState == 1){
            int[] thirdLine = new int[10];
            int[] secondLine = {0,0,0,0,1,0,0,0,0,0}; 
            int[] firstLine =  {0,0,0,0,1,0,0,0,0,0};
            int[] bottomLine = {0,0,0,0,1,1,0,0,0,0}; 
        }//end rotateState 1
        else if(rotateState == 2){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,1,1,1,0,0,0,0};
            int[] bottomLine = {0,0,0,1,0,0,0,0,0,0}; 
        }//end rotateState 2
        else if(rotateState == 3){
            int[] thirdLine = new int[10];
            int[] secondLine = {0,0,0,0,1,1,0,0,0,0}; 
            int[] firstLine =  {0,0,0,0,0,1,0,0,0,0};
            int[] bottomLine = {0,0,0,0,0,1,0,0,0,0}; 
        }//end rotateState 3
        
        
    }//end constructor b(rotateState)
}//end class b

//declare a class of o pieces
public class o{
    public o(int rotateState){
        if(rotateState == 0){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,0,1,1,0,0,0,0};
            int[] bottomLine = {0,0,0,0,1,1,0,0,0,0}; 
        }//end rotateState 0
    }//end constructor o(rotateState)
}//end class o

//declare a class of l pieces
public class l{
    public l(int rotateState){
        if(rotateState == 0){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,0,0,0,0,0,0,0};
            int[] bottomLine = {0,0,0,1,1,1,1,0,0,0}; 
        }//end rotateState 0
        if(rotateState == 1){
            int[] thirdLine =  {0,0,0,0,0,1,0,0,0,0};
            int[] secondLine = {0,0,0,0,0,1,0,0,0,0}; 
            int[] firstLine =  {0,0,0,0,0,1,0,0,0,0};
            int[] bottomLine = {0,0,0,0,0,1,0,0,0,0}; 
        }//end rotateState 1
    }//end constructor l(rotateState)
}//end class l

//declare a class of T pieces
public class T{
    public T(int rotateState){
        if(rotateState == 0){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,0,0,1,0,0,0,0};
            int[] bottomLine = {0,0,0,0,1,1,1,0,0,0};
        }//end rotateState 0
        else if(rotateState == 1){
            int[] thirdLine = new int[10];
            int[] secondLine = {0,0,0,0,0,1,0,0,0,0}; 
            int[] firstLine =  {0,0,0,0,0,1,1,0,0,0};
            int[] bottomLine = {0,0,0,0,0,1,0,0,0,0};
        }//end rotateState 1
        if(rotateState == 2){
            int[] thirdLine = new int[10];
            int[] secondLine = new int[10];
            int[] firstLine =  {0,0,0,0,1,1,1,0,0,0};
            int[] bottomLine = {0,0,0,0,0,1,0,0,0,0};
        }//end rotateState 2
        else if(rotateState == 3){
            int[] thirdLine = new int[10];
            int[] secondLine = {0,0,0,0,0,1,0,0,0,0}; 
            int[] firstLine =  {0,0,0,0,1,1,0,0,0,0};
            int[] bottomLine = {0,0,0,0,0,1,0,0,0,0};
        }//end rotateState 3
    }//end constructor T
}//end class T


}//end class Michaeltris
