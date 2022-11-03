/*
 * Copyright 2020 Google LLC
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

package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * Response for the `ListTopicSubscriptions` method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.ListTopicSubscriptionsResponse}
 */
public final class ListTopicSubscriptionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.ListTopicSubscriptionsResponse)
    ListTopicSubscriptionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTopicSubscriptionsResponse.newBuilder() to construct.
  private ListTopicSubscriptionsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTopicSubscriptionsResponse() {
    subscriptions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListTopicSubscriptionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ListTopicSubscriptionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ListTopicSubscriptionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.ListTopicSubscriptionsResponse.class,
            com.google.pubsub.v1.ListTopicSubscriptionsResponse.Builder.class);
  }

  public static final int SUBSCRIPTIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList subscriptions_;
  /**
   *
   *
   * <pre>
   * The names of subscriptions attached to the topic specified in the request.
   * </pre>
   *
   * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the subscriptions.
   */
  public com.google.protobuf.ProtocolStringList getSubscriptionsList() {
    return subscriptions_;
  }
  /**
   *
   *
   * <pre>
   * The names of subscriptions attached to the topic specified in the request.
   * </pre>
   *
   * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of subscriptions.
   */
  public int getSubscriptionsCount() {
    return subscriptions_.size();
  }
  /**
   *
   *
   * <pre>
   * The names of subscriptions attached to the topic specified in the request.
   * </pre>
   *
   * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The subscriptions at the given index.
   */
  public java.lang.String getSubscriptions(int index) {
    return subscriptions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The names of subscriptions attached to the topic specified in the request.
   * </pre>
   *
   * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the subscriptions at the given index.
   */
  public com.google.protobuf.ByteString getSubscriptionsBytes(int index) {
    return subscriptions_.getByteString(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more subscriptions that match
   * the request; this value should be passed in a new
   * `ListTopicSubscriptionsRequest` to get more subscriptions.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more subscriptions that match
   * the request; this value should be passed in a new
   * `ListTopicSubscriptionsRequest` to get more subscriptions.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < subscriptions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscriptions_.getRaw(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < subscriptions_.size(); i++) {
        dataSize += computeStringSizeNoTag(subscriptions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSubscriptionsList().size();
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.pubsub.v1.ListTopicSubscriptionsResponse)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.ListTopicSubscriptionsResponse other =
        (com.google.pubsub.v1.ListTopicSubscriptionsResponse) obj;

    if (!getSubscriptionsList().equals(other.getSubscriptionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSubscriptionsCount() > 0) {
      hash = (37 * hash) + SUBSCRIPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSubscriptionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.pubsub.v1.ListTopicSubscriptionsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for the `ListTopicSubscriptions` method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.ListTopicSubscriptionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.ListTopicSubscriptionsResponse)
      com.google.pubsub.v1.ListTopicSubscriptionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ListTopicSubscriptionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ListTopicSubscriptionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.ListTopicSubscriptionsResponse.class,
              com.google.pubsub.v1.ListTopicSubscriptionsResponse.Builder.class);
    }

    // Construct using com.google.pubsub.v1.ListTopicSubscriptionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      subscriptions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ListTopicSubscriptionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListTopicSubscriptionsResponse getDefaultInstanceForType() {
      return com.google.pubsub.v1.ListTopicSubscriptionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListTopicSubscriptionsResponse build() {
      com.google.pubsub.v1.ListTopicSubscriptionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListTopicSubscriptionsResponse buildPartial() {
      com.google.pubsub.v1.ListTopicSubscriptionsResponse result =
          new com.google.pubsub.v1.ListTopicSubscriptionsResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        subscriptions_ = subscriptions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.subscriptions_ = subscriptions_;
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.ListTopicSubscriptionsResponse) {
        return mergeFrom((com.google.pubsub.v1.ListTopicSubscriptionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.ListTopicSubscriptionsResponse other) {
      if (other == com.google.pubsub.v1.ListTopicSubscriptionsResponse.getDefaultInstance())
        return this;
      if (!other.subscriptions_.isEmpty()) {
        if (subscriptions_.isEmpty()) {
          subscriptions_ = other.subscriptions_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSubscriptionsIsMutable();
          subscriptions_.addAll(other.subscriptions_);
        }
        onChanged();
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureSubscriptionsIsMutable();
                subscriptions_.add(s);
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList subscriptions_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureSubscriptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subscriptions_ = new com.google.protobuf.LazyStringArrayList(subscriptions_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The names of subscriptions attached to the topic specified in the request.
     * </pre>
     *
     * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return A list containing the subscriptions.
     */
    public com.google.protobuf.ProtocolStringList getSubscriptionsList() {
      return subscriptions_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * The names of subscriptions attached to the topic specified in the request.
     * </pre>
     *
     * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The count of subscriptions.
     */
    public int getSubscriptionsCount() {
      return subscriptions_.size();
    }
    /**
     *
     *
     * <pre>
     * The names of subscriptions attached to the topic specified in the request.
     * </pre>
     *
     * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the element to return.
     * @return The subscriptions at the given index.
     */
    public java.lang.String getSubscriptions(int index) {
      return subscriptions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The names of subscriptions attached to the topic specified in the request.
     * </pre>
     *
     * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the subscriptions at the given index.
     */
    public com.google.protobuf.ByteString getSubscriptionsBytes(int index) {
      return subscriptions_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The names of subscriptions attached to the topic specified in the request.
     * </pre>
     *
     * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index to set the value at.
     * @param value The subscriptions to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptions(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSubscriptionsIsMutable();
      subscriptions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of subscriptions attached to the topic specified in the request.
     * </pre>
     *
     * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The subscriptions to add.
     * @return This builder for chaining.
     */
    public Builder addSubscriptions(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSubscriptionsIsMutable();
      subscriptions_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of subscriptions attached to the topic specified in the request.
     * </pre>
     *
     * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param values The subscriptions to add.
     * @return This builder for chaining.
     */
    public Builder addAllSubscriptions(java.lang.Iterable<java.lang.String> values) {
      ensureSubscriptionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, subscriptions_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of subscriptions attached to the topic specified in the request.
     * </pre>
     *
     * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubscriptions() {
      subscriptions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of subscriptions attached to the topic specified in the request.
     * </pre>
     *
     * <code>repeated string subscriptions = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes of the subscriptions to add.
     * @return This builder for chaining.
     */
    public Builder addSubscriptionsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureSubscriptionsIsMutable();
      subscriptions_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more subscriptions that match
     * the request; this value should be passed in a new
     * `ListTopicSubscriptionsRequest` to get more subscriptions.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more subscriptions that match
     * the request; this value should be passed in a new
     * `ListTopicSubscriptionsRequest` to get more subscriptions.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more subscriptions that match
     * the request; this value should be passed in a new
     * `ListTopicSubscriptionsRequest` to get more subscriptions.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more subscriptions that match
     * the request; this value should be passed in a new
     * `ListTopicSubscriptionsRequest` to get more subscriptions.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more subscriptions that match
     * the request; this value should be passed in a new
     * `ListTopicSubscriptionsRequest` to get more subscriptions.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.ListTopicSubscriptionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.ListTopicSubscriptionsResponse)
  private static final com.google.pubsub.v1.ListTopicSubscriptionsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.ListTopicSubscriptionsResponse();
  }

  public static com.google.pubsub.v1.ListTopicSubscriptionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTopicSubscriptionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListTopicSubscriptionsResponse>() {
        @java.lang.Override
        public ListTopicSubscriptionsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ListTopicSubscriptionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTopicSubscriptionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.ListTopicSubscriptionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
