/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durchschnitt;

/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 */
public class Durchschnitt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    /**
     * Methode zur Berechnung des Durchschnittes eines Arrays 
     * von nichtnegativen int-Zahlen.
     * 
     * @param feld ein Array von int-Zahlen.
     * @return Der berechnete Durchschnitt der Zahlen im Array.
     */
    public double berechneDurchschnitt(int[] feld) {
        // Der Durchschnitt ergibt sich aus der Summe der Array-Element dividiert durch null.
        double durchschnitt = 0.0; // Initalisierung
        for(int i : feld){      //  jedes element i in feld
            durchschnitt+=i;    //  wird zum durchschnitt addiert
        }
        
        // die Summe muss nun durch die Anzahl der Array-Elemente dividiert werden.
        durchschnitt/=feld.length; 
        
        // Da die JVM bei einer Division durch 0 zu NaN auswertet, muessen wir dies pruefen
        // und im gegebenen Fall mit 0 ueberschreiben.
        return (Double.isNaN(durchschnitt))? 0 : durchschnitt; 
    }
    
}
