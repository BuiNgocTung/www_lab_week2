package entities;

import java.sql.Timestamp;

public class Log {
    private long iD;
    private String accountID;
    private Timestamp loginTime;
    private Timestamp logoutTime;
    private String notes;

    public long getiD() {
        return iD;
    }

    public void setiD(long iD) {
        this.iD = iD;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public Timestamp getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Timestamp logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Log(long iD, String accountID, Timestamp loginTime, Timestamp logoutTime, String notes) {
        this.iD = iD;
        this.accountID = accountID;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.notes = notes;
    }

    public Log() {
    }

    @Override
    public String toString() {
        return "Log{" +
                "iD=" + iD +
                ", accountID='" + accountID + '\'' +
                ", loginTime=" + loginTime +
                ", logoutTime=" + logoutTime +
                ", notes='" + notes + '\'' +
                '}';
    }
}
