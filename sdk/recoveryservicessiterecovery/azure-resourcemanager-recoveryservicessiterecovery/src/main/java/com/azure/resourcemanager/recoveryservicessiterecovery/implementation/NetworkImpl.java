// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.NetworkInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Network;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.NetworkProperties;

public final class NetworkImpl implements Network {
    private NetworkInner innerObject;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    NetworkImpl(
        NetworkInner innerObject,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public NetworkProperties properties() {
        return this.innerModel().properties();
    }

    public String location() {
        return this.innerModel().location();
    }

    public NetworkInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
