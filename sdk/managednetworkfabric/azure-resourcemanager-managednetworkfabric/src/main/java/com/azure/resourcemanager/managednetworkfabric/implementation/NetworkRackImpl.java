// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkRackInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRack;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkRackPatch;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NetworkRackImpl implements NetworkRack, NetworkRack.Definition, NetworkRack.Update {
    private NetworkRackInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String networkRackSku() {
        return this.innerModel().networkRackSku();
    }

    public String networkFabricId() {
        return this.innerModel().networkFabricId();
    }

    public List<String> networkDevices() {
        List<String> inner = this.innerModel().networkDevices();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String annotation() {
        return this.innerModel().annotation();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NetworkRackInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkRackName;

    private NetworkRackPatch updateBody;

    public NetworkRackImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkRack create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkRacks()
                .create(resourceGroupName, networkRackName, this.innerModel(), Context.NONE);
        return this;
    }

    public NetworkRack create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkRacks()
                .create(resourceGroupName, networkRackName, this.innerModel(), context);
        return this;
    }

    NetworkRackImpl(
        String name, com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = new NetworkRackInner();
        this.serviceManager = serviceManager;
        this.networkRackName = name;
    }

    public NetworkRackImpl update() {
        this.updateBody = new NetworkRackPatch();
        return this;
    }

    public NetworkRack apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkRacks()
                .update(resourceGroupName, networkRackName, updateBody, Context.NONE);
        return this;
    }

    public NetworkRack apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkRacks()
                .update(resourceGroupName, networkRackName, updateBody, context);
        return this;
    }

    NetworkRackImpl(
        NetworkRackInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkRackName = Utils.getValueFromIdByName(innerObject.id(), "networkRacks");
    }

    public NetworkRack refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkRacks()
                .getByResourceGroupWithResponse(resourceGroupName, networkRackName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkRack refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkRacks()
                .getByResourceGroupWithResponse(resourceGroupName, networkRackName, context)
                .getValue();
        return this;
    }

    public NetworkRackImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkRackImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkRackImpl withNetworkRackSku(String networkRackSku) {
        this.innerModel().withNetworkRackSku(networkRackSku);
        return this;
    }

    public NetworkRackImpl withNetworkFabricId(String networkFabricId) {
        this.innerModel().withNetworkFabricId(networkFabricId);
        return this;
    }

    public NetworkRackImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public NetworkRackImpl withAnnotation(String annotation) {
        this.innerModel().withAnnotation(annotation);
        return this;
    }

    public NetworkRackImpl withProperties(Object properties) {
        this.updateBody.withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
