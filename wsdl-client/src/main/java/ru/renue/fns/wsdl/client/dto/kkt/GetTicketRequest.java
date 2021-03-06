
package ru.renue.fns.wsdl.client.dto.kkt;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTicketInfo" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0}GetTicketInfo"/>
 *         &lt;element name="GeoInfo" type="{urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0}GeoInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTicketInfo",
    "geoInfo"
})
@XmlRootElement(name = "GetTicketRequest", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0")
public class GetTicketRequest {

    @XmlElement(name = "GetTicketInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected GetTicketInfo getTicketInfo;
    @XmlElement(name = "GeoInfo", namespace = "urn://x-artefacts-gnivc-ru/ais3/kkt/KktTicketService/types/1.0", required = true)
    protected GeoInfo geoInfo;

    /**
     * Gets the value of the getTicketInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetTicketInfo }
     *     
     */
    public GetTicketInfo getGetTicketInfo() {
        return getTicketInfo;
    }

    /**
     * Sets the value of the getTicketInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTicketInfo }
     *     
     */
    public void setGetTicketInfo(GetTicketInfo value) {
        this.getTicketInfo = value;
    }

    /**
     * Gets the value of the geoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GeoInfo }
     *     
     */
    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    /**
     * Sets the value of the geoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoInfo }
     *     
     */
    public void setGeoInfo(GeoInfo value) {
        this.geoInfo = value;
    }

}
