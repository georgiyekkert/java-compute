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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. On failover or failback, this field indicates whether connection draining will be honored. GCP has a fixed connection draining timeout of 10 minutes. A setting of true terminates existing TCP connections to the active pool during failover and failback, immediately draining traffic. A setting of false allows existing TCP connections to persist, even on VMs no longer in the active pool, for up to the duration of the connection draining timeout (10 minutes).
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.BackendServiceFailoverPolicy}
 */
public final class BackendServiceFailoverPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.BackendServiceFailoverPolicy)
    BackendServiceFailoverPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BackendServiceFailoverPolicy.newBuilder() to construct.
  private BackendServiceFailoverPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BackendServiceFailoverPolicy() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BackendServiceFailoverPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BackendServiceFailoverPolicy(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 898315424:
            {
              dropTrafficIfUnhealthy_ = input.readBool();
              break;
            }
          case 1457206024:
            {
              disableConnectionDrainOnFailover_ = input.readBool();
              break;
            }
          case 1701336053:
            {
              failoverRatio_ = input.readFloat();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.BackendServiceFailoverPolicy.class,
            com.google.cloud.compute.v1.BackendServiceFailoverPolicy.Builder.class);
  }

  public static final int DISABLE_CONNECTION_DRAIN_ON_FAILOVER_FIELD_NUMBER = 182150753;
  private boolean disableConnectionDrainOnFailover_;
  /**
   *
   *
   * <pre>
   * This can be set to true only if the protocol is TCP.
   * The default is false.
   * </pre>
   *
   * <code>bool disable_connection_drain_on_failover = 182150753;</code>
   *
   * @return The disableConnectionDrainOnFailover.
   */
  @java.lang.Override
  public boolean getDisableConnectionDrainOnFailover() {
    return disableConnectionDrainOnFailover_;
  }

  public static final int DROP_TRAFFIC_IF_UNHEALTHY_FIELD_NUMBER = 112289428;
  private boolean dropTrafficIfUnhealthy_;
  /**
   *
   *
   * <pre>
   * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing, If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. The default is false.
   * </pre>
   *
   * <code>bool drop_traffic_if_unhealthy = 112289428;</code>
   *
   * @return The dropTrafficIfUnhealthy.
   */
  @java.lang.Override
  public boolean getDropTrafficIfUnhealthy() {
    return dropTrafficIfUnhealthy_;
  }

  public static final int FAILOVER_RATIO_FIELD_NUMBER = 212667006;
  private float failoverRatio_;
  /**
   *
   *
   * <pre>
   * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio.
   * </pre>
   *
   * <code>float failover_ratio = 212667006;</code>
   *
   * @return The failoverRatio.
   */
  @java.lang.Override
  public float getFailoverRatio() {
    return failoverRatio_;
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
    if (dropTrafficIfUnhealthy_ != false) {
      output.writeBool(112289428, dropTrafficIfUnhealthy_);
    }
    if (disableConnectionDrainOnFailover_ != false) {
      output.writeBool(182150753, disableConnectionDrainOnFailover_);
    }
    if (failoverRatio_ != 0F) {
      output.writeFloat(212667006, failoverRatio_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dropTrafficIfUnhealthy_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(112289428, dropTrafficIfUnhealthy_);
    }
    if (disableConnectionDrainOnFailover_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              182150753, disableConnectionDrainOnFailover_);
    }
    if (failoverRatio_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(212667006, failoverRatio_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.compute.v1.BackendServiceFailoverPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.BackendServiceFailoverPolicy other =
        (com.google.cloud.compute.v1.BackendServiceFailoverPolicy) obj;

    if (getDisableConnectionDrainOnFailover() != other.getDisableConnectionDrainOnFailover())
      return false;
    if (getDropTrafficIfUnhealthy() != other.getDropTrafficIfUnhealthy()) return false;
    if (java.lang.Float.floatToIntBits(getFailoverRatio())
        != java.lang.Float.floatToIntBits(other.getFailoverRatio())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DISABLE_CONNECTION_DRAIN_ON_FAILOVER_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(getDisableConnectionDrainOnFailover());
    hash = (37 * hash) + DROP_TRAFFIC_IF_UNHEALTHY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDropTrafficIfUnhealthy());
    hash = (37 * hash) + FAILOVER_RATIO_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getFailoverRatio());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.compute.v1.BackendServiceFailoverPolicy prototype) {
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
   * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. On failover or failback, this field indicates whether connection draining will be honored. GCP has a fixed connection draining timeout of 10 minutes. A setting of true terminates existing TCP connections to the active pool during failover and failback, immediately draining traffic. A setting of false allows existing TCP connections to persist, even on VMs no longer in the active pool, for up to the duration of the connection draining timeout (10 minutes).
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.BackendServiceFailoverPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.BackendServiceFailoverPolicy)
      com.google.cloud.compute.v1.BackendServiceFailoverPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.BackendServiceFailoverPolicy.class,
              com.google.cloud.compute.v1.BackendServiceFailoverPolicy.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.BackendServiceFailoverPolicy.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      disableConnectionDrainOnFailover_ = false;

      dropTrafficIfUnhealthy_ = false;

      failoverRatio_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceFailoverPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceFailoverPolicy getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.BackendServiceFailoverPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceFailoverPolicy build() {
      com.google.cloud.compute.v1.BackendServiceFailoverPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceFailoverPolicy buildPartial() {
      com.google.cloud.compute.v1.BackendServiceFailoverPolicy result =
          new com.google.cloud.compute.v1.BackendServiceFailoverPolicy(this);
      result.disableConnectionDrainOnFailover_ = disableConnectionDrainOnFailover_;
      result.dropTrafficIfUnhealthy_ = dropTrafficIfUnhealthy_;
      result.failoverRatio_ = failoverRatio_;
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
      if (other instanceof com.google.cloud.compute.v1.BackendServiceFailoverPolicy) {
        return mergeFrom((com.google.cloud.compute.v1.BackendServiceFailoverPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.BackendServiceFailoverPolicy other) {
      if (other == com.google.cloud.compute.v1.BackendServiceFailoverPolicy.getDefaultInstance())
        return this;
      if (other.getDisableConnectionDrainOnFailover() != false) {
        setDisableConnectionDrainOnFailover(other.getDisableConnectionDrainOnFailover());
      }
      if (other.getDropTrafficIfUnhealthy() != false) {
        setDropTrafficIfUnhealthy(other.getDropTrafficIfUnhealthy());
      }
      if (other.getFailoverRatio() != 0F) {
        setFailoverRatio(other.getFailoverRatio());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.compute.v1.BackendServiceFailoverPolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.compute.v1.BackendServiceFailoverPolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean disableConnectionDrainOnFailover_;
    /**
     *
     *
     * <pre>
     * This can be set to true only if the protocol is TCP.
     * The default is false.
     * </pre>
     *
     * <code>bool disable_connection_drain_on_failover = 182150753;</code>
     *
     * @return The disableConnectionDrainOnFailover.
     */
    @java.lang.Override
    public boolean getDisableConnectionDrainOnFailover() {
      return disableConnectionDrainOnFailover_;
    }
    /**
     *
     *
     * <pre>
     * This can be set to true only if the protocol is TCP.
     * The default is false.
     * </pre>
     *
     * <code>bool disable_connection_drain_on_failover = 182150753;</code>
     *
     * @param value The disableConnectionDrainOnFailover to set.
     * @return This builder for chaining.
     */
    public Builder setDisableConnectionDrainOnFailover(boolean value) {

      disableConnectionDrainOnFailover_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This can be set to true only if the protocol is TCP.
     * The default is false.
     * </pre>
     *
     * <code>bool disable_connection_drain_on_failover = 182150753;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisableConnectionDrainOnFailover() {

      disableConnectionDrainOnFailover_ = false;
      onChanged();
      return this;
    }

    private boolean dropTrafficIfUnhealthy_;
    /**
     *
     *
     * <pre>
     * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing, If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. The default is false.
     * </pre>
     *
     * <code>bool drop_traffic_if_unhealthy = 112289428;</code>
     *
     * @return The dropTrafficIfUnhealthy.
     */
    @java.lang.Override
    public boolean getDropTrafficIfUnhealthy() {
      return dropTrafficIfUnhealthy_;
    }
    /**
     *
     *
     * <pre>
     * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing, If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. The default is false.
     * </pre>
     *
     * <code>bool drop_traffic_if_unhealthy = 112289428;</code>
     *
     * @param value The dropTrafficIfUnhealthy to set.
     * @return This builder for chaining.
     */
    public Builder setDropTrafficIfUnhealthy(boolean value) {

      dropTrafficIfUnhealthy_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing, If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. The default is false.
     * </pre>
     *
     * <code>bool drop_traffic_if_unhealthy = 112289428;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDropTrafficIfUnhealthy() {

      dropTrafficIfUnhealthy_ = false;
      onChanged();
      return this;
    }

    private float failoverRatio_;
    /**
     *
     *
     * <pre>
     * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio.
     * </pre>
     *
     * <code>float failover_ratio = 212667006;</code>
     *
     * @return The failoverRatio.
     */
    @java.lang.Override
    public float getFailoverRatio() {
      return failoverRatio_;
    }
    /**
     *
     *
     * <pre>
     * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio.
     * </pre>
     *
     * <code>float failover_ratio = 212667006;</code>
     *
     * @param value The failoverRatio to set.
     * @return This builder for chaining.
     */
    public Builder setFailoverRatio(float value) {

      failoverRatio_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Applicable only to Failover for Internal TCP/UDP Load Balancing and Network Load Balancing. The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio.
     * </pre>
     *
     * <code>float failover_ratio = 212667006;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFailoverRatio() {

      failoverRatio_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.BackendServiceFailoverPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.BackendServiceFailoverPolicy)
  private static final com.google.cloud.compute.v1.BackendServiceFailoverPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.BackendServiceFailoverPolicy();
  }

  public static com.google.cloud.compute.v1.BackendServiceFailoverPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackendServiceFailoverPolicy> PARSER =
      new com.google.protobuf.AbstractParser<BackendServiceFailoverPolicy>() {
        @java.lang.Override
        public BackendServiceFailoverPolicy parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BackendServiceFailoverPolicy(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BackendServiceFailoverPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackendServiceFailoverPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.BackendServiceFailoverPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
