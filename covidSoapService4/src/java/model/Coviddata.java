/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author athap
 */
@Entity
@Table(name = "COVIDDATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coviddata.findAll", query = "SELECT c FROM Coviddata c"),
    @NamedQuery(name = "Coviddata.findById", query = "SELECT c FROM Coviddata c WHERE c.id = :id"),
    @NamedQuery(name = "Coviddata.findByYears", query = "SELECT c FROM Coviddata c WHERE c.years = :years"),
    @NamedQuery(name = "Coviddata.findByWeeknum", query = "SELECT c FROM Coviddata c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Coviddata.findByNewCase", query = "SELECT c FROM Coviddata c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Coviddata.findByTotalCase", query = "SELECT c FROM Coviddata c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Coviddata.findByNewCaseExcludeabroad", query = "SELECT c FROM Coviddata c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Coviddata.findByTotalCaseExcludeabroad", query = "SELECT c FROM Coviddata c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Coviddata.findByNewRecovered", query = "SELECT c FROM Coviddata c WHERE c.newRecovered = :newRecovered"),
    @NamedQuery(name = "Coviddata.findByTotalRecovered", query = "SELECT c FROM Coviddata c WHERE c.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Coviddata.findByNewDeath", query = "SELECT c FROM Coviddata c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Coviddata.findByTotalDeath", query = "SELECT c FROM Coviddata c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Coviddata.findByCaseForeign", query = "SELECT c FROM Coviddata c WHERE c.caseForeign = :caseForeign"),
    @NamedQuery(name = "Coviddata.findByCasePrison", query = "SELECT c FROM Coviddata c WHERE c.casePrison = :casePrison"),
    @NamedQuery(name = "Coviddata.findByCaseWalkin", query = "SELECT c FROM Coviddata c WHERE c.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Coviddata.findByCaseNewPrev", query = "SELECT c FROM Coviddata c WHERE c.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Coviddata.findByCaseNewDiff", query = "SELECT c FROM Coviddata c WHERE c.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Coviddata.findByDeathNewPrev", query = "SELECT c FROM Coviddata c WHERE c.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Coviddata.findByDeathNewDiff", query = "SELECT c FROM Coviddata c WHERE c.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Coviddata.findByUpdateDate", query = "SELECT c FROM Coviddata c WHERE c.updateDate = :updateDate")})
public class Coviddata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "years")
    private int years;
    @Basic(optional = false)
    @NotNull
    @Column(name = "weeknum")
    private int weeknum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "new_case")
    private int newCase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_case")
    private int totalCase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "new_case_excludeabroad")
    private int newCaseExcludeabroad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_case_excludeabroad")
    private int totalCaseExcludeabroad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "new_recovered")
    private int newRecovered;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_recovered")
    private int totalRecovered;
    @Basic(optional = false)
    @NotNull
    @Column(name = "new_death")
    private int newDeath;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_death")
    private int totalDeath;
    @Basic(optional = false)
    @NotNull
    @Column(name = "case_foreign")
    private int caseForeign;
    @Basic(optional = false)
    @NotNull
    @Column(name = "case_prison")
    private int casePrison;
    @Basic(optional = false)
    @NotNull
    @Column(name = "case_walkin")
    private int caseWalkin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "case_new_prev")
    private int caseNewPrev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "case_new_diff")
    private int caseNewDiff;
    @Basic(optional = false)
    @NotNull
    @Column(name = "death_new_prev")
    private int deathNewPrev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "death_new_diff")
    private int deathNewDiff;
    @Size(max = 40)
    @Column(name = "update_date")
    private String updateDate;

    public Coviddata() {
    }

    public Coviddata(Integer id) {
        this.id = id;
    }

    public Coviddata(Integer id, int years, int weeknum, int newCase, int totalCase, int newCaseExcludeabroad, int totalCaseExcludeabroad, int newRecovered, int totalRecovered, int newDeath, int totalDeath, int caseForeign, int casePrison, int caseWalkin, int caseNewPrev, int caseNewDiff, int deathNewPrev, int deathNewDiff) {
        this.id = id;
        this.years = years;
        this.weeknum = weeknum;
        this.newCase = newCase;
        this.totalCase = totalCase;
        this.newCaseExcludeabroad = newCaseExcludeabroad;
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
        this.newRecovered = newRecovered;
        this.totalRecovered = totalRecovered;
        this.newDeath = newDeath;
        this.totalDeath = totalDeath;
        this.caseForeign = caseForeign;
        this.casePrison = casePrison;
        this.caseWalkin = caseWalkin;
        this.caseNewPrev = caseNewPrev;
        this.caseNewDiff = caseNewDiff;
        this.deathNewPrev = deathNewPrev;
        this.deathNewDiff = deathNewDiff;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(int weeknum) {
        this.weeknum = weeknum;
    }

    public int getNewCase() {
        return newCase;
    }

    public void setNewCase(int newCase) {
        this.newCase = newCase;
    }

    public int getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(int totalCase) {
        this.totalCase = totalCase;
    }

    public int getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(int newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public int getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(int totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public int getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(int newRecovered) {
        this.newRecovered = newRecovered;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public int getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(int newDeath) {
        this.newDeath = newDeath;
    }

    public int getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(int totalDeath) {
        this.totalDeath = totalDeath;
    }

    public int getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(int caseForeign) {
        this.caseForeign = caseForeign;
    }

    public int getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(int casePrison) {
        this.casePrison = casePrison;
    }

    public int getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(int caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public int getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(int caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public int getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(int caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public int getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(int deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public int getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(int deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coviddata)) {
            return false;
        }
        Coviddata other = (Coviddata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Coviddata[ id=" + id + " ]";
    }
    
}
