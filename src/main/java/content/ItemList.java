/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package content;

import java.util.HashMap;
import main.Website;

/**
 *
 * @author User
 */
public class ItemList implements Website{
    
    HashMap<String, Otsikko> otsikot;
    
    public ItemList () {
        this.otsikot = new HashMap();
    
    }

    
    @Override
    public HashMap<String, Otsikko> getItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUutisotsikot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
