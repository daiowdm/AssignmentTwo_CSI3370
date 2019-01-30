/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author Mark
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ninety_Nine_Bottles_of_Beer();
    }
    
    
    public static void Ninety_Nine_Bottles_of_Beer(){
     
        //print 99 bottles
        for(int bottleCount = 99; bottleCount > 1; bottleCount--){
            System.out.println(bottleCount + " bottles of beer on the wall," + bottleCount + " bottles of beer\ntake one down, pass it around,"
                    + (bottleCount - 1) + " bottles of beer on the wall.");
        }//end for loop
        
        //print clsoing statement
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
        System.out.println("take one down, pass it around,no more bottles of beer on the wall.");
        
    }
}
