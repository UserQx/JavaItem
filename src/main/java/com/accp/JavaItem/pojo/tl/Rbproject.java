package com.accp.JavaItem.pojo.tl;

public class Rbproject {
	
    private Integer rbprojectid;

    private Integer rescuebillid;

    private Integer artisansid;

    private Integer armemberid;

    private Integer repairbillid;

    private Integer rbprojectsl;

    private String rbprojectms;

    private String rbprojectyy;

    private Float yprice;

    private Float yprices;

    public Integer getRbprojectid() {
        return rbprojectid;
    }

    public void setRbprojectid(Integer rbprojectid) {
        this.rbprojectid = rbprojectid;
    }

    public Integer getRescuebillid() {
        return rescuebillid;
    }

    public void setRescuebillid(Integer rescuebillid) {
        this.rescuebillid = rescuebillid;
    }

    public Integer getArtisansid() {
        return artisansid;
    }

    public void setArtisansid(Integer artisansid) {
        this.artisansid = artisansid;
    }

    public Integer getArmemberid() {
        return armemberid;
    }

    public void setArmemberid(Integer armemberid) {
        this.armemberid = armemberid;
    }

    public Integer getRepairbillid() {
        return repairbillid;
    }

    public void setRepairbillid(Integer repairbillid) {
        this.repairbillid = repairbillid;
    }

    public Integer getRbprojectsl() {
        return rbprojectsl;
    }

    public void setRbprojectsl(Integer rbprojectsl) {
        this.rbprojectsl = rbprojectsl;
    }

    public String getRbprojectms() {
        return rbprojectms;
    }

    public void setRbprojectms(String rbprojectms) {
        this.rbprojectms = rbprojectms == null ? null : rbprojectms.trim();
    }

    public String getRbprojectyy() {
        return rbprojectyy;
    }

    public void setRbprojectyy(String rbprojectyy) {
        this.rbprojectyy = rbprojectyy == null ? null : rbprojectyy.trim();
    }

    public Float getYprice() {
        return yprice;
    }

    public void setYprice(Float yprice) {
        this.yprice = yprice;
    }

    public Float getYprices() {
        return yprices;
    }

    public void setYprices(Float yprices) {
        this.yprices = yprices;
    }
    
}