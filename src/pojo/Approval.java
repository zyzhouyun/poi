package pojo;

import java.util.Date;

public class Approval {
    private Integer approvalID;

    private Integer loginid;

    private Integer handlerID;

    private Integer changeID;

    private Date approvalDate;

    private Date submitDate;

    private Integer resultState;

    private String msg;

    private Integer approvaldormrecord;

    private String nomsg;

    public Integer getApprovalID() {
        return approvalID;
    }

    public void setApprovalID(Integer approvalID) {
        this.approvalID = approvalID;
    }

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public Integer getHandlerID() {
        return handlerID;
    }

    public void setHandlerID(Integer handlerID) {
        this.handlerID = handlerID;
    }

    public Integer getChangeID() {
        return changeID;
    }

    public void setChangeID(Integer changeID) {
        this.changeID = changeID;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Integer getResultState() {
        return resultState;
    }

    public void setResultState(Integer resultState) {
        this.resultState = resultState;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getApprovaldormrecord() {
        return approvaldormrecord;
    }

    public void setApprovaldormrecord(Integer approvaldormrecord) {
        this.approvaldormrecord = approvaldormrecord;
    }

    public String getNomsg() {
        return nomsg;
    }

    public void setNomsg(String nomsg) {
        this.nomsg = nomsg;
    }
}