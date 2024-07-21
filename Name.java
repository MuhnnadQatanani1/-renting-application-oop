
package com.mycompany.renting_application;

//composition
class Name {
    private String FName;
    private String MName;
    private String LName;

     public Name(String FName, String MName, String LName) {
        this.FName = FName;
        this.MName = MName;
        this.LName = LName;
    }
     public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

   
}
