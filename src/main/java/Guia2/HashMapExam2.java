/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashMap;

/**
 *
 * @author Rocio
 */
public class HashMapExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         HashMap<Integer, String> animes = new HashMap<>();
        
        animes.put(1 , "Dragon Ball");
        animes.put(2 , "Naruto");
        animes.put(3 , "My Hero Academia");
        animes.put(4 , "Berserk");
        animes.put(5 , "Jojo's Biz");
        animes.put(6 , "Kimetsu no Yaiba");
        animes.put(7 , "Soul Eater");
        animes.put(8 , "Tengen Topa");
        animes.put(9 , "Fairy Tail");
        animes.put(10 ,"Shingeki no Kyojin");
        
        System.out.println("Algunos animes shonen son: \n" + animes);
        
        HashMap<Integer, String> AnimeShojo = new HashMap<>();
        
        AnimeShojo.put(11 , "Kimi ni todoke");
        AnimeShojo.put(12 , "Kamisama Kiss");
        AnimeShojo.put(13 , "Sailor Moon");
        AnimeShojo.put(14 , "Shugo Chara");
        AnimeShojo.put(15 , "Fruits Basket");
        AnimeShojo.put(16 , "Ao Haru Ride");
        AnimeShojo.put(17 , "Ore monogatari");
        AnimeShojo.put(18 , "My Little monster");
        AnimeShojo.put(19 , "Ouran High School");
        AnimeShojo.put(20 , "Skip Beat");
        
        System.out.println("Algunos animes shojo son: \n" + AnimeShojo);
        // TODO code application logic here
    }
    
}
