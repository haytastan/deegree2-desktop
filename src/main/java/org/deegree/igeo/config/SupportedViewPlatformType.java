//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.15 at 10:29:06 AM MESZ 
//


package org.deegree.igeo.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for SupportedViewPlatformType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportedViewPlatformType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Application"/>
 *     &lt;enumeration value="Portlet"/>
 *     &lt;enumeration value="JSP/HTML"/>
 *     &lt;enumeration value="Applet"/>
 *     &lt;enumeration value="JME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum SupportedViewPlatformType {

    @XmlEnumValue("Application")
    APPLICATION("Application"),
    @XmlEnumValue("Portlet")
    PORTLET("Portlet"),
    @XmlEnumValue("JSP/HTML")
    JSP___HTML("JSP/HTML"),
    @XmlEnumValue("Applet")
    APPLET("Applet"),
    JME("JME");
    private final String value;

    SupportedViewPlatformType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SupportedViewPlatformType fromValue(String v) {
        for (SupportedViewPlatformType c: SupportedViewPlatformType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}