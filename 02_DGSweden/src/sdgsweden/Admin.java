/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author ellig
 */
public class Admin extends Anstalld {
     private String behorighetsniva;
    
    public Admin(String aid, String fornamn, String efternamn, String adress, String epost, String telefon, String anstallningsdatum, String losenord, Avdelning avdelning, String behorighetsniva){
        super(
        aid,
        fornamn,
        efternamn,
        adress,
        epost,
        telefon,
        anstallningsdatum,
        losenord,
        avdelning
        );
        this.behorighetsniva = behorighetsniva;
    }
    
    public void setBehorighetsniva(String behorighetsniva){
        this.behorighetsniva = behorighetsniva;
    }
    
    public String getBehorighetsniva(){
        return behorighetsniva;
    }
}
