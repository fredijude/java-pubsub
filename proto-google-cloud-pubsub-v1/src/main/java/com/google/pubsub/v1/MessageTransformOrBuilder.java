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

public interface MessageTransformOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.MessageTransform)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. JavaScript User Defined Function. If multiple JavaScriptUDF's
   * are specified on a resource, each must have a unique `function_name`.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.JavaScriptUDF javascript_udf = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the javascriptUdf field is set.
   */
  boolean hasJavascriptUdf();
  /**
   *
   *
   * <pre>
   * Optional. JavaScript User Defined Function. If multiple JavaScriptUDF's
   * are specified on a resource, each must have a unique `function_name`.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.JavaScriptUDF javascript_udf = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The javascriptUdf.
   */
  com.google.pubsub.v1.JavaScriptUDF getJavascriptUdf();
  /**
   *
   *
   * <pre>
   * Optional. JavaScript User Defined Function. If multiple JavaScriptUDF's
   * are specified on a resource, each must have a unique `function_name`.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.JavaScriptUDF javascript_udf = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.JavaScriptUDFOrBuilder getJavascriptUdfOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. This field is deprecated, use the `disabled` field to disable
   * transforms.
   * </pre>
   *
   * <code>bool enabled = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @deprecated google.pubsub.v1.MessageTransform.enabled is deprecated. See
   *     google/pubsub/v1/pubsub.proto;l=726
   * @return The enabled.
   */
  @java.lang.Deprecated
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Optional. If true, the transform is disabled and will not be applied to
   * messages. Defaults to `false`.
   * </pre>
   *
   * <code>bool disabled = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  com.google.pubsub.v1.MessageTransform.TransformCase getTransformCase();
}
