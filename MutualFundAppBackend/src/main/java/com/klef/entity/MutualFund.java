package com.klef.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mutual_fund")
public class MutualFund {

    @Id
    @Column(name = "fund_id")
    private int fundId;

    @Column(name = "fund_name", nullable = false, length = 100)
    private String fundName;

    @Column(name = "category", length = 50)
    private String category;

    @Column(name = "risk_level", length = 20)
    private String riskLevel;

    @Column(name = "aum")
    private Double aum;

    @Column(name = "expense_ratio")
    private Double expenseRatio;

    @Column(name = "nav")
    private Double nav;

    @Column(name = "launch_date", length = 20)
    private String launchDate;

    @Column(name = "description", length = 1000)
    private String description;

    // getters and setters

    public int getFundId() {
        return fundId;
    }
    public void setFundId(int fundId) {
        this.fundId = fundId;
    }
    public String getFundName() {
        return fundName;
    }
    public void setFundName(String fundName) {
        this.fundName = fundName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getRiskLevel() {
        return riskLevel;
    }
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
    public Double getAum() {
        return aum;
    }
    public void setAum(Double aum) {
        this.aum = aum;
    }
    public Double getExpenseRatio() {
        return expenseRatio;
    }
    public void setExpenseRatio(Double expenseRatio) {
        this.expenseRatio = expenseRatio;
    }
    public Double getNav() {
        return nav;
    }
    public void setNav(Double nav) {
        this.nav = nav;
    }
    public String getLaunchDate() {
        return launchDate;
    }
    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // toString
    @Override
    public String toString() {
        return "MutualFund [fundId=" + fundId + ", fundName=" + fundName + ", category=" + category + ", riskLevel="
                + riskLevel + ", aum=" + aum + ", expenseRatio=" + expenseRatio + ", nav=" + nav + ", launchDate="
                + launchDate + ", description=" + description + "]";
    }
}
