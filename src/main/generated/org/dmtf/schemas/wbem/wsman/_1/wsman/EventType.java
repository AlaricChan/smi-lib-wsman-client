/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.08 at 03:58:08 PM CDT 
//

package org.dmtf.schemas.wbem.wsman._1.wsman;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for EventType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.dmtf.org/wbem/wsman/1/wsman.xsd}attributableAny">
 *       &lt;attribute name="Action" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType")
public class EventType extends AttributableAny {

    @XmlAttribute(name = "Action", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String action;


    /**
     * Gets the value of the action property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAction() {
        return action;
    }


    /**
     * Sets the value of the action property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setAction(String value) {
        this.action = value;
    }

}
