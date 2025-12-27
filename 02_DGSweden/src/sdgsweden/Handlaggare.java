/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author ellig
 */
public class Handlaggare {
    private Anstalld hAid;
    private String ansvarighetsomraden;
    private Mentor mentor;
    
    public Handlaggare(Anstalld aid, String ansvarighetsomraden, Mentor mentor){
        hAid = aid;
        this.ansvarighetsomraden = ansvarighetsomraden;
        this.mentor = mentor;
    }
    
    public String gethAid(){
        return hAid.getAid();
    }
    
    public void setAnsvarighetsomraden(String ansvarighetsomraden){
        this.ansvarighetsomraden = ansvarighetsomraden;
    }
    
    public String getAnsvarighetsomraden(){
        return ansvarighetsomraden;
    }
    
    public String getMid(){
        return mentor.getMid();
    }
}
