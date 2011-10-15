package ru.dreamjteam.xml.binds.carReports;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for carReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="carModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="govNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seatCap" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="running" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="new"/>
 *               &lt;enumeration value="executing"/>
 *               &lt;enumeration value="done"/>
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
@XmlType(name = "carReport", propOrder = {
    "idCar",
    "idOrder",
    "carModel",
    "govNumber",
    "seatCap",
    "running",
    "status"
})
@XmlRootElement
public class CarReport {

    protected int idCar;
    protected int idOrder;
    @XmlElement(required = true)
    protected String carModel;
    @XmlElement(required = true)
    protected String govNumber;
    protected int seatCap;
    protected int running;
    @XmlElement(required = true)
    protected String status;
    protected int carTypeId;
    
    /**
     * Gets the value of the idCar property.
     * 
     */
    public int getIdCar() {
        return idCar;
    }

    /**
     * Sets the value of the idCar property.
     * 
     */
    public void setIdCar(int value) {
        this.idCar = value;
    }

    /**
     * Gets the value of the idOrder property.
     * 
     */
    public int getIdOrder() {
        return idOrder;
    }

    /**
     * Sets the value of the idOrder property.
     * 
     */
    public void setIdOrder(int value) {
        this.idOrder = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

    /**
     * Gets the value of the govNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovNumber() {
        return govNumber;
    }

    /**
     * Sets the value of the govNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovNumber(String value) {
        this.govNumber = value;
    }

    /**
     * Gets the value of the seatCap property.
     * 
     */
    public int getSeatCap() {
        return seatCap;
    }

    /**
     * Sets the value of the seatCap property.
     * 
     */
    public void setSeatCap(int value) {
        this.seatCap = value;
    }

    /**
     * Gets the value of the running property.
     * 
     */
    public int getRunning() {
        return running;
    }

    /**
     * Sets the value of the running property.
     * 
     */
    public void setRunning(int value) {
        this.running = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }
    
        /**
     * Gets the value of the carTypeId property.
     * 
     */
    public int getCarTypeId() {
        return carTypeId;
    }

    /**
     * Sets the value of the carTypeId property.
     * 
     */
    public void setCarTypeId(int value) {
        this.carTypeId = value;
    }

}
