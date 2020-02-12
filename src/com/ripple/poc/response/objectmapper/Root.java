package com.ripple.poc.response.objectmapper;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Root {

    @XmlSchemaType(name = "unsignedByte")
    protected short id;
    @XmlElement(required = true)
    protected Root.Result result;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the id property.
     * 
     */
    public short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(short value) {
        this.id = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Root.Result }
     *     
     */
    public Root.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Root.Result }
     *     
     */
    public void setResult(Root.Result value) {
        this.result = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }


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
     *         &lt;element name="info">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="build_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="complete_ledgers" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="hostid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="io_latency_ms" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="jq_trans_overflow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="last_close">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="converge_time_s" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                             &lt;element name="proposers" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="load_factor" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="peer_disconnects" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                   &lt;element name="peer_disconnects_resources" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
     *                   &lt;element name="peers" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                   &lt;element name="pubkey_node" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="server_state" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="server_state_duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                   &lt;element name="state_accounting">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="connected">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                       &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="disconnected">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                       &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="full">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                                       &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="syncing">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                       &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="tracking">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                       &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="uptime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                   &lt;element name="validated_ledger">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                             &lt;element name="base_fee_xrp" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="reserve_base_xrp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                             &lt;element name="reserve_inc_xrp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                             &lt;element name="seq" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="validation_quorum" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "info"
    })
    public static class Result {

        @XmlElement(required = true)
        protected Root.Result.Info info;

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link Root.Result.Info }
         *     
         */
        public Root.Result.Info getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link Root.Result.Info }
         *     
         */
        public void setInfo(Root.Result.Info value) {
            this.info = value;
        }


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
         *         &lt;element name="build_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="complete_ledgers" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="hostid" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="io_latency_ms" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="jq_trans_overflow" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="last_close">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="converge_time_s" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                   &lt;element name="proposers" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="load_factor" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="peer_disconnects" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *         &lt;element name="peer_disconnects_resources" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
         *         &lt;element name="peers" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *         &lt;element name="pubkey_node" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="server_state" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="server_state_duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *         &lt;element name="state_accounting">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="connected">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                             &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="disconnected">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                             &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="full">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *                             &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="syncing">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                             &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="tracking">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                             &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="uptime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *         &lt;element name="validated_ledger">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                   &lt;element name="base_fee_xrp" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="reserve_base_xrp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                   &lt;element name="reserve_inc_xrp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
         *                   &lt;element name="seq" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="validation_quorum" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
            "buildVersion",
            "completeLedgers",
            "hostid",
            "ioLatencyMs",
            "jqTransOverflow",
            "lastClose",
            "loadFactor",
            "peerDisconnects",
            "peerDisconnectsResources",
            "peers",
            "pubkeyNode",
            "serverState",
            "serverStateDurationUs",
            "stateAccounting",
            "time",
            "uptime",
            "validatedLedger",
            "validationQuorum"
        })
        public static class Info {

        	@JsonProperty("build_version")
            protected String build_version;
        	
           
            @JsonProperty("complete_ledgers")
            protected String complete_ledgers;
            
            @JsonProperty("hostid")
            protected String hostid;
            
            @JsonProperty("io_latency_ms")
            protected short io_latency_ms;
           
            @JsonProperty("jq_trans_overflow")
            protected short jq_trans_overflow;
            
            
            @JsonProperty("last_close")
            protected Root.Result.Info.LastClose last_close;
            
            @JsonProperty("load_factor")
            protected short load_factor;
            
            
            @JsonProperty("peer_disconnects")
            protected long peer_disconnects;
            
            
            @JsonProperty("peer_disconnects_resources")
            protected int peer_disconnects_resources;
            
            
            @JsonProperty("peers")
            protected short peers;
            
            
            @JsonProperty("pubkey_node")
            protected String pubkey_node;
            
            
            @JsonProperty("server_state")
            protected String serverState;
            
            
            @JsonProperty("server_state_duration_us")
            protected BigInteger serverStateDurationUs;
           
            @JsonProperty("state_accounting")
            protected Root.Result.Info.StateAccounting stateAccounting;
            
            @JsonProperty("time")
            protected String time;
            
            @JsonProperty("uptime")
            protected long uptime;
            
            @JsonProperty("validated_ledger")
            protected Root.Result.Info.ValidatedLedger validatedLedger;
            
            @JsonProperty("validation_quorum")
            protected short validationQuorum;

            /**
             * Gets the value of the buildVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBuildVersion() {
                return build_version;
            }

            /**
             * Sets the value of the buildVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBuildVersion(String value) {
                this.build_version = value;
            }

            /**
             * Gets the value of the completeLedgers property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompleteLedgers() {
                return complete_ledgers;
            }

            /**
             * Sets the value of the completeLedgers property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompleteLedgers(String value) {
                this.complete_ledgers = value;
            }

            /**
             * Gets the value of the hostid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHostid() {
                return hostid;
            }

            /**
             * Sets the value of the hostid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHostid(String value) {
                this.hostid = value;
            }

            /**
             * Gets the value of the ioLatencyMs property.
             * 
             */
            public short getIoLatencyMs() {
                return io_latency_ms;
            }

            /**
             * Sets the value of the ioLatencyMs property.
             * 
             */
            public void setIoLatencyMs(short value) {
                this.io_latency_ms = value;
            }

            /**
             * Gets the value of the jqTransOverflow property.
             * 
             */
            public short getJqTransOverflow() {
                return jq_trans_overflow;
            }

            /**
             * Sets the value of the jqTransOverflow property.
             * 
             */
            public void setJqTransOverflow(short value) {
                this.jq_trans_overflow = value;
            }

            /**
             * Gets the value of the lastClose property.
             * 
             * @return
             *     possible object is
             *     {@link Root.Result.Info.LastClose }
             *     
             */
            public Root.Result.Info.LastClose getLastClose() {
                return last_close;
            }

            /**
             * Sets the value of the lastClose property.
             * 
             * @param value
             *     allowed object is
             *     {@link Root.Result.Info.LastClose }
             *     
             */
            public void setLastClose(Root.Result.Info.LastClose value) {
                this.last_close = value;
            }

            /**
             * Gets the value of the loadFactor property.
             * 
             */
            public short getLoadFactor() {
                return load_factor;
            }

            /**
             * Sets the value of the loadFactor property.
             * 
             */
            public void setLoadFactor(short value) {
                this.load_factor = value;
            }

            /**
             * Gets the value of the peerDisconnects property.
             * 
             */
            public long getPeerDisconnects() {
                return peer_disconnects;
            }

            /**
             * Sets the value of the peerDisconnects property.
             * 
             */
            public void setPeerDisconnects(long value) {
                this.peer_disconnects = value;
            }

            /**
             * Gets the value of the peerDisconnectsResources property.
             * 
             */
            public int getPeerDisconnectsResources() {
                return peer_disconnects_resources;
            }

            /**
             * Sets the value of the peerDisconnectsResources property.
             * 
             */
            public void setPeerDisconnectsResources(int value) {
                this.peer_disconnects_resources = value;
            }

            /**
             * Gets the value of the peers property.
             * 
             */
            public short getPeers() {
                return peers;
            }

            /**
             * Sets the value of the peers property.
             * 
             */
            public void setPeers(short value) {
                this.peers = value;
            }

            /**
             * Gets the value of the pubkeyNode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPubkeyNode() {
                return pubkey_node;
            }

            /**
             * Sets the value of the pubkeyNode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPubkeyNode(String value) {
                this.pubkey_node = value;
            }

            /**
             * Gets the value of the serverState property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServerState() {
                return serverState;
            }

            /**
             * Sets the value of the serverState property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServerState(String value) {
                this.serverState = value;
            }

            /**
             * Gets the value of the serverStateDurationUs property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getServerStateDurationUs() {
                return serverStateDurationUs;
            }

            /**
             * Sets the value of the serverStateDurationUs property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setServerStateDurationUs(BigInteger value) {
                this.serverStateDurationUs = value;
            }

            /**
             * Gets the value of the stateAccounting property.
             * 
             * @return
             *     possible object is
             *     {@link Root.Result.Info.StateAccounting }
             *     
             */
            public Root.Result.Info.StateAccounting getStateAccounting() {
                return stateAccounting;
            }

            /**
             * Sets the value of the stateAccounting property.
             * 
             * @param value
             *     allowed object is
             *     {@link Root.Result.Info.StateAccounting }
             *     
             */
            public void setStateAccounting(Root.Result.Info.StateAccounting value) {
                this.stateAccounting = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTime(String value) {
                this.time = value;
            }

            /**
             * Gets the value of the uptime property.
             * 
             */
            public long getUptime() {
                return uptime;
            }

            /**
             * Sets the value of the uptime property.
             * 
             */
            public void setUptime(long value) {
                this.uptime = value;
            }

            /**
             * Gets the value of the validatedLedger property.
             * 
             * @return
             *     possible object is
             *     {@link Root.Result.Info.ValidatedLedger }
             *     
             */
            public Root.Result.Info.ValidatedLedger getValidatedLedger() {
                return validatedLedger;
            }

            /**
             * Sets the value of the validatedLedger property.
             * 
             * @param value
             *     allowed object is
             *     {@link Root.Result.Info.ValidatedLedger }
             *     
             */
            public void setValidatedLedger(Root.Result.Info.ValidatedLedger value) {
                this.validatedLedger = value;
            }

            /**
             * Gets the value of the validationQuorum property.
             * 
             */
            public short getValidationQuorum() {
                return validationQuorum;
            }

            /**
             * Sets the value of the validationQuorum property.
             * 
             */
            public void setValidationQuorum(short value) {
                this.validationQuorum = value;
            }


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
             *         &lt;element name="converge_time_s" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *         &lt;element name="proposers" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
                "convergeTimeS",
                "proposers"
            })
            public static class LastClose {

               
                @JsonProperty("converge_time_s")
                protected BigDecimal convergeTimeS;
               
                @JsonProperty("proposers")
                protected short proposers;

                /**
                 * Gets the value of the convergeTimeS property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getConvergeTimeS() {
                    return convergeTimeS;
                }

                /**
                 * Sets the value of the convergeTimeS property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setConvergeTimeS(BigDecimal value) {
                    this.convergeTimeS = value;
                }

                /**
                 * Gets the value of the proposers property.
                 * 
                 */
                public short getProposers() {
                    return proposers;
                }

                /**
                 * Sets the value of the proposers property.
                 * 
                 */
                public void setProposers(short value) {
                    this.proposers = value;
                }

            }


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
             *         &lt;element name="connected">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *                   &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="disconnected">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *                   &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="full">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
             *                   &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="syncing">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *                   &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="tracking">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                   &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
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
            @XmlType(name = "", propOrder = {
                "connected",
                "disconnected",
                "full",
                "syncing",
                "tracking"
            })
            public static class StateAccounting {

            	 @JsonProperty("connected")
                protected Root.Result.Info.StateAccounting.Connected connected;
            	 @JsonProperty("disconnected")
                protected Root.Result.Info.StateAccounting.Disconnected disconnected;
            	 @JsonProperty("full")
                protected Root.Result.Info.StateAccounting.Full full;
            	 @JsonProperty("syncing")
                protected Root.Result.Info.StateAccounting.Syncing syncing;
            	 @JsonProperty("tracking")
                protected Root.Result.Info.StateAccounting.Tracking tracking;

                /**
                 * Gets the value of the connected property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.Result.Info.StateAccounting.Connected }
                 *     
                 */
                public Root.Result.Info.StateAccounting.Connected getConnected() {
                    return connected;
                }

                /**
                 * Sets the value of the connected property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.Result.Info.StateAccounting.Connected }
                 *     
                 */
                public void setConnected(Root.Result.Info.StateAccounting.Connected value) {
                    this.connected = value;
                }

                /**
                 * Gets the value of the disconnected property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.Result.Info.StateAccounting.Disconnected }
                 *     
                 */
                public Root.Result.Info.StateAccounting.Disconnected getDisconnected() {
                    return disconnected;
                }

                /**
                 * Sets the value of the disconnected property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.Result.Info.StateAccounting.Disconnected }
                 *     
                 */
                public void setDisconnected(Root.Result.Info.StateAccounting.Disconnected value) {
                    this.disconnected = value;
                }

                /**
                 * Gets the value of the full property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.Result.Info.StateAccounting.Full }
                 *     
                 */
                public Root.Result.Info.StateAccounting.Full getFull() {
                    return full;
                }

                /**
                 * Sets the value of the full property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.Result.Info.StateAccounting.Full }
                 *     
                 */
                public void setFull(Root.Result.Info.StateAccounting.Full value) {
                    this.full = value;
                }

                /**
                 * Gets the value of the syncing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.Result.Info.StateAccounting.Syncing }
                 *     
                 */
                public Root.Result.Info.StateAccounting.Syncing getSyncing() {
                    return syncing;
                }

                /**
                 * Sets the value of the syncing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.Result.Info.StateAccounting.Syncing }
                 *     
                 */
                public void setSyncing(Root.Result.Info.StateAccounting.Syncing value) {
                    this.syncing = value;
                }

                /**
                 * Gets the value of the tracking property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Root.Result.Info.StateAccounting.Tracking }
                 *     
                 */
                public Root.Result.Info.StateAccounting.Tracking getTracking() {
                    return tracking;
                }

                /**
                 * Sets the value of the tracking property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Root.Result.Info.StateAccounting.Tracking }
                 *     
                 */
                public void setTracking(Root.Result.Info.StateAccounting.Tracking value) {
                    this.tracking = value;
                }


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
                 *         &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                 *         &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
                    "durationUs",
                    "transitions"
                })
                public static class Connected {

                	@JsonProperty("duration_us")
                    protected long durationUs;
                	@JsonProperty("transitions")
                    protected short transitions;

                    /**
                     * Gets the value of the durationUs property.
                     * 
                     */
                    public long getDurationUs() {
                        return durationUs;
                    }

                    /**
                     * Sets the value of the durationUs property.
                     * 
                     */
                    public void setDurationUs(long value) {
                        this.durationUs = value;
                    }

                    /**
                     * Gets the value of the transitions property.
                     * 
                     */
                    public short getTransitions() {
                        return transitions;
                    }

                    /**
                     * Sets the value of the transitions property.
                     * 
                     */
                    public void setTransitions(short value) {
                        this.transitions = value;
                    }

                }


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
                 *         &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                 *         &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
                    "durationUs",
                    "transitions"
                })
                public static class Disconnected {

                	@JsonProperty("duration_us")
                    protected long durationUs;
                	@JsonProperty("transitions")
                    protected short transitions;

                    /**
                     * Gets the value of the durationUs property.
                     * 
                     */
                    public long getDurationUs() {
                        return durationUs;
                    }

                    /**
                     * Sets the value of the durationUs property.
                     * 
                     */
                    public void setDurationUs(long value) {
                        this.durationUs = value;
                    }

                    /**
                     * Gets the value of the transitions property.
                     * 
                     */
                    public short getTransitions() {
                        return transitions;
                    }

                    /**
                     * Sets the value of the transitions property.
                     * 
                     */
                    public void setTransitions(short value) {
                        this.transitions = value;
                    }

                }


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
                 *         &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
                 *         &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
                    "durationUs",
                    "transitions"
                })
                public static class Full {

                	@JsonProperty("duration_us")
                    protected BigInteger durationUs;
                	@JsonProperty("transitions")
                    protected short transitions;

                    /**
                     * Gets the value of the durationUs property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getDurationUs() {
                        return durationUs;
                    }

                    /**
                     * Sets the value of the durationUs property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setDurationUs(BigInteger value) {
                        this.durationUs = value;
                    }

                    /**
                     * Gets the value of the transitions property.
                     * 
                     */
                    public short getTransitions() {
                        return transitions;
                    }

                    /**
                     * Sets the value of the transitions property.
                     * 
                     */
                    public void setTransitions(short value) {
                        this.transitions = value;
                    }

                }


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
                 *         &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                 *         &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
                    "durationUs",
                    "transitions"
                })
                public static class Syncing {

                	@JsonProperty("duration_us")
                    protected long durationUs;
                    @JsonProperty("transitions")
                    protected short transitions;

                    /**
                     * Gets the value of the durationUs property.
                     * 
                     */
                    public long getDurationUs() {
                        return durationUs;
                    }

                    /**
                     * Sets the value of the durationUs property.
                     * 
                     */
                    public void setDurationUs(long value) {
                        this.durationUs = value;
                    }

                    /**
                     * Gets the value of the transitions property.
                     * 
                     */
                    public short getTransitions() {
                        return transitions;
                    }

                    /**
                     * Sets the value of the transitions property.
                     * 
                     */
                    public void setTransitions(short value) {
                        this.transitions = value;
                    }

                }


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
                 *         &lt;element name="duration_us" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
                 *         &lt;element name="transitions" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
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
                    "durationUs",
                    "transitions"
                })
                public static class Tracking {

                	@JsonProperty("duration_us")
                    protected short durationUs;
                	@JsonProperty("transitions")
                    protected short transitions;

                    /**
                     * Gets the value of the durationUs property.
                     * 
                     */
                    public short getDurationUs() {
                        return durationUs;
                    }

                    /**
                     * Sets the value of the durationUs property.
                     * 
                     */
                    public void setDurationUs(short value) {
                        this.durationUs = value;
                    }

                    /**
                     * Gets the value of the transitions property.
                     * 
                     */
                    public short getTransitions() {
                        return transitions;
                    }

                    /**
                     * Sets the value of the transitions property.
                     * 
                     */
                    public void setTransitions(short value) {
                        this.transitions = value;
                    }

                }

            }


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
             *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *         &lt;element name="base_fee_xrp" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="reserve_base_xrp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *         &lt;element name="reserve_inc_xrp" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
             *         &lt;element name="seq" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
                "age",
                "baseFeeXrp",
                "hash",
                "reserveBaseXrp",
                "reserveIncXrp",
                "seq"
            })
            public static class ValidatedLedger {

            	 @JsonProperty("age")
                protected short age;
            	 @JsonProperty("base_fee_xrp")
                protected float baseFeeXrp;
            	 @JsonProperty("hash")
                protected String hash;
            	 @JsonProperty("reserve_base_xrp")
                protected short reserveBaseXrp;
            	 @JsonProperty("reserve_inc_xrp")
              
                protected short reserveIncXrp;
            	 @JsonProperty("seq")
                protected long seq;

                /**
                 * Gets the value of the age property.
                 * 
                 */
                public short getAge() {
                    return age;
                }

                /**
                 * Sets the value of the age property.
                 * 
                 */
                public void setAge(short value) {
                    this.age = value;
                }

                /**
                 * Gets the value of the baseFeeXrp property.
                 * 
                 */
                public float getBaseFeeXrp() {
                    return baseFeeXrp;
                }

                /**
                 * Sets the value of the baseFeeXrp property.
                 * 
                 */
                public void setBaseFeeXrp(float value) {
                    this.baseFeeXrp = value;
                }

                /**
                 * Gets the value of the hash property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHash() {
                    return hash;
                }

                /**
                 * Sets the value of the hash property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHash(String value) {
                    this.hash = value;
                }

                /**
                 * Gets the value of the reserveBaseXrp property.
                 * 
                 */
                public short getReserveBaseXrp() {
                    return reserveBaseXrp;
                }

                /**
                 * Sets the value of the reserveBaseXrp property.
                 * 
                 */
                public void setReserveBaseXrp(short value) {
                    this.reserveBaseXrp = value;
                }

                /**
                 * Gets the value of the reserveIncXrp property.
                 * 
                 */
                public short getReserveIncXrp() {
                    return reserveIncXrp;
                }

                /**
                 * Sets the value of the reserveIncXrp property.
                 * 
                 */
                public void setReserveIncXrp(short value) {
                    this.reserveIncXrp = value;
                }

                /**
                 * Gets the value of the seq property.
                 * 
                 */
                public long getSeq() {
                    return seq;
                }

                /**
                 * Sets the value of the seq property.
                 * 
                 */
                public void setSeq(long value) {
                    this.seq = value;
                }

            }

        }

    }

}
