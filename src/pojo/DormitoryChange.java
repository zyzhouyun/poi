package pojo;

import java.util.Date;

public class DormitoryChange {
    private Integer changeID;

    private Integer outStudentID;

    private Integer inStudentID;

    private Date changeDate;

    private Integer stateID;

    public Integer getChangeID() {
        return changeID;
    }

    public void setChangeID(Integer changeID) {
        this.changeID = changeID;
    }

    public Integer getOutStudentID() {
        return outStudentID;
    }

    public void setOutStudentID(Integer outStudentID) {
        this.outStudentID = outStudentID;
    }

    public Integer getInStudentID() {
        return inStudentID;
    }

    public void setInStudentID(Integer inStudentID) {
        this.inStudentID = inStudentID;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public Integer getStateID() {
        return stateID;
    }

    public void setStateID(Integer stateID) {
        this.stateID = stateID;
    }
}