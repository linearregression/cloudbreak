package com.sequenceiq.cloudbreak.converter;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.sequenceiq.cloudbreak.controller.json.NetworkJson;
import com.sequenceiq.cloudbreak.controller.validation.OpenStackNetworkParam;
import com.sequenceiq.cloudbreak.domain.OpenStackNetwork;

@Component
public class JsonToOpenStackNetworkConverter extends AbstractConversionServiceAwareConverter<NetworkJson, OpenStackNetwork> {

    @Override
    public OpenStackNetwork convert(NetworkJson source) {
        OpenStackNetwork network = new OpenStackNetwork();
        network.setName(source.getName());
        network.setDescription(source.getDescription());
        network.setSubnetCIDR(source.getSubnetCIDR());
        network.setPublicInAccount(source.isPublicInAccount());
        Map<String, Object> parameters = source.getParameters();
        if (parameters.containsKey(OpenStackNetworkParam.PUBLIC_NET_ID.getName())) {
            String publicNetId = String.valueOf(parameters.get(OpenStackNetworkParam.PUBLIC_NET_ID.getName()));
            network.setPublicNetId(publicNetId);
        }
        return network;
    }
}
