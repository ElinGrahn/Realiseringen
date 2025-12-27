/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author nikecederlid
 */
public class AvdelningHållbarhet {
    private String avdid;
    private String hid;
    
    public AvdelningHållbarhet(String avdid, String hid){
        this.avdid = avdid;
        this.hid = hid;
    }
    
    public String getAvdid(){
        return avdid;
    }
    
    public String getHid(){
        return hid;
    }
    
}
