// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for NetworkDevices GetStaticInterfaceMaps. */
public final class NetworkDevicesGetStaticInterfaceMapsSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/NetworkDevices_getStaticInterfaceMaps_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkDevices_getStaticInterfaceMaps_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkDevicesGetStaticInterfaceMapsMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .networkDevices()
            .getStaticInterfaceMaps("resourceGroupName", "networkDeviceName", com.azure.core.util.Context.NONE);
    }
}
