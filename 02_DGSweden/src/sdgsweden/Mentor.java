/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author ellig
 */
public class Mentor {
    private Anstalld mid;
    
    public Mentor(Anstalld mid){
        this.mid = mid;
    }
    
    public String getMid(){
        return mid.getAid();
    }
}
