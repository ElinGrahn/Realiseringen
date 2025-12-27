/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdgsweden;

/**
 *
 * @author nikecederlid
 */
public class Stad {
    private String namn;
    private String sid;
    private String land;
    
public Stad (String namn, String SID){
        this.namn = namn;
        this.SID = SID;
    }

public String getNamn(){
    return namn;
}

public void setNamn(String namn){
    this.namn = namn;
}

public String getSid(){
    return sid;
}

public String getLand(){
    return land;
}

    
}
