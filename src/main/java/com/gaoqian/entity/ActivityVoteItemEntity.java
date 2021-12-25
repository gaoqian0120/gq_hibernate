package com.gaoqian.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "activity_vote_item", schema = "springmvc", catalog = "")
public class ActivityVoteItemEntity {
    private BigDecimal id;
    private BigDecimal voteId;
    private BigDecimal voteGroupId;
    private String name;
    private BigDecimal sortId;
    private BigDecimal readCount;
    private BigDecimal voteCount;
    private BigDecimal mainCount;
    private BigDecimal partCount;
    private BigDecimal resourceId;
    private String resourceType;
    private Timestamp createDate;
    private Timestamp updateDate;
    private BigDecimal createUserId;
    private BigDecimal updateUserId;
    private String extstring1;
    private String extstring2;
    private String extstring3;
    private String extstring4;
    private String no;

    @Basic
    @Column(name = "ID", nullable = false, precision = 30)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "VOTE_ID", nullable = true, precision = 30)
    public BigDecimal getVoteId() {
        return voteId;
    }

    public void setVoteId(BigDecimal voteId) {
        this.voteId = voteId;
    }

    @Basic
    @Column(name = "VOTE_GROUP_ID", nullable = true, precision = 30)
    public BigDecimal getVoteGroupId() {
        return voteGroupId;
    }

    public void setVoteGroupId(BigDecimal voteGroupId) {
        this.voteGroupId = voteGroupId;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SORT_ID", nullable = true, precision = 30)
    public BigDecimal getSortId() {
        return sortId;
    }

    public void setSortId(BigDecimal sortId) {
        this.sortId = sortId;
    }

    @Basic
    @Column(name = "READ_COUNT", nullable = true, precision = 30)
    public BigDecimal getReadCount() {
        return readCount;
    }

    public void setReadCount(BigDecimal readCount) {
        this.readCount = readCount;
    }

    @Basic
    @Column(name = "VOTE_COUNT", nullable = true, precision = 30)
    public BigDecimal getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(BigDecimal voteCount) {
        this.voteCount = voteCount;
    }

    @Basic
    @Column(name = "MAIN_COUNT", nullable = true, precision = 30)
    public BigDecimal getMainCount() {
        return mainCount;
    }

    public void setMainCount(BigDecimal mainCount) {
        this.mainCount = mainCount;
    }

    @Basic
    @Column(name = "PART_COUNT", nullable = true, precision = 30)
    public BigDecimal getPartCount() {
        return partCount;
    }

    public void setPartCount(BigDecimal partCount) {
        this.partCount = partCount;
    }

    @Basic
    @Column(name = "RESOURCE_ID", nullable = true, precision = 30)
    public BigDecimal getResourceId() {
        return resourceId;
    }

    public void setResourceId(BigDecimal resourceId) {
        this.resourceId = resourceId;
    }

    @Basic
    @Column(name = "RESOURCE_TYPE", nullable = true, length = 20)
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "UPDATE_DATE", nullable = true)
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "CREATE_USER_ID", nullable = true, precision = 30)
    public BigDecimal getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(BigDecimal createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "UPDATE_USER_ID", nullable = true, precision = 30)
    public BigDecimal getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(BigDecimal updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Basic
    @Column(name = "EXTSTRING1", nullable = true, length = -1)
    public String getExtstring1() {
        return extstring1;
    }

    public void setExtstring1(String extstring1) {
        this.extstring1 = extstring1;
    }

    @Basic
    @Column(name = "EXTSTRING2", nullable = true, length = -1)
    public String getExtstring2() {
        return extstring2;
    }

    public void setExtstring2(String extstring2) {
        this.extstring2 = extstring2;
    }

    @Basic
    @Column(name = "EXTSTRING3", nullable = true, length = -1)
    public String getExtstring3() {
        return extstring3;
    }

    public void setExtstring3(String extstring3) {
        this.extstring3 = extstring3;
    }

    @Basic
    @Column(name = "EXTSTRING4", nullable = true, length = -1)
    public String getExtstring4() {
        return extstring4;
    }

    public void setExtstring4(String extstring4) {
        this.extstring4 = extstring4;
    }

    @Basic
    @Column(name = "NO", nullable = true, length = 20)
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActivityVoteItemEntity that = (ActivityVoteItemEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (voteId != null ? !voteId.equals(that.voteId) : that.voteId != null) return false;
        if (voteGroupId != null ? !voteGroupId.equals(that.voteGroupId) : that.voteGroupId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sortId != null ? !sortId.equals(that.sortId) : that.sortId != null) return false;
        if (readCount != null ? !readCount.equals(that.readCount) : that.readCount != null) return false;
        if (voteCount != null ? !voteCount.equals(that.voteCount) : that.voteCount != null) return false;
        if (mainCount != null ? !mainCount.equals(that.mainCount) : that.mainCount != null) return false;
        if (partCount != null ? !partCount.equals(that.partCount) : that.partCount != null) return false;
        if (resourceId != null ? !resourceId.equals(that.resourceId) : that.resourceId != null) return false;
        if (resourceType != null ? !resourceType.equals(that.resourceType) : that.resourceType != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (extstring1 != null ? !extstring1.equals(that.extstring1) : that.extstring1 != null) return false;
        if (extstring2 != null ? !extstring2.equals(that.extstring2) : that.extstring2 != null) return false;
        if (extstring3 != null ? !extstring3.equals(that.extstring3) : that.extstring3 != null) return false;
        if (extstring4 != null ? !extstring4.equals(that.extstring4) : that.extstring4 != null) return false;
        if (no != null ? !no.equals(that.no) : that.no != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (voteId != null ? voteId.hashCode() : 0);
        result = 31 * result + (voteGroupId != null ? voteGroupId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sortId != null ? sortId.hashCode() : 0);
        result = 31 * result + (readCount != null ? readCount.hashCode() : 0);
        result = 31 * result + (voteCount != null ? voteCount.hashCode() : 0);
        result = 31 * result + (mainCount != null ? mainCount.hashCode() : 0);
        result = 31 * result + (partCount != null ? partCount.hashCode() : 0);
        result = 31 * result + (resourceId != null ? resourceId.hashCode() : 0);
        result = 31 * result + (resourceType != null ? resourceType.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (extstring1 != null ? extstring1.hashCode() : 0);
        result = 31 * result + (extstring2 != null ? extstring2.hashCode() : 0);
        result = 31 * result + (extstring3 != null ? extstring3.hashCode() : 0);
        result = 31 * result + (extstring4 != null ? extstring4.hashCode() : 0);
        result = 31 * result + (no != null ? no.hashCode() : 0);
        return result;
    }
}
