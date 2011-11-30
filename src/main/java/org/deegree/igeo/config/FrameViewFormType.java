//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.18 at 01:52:07 PM MESZ 
//


package org.deegree.igeo.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				view form definition for displaying a module within its own window. A window may be set to be resizeable or not
 * 			
 * 
 * <p>Java class for FrameViewFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrameViewFormType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.deegree.org/project}_AbstractViewFormType">
 *       &lt;sequence>
 *         &lt;element name="frameTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="resizeable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="closable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrameViewFormType", propOrder = {
    "frameTitle"
})
public class FrameViewFormType
    extends _AbstractViewFormType
{

    @XmlElement(required = true)
    protected String frameTitle;
    @XmlAttribute
    protected Boolean resizeable;
    @XmlAttribute
    protected Boolean closable;

    /**
     * Gets the value of the frameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameTitle() {
        return frameTitle;
    }

    /**
     * Sets the value of the frameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameTitle(String value) {
        this.frameTitle = value;
    }

    /**
     * Gets the value of the resizeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isResizeable() {
        if (resizeable == null) {
            return true;
        } else {
            return resizeable;
        }
    }

    /**
     * Sets the value of the resizeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResizeable(Boolean value) {
        this.resizeable = value;
    }

    /**
     * Gets the value of the closable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosable() {
        if (closable == null) {
            return true;
        } else {
            return closable;
        }
    }

    /**
     * Sets the value of the closable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosable(Boolean value) {
        this.closable = value;
    }

}