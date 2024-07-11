package MendixApi.ma.domain;

public class McmData {
    private Integer chipNo,contactChip;
    private String dieType, landNo, refName;
    private double cl, cw, ct, sx, sy, ctz, adhl, adhw, adht;
    private Long adhMid;

    public McmData(Integer chipNo, Integer contactChip, String dieType, String landNo, String refName, double cl, double cw, double ct, double sx, double sy, double ctz, double adhl, double adhw, double adht, Long adhMid) {
        this.chipNo = chipNo;
        this.contactChip = contactChip;
        this.dieType = dieType;
        this.landNo = landNo;
        this.refName = refName;
        this.cl = cl;
        this.cw = cw;
        this.ct = ct;
        this.sx = sx;
        this.sy = sy;
        this.ctz = ctz;
        this.adhl = adhl;
        this.adhw = adhw;
        this.adht = adht;
        this.adhMid = adhMid;
    }

    public Integer getChipNo() {
        return chipNo;
    }

    public void setChipNo(Integer chipNo) {
        this.chipNo = chipNo;
    }

    public Integer getContactChip() {
        return contactChip;
    }

    public void setContactChip(Integer contactChip) {
        this.contactChip = contactChip;
    }

    public String getDieType() {
        return dieType;
    }

    public void setDieType(String dieType) {
        this.dieType = dieType;
    }

    public String getLandNo() {
        return landNo;
    }

    public void setLandNo(String landNo) {
        this.landNo = landNo;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public double getCl() {
        return cl;
    }

    public void setCl(double cl) {
        this.cl = cl;
    }

    public double getCw() {
        return cw;
    }

    public void setCw(double cw) {
        this.cw = cw;
    }

    public double getCt() {
        return ct;
    }

    public void setCt(double ct) {
        this.ct = ct;
    }

    public double getSx() {
        return sx;
    }

    public void setSx(double sx) {
        this.sx = sx;
    }

    public double getSy() {
        return sy;
    }

    public void setSy(double sy) {
        this.sy = sy;
    }

    public double getCtz() {
        return ctz;
    }

    public void setCtz(double ctz) {
        this.ctz = ctz;
    }

    public double getAdhl() {
        return adhl;
    }

    public void setAdhl(double adhl) {
        this.adhl = adhl;
    }

    public double getAdhw() {
        return adhw;
    }

    public void setAdhw(double adhw) {
        this.adhw = adhw;
    }

    public double getAdht() {
        return adht;
    }

    public void setAdht(double adht) {
        this.adht = adht;
    }

    public Long getAdhMid() {
        return adhMid;
    }

    public void setAdhMid(Long adhMid) {
        this.adhMid = adhMid;
    }
}
