/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author ellig
 */
public class Admin {
    private Anstalld aAid;
    private String behorighetsniva;
    
    public Admin(Anstalld aid, String behorighetsniva){
        aAid = aid;
        this.behorighetsniva = behorighetsniva;
    }
    
    public String getAdminAid(){
        return aAid.getAid();
    }
    
    public void setBehorighetsniva(String behorighetsniva){
        this.behorighetsniva = behorighetsniva;
    }
    
    public String getBehorighetsniva(){
        return behorighetsniva;
    }
}
