
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coviddata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coviddata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseForeign" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseNewDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseNewPrev" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="casePrison" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseWalkin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deathNewDiff" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deathNewPrev" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newCase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newCaseExcludeabroad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newDeath" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="newRecovered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalCase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalCaseExcludeabroad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalDeath" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalRecovered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weeknum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coviddata", propOrder = {
    "caseForeign",
    "caseNewDiff",
    "caseNewPrev",
    "casePrison",
    "caseWalkin",
    "deathNewDiff",
    "deathNewPrev",
    "id",
    "newCase",
    "newCaseExcludeabroad",
    "newDeath",
    "newRecovered",
    "totalCase",
    "totalCaseExcludeabroad",
    "totalDeath",
    "totalRecovered",
    "updateDate",
    "weeknum",
    "years"
})
public class Coviddata {

    protected int caseForeign;
    protected int caseNewDiff;
    protected int caseNewPrev;
    protected int casePrison;
    protected int caseWalkin;
    protected int deathNewDiff;
    protected int deathNewPrev;
    protected Integer id;
    protected int newCase;
    protected int newCaseExcludeabroad;
    protected int newDeath;
    protected int newRecovered;
    protected int totalCase;
    protected int totalCaseExcludeabroad;
    protected int totalDeath;
    protected int totalRecovered;
    protected String updateDate;
    protected int weeknum;
    protected int years;

    /**
     * Gets the value of the caseForeign property.
     * 
     */
    public int getCaseForeign() {
        return caseForeign;
    }

    /**
     * Sets the value of the caseForeign property.
     * 
     */
    public void setCaseForeign(int value) {
        this.caseForeign = value;
    }

    /**
     * Gets the value of the caseNewDiff property.
     * 
     */
    public int getCaseNewDiff() {
        return caseNewDiff;
    }

    /**
     * Sets the value of the caseNewDiff property.
     * 
     */
    public void setCaseNewDiff(int value) {
        this.caseNewDiff = value;
    }

    /**
     * Gets the value of the caseNewPrev property.
     * 
     */
    public int getCaseNewPrev() {
        return caseNewPrev;
    }

    /**
     * Sets the value of the caseNewPrev property.
     * 
     */
    public void setCaseNewPrev(int value) {
        this.caseNewPrev = value;
    }

    /**
     * Gets the value of the casePrison property.
     * 
     */
    public int getCasePrison() {
        return casePrison;
    }

    /**
     * Sets the value of the casePrison property.
     * 
     */
    public void setCasePrison(int value) {
        this.casePrison = value;
    }

    /**
     * Gets the value of the caseWalkin property.
     * 
     */
    public int getCaseWalkin() {
        return caseWalkin;
    }

    /**
     * Sets the value of the caseWalkin property.
     * 
     */
    public void setCaseWalkin(int value) {
        this.caseWalkin = value;
    }

    /**
     * Gets the value of the deathNewDiff property.
     * 
     */
    public int getDeathNewDiff() {
        return deathNewDiff;
    }

    /**
     * Sets the value of the deathNewDiff property.
     * 
     */
    public void setDeathNewDiff(int value) {
        this.deathNewDiff = value;
    }

    /**
     * Gets the value of the deathNewPrev property.
     * 
     */
    public int getDeathNewPrev() {
        return deathNewPrev;
    }

    /**
     * Sets the value of the deathNewPrev property.
     * 
     */
    public void setDeathNewPrev(int value) {
        this.deathNewPrev = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the newCase property.
     * 
     */
    public int getNewCase() {
        return newCase;
    }

    /**
     * Sets the value of the newCase property.
     * 
     */
    public void setNewCase(int value) {
        this.newCase = value;
    }

    /**
     * Gets the value of the newCaseExcludeabroad property.
     * 
     */
    public int getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    /**
     * Sets the value of the newCaseExcludeabroad property.
     * 
     */
    public void setNewCaseExcludeabroad(int value) {
        this.newCaseExcludeabroad = value;
    }

    /**
     * Gets the value of the newDeath property.
     * 
     */
    public int getNewDeath() {
        return newDeath;
    }

    /**
     * Sets the value of the newDeath property.
     * 
     */
    public void setNewDeath(int value) {
        this.newDeath = value;
    }

    /**
     * Gets the value of the newRecovered property.
     * 
     */
    public int getNewRecovered() {
        return newRecovered;
    }

    /**
     * Sets the value of the newRecovered property.
     * 
     */
    public void setNewRecovered(int value) {
        this.newRecovered = value;
    }

    /**
     * Gets the value of the totalCase property.
     * 
     */
    public int getTotalCase() {
        return totalCase;
    }

    /**
     * Sets the value of the totalCase property.
     * 
     */
    public void setTotalCase(int value) {
        this.totalCase = value;
    }

    /**
     * Gets the value of the totalCaseExcludeabroad property.
     * 
     */
    public int getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    /**
     * Sets the value of the totalCaseExcludeabroad property.
     * 
     */
    public void setTotalCaseExcludeabroad(int value) {
        this.totalCaseExcludeabroad = value;
    }

    /**
     * Gets the value of the totalDeath property.
     * 
     */
    public int getTotalDeath() {
        return totalDeath;
    }

    /**
     * Sets the value of the totalDeath property.
     * 
     */
    public void setTotalDeath(int value) {
        this.totalDeath = value;
    }

    /**
     * Gets the value of the totalRecovered property.
     * 
     */
    public int getTotalRecovered() {
        return totalRecovered;
    }

    /**
     * Sets the value of the totalRecovered property.
     * 
     */
    public void setTotalRecovered(int value) {
        this.totalRecovered = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the weeknum property.
     * 
     */
    public int getWeeknum() {
        return weeknum;
    }

    /**
     * Sets the value of the weeknum property.
     * 
     */
    public void setWeeknum(int value) {
        this.weeknum = value;
    }

    /**
     * Gets the value of the years property.
     * 
     */
    public int getYears() {
        return years;
    }

    /**
     * Sets the value of the years property.
     * 
     */
    public void setYears(int value) {
        this.years = value;
    }

}
