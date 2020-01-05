package com.accp.JavaItem.pojo.tl;

import java.util.Date;
import java.util.List;

public class Repairbill {
	
    private Integer repairbillid;

    private Integer shifstid;

    private Integer serviceitid;

    private Integer clearingformid;

    private Integer uvehicleid;

    private Integer armemberid;

    private Date repairbilldate;

    private Date repairbilldated;

    private Date repairbilldates;

    private Float rbbudget;

    private String receptionnote;

    private String statement;

    private Integer servicestateid;
    
    //对应的订单项目
    private List<Rbproject> bills;
    
    public List<Rbproject> getBills() {
		return bills;
	}

	public void setBills(List<Rbproject> bills) {
		this.bills = bills;
	}

	public Integer getRepairbillid() {
        return repairbillid;
    }

    public void setRepairbillid(Integer repairbillid) {
        this.repairbillid = repairbillid;
    }

    public Integer getShifstid() {
        return shifstid;
    }

    public void setShifstid(Integer shifstid) {
        this.shifstid = shifstid;
    }

    public Integer getServiceitid() {
        return serviceitid;
    }

    public void setServiceitid(Integer serviceitid) {
        this.serviceitid = serviceitid;
    }

    public Integer getClearingformid() {
        return clearingformid;
    }

    public void setClearingformid(Integer clearingformid) {
        this.clearingformid = clearingformid;
    }

    public Integer getUvehicleid() {
        return uvehicleid;
    }

    public void setUvehicleid(Integer uvehicleid) {
        this.uvehicleid = uvehicleid;
    }

    public Integer getArmemberid() {
        return armemberid;
    }

    public void setArmemberid(Integer armemberid) {
        this.armemberid = armemberid;
    }

    public Date getRepairbilldate() {
        return repairbilldate;
    }

    public void setRepairbilldate(Date repairbilldate) {
        this.repairbilldate = repairbilldate;
    }

    public Date getRepairbilldated() {
        return repairbilldated;
    }

    public void setRepairbilldated(Date repairbilldated) {
        this.repairbilldated = repairbilldated;
    }

    public Date getRepairbilldates() {
        return repairbilldates;
    }

    public void setRepairbilldates(Date repairbilldates) {
        this.repairbilldates = repairbilldates;
    }

    public Float getRbbudget() {
        return rbbudget;
    }

    public void setRbbudget(Float rbbudget) {
        this.rbbudget = rbbudget;
    }

    public String getReceptionnote() {
        return receptionnote;
    }

    public void setReceptionnote(String receptionnote) {
        this.receptionnote = receptionnote == null ? null : receptionnote.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    public Integer getServicestateid() {
        return servicestateid;
    }

    public void setServicestateid(Integer servicestateid) {
        this.servicestateid = servicestateid;
    }
}