// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.Schedule;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SchedulesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"ykglt\",\"weeklyRecurrence\":{\"weekdays\":[],\"time\":\"qfgqkayejsxtlg\"},\"dailyRecurrence\":{\"time\":\"fgzii\"},\"hourlyRecurrence\":{\"minute\":845914569},\"timeZoneId\":\"ceatlijjjrtvamca\",\"notificationSettings\":{\"status\":\"Disabled\",\"timeInMinutes\":1639548790,\"webhookUrl\":\"ccxetyvkun\",\"emailRecipient\":\"gno\",\"notificationLocale\":\"k\"},\"createdDate\":\"2021-08-16T11:24:54Z\",\"targetResourceId\":\"g\",\"provisioningState\":\"pinde\",\"uniqueIdentifier\":\"abbxbhmedeil\"},\"location\":\"jywfcfxzirzzih\",\"tags\":{\"slczwciidjsllf\":\"pusuv\",\"dqacfrgnawbabgf\":\"yvdmvx\",\"zlfsyqkfrbzgowo\":\"ktyjmf\",\"jcx\":\"qmje\"},\"id\":\"yqgxhlus\",\"name\":\"vxisimjcea\",\"type\":\"bjqvls\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DevTestLabsManager manager =
            DevTestLabsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Schedule response =
            manager
                .schedules()
                .getWithResponse(
                    "wdfmmpzhzzwvywr", "yngydgrpxncaki", "aondjrkclamgg", "vlmfej", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("jywfcfxzirzzih", response.location());
        Assertions.assertEquals("pusuv", response.tags().get("slczwciidjsllf"));
        Assertions.assertEquals(EnableStatus.ENABLED, response.status());
        Assertions.assertEquals("ykglt", response.taskType());
        Assertions.assertEquals("qfgqkayejsxtlg", response.weeklyRecurrence().time());
        Assertions.assertEquals("fgzii", response.dailyRecurrence().time());
        Assertions.assertEquals(845914569, response.hourlyRecurrence().minute());
        Assertions.assertEquals("ceatlijjjrtvamca", response.timeZoneId());
        Assertions.assertEquals(EnableStatus.DISABLED, response.notificationSettings().status());
        Assertions.assertEquals(1639548790, response.notificationSettings().timeInMinutes());
        Assertions.assertEquals("ccxetyvkun", response.notificationSettings().webhookUrl());
        Assertions.assertEquals("gno", response.notificationSettings().emailRecipient());
        Assertions.assertEquals("k", response.notificationSettings().notificationLocale());
        Assertions.assertEquals("g", response.targetResourceId());
    }
}
