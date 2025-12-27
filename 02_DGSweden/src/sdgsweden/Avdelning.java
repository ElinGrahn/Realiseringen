/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author nikecederlid
 */
public class Avdelning {
    private String avdid;
    private String avdelningnamn;
    private String beskrivning;
    private String adress;
    private String epost;
    private String telefon;

    
    public Avdelning(String avdid, String namn, String beskrivning, String adress, String epost, String telefon){
        this.avdid = avdid;
        this.avdelningnamn = avdelningnamn;
        this.beskrivning = beskrivning;
        this.adress = adress;
        this.epost = epost;
        this.telefon = telefon;
    }
    public String getAvdid(){
        return avdid;
    }
    
    public String getAvdelningnamn() {
        return avdelningnamn;
    }
    
    public void setNamn(String avdelningnamn){
        this.avdelningnamn = avdelningnamn;
    }

    public String getBeskrining(){
        return beskrivning;
    }
    
    public void setBeskrivning(String beskrivning){
        this.beskrivning = beskrivning;
    }
    
    public String getAdress(){
        return adress;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }
   
    public String getEpost(){
        return epost;
    }
    
    public void setEpost(String epost){
        this.epost = epost;
    }
    
    public String getTelefon(){
        return telefon;
    }
    
    public void setTelefon(String telefon){
        this.telefon = telefon;
    }
}