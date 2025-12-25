/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author winte
 */
public class ProjektHallbarhet {
    
    private String pid;
    private String hid;
 
public ProjektHallbarhet(String pid, String hid){
    this.pid = pid;
    this.hid = hid;
}

public String getPid(){
    return pid;
}

public String getHid(){
    return hid;
}
}
