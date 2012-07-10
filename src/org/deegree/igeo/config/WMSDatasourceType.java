//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.15 at 10:29:06 AM MESZ 
//


package org.deegree.igeo.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Datasource for accessing an OGC Web Map Service. This is much like WCS datasource but instead of a GetCoverage
 * 				request a GetMap request must be defined as template.
 * 			
 * 
 * <p>Java class for WMSDatasourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WMSDatasourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.deegree.org/coremapmodel}ServiceDatasourceType">
 *       &lt;sequence>
 *         &lt;element name="baseRequest" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WMSDatasourceType", namespace = "http://www.deegree.org/coremapmodel", propOrder = {
    "baseRequest"
})
public class WMSDatasourceType
    extends ServiceDatasourceType
{

    @XmlElement(namespace = "http://www.deegree.org/coremapmodel", required = true)
    protected String baseRequest;

    /**
     * Gets the value of the baseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRequest() {
        return baseRequest;
    }

    /**
     * Sets the value of the baseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRequest(String value) {
        this.baseRequest = value;
    }

}
