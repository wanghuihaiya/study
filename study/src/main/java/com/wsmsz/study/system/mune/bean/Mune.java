package com.wsmsz.study.system.mune.bean;

public class Mune {
    private Integer id;

    private String muneName;

    private Integer munePid;

    private String muneUrl;

    private String muneImg;

    private String muneDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMuneName() {
        return muneName;
    }

    public void setMuneName(String muneName) {
        this.muneName = muneName == null ? null : muneName.trim();
    }

    public Integer getMunePid() {
        return munePid;
    }

    public void setMunePid(Integer munePid) {
        this.munePid = munePid;
    }

    public String getMuneUrl() {
        return muneUrl;
    }

    public void setMuneUrl(String muneUrl) {
        this.muneUrl = muneUrl == null ? null : muneUrl.trim();
    }

    public String getMuneImg() {
        return muneImg;
    }

    public void setMuneImg(String muneImg) {
        this.muneImg = muneImg == null ? null : muneImg.trim();
    }

    public String getMuneDesc() {
        return muneDesc;
    }

    public void setMuneDesc(String muneDesc) {
        this.muneDesc = muneDesc == null ? null : muneDesc.trim();
    }
}