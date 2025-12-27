/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author ellig
 */
//Ärver allt från basklassen
public class Handlaggare extends Anstalld {
    private String ansvarighetsomraden;
    private Handlaggare mentor;
    
    //super(); anropar och initierar Anstallds konstruktor
    public Handlaggare(String aid, String fornamn, String efternamn, String adress, String epost, String telefon, String anstallningsdatum, String losenord, Avdelning avdelning, String ansvarighetsomraden, Handlaggare mentor){
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
        this.ansvarighetsomraden = ansvarighetsomraden;
        this.mentor = mentor;
    }
    
    public void setAnsvarighetsomraden(String ansvarighetsomraden){
        this.ansvarighetsomraden = ansvarighetsomraden;
    }
    
    public String getAnsvarighetsomraden(){
        return ansvarighetsomraden;
    }
    
    //En if-sats ifall det inte finns en mentor?
    public String getMentorId(){
        return mentor.getAid();
    }
}
