package com.sequenceiq.cloudbreak.domain;

import javax.persistence.Entity;

@Entity
public class AzureNetwork extends Network {

    private String addressesPrefixCIDR;

    public String getAddressesPrefixCIDR() {
        return addressesPrefixCIDR;
    }

    public void setAddressesPrefixCIDR(String addressesPrefixCIDR) {
        this.addressesPrefixCIDR = addressesPrefixCIDR;
    }
}
