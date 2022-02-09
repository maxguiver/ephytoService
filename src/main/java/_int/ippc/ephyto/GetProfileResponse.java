/**
 * GetProfileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _int.ippc.ephyto;

public class GetProfileResponse  implements java.io.Serializable {
    private _int.ippc.ephyto.HUB_Entities.Nppo getProfileResult;

    public GetProfileResponse() {
    }

    public GetProfileResponse(
           _int.ippc.ephyto.HUB_Entities.Nppo getProfileResult) {
           this.getProfileResult = getProfileResult;
    }


    /**
     * Gets the getProfileResult value for this GetProfileResponse.
     * 
     * @return getProfileResult
     */
    public _int.ippc.ephyto.HUB_Entities.Nppo getGetProfileResult() {
        return getProfileResult;
    }


    /**
     * Sets the getProfileResult value for this GetProfileResponse.
     * 
     * @param getProfileResult
     */
    public void setGetProfileResult(_int.ippc.ephyto.HUB_Entities.Nppo getProfileResult) {
        this.getProfileResult = getProfileResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetProfileResponse)) return false;
        GetProfileResponse other = (GetProfileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getProfileResult==null && other.getGetProfileResult()==null) || 
             (this.getProfileResult!=null &&
              this.getProfileResult.equals(other.getGetProfileResult())));
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
        if (getGetProfileResult() != null) {
            _hashCode += getGetProfileResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProfileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProfileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getProfileResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ephyto.ippc.int/", "GetProfileResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ephyto.ippc.int/HUB.Entities", "Nppo"));
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
