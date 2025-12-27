/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author nikecederlid
 */
public class Hållbarhetsmål {
    private String hid;
    private String namn;
    private int malnummer;
    private String beskrivning;
    private String prioritet;
    
    public Hållbarhetsmål(String hid, String namn, int malnummer, String beskrivning, String prioritet){
        this.hid = hid;
        this.namn = namn;
        this.malnummer = malnummer;
        this.beskrivning = beskrivning;
        this.prioritet = prioritet;
    }
    
    public String getHid(){
        return hid;
    }
    
    public String getNamn(){
        return namn;
    }
    
    public void setNamn(String namn) {
        this.namn = namn;
    }
    
    public int getMalnummer(){
        return malnummer;
    }
    
    public void setMalnummer(int malnummer){
        this.malnummer = malnummer;
    }
    
    public String getBeskrvining(){
        return beskrivning;
    }
    
    public void setBeskrivning(String beskrivning){
        this.beskrivning = beskrivning;
    }
    
    public String getPrioritet(){
        return prioritet; 
    }
    
    public void setPrioritet(String prioritet){
        this.prioritet = prioritet;
    }
    
}
