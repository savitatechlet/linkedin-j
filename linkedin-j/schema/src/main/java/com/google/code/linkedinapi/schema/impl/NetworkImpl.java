//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.11 at 11:52:24 AM GMT+05:00 
//


package com.google.code.linkedinapi.schema.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.Network;
import com.google.code.linkedinapi.schema.NetworkStats;
import com.google.code.linkedinapi.schema.Updates;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "networkStats",
    "updates"
})
@XmlRootElement(name = "network")
public class NetworkImpl
    implements Network
{

    @XmlElement(name = "network-stats", required = true, type = NetworkStatsImpl.class)
    protected NetworkStatsImpl networkStats;
    @XmlElement(required = true, type = UpdatesImpl.class)
    protected UpdatesImpl updates;

    public NetworkStats getNetworkStats() {
        return networkStats;
    }

    public void setNetworkStats(NetworkStats value) {
        this.networkStats = ((NetworkStatsImpl) value);
    }

    public Updates getUpdates() {
        return updates;
    }

    public void setUpdates(Updates value) {
        this.updates = ((UpdatesImpl) value);
    }

}