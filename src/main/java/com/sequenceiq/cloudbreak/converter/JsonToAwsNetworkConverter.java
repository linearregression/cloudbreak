package com.sequenceiq.cloudbreak.converter;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.sequenceiq.cloudbreak.controller.json.NetworkJson;
import com.sequenceiq.cloudbreak.controller.validation.AwsNetworkParam;
import com.sequenceiq.cloudbreak.domain.AwsNetwork;

@Component
public class JsonToAwsNetworkConverter extends AbstractConversionServiceAwareConverter<NetworkJson, AwsNetwork> {

    @Override
    public AwsNetwork convert(NetworkJson source) {
        AwsNetwork network = new AwsNetwork();
        network.setName(source.getName());
        network.setDescription(source.getDescription());
        network.setSubnetCIDR(source.getSubnetCIDR());
        network.setPublicInAccount(source.isPublicInAccount());
        Map<String, Object> parameters = source.getParameters();
        if (parameters.containsKey(AwsNetworkParam.VPC_ID.getName())) {
            String vpcId = String.valueOf(parameters.get(AwsNetworkParam.VPC_ID.getName()));
            network.setVpcId(vpcId);
        }
        if (parameters.containsKey(AwsNetworkParam.INTERNET_GATEWAY_ID.getName())) {
            String internetGatewayId = String.valueOf(parameters.get(AwsNetworkParam.INTERNET_GATEWAY_ID.getName()));
            network.setInternetGatewayId(internetGatewayId);
        }
        return network;
    }
}
