/**
 * ConsigneeSPSParty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class ConsigneeSPSParty  implements java.io.Serializable {
    private java.lang.String name;

    private _int.ippc.ephyto.SpecifiedSPSAddress specifiedSPSAddress;

    public ConsigneeSPSParty() {
    }

    public ConsigneeSPSParty(
           java.lang.String name,
           _int.ippc.ephyto.SpecifiedSPSAddress specifiedSPSAddress) {
           this.name = name;
           this.specifiedSPSAddress = specifiedSPSAddress;
    }


    /**
     * Gets the name value for this ConsigneeSPSParty.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConsigneeSPSParty.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the specifiedSPSAddress value for this ConsigneeSPSParty.
     * 
     * @return specifiedSPSAddress
     */
    public _int.ippc.ephyto.SpecifiedSPSAddress getSpecifiedSPSAddress() {
        return specifiedSPSAddress;
    }


    /**
     * Sets the specifiedSPSAddress value for this ConsigneeSPSParty.
     * 
     * @param specifiedSPSAddress
     */
    public void setSpecifiedSPSAddress(_int.ippc.ephyto.SpecifiedSPSAddress specifiedSPSAddress) {
        this.specifiedSPSAddress = specifiedSPSAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsigneeSPSParty)) return false;
        ConsigneeSPSParty other = (ConsigneeSPSParty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.specifiedSPSAddress==null && other.getSpecifiedSPSAddress()==null) || 
             (this.specifiedSPSAddress!=null &&
              this.specifiedSPSAddress.equals(other.getSpecifiedSPSAddress())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSpecifiedSPSAddress() != null) {
            _hashCode += getSpecifiedSPSAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsigneeSPSParty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "consigneeSPSParty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specifiedSPSAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:21", "SpecifiedSPSAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "specifiedSPSAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
