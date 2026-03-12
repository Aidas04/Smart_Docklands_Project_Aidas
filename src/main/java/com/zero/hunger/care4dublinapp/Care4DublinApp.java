/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
    to change this license
 */

/* -----Application-Care4Dublin-----
    - Simple GUI for all levels of users
    - Create new Records for environmental issues in the Dublin Docks
    - Store the records in different ADT's
    - View Pending Records
    - Display Next Record to be resolved by Dublin City Council
    - Display most recently solved issue
*/


/*
Aidas Kibas
08.03.26
Care4DublinApp.java - CA1 for Data Structures and Algorithms
*/

package com.zero.hunger.care4dublinapp;

public class Care4DublinApp {

    // Running my main method for the app to allow for the landing page to open
    
    public static void main(String[] args) {
        
        LandingPage myLP = new LandingPage();
        myLP.setVisible(true); // ensuring the landing page can be seen
        
    }
}
