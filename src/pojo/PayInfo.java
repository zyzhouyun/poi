package pojo;

import java.util.Date;

public class PayInfo {
    private Integer payID;

    private Integer studentID;

    private Integer money;

    private Date payDate;

    private Date expireDate;

    private Integer pstate;

    private Integer jiaofei;

    public Integer getPayID() {
        return payID;
    }

    public void setPayID(Integer payID) {
        this.payID = payID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }

    public Integer getJiaofei() {
        return jiaofei;
    }

    public void setJiaofei(Integer jiaofei) {
        this.jiaofei = jiaofei;
    }
}