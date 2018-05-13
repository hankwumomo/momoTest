package com.momo.webns.persistence.domain.funbon;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Tdescribecode {
    private String describeCode;
    private String describeTitle;
    private String codeTextYn;
    private String codeLgroup;
    private String webFlag;
    private String sortSeq;
    private Time insertDate;
    private String insertId;
    private Time modifyDate;
    private String modifyId;
    private String deptCode;
    private String deptCodeSet;

    @Id
    @Column(name = "DESCRIBE_CODE", nullable = false, length = 3)
    public String getDescribeCode() {
        return describeCode;
    }

    public void setDescribeCode(String describeCode) {
        this.describeCode = describeCode;
    }

    @Basic
    @Column(name = "DESCRIBE_TITLE", nullable = true, length = 40)
    public String getDescribeTitle() {
        return describeTitle;
    }

    public void setDescribeTitle(String describeTitle) {
        this.describeTitle = describeTitle;
    }

    @Basic
    @Column(name = "CODE_TEXT_YN", nullable = true, length = 1)
    public String getCodeTextYn() {
        return codeTextYn;
    }

    public void setCodeTextYn(String codeTextYn) {
        this.codeTextYn = codeTextYn;
    }

    @Basic
    @Column(name = "CODE_LGROUP", nullable = true, length = 10)
    public String getCodeLgroup() {
        return codeLgroup;
    }

    public void setCodeLgroup(String codeLgroup) {
        this.codeLgroup = codeLgroup;
    }

    @Basic
    @Column(name = "WEB_FLAG", nullable = true, length = 1)
    public String getWebFlag() {
        return webFlag;
    }

    public void setWebFlag(String webFlag) {
        this.webFlag = webFlag;
    }

    @Basic
    @Column(name = "SORT_SEQ", nullable = true, length = 3)
    public String getSortSeq() {
        return sortSeq;
    }

    public void setSortSeq(String sortSeq) {
        this.sortSeq = sortSeq;
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
    @Column(name = "DEPT_CODE", nullable = true, length = 10)
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Basic
    @Column(name = "DEPT_CODE_SET", nullable = true, length = 10)
    public String getDeptCodeSet() {
        return deptCodeSet;
    }

    public void setDeptCodeSet(String deptCodeSet) {
        this.deptCodeSet = deptCodeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tdescribecode that = (Tdescribecode) o;
        return Objects.equals(describeCode, that.describeCode) &&
                Objects.equals(describeTitle, that.describeTitle) &&
                Objects.equals(codeTextYn, that.codeTextYn) &&
                Objects.equals(codeLgroup, that.codeLgroup) &&
                Objects.equals(webFlag, that.webFlag) &&
                Objects.equals(sortSeq, that.sortSeq) &&
                Objects.equals(insertDate, that.insertDate) &&
                Objects.equals(insertId, that.insertId) &&
                Objects.equals(modifyDate, that.modifyDate) &&
                Objects.equals(modifyId, that.modifyId) &&
                Objects.equals(deptCode, that.deptCode) &&
                Objects.equals(deptCodeSet, that.deptCodeSet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(describeCode, describeTitle, codeTextYn, codeLgroup, webFlag, sortSeq, insertDate, insertId, modifyDate, modifyId, deptCode, deptCodeSet);
    }
}
