/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author User
 */
public class Parser {
    
    private Document doc;
    private String name;
    
    
    public Parser(String name, String url) throws Exception {
        this.doc = Jsoup.connect(url).get();
        this.name = name;
        
    
    }
    
    public String getHeadlines() {
        String otsikot = "";// make a switch-case statement which implements the correct css-code for desired items
        if (this.name.contains("Wikipedia")) {
        Elements newsHeadlines = this.doc.select("#mp-itn b a");
        otsikot = parseHeadlines(newsHeadlines);
        System.out.println(newsHeadlines);
        }
        else if (this.name.contains("BBC")) {
        Elements newsHeadlines = this.doc.select("#top-story h2 a");
        Elements news2 = this.doc.select("#second-story h2 a");
        
        otsikot = parseHeadlines(newsHeadlines);
        System.out.println(newsHeadlines + "\n" + news2 );
        }
        return otsikot;
    }
    
    public String parseHeadlines(Elements otsikot) {
        
        String otsikkopaketti = "";
        otsikot = otsikot;
        
        return otsikkopaketti;
    }
    
    public void tulostaString() {
        String tuloste = "";
        tuloste = getHeadlines();
        System.out.println(tuloste);
    }
    
}
