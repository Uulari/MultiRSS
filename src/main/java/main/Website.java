/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.HashMap;
import content.Otsikko;

/**
 *
 * @author User
 */
public interface Website {
    public HashMap<String, Otsikko> getItems();
    
    public String getUutisotsikot();
}
