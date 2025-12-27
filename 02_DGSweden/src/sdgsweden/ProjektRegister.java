/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

import java.util.ArrayList;

/**
 *
 * @author winte, detta klass finns för att kunna samla alla projekt för att sedan kunna 
 * ändra, lägga till, och ta bort projekt. 
 */
public class ProjektRegister {
    
    private static ArrayList<Projekt> projektLista = new ArrayList<>();
    
    public static void laggTillProjekt(Projekt p){ 
        projektLista.add(p);
    }
    
    public static ArrayList<Projekt> getAllaProjekt(){
        return projektLista;
    }
    
    public static boolean taBortProjekt(String pid){
        Projekt p = hamtaProjekt(pid);
        if(p != null){
        projektLista.remove(p);
        return true;
    }
        return false;
    }
    
    public static boolean finnsPid(String pid){
        for(Projekt p : projektLista){
            if(p.getPid().equals(pid)){
                return true;
            }
        }
        return false;
    }
    
    public static Projekt hamtaProjekt(String pid){
        for (Projekt p : projektLista){
            if(p.getPid().equals(pid)){
                return p;
            }
        }return null;
    }
    
    public static ArrayList<Projekt> hamtaAllaProjekt(){
        return projektLista;
    }
}
