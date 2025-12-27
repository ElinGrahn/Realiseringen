/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author ellig
 */
public class Anstalld {
    private String aid;
    private String fornamn;
    private String efternamn;
    private String adress;
    private String epost;
    private String telefon;
    private String anstallningsdatum;
    private String losenord;
    private Avdelning avdelning;
    
    public Anstalld(String aid, String fornamn, String efternamn, String adress, String epost, String telefon, String anstallningsdatum, String losenord){
        this.aid = aid;
        this.fornamn = fornamn;
        this.efternamn = efternamn;
        this.adress = adress;
        this.epost = epost;
        this.telefon = telefon;
        this.anstallningsdatum = anstallningsdatum;
        this.losenord = losenord;
}
    
    public String getAid(){
        return aid;
    }
    
    public void setFornamn(String fornamn){
        this.fornamn = fornamn;
    }
    
    public String getFornamn(){
        return fornamn;
    }
    
    public void setEfternamn(String efternamn){
        this.efternamn = efternamn;
    }
    
    public String getEfternamn(){
        return efternamn;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setEpost(String epost){
        this.epost = epost;
    }
    
    public String getEpost(){
        return epost;
    }
    
    public void setTelefon(String telefon){
        this.telefon = telefon;
    }
    
    public String getTelefon(){
        return telefon;
    }
    
    public void setAnstallningsdatum(String anstallningsdatum){
        this.anstallningsdatum = anstallningsdatum;
    }
    
    public String getAnstallningsdatum(){
        return anstallningsdatum;
    }
    
    public void setLosenord(String losenord){
        this.losenord = losenord;
    }
    
    public String getLosenord(){
        return losenord;
    }
    
      public void setAvdelning(Avdelning avdelning) {
        this.avdelning = avdelning;
    }

    public String getAvdelning() {
        return avdelning.getNamn();
    }
    
    
}


