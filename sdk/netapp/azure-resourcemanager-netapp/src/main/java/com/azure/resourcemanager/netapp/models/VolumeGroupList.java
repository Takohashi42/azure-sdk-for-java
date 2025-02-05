// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.netapp.fluent.models.VolumeGroupInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of volume group resources. */
@Fluent
public final class VolumeGroupList {
    /*
     * List of volume Groups
     */
    @JsonProperty(value = "value")
    private List<VolumeGroupInner> value;

    /** Creates an instance of VolumeGroupList class. */
    public VolumeGroupList() {
    }

    /**
     * Get the value property: List of volume Groups.
     *
     * @return the value value.
     */
    public List<VolumeGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of volume Groups.
     *
     * @param value the value value to set.
     * @return the VolumeGroupList object itself.
     */
    public VolumeGroupList withValue(List<VolumeGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
