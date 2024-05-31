/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieproject;

/**
 *
 * @author Simona
 */
public class ProdajbaItem {
    private String vidPlashtane;

    public String getVidPlashtane() {
        return vidPlashtane;
    }

    public void setVidPlashtane(String vidPlashtane) {
        this.vidPlashtane = vidPlashtane;
    }
       public ProdajbaItem(String vidPlashtane) {
      
        setVidPlashtane(vidPlashtane);
       
    }

    public ProdajbaItem() {
        this("Банка");
        
    }
}
