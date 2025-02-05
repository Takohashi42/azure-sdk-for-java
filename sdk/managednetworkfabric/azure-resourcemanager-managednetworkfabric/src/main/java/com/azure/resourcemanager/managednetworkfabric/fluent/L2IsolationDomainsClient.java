// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ArpPropertiesInner;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.L2IsolationDomainInner;
import com.azure.resourcemanager.managednetworkfabric.models.EnableDisableOnResources;
import com.azure.resourcemanager.managednetworkfabric.models.L2IsolationDomainPatch;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;
import java.util.Map;

/** An instance of this class provides access to all the operations defined in L2IsolationDomainsClient. */
public interface L2IsolationDomainsClient {
    /**
     * Create L2 Isolation Domain.
     *
     * <p>Creates layer 2 network connectivity between compute nodes within a rack and across racks.The configuration is
     * applied on the devices only after the isolation domain is enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the L2IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<L2IsolationDomainInner>, L2IsolationDomainInner> beginCreate(
        String resourceGroupName, String l2IsolationDomainName, L2IsolationDomainInner body);

    /**
     * Create L2 Isolation Domain.
     *
     * <p>Creates layer 2 network connectivity between compute nodes within a rack and across racks.The configuration is
     * applied on the devices only after the isolation domain is enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the L2IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<L2IsolationDomainInner>, L2IsolationDomainInner> beginCreate(
        String resourceGroupName, String l2IsolationDomainName, L2IsolationDomainInner body, Context context);

    /**
     * Create L2 Isolation Domain.
     *
     * <p>Creates layer 2 network connectivity between compute nodes within a rack and across racks.The configuration is
     * applied on the devices only after the isolation domain is enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L2IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L2IsolationDomainInner create(String resourceGroupName, String l2IsolationDomainName, L2IsolationDomainInner body);

    /**
     * Create L2 Isolation Domain.
     *
     * <p>Creates layer 2 network connectivity between compute nodes within a rack and across racks.The configuration is
     * applied on the devices only after the isolation domain is enabled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L2IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L2IsolationDomainInner create(
        String resourceGroupName, String l2IsolationDomainName, L2IsolationDomainInner body, Context context);

    /**
     * Retrieves details of this L2 Isolation Domain.
     *
     * <p>Implements L2 Isolation Domain GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L2IsolationDomain resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<L2IsolationDomainInner> getByResourceGroupWithResponse(
        String resourceGroupName, String l2IsolationDomainName, Context context);

    /**
     * Retrieves details of this L2 Isolation Domain.
     *
     * <p>Implements L2 Isolation Domain GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L2IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L2IsolationDomainInner getByResourceGroup(String resourceGroupName, String l2IsolationDomainName);

    /**
     * Updates a L2 Isolation Domain.
     *
     * <p>API to update certain properties of the L2 Isolation Domain resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param body API to update certain properties of the L2 Isolation Domain resource..
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the L2IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<L2IsolationDomainInner>, L2IsolationDomainInner> beginUpdate(
        String resourceGroupName, String l2IsolationDomainName, L2IsolationDomainPatch body);

    /**
     * Updates a L2 Isolation Domain.
     *
     * <p>API to update certain properties of the L2 Isolation Domain resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param body API to update certain properties of the L2 Isolation Domain resource..
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the L2IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<L2IsolationDomainInner>, L2IsolationDomainInner> beginUpdate(
        String resourceGroupName, String l2IsolationDomainName, L2IsolationDomainPatch body, Context context);

    /**
     * Updates a L2 Isolation Domain.
     *
     * <p>API to update certain properties of the L2 Isolation Domain resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param body API to update certain properties of the L2 Isolation Domain resource..
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L2IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L2IsolationDomainInner update(String resourceGroupName, String l2IsolationDomainName, L2IsolationDomainPatch body);

    /**
     * Updates a L2 Isolation Domain.
     *
     * <p>API to update certain properties of the L2 Isolation Domain resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param body API to update certain properties of the L2 Isolation Domain resource..
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L2IsolationDomain resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    L2IsolationDomainInner update(
        String resourceGroupName, String l2IsolationDomainName, L2IsolationDomainPatch body, Context context);

    /**
     * Deletes named L2 Isolation Domain
     *
     * <p>Deletes layer 2 connectivity between compute nodes by managed by named L2 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String l2IsolationDomainName);

    /**
     * Deletes named L2 Isolation Domain
     *
     * <p>Deletes layer 2 connectivity between compute nodes by managed by named L2 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String l2IsolationDomainName, Context context);

    /**
     * Deletes named L2 Isolation Domain
     *
     * <p>Deletes layer 2 connectivity between compute nodes by managed by named L2 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String l2IsolationDomainName);

    /**
     * Deletes named L2 Isolation Domain
     *
     * <p>Deletes layer 2 connectivity between compute nodes by managed by named L2 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2 Isolation Domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String l2IsolationDomainName, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Enables isolation domain across the fabric or on specified racks.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdateAdministrativeState(
        String resourceGroupName, String l2IsolationDomainName, UpdateAdministrativeState body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Enables isolation domain across the fabric or on specified racks.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdateAdministrativeState(
        String resourceGroupName, String l2IsolationDomainName, UpdateAdministrativeState body, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Enables isolation domain across the fabric or on specified racks.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateAdministrativeState(
        String resourceGroupName, String l2IsolationDomainName, UpdateAdministrativeState body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Enables isolation domain across the fabric or on specified racks.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateAdministrativeState(
        String resourceGroupName, String l2IsolationDomainName, UpdateAdministrativeState body, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginClearArpTable(
        String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginClearArpTable(
        String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void clearArpTable(String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void clearArpTable(
        String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbors for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginClearNeighborTable(
        String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbors for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginClearNeighborTable(
        String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbors for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void clearNeighborTable(String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbors for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void clearNeighborTable(
        String resourceGroupName, String l2IsolationDomainName, EnableDisableOnResources body, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbors for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of show ARP entries response per network device.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Map<String, ArpPropertiesInner>>, Map<String, ArpPropertiesInner>> beginGetArpEntries(
        String resourceGroupName, String l2IsolationDomainName);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbors for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of show ARP entries response per network device.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Map<String, ArpPropertiesInner>>, Map<String, ArpPropertiesInner>> beginGetArpEntries(
        String resourceGroupName, String l2IsolationDomainName, Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbors for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return show ARP entries response per network device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Map<String, ArpPropertiesInner> getArpEntries(String resourceGroupName, String l2IsolationDomainName);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbors for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l2IsolationDomainName Name of the L2IsolationDomain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return show ARP entries response per network device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Map<String, ArpPropertiesInner> getArpEntries(
        String resourceGroupName, String l2IsolationDomainName, Context context);

    /**
     * List L2IsolationDomains by resource group.
     *
     * <p>Displays L2IsolationDomains list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L2IsolationDomains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<L2IsolationDomainInner> listByResourceGroup(String resourceGroupName);

    /**
     * List L2IsolationDomains by resource group.
     *
     * <p>Displays L2IsolationDomains list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L2IsolationDomains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<L2IsolationDomainInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List L2IsolationDomains by subscription.
     *
     * <p>Displays L2IsolationDomains list by subscription GET method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L2IsolationDomains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<L2IsolationDomainInner> list();

    /**
     * List L2IsolationDomains by subscription.
     *
     * <p>Displays L2IsolationDomains list by subscription GET method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L2IsolationDomains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<L2IsolationDomainInner> list(Context context);
}
