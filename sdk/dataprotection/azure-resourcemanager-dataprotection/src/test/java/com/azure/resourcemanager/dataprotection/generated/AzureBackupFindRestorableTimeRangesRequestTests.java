// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesRequest;
import com.azure.resourcemanager.dataprotection.models.RestoreSourceDataStoreType;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupFindRestorableTimeRangesRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupFindRestorableTimeRangesRequest model =
            BinaryData
                .fromString(
                    "{\"sourceDataStoreType\":\"ArchiveStore\",\"startTime\":\"vlvqhjkbegi\",\"endTime\":\"nmxiebwwaloayqc\"}")
                .toObject(AzureBackupFindRestorableTimeRangesRequest.class);
        Assertions.assertEquals(RestoreSourceDataStoreType.ARCHIVE_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("vlvqhjkbegi", model.startTime());
        Assertions.assertEquals("nmxiebwwaloayqc", model.endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupFindRestorableTimeRangesRequest model =
            new AzureBackupFindRestorableTimeRangesRequest()
                .withSourceDataStoreType(RestoreSourceDataStoreType.ARCHIVE_STORE)
                .withStartTime("vlvqhjkbegi")
                .withEndTime("nmxiebwwaloayqc");
        model = BinaryData.fromObject(model).toObject(AzureBackupFindRestorableTimeRangesRequest.class);
        Assertions.assertEquals(RestoreSourceDataStoreType.ARCHIVE_STORE, model.sourceDataStoreType());
        Assertions.assertEquals("vlvqhjkbegi", model.startTime());
        Assertions.assertEquals("nmxiebwwaloayqc", model.endTime());
    }
}
