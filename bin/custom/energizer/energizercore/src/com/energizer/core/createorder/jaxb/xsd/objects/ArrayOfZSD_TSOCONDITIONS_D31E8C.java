//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.20 at 05:57:26 PM IST 
//


package com.energizer.core.createorder.jaxb.xsd.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfZSD_TSOCONDITIONS_d31e8c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfZSD_TSOCONDITIONS_d31e8c">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZSD_TSOCONDITIONS" type="{http://Microsoft.LobServices.Sap/2007/03/Types/Rfc/}ZSD_TSOCONDITIONS_d31e8c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfZSD_TSOCONDITIONS_d31e8c", propOrder = {
    "zsdTSOCONDITIONS"
})
public class ArrayOfZSD_TSOCONDITIONS_D31E8C {

    @XmlElement(name = "ZSD_TSOCONDITIONS")
    protected List<ZSD_TSOCONDITIONS_D31E8C> zsdTSOCONDITIONS;

    /**
     * Gets the value of the zsdTSOCONDITIONS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zsdTSOCONDITIONS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZSD_TSOCONDITIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZSD_TSOCONDITIONS_D31E8C }
     * 
     * 
     */
    public List<ZSD_TSOCONDITIONS_D31E8C> getZSD_TSOCONDITIONS() {
        if (zsdTSOCONDITIONS == null) {
            zsdTSOCONDITIONS = new ArrayList<ZSD_TSOCONDITIONS_D31E8C>();
        }
        return this.zsdTSOCONDITIONS;
    }

}
