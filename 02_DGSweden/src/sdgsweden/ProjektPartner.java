/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author winte
 */
public class ProjektPartner {
    
    private String pid;
    private String partnerPid;
    
public ProjektPartner(String pid, String partnerPid){
    this.pid = pid;
    this.partnerPid = partnerPid;
}

public String getPid(){
    return pid;
}

public String getPartnerPid(){
    return partnerPid;
}
}
