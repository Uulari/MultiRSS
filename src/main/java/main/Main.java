/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import parser.Parser;

/**
 *
 * @author User
 */
public class Main {
    public static void main (String[] args) throws Exception{
        Parser wikipedia = new Parser("Wikipedia", "http://en.wikipedia.org/");
        wikipedia.tulostaString();
        Parser bbcEurope = new Parser("BBC Europe","http://www.bbc.com/news/world/europe/");
        bbcEurope.tulostaString();
    }
}
