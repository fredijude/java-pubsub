/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

// Protobuf Java Version: 3.25.5
package com.google.pubsub.v1;

public interface IngestionFailureEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.IngestionFailureEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the import topic. Format is:
   * projects/{project_name}/topics/{topic_name}.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   *
   *
   * <pre>
   * Required. Name of the import topic. Format is:
   * projects/{project_name}/topics/{topic_name}.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString getTopicBytes();

  /**
   *
   *
   * <pre>
   * Required. Error details explaining why ingestion to Pub/Sub has failed.
   * </pre>
   *
   * <code>string error_message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The errorMessage.
   */
  java.lang.String getErrorMessage();
  /**
   *
   *
   * <pre>
   * Required. Error details explaining why ingestion to Pub/Sub has failed.
   * </pre>
   *
   * <code>string error_message = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for errorMessage.
   */
  com.google.protobuf.ByteString getErrorMessageBytes();

  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Cloud Storage.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.CloudStorageFailure cloud_storage_failure = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the cloudStorageFailure field is set.
   */
  boolean hasCloudStorageFailure();
  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Cloud Storage.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.CloudStorageFailure cloud_storage_failure = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The cloudStorageFailure.
   */
  com.google.pubsub.v1.IngestionFailureEvent.CloudStorageFailure getCloudStorageFailure();
  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Cloud Storage.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.CloudStorageFailure cloud_storage_failure = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionFailureEvent.CloudStorageFailureOrBuilder
      getCloudStorageFailureOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Amazon MSK.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.AwsMskFailureReason aws_msk_failure = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the awsMskFailure field is set.
   */
  boolean hasAwsMskFailure();
  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Amazon MSK.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.AwsMskFailureReason aws_msk_failure = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The awsMskFailure.
   */
  com.google.pubsub.v1.IngestionFailureEvent.AwsMskFailureReason getAwsMskFailure();
  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Amazon MSK.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.AwsMskFailureReason aws_msk_failure = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionFailureEvent.AwsMskFailureReasonOrBuilder
      getAwsMskFailureOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Azure Event Hubs.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.AzureEventHubsFailureReason azure_event_hubs_failure = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the azureEventHubsFailure field is set.
   */
  boolean hasAzureEventHubsFailure();
  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Azure Event Hubs.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.AzureEventHubsFailureReason azure_event_hubs_failure = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The azureEventHubsFailure.
   */
  com.google.pubsub.v1.IngestionFailureEvent.AzureEventHubsFailureReason getAzureEventHubsFailure();
  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Azure Event Hubs.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.AzureEventHubsFailureReason azure_event_hubs_failure = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionFailureEvent.AzureEventHubsFailureReasonOrBuilder
      getAzureEventHubsFailureOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Confluent Cloud.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.ConfluentCloudFailureReason confluent_cloud_failure = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the confluentCloudFailure field is set.
   */
  boolean hasConfluentCloudFailure();
  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Confluent Cloud.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.ConfluentCloudFailureReason confluent_cloud_failure = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The confluentCloudFailure.
   */
  com.google.pubsub.v1.IngestionFailureEvent.ConfluentCloudFailureReason getConfluentCloudFailure();
  /**
   *
   *
   * <pre>
   * Optional. Failure when ingesting from Confluent Cloud.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionFailureEvent.ConfluentCloudFailureReason confluent_cloud_failure = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionFailureEvent.ConfluentCloudFailureReasonOrBuilder
      getConfluentCloudFailureOrBuilder();

  com.google.pubsub.v1.IngestionFailureEvent.FailureCase getFailureCase();
}
