package model;
// Generated Aug 2, 2017 9:27:24 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Course generated by hbm2java
 */
public class Course  implements java.io.Serializable {


     private BigDecimal id;
     private String course;
     private long fees;
     private long duration;

    public Course() {
    }

    public Course(BigDecimal id, String course, long fees, long duration) {
       this.id = id;
       this.course = course;
       this.fees = fees;
       this.duration = duration;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getCourse() {
        return this.course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    public long getFees() {
        return this.fees;
    }
    
    public void setFees(long fees) {
        this.fees = fees;
    }
    public long getDuration() {
        return this.duration;
    }
    
    public void setDuration(long duration) {
        this.duration = duration;
    }




}


