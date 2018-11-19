package com.niit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Project {
    private Integer pid;

    private String uphone;

    private String pname;

    private String pdesc;

    private Date psd;

    private Integer pnm;

    private Integer pcategoryid;

    private String premark;

    private Integer pstate;

    private BigDecimal pweight;

    private BigDecimal pprice;

    private String pbrand;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }

    public Date getPsd() {
        return psd;
    }

    public void setPsd(Date psd) {
        this.psd = psd;
    }

    public Integer getPnm() {
        return pnm;
    }

    public void setPnm(Integer pnm) {
        this.pnm = pnm;
    }

    public Integer getPcategoryid() {
        return pcategoryid;
    }

    public void setPcategoryid(Integer pcategoryid) {
        this.pcategoryid = pcategoryid;
    }

    public String getPremark() {
        return premark;
    }

    public void setPremark(String premark) {
        this.premark = premark == null ? null : premark.trim();
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }

    public BigDecimal getPweight() {
        return pweight;
    }

    public void setPweight(BigDecimal pweight) {
        this.pweight = pweight;
    }

    public BigDecimal getPprice() {
        return pprice;
    }

    public void setPprice(BigDecimal pprice) {
        this.pprice = pprice;
    }

    public String getPbrand() {
        return pbrand;
    }

    public void setPbrand(String pbrand) {
        this.pbrand = pbrand == null ? null : pbrand.trim();
    }
}