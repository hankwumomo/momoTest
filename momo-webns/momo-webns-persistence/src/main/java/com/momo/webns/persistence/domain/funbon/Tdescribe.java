package com.momo.webns.persistence.domain.funbon;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(TdescribePK.class)
public class Tdescribe {
    private String goodsCode;
    private String describeCode;
    private String describeTitle;
    private String codeTextYn;
    private String codeLgroup;
    private String describeNoteCode;
    private String describeNote;
    private String webFlag;
    private Date insertDate;
    private String insertId;
    private Date modifyDate;
    private String modifyId;

    @Id
    @Column(name = "GOODS_CODE", nullable = false, length = 10)
    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

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
    @Column(name = "DESCRIBE_NOTE_CODE", nullable = true, length = 4000)
    public String getDescribeNoteCode() {
        return describeNoteCode;
    }

    public void setDescribeNoteCode(String describeNoteCode) {
        this.describeNoteCode = describeNoteCode;
    }

    @Basic
    @Column(name = "DESCRIBE_NOTE", nullable = true, length = 4000)
    public String getDescribeNote() {
        return describeNote;
    }

    public void setDescribeNote(String describeNote) {
        this.describeNote = describeNote;
    }

    @Basic
    @Column(name = "WEB_FLAG", nullable = false, length = 1)
    public String getWebFlag() {
        return webFlag;
    }

    public void setWebFlag(String webFlag) {
        this.webFlag = webFlag;
    }

    @Basic
    @Column(name = "INSERT_DATE", nullable = true)
    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
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
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tdescribe tdescribe = (Tdescribe) o;
        return Objects.equals(goodsCode, tdescribe.goodsCode) &&
                Objects.equals(describeCode, tdescribe.describeCode) &&
                Objects.equals(describeTitle, tdescribe.describeTitle) &&
                Objects.equals(codeTextYn, tdescribe.codeTextYn) &&
                Objects.equals(codeLgroup, tdescribe.codeLgroup) &&
                Objects.equals(describeNoteCode, tdescribe.describeNoteCode) &&
                Objects.equals(describeNote, tdescribe.describeNote) &&
                Objects.equals(webFlag, tdescribe.webFlag) &&
                Objects.equals(insertDate, tdescribe.insertDate) &&
                Objects.equals(insertId, tdescribe.insertId) &&
                Objects.equals(modifyDate, tdescribe.modifyDate) &&
                Objects.equals(modifyId, tdescribe.modifyId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodsCode, describeCode, describeTitle, codeTextYn, codeLgroup, describeNoteCode, describeNote, webFlag, insertDate, insertId, modifyDate, modifyId);
    }
}
