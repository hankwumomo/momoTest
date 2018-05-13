package com.momo.webns.persistence.dto.form;

import com.momo.webns.service.api.dto.form.MaintainGoodRegSpecTdescribeFormApi;

public class MaintainGoodRegSpecTdescribeForm implements MaintainGoodRegSpecTdescribeFormApi{
    private String goodsCode;
    private String describeCode;
    private String describeTitle;
    private String codeTextYn;
    private String codeLgroup;
    private String describeNoteCode;
    private String describeNote;
    private String webFlag;
    private String insertId;
    private String modifyId;

 	public String getGoodsCode() {
        return goodsCode;
    }

	public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

	public String getDescribeCode() {
        return describeCode;
    }

	public void setDescribeCode(String describeCode) {
        this.describeCode = describeCode;
    }

	public String getDescribeTitle() {
        return describeTitle;
    }

	public void setDescribeTitle(String describeTitle) {
        this.describeTitle = describeTitle;
    }

	public String getCodeTextYn() {
        return codeTextYn;
    }

	public void setCodeTextYn(String codeTextYn) {
        this.codeTextYn = codeTextYn;
    }

	public String getCodeLgroup() {
        return codeLgroup;
    }

	public void setCodeLgroup(String codeLgroup) {
        this.codeLgroup = codeLgroup;
    }

	public String getDescribeNoteCode() {
        return describeNoteCode;
    }

	public void setDescribeNoteCode(String describeNoteCode) {
        this.describeNoteCode = describeNoteCode;
    }

	public String getDescribeNote() {
        return describeNote;
    }

	public void setDescribeNote(String describeNote) {
        this.describeNote = describeNote;
    }

	public String getWebFlag() {
        return webFlag;
    }

	public void setWebFlag(String webFlag) {
        this.webFlag = webFlag;
    }

	public String getInsertId() {
        return insertId;
    }

	public void setInsertId(String insertId) {
        this.insertId = insertId;
    }

	public String getModifyId() {
        return modifyId;
    }

	public void setModifyId(String modifyId) {
        this.modifyId = modifyId;
    }


}
