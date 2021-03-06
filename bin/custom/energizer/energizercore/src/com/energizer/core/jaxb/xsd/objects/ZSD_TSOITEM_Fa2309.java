//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.20 at 04:53:49 PM IST 
//


package com.energizer.core.jaxb.xsd.objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZSD_TSOITEM_fa2309 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZSD_TSOITEM_fa2309">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ITM_NUMBER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MATERIAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="18"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TARGET_QTY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TARGET_QU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PLANT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NET_VALUE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([\-]{0,1})(([0-9]{0,20}\.[0-9]{0,9})|([0-9]{1,20}))"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZSD_TSOITEM_fa2309", propOrder = {
    "itmNUMBER",
    "material",
    "targetQTY",
    "targetQU",
    "plant",
    "netVALUE"
})
public class ZSD_TSOITEM_Fa2309 {

    @XmlElementRef(name = "ITM_NUMBER", namespace = "http://Microsoft.LobServices.Sap/2007/03/Types/Rfc/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> itmNUMBER;
    @XmlElementRef(name = "MATERIAL", namespace = "http://Microsoft.LobServices.Sap/2007/03/Types/Rfc/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> material;
    @XmlElementRef(name = "TARGET_QTY", namespace = "http://Microsoft.LobServices.Sap/2007/03/Types/Rfc/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> targetQTY;
    @XmlElementRef(name = "TARGET_QU", namespace = "http://Microsoft.LobServices.Sap/2007/03/Types/Rfc/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetQU;
    @XmlElementRef(name = "PLANT", namespace = "http://Microsoft.LobServices.Sap/2007/03/Types/Rfc/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plant;
    @XmlElementRef(name = "NET_VALUE", namespace = "http://Microsoft.LobServices.Sap/2007/03/Types/Rfc/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> netVALUE;

    /**
     * Gets the value of the itm_NUMBER property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getITM_NUMBER() {
        return itmNUMBER;
    }

    /**
     * Sets the value of the itm_NUMBER property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setITM_NUMBER(JAXBElement<Integer> value) {
        this.itmNUMBER = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMATERIAL() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMATERIAL(JAXBElement<String> value) {
        this.material = value;
    }

    /**
     * Gets the value of the target_QTY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTARGET_QTY() {
        return targetQTY;
    }

    /**
     * Sets the value of the target_QTY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTARGET_QTY(JAXBElement<Long> value) {
        this.targetQTY = value;
    }

    /**
     * Gets the value of the target_QU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTARGET_QU() {
        return targetQU;
    }

    /**
     * Sets the value of the target_QU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTARGET_QU(JAXBElement<String> value) {
        this.targetQU = value;
    }

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPLANT() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPLANT(JAXBElement<String> value) {
        this.plant = value;
    }

    /**
     * Gets the value of the net_VALUE property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNET_VALUE() {
        return netVALUE;
    }

    /**
     * Sets the value of the net_VALUE property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNET_VALUE(JAXBElement<String> value) {
        this.netVALUE = value;
    }

}
