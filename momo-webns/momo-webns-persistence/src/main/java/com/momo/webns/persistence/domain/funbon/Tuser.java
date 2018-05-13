package com.momo.webns.persistence.domain.funbon;

import java.sql.Time;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tuser {
    private String userId;
    private String userName;
    private String passwd;
    private String shopId;
    private String deptCode;
    private String sabun;
    private Time startDate;
    private Time endDate;
    private String userGb;
    private Long maxDcRate;
    private String residentNo;
    private String sex;
    private Time insertDate;
    private String insertId;
    private Time modifyDate;
    private String modifyId;
    private String remark;
    private String majorGroup;
    private String minorGroup;
    private String icdNo;
    private String agentLevel;
    private String agentSkill1;
    private String agentSkill2;
    private String agentSkill3;
    private String pbxLoginId;
    private String worker;
    private Time dhWk;
    private String computerName;
    private String csDeptCode;
    private String userType;
    private String jobId;
    private String ipAddr;
    private String email;
    private Time pwdModifydate;
    private Boolean pwdErrorsNum;
    private String newPwdSend;
    private String remark2;

    @Basic
    @Id
    @Column(name = "USER_ID", nullable = false, length = 10)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = false, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWD", nullable = false, length = 30)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "SHOP_ID", nullable = false, length = 10)
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "DEPT_CODE", nullable = true, length = 10)
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Basic
    @Column(name = "SABUN", nullable = true, length = 10)
    public String getSabun() {
        return sabun;
    }

    public void setSabun(String sabun) {
        this.sabun = sabun;
    }

    @Basic
    @Column(name = "START_DATE", nullable = true)
    public Time getStartDate() {
        return startDate;
    }

    public void setStartDate(Time startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "END_DATE", nullable = true)
    public Time getEndDate() {
        return endDate;
    }

    public void setEndDate(Time endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "USER_GB", nullable = true, length = 3)
    public String getUserGb() {
        return userGb;
    }

    public void setUserGb(String userGb) {
        this.userGb = userGb;
    }

    @Basic
    @Column(name = "MAX_DC_RATE", nullable = true, precision = 2)
    public Long getMaxDcRate() {
        return maxDcRate;
    }

    public void setMaxDcRate(Long maxDcRate) {
        this.maxDcRate = maxDcRate;
    }

    @Basic
    @Column(name = "RESIDENT_NO", nullable = true, length = 13)
    public String getResidentNo() {
        return residentNo;
    }

    public void setResidentNo(String residentNo) {
        this.residentNo = residentNo;
    }

    @Basic
    @Column(name = "SEX", nullable = true, length = 1)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "INSERT_DATE", nullable = true)
    public Time getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Time insertDate) {
        this.insertDate = insertDate;
    }

    @Basic
    @Column(name = "INSERT_ID", nullable = true, length = 10)
    public String getInsertId() {
        return insertId;
    }

    public void setInsertId(String insertId) {
        this.insertId = insertId;
    }

    @Basic
    @Column(name = "MODIFY_DATE", nullable = true)
    public Time getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Time modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "MODIFY_ID", nullable = true, length = 10)
    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, length = 200)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "MAJOR_GROUP", nullable = true, length = 5)
    public String getMajorGroup() {
        return majorGroup;
    }

    public void setMajorGroup(String majorGroup) {
        this.majorGroup = majorGroup;
    }

    @Basic
    @Column(name = "MINOR_GROUP", nullable = true, length = 5)
    public String getMinorGroup() {
        return minorGroup;
    }

    public void setMinorGroup(String minorGroup) {
        this.minorGroup = minorGroup;
    }

    @Basic
    @Column(name = "ICD_NO", nullable = true, length = 5)
    public String getIcdNo() {
        return icdNo;
    }

    public void setIcdNo(String icdNo) {
        this.icdNo = icdNo;
    }

    @Basic
    @Column(name = "AGENT_LEVEL", nullable = true, length = 1)
    public String getAgentLevel() {
        return agentLevel;
    }

    public void setAgentLevel(String agentLevel) {
        this.agentLevel = agentLevel;
    }

    @Basic
    @Column(name = "AGENT_SKILL1", nullable = true, length = 3)
    public String getAgentSkill1() {
        return agentSkill1;
    }

    public void setAgentSkill1(String agentSkill1) {
        this.agentSkill1 = agentSkill1;
    }

    @Basic
    @Column(name = "AGENT_SKILL2", nullable = true, length = 3)
    public String getAgentSkill2() {
        return agentSkill2;
    }

    public void setAgentSkill2(String agentSkill2) {
        this.agentSkill2 = agentSkill2;
    }

    @Basic
    @Column(name = "AGENT_SKILL3", nullable = true, length = 3)
    public String getAgentSkill3() {
        return agentSkill3;
    }

    public void setAgentSkill3(String agentSkill3) {
        this.agentSkill3 = agentSkill3;
    }

    @Basic
    @Column(name = "PBX_LOGIN_ID", nullable = true, length = 4)
    public String getPbxLoginId() {
        return pbxLoginId;
    }

    public void setPbxLoginId(String pbxLoginId) {
        this.pbxLoginId = pbxLoginId;
    }

    @Basic
    @Column(name = "WORKER", nullable = true, length = 8)
    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    @Basic
    @Column(name = "DH_WK", nullable = true)
    public Time getDhWk() {
        return dhWk;
    }

    public void setDhWk(Time dhWk) {
        this.dhWk = dhWk;
    }

    @Basic
    @Column(name = "COMPUTER_NAME", nullable = true, length = 50)
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    @Basic
    @Column(name = "CS_DEPT_CODE", nullable = true, length = 10)
    public String getCsDeptCode() {
        return csDeptCode;
    }

    public void setCsDeptCode(String csDeptCode) {
        this.csDeptCode = csDeptCode;
    }

    @Basic
    @Column(name = "USER_TYPE", nullable = true, length = 3)
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "JOB_ID", nullable = true, length = 10)
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "IP_ADDR", nullable = true, length = 1000)
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PWD_MODIFYDATE", nullable = true)
    public Time getPwdModifydate() {
        return pwdModifydate;
    }

    public void setPwdModifydate(Time pwdModifydate) {
        this.pwdModifydate = pwdModifydate;
    }

    @Basic
    @Column(name = "PWD_ERRORS_NUM", nullable = true, precision = 0)
    public Boolean getPwdErrorsNum() {
        return pwdErrorsNum;
    }

    public void setPwdErrorsNum(Boolean pwdErrorsNum) {
        this.pwdErrorsNum = pwdErrorsNum;
    }

    @Basic
    @Column(name = "NEW_PWD_SEND", nullable = true, length = 1)
    public String getNewPwdSend() {
        return newPwdSend;
    }

    public void setNewPwdSend(String newPwdSend) {
        this.newPwdSend = newPwdSend;
    }

    @Basic
    @Column(name = "REMARK2", nullable = true, length = 200)
    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuser tuser = (Tuser) o;
        return Objects.equals(userId, tuser.userId) &&
                Objects.equals(userName, tuser.userName) &&
                Objects.equals(passwd, tuser.passwd) &&
                Objects.equals(shopId, tuser.shopId) &&
                Objects.equals(deptCode, tuser.deptCode) &&
                Objects.equals(sabun, tuser.sabun) &&
                Objects.equals(startDate, tuser.startDate) &&
                Objects.equals(endDate, tuser.endDate) &&
                Objects.equals(userGb, tuser.userGb) &&
                Objects.equals(maxDcRate, tuser.maxDcRate) &&
                Objects.equals(residentNo, tuser.residentNo) &&
                Objects.equals(sex, tuser.sex) &&
                Objects.equals(insertDate, tuser.insertDate) &&
                Objects.equals(insertId, tuser.insertId) &&
                Objects.equals(modifyDate, tuser.modifyDate) &&
                Objects.equals(modifyId, tuser.modifyId) &&
                Objects.equals(remark, tuser.remark) &&
                Objects.equals(majorGroup, tuser.majorGroup) &&
                Objects.equals(minorGroup, tuser.minorGroup) &&
                Objects.equals(icdNo, tuser.icdNo) &&
                Objects.equals(agentLevel, tuser.agentLevel) &&
                Objects.equals(agentSkill1, tuser.agentSkill1) &&
                Objects.equals(agentSkill2, tuser.agentSkill2) &&
                Objects.equals(agentSkill3, tuser.agentSkill3) &&
                Objects.equals(pbxLoginId, tuser.pbxLoginId) &&
                Objects.equals(worker, tuser.worker) &&
                Objects.equals(dhWk, tuser.dhWk) &&
                Objects.equals(computerName, tuser.computerName) &&
                Objects.equals(csDeptCode, tuser.csDeptCode) &&
                Objects.equals(userType, tuser.userType) &&
                Objects.equals(jobId, tuser.jobId) &&
                Objects.equals(ipAddr, tuser.ipAddr) &&
                Objects.equals(email, tuser.email) &&
                Objects.equals(pwdModifydate, tuser.pwdModifydate) &&
                Objects.equals(pwdErrorsNum, tuser.pwdErrorsNum) &&
                Objects.equals(newPwdSend, tuser.newPwdSend) &&
                Objects.equals(remark2, tuser.remark2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, userName, passwd, shopId, deptCode, sabun, startDate, endDate, userGb, maxDcRate, residentNo, sex, insertDate, insertId, modifyDate, modifyId, remark, majorGroup, minorGroup, icdNo, agentLevel, agentSkill1, agentSkill2, agentSkill3, pbxLoginId, worker, dhWk, computerName, csDeptCode, userType, jobId, ipAddr, email, pwdModifydate, pwdErrorsNum, newPwdSend, remark2);
    }

	@Override
	public String toString() {
		return "Tuser [userId=" + userId + ", userName=" + userName + ", passwd=" + passwd + ", shopId=" + shopId
				+ ", deptCode=" + deptCode + ", sabun=" + sabun + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", userGb=" + userGb + ", maxDcRate=" + maxDcRate + ", residentNo=" + residentNo + ", sex=" + sex
				+ ", insertDate=" + insertDate + ", insertId=" + insertId + ", modifyDate=" + modifyDate + ", modifyId="
				+ modifyId + ", remark=" + remark + ", majorGroup=" + majorGroup + ", minorGroup=" + minorGroup
				+ ", icdNo=" + icdNo + ", agentLevel=" + agentLevel + ", agentSkill1=" + agentSkill1 + ", agentSkill2="
				+ agentSkill2 + ", agentSkill3=" + agentSkill3 + ", pbxLoginId=" + pbxLoginId + ", worker=" + worker
				+ ", dhWk=" + dhWk + ", computerName=" + computerName + ", csDeptCode=" + csDeptCode + ", userType="
				+ userType + ", jobId=" + jobId + ", ipAddr=" + ipAddr + ", email=" + email + ", pwdModifydate="
				+ pwdModifydate + ", pwdErrorsNum=" + pwdErrorsNum + ", newPwdSend=" + newPwdSend + ", remark2="
				+ remark2 + "]";
	}
    
    
}
