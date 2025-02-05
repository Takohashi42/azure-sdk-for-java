// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkInterfaceInner;
import org.junit.jupiter.api.Assertions;

public final class NetworkInterfaceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkInterfaceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"physicalIdentifier\":\"ostgkts\",\"administrativeState\":\"Disabled\",\"provisioningState\":\"Updating\",\"connectedTo\":\"lzedqbcvhzlhplo\",\"interfaceType\":\"Management\",\"ipv4Address\":\"lwwqfbumlkxtrqj\",\"ipv6Address\":\"mlmbtxhwgfwsrta\",\"annotation\":\"oezbrhubsk\"},\"id\":\"dyg\",\"name\":\"ookk\",\"type\":\"fqjbvleo\"}")
                .toObject(NetworkInterfaceInner.class);
        Assertions.assertEquals("oezbrhubsk", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkInterfaceInner model = new NetworkInterfaceInner().withAnnotation("oezbrhubsk");
        model = BinaryData.fromObject(model).toObject(NetworkInterfaceInner.class);
        Assertions.assertEquals("oezbrhubsk", model.annotation());
    }
}
