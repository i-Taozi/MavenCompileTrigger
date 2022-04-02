//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.17 at 01:40:15 PM MEZ
//


package slash.navigation.kml.binding20;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}href"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}refreshMode" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}refreshInterval" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}viewRefreshMode" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}viewRefreshTime" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}viewFormat" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Url")
public class Url {

    @XmlElement(required = true)
    protected String href;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refreshMode;
    protected Integer refreshInterval;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String viewRefreshMode;
    protected Integer viewRefreshTime;
    protected String viewFormat;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the refreshMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshMode() {
        return refreshMode;
    }

    /**
     * Sets the value of the refreshMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshMode(String value) {
        this.refreshMode = value;
    }

    /**
     * Gets the value of the refreshInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * Sets the value of the refreshInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefreshInterval(Integer value) {
        this.refreshInterval = value;
    }

    /**
     * Gets the value of the viewRefreshMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewRefreshMode() {
        return viewRefreshMode;
    }

    /**
     * Sets the value of the viewRefreshMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewRefreshMode(String value) {
        this.viewRefreshMode = value;
    }

    /**
     * Gets the value of the viewRefreshTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getViewRefreshTime() {
        return viewRefreshTime;
    }

    /**
     * Sets the value of the viewRefreshTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setViewRefreshTime(Integer value) {
        this.viewRefreshTime = value;
    }

    /**
     * Gets the value of the viewFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewFormat() {
        return viewFormat;
    }

    /**
     * Sets the value of the viewFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewFormat(String value) {
        this.viewFormat = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
