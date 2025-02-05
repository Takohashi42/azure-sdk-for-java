// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.IpAddress;
import org.junit.jupiter.api.Assertions;

public final class IpAddressTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpAddress model =
            BinaryData
                .fromString("{\"resourceId\":\"yhejhzisxgfp\",\"address\":\"olppvksrpqvujz\"}")
                .toObject(IpAddress.class);
        Assertions.assertEquals("yhejhzisxgfp", model.resourceId());
        Assertions.assertEquals("olppvksrpqvujz", model.address());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpAddress model = new IpAddress().withResourceId("yhejhzisxgfp").withAddress("olppvksrpqvujz");
        model = BinaryData.fromObject(model).toObject(IpAddress.class);
        Assertions.assertEquals("yhejhzisxgfp", model.resourceId());
        Assertions.assertEquals("olppvksrpqvujz", model.address());
    }
}
