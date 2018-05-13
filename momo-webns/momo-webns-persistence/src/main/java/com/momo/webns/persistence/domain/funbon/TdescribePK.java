package com.momo.webns.persistence.domain.funbon;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TdescribePK implements Serializable {
    private String goodsCode;
    private String describeCode;

    @Column(name = "GOODS_CODE", nullable = false, length = 10)
    @Id
    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    @Column(name = "DESCRIBE_CODE", nullable = false, length = 3)
    @Id
    public String getDescribeCode() {
        return describeCode;
    }

    public void setDescribeCode(String describeCode) {
        this.describeCode = describeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TdescribePK that = (TdescribePK) o;
        return Objects.equals(goodsCode, that.goodsCode) &&
                Objects.equals(describeCode, that.describeCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodsCode, describeCode);
    }
}
