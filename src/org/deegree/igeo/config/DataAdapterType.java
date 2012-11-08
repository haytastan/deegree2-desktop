//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.15 at 10:29:06 AM MESZ 
//


package org.deegree.igeo.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				For each project data adapter for accessing WMS/WFS/WCS and known raster data formats can be configured. If
 * 				no data adpater element will be defined deegree uses default behavior
 * 			
 * 
 * <p>Java class for DataAdapterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataAdapterType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.deegree.org/settings}_ChangeableType">
 *       &lt;sequence>
 *         &lt;element name="WFSFeatureAdapter" type="{http://www.deegree.org/settings}WFSFeatureAdapterType" minOccurs="0"/>
 *         &lt;element name="WMSGridCoverageAdapter" type="{http://www.deegree.org/settings}WMSGridCoverageAdapterType" minOccurs="0"/>
 *         &lt;element name="WCSGridCoverageAdapter" type="{http://www.deegree.org/settings}ServiceAdapterType" minOccurs="0"/>
 *         &lt;element name="KnownRasterFormats" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                 &lt;attribute name="val" type="{http://www.w3.org/2001/XMLSchema}string" default="|gif|tif|tiff|jpg|jpeg|png|bmp|" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataAdapterType", namespace = "http://www.deegree.org/settings", propOrder = {
    "wfsFeatureAdapter",
    "wmsGridCoverageAdapter",
    "wcsGridCoverageAdapter",
    "knownRasterFormats"
})
public class DataAdapterType
    extends _ChangeableType
{

    @XmlElement(name = "WFSFeatureAdapter", namespace = "http://www.deegree.org/settings")
    protected WFSFeatureAdapterType wfsFeatureAdapter;
    @XmlElement(name = "WMSGridCoverageAdapter", namespace = "http://www.deegree.org/settings")
    protected WMSGridCoverageAdapterType wmsGridCoverageAdapter;
    @XmlElement(name = "WCSGridCoverageAdapter", namespace = "http://www.deegree.org/settings")
    protected ServiceAdapterType wcsGridCoverageAdapter;
    @XmlElement(name = "KnownRasterFormats", namespace = "http://www.deegree.org/settings")
    protected DataAdapterType.KnownRasterFormats knownRasterFormats;

    /**
     * Gets the value of the wfsFeatureAdapter property.
     * 
     * @return
     *     possible object is
     *     {@link WFSFeatureAdapterType }
     *     
     */
    public WFSFeatureAdapterType getWFSFeatureAdapter() {
        return wfsFeatureAdapter;
    }

    /**
     * Sets the value of the wfsFeatureAdapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFSFeatureAdapterType }
     *     
     */
    public void setWFSFeatureAdapter(WFSFeatureAdapterType value) {
        this.wfsFeatureAdapter = value;
    }

    /**
     * Gets the value of the wmsGridCoverageAdapter property.
     * 
     * @return
     *     possible object is
     *     {@link WMSGridCoverageAdapterType }
     *     
     */
    public WMSGridCoverageAdapterType getWMSGridCoverageAdapter() {
        return wmsGridCoverageAdapter;
    }

    /**
     * Sets the value of the wmsGridCoverageAdapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WMSGridCoverageAdapterType }
     *     
     */
    public void setWMSGridCoverageAdapter(WMSGridCoverageAdapterType value) {
        this.wmsGridCoverageAdapter = value;
    }

    /**
     * Gets the value of the wcsGridCoverageAdapter property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAdapterType }
     *     
     */
    public ServiceAdapterType getWCSGridCoverageAdapter() {
        return wcsGridCoverageAdapter;
    }

    /**
     * Sets the value of the wcsGridCoverageAdapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAdapterType }
     *     
     */
    public void setWCSGridCoverageAdapter(ServiceAdapterType value) {
        this.wcsGridCoverageAdapter = value;
    }

    /**
     * Gets the value of the knownRasterFormats property.
     * 
     * @return
     *     possible object is
     *     {@link DataAdapterType.KnownRasterFormats }
     *     
     */
    public DataAdapterType.KnownRasterFormats getKnownRasterFormats() {
        return knownRasterFormats;
    }

    /**
     * Sets the value of the knownRasterFormats property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataAdapterType.KnownRasterFormats }
     *     
     */
    public void setKnownRasterFormats(DataAdapterType.KnownRasterFormats value) {
        this.knownRasterFormats = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *       &lt;attribute name="val" type="{http://www.w3.org/2001/XMLSchema}string" default="|gif|tif|tiff|jpg|jpeg|png|bmp|" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class KnownRasterFormats {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected Boolean changeable;
        @XmlAttribute
        protected String val;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changeable property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isChangeable() {
            if (changeable == null) {
                return true;
            } else {
                return changeable;
            }
        }

        /**
         * Sets the value of the changeable property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChangeable(Boolean value) {
            this.changeable = value;
        }

        /**
         * Gets the value of the val property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVal() {
            if (val == null) {
                return "|gif|tif|tiff|jpg|jpeg|png|bmp|";
            } else {
                return val;
            }
        }

        /**
         * Sets the value of the val property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVal(String value) {
            this.val = value;
        }

    }

}