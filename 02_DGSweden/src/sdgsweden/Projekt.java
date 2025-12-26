/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author winte 
 */
public class Projekt {
     private String pid;
    private String projektnamn;
    private String beskrivning;
    private String startdatum;
    private String slutdatum;
    private int kostnad;
    private String status;
    private String prioritet;
    private String projektchefId;
    private String landId;
    
   
   public Projekt(String pid, String projektnamn, String beskrivning, String startdatum,
           String slutdatum, int kostnad, String status, String prioritet, String projektchefId, String landId){
       
       this.pid = pid;
       this.projektnamn = projektnamn;
       this.beskrivning = beskrivning;
       this.startdatum = startdatum;
       this.slutdatum = slutdatum;
       this.kostnad = kostnad;
       this.status = status;
       this.prioritet = prioritet;
       this.projektchefId = projektchefId;
       this.landId = landId;
   } 
    
  public String getPid(){
      return pid;
  }
  
  public String getProjektnamn(){
      return projektnamn;
  }
  
  public void setProjektnamn(String projektnamn){
      this.projektnamn = projektnamn;
  }
  
  public String getBeskrivning(){
      return beskrivning;
  }
  
  public void setBeskrivning(String beskrivning){
      this.beskrivning = beskrivning;
  }
  
  public String getStartdatum(){
      return startdatum;
  }
  
  public void setStartdatum(String startdatum){
      this.startdatum = startdatum;
  }
  
  public String getSlutdatum(){
      return slutdatum;
  }
  
  public void setSlutdatum(String slutdatum){
      this.slutdatum = slutdatum;
  }
  
  public int getKostnad(){
      return kostnad;
  }
  
  public void setKostnad(int kostnad){
      this.kostnad = kostnad;
  }
  
  public String getStatus(){
      return status;
  }
  
  public void setStatus(String status){
      this.status = status;
  }
  
  public String getPrioritet(){
      return prioritet;
  }
  
  public void setPrioritet(String prioritet){
      this.prioritet = prioritet;
  }
  
  public String getProjektchefId(){
      return projektchefId;
  }
  
  public void setProjektchefId(String projektchefId){
      this.projektchefId = projektchefId;
  }
  
  public String getLandId(){
      return landId;
  }
  
  public void setLandId(String landId){
      this.landId = landId;
  }
  
}
