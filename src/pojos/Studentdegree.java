package pojos;
// Generated Dec 22, 2019 10:32:27 AM by Hibernate Tools 4.3.1



/**
 * Studentdegree generated by hbm2java
 */
public class Studentdegree  implements java.io.Serializable {


     private int regno;
     private String type;
     private String curriculam;
     private String sid;
     private int programmeId;

    public Studentdegree() {
    }

    public Studentdegree(int regno, String type, String curriculam, String sid, int programmeId) {
       this.regno = regno;
       this.type = type;
       this.curriculam = curriculam;
       this.sid = sid;
       this.programmeId = programmeId;
    }
   
    public int getRegno() {
        return this.regno;
    }
    
    public void setRegno(int regno) {
        this.regno = regno;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getCurriculam() {
        return this.curriculam;
    }
    
    public void setCurriculam(String curriculam) {
        this.curriculam = curriculam;
    }
    public String getSid() {
        return this.sid;
    }
    
    public void setSid(String sid) {
        this.sid = sid;
    }
    public int getProgrammeId() {
        return this.programmeId;
    }
    
    public void setProgrammeId(int programmeId) {
        this.programmeId = programmeId;
    }




}


