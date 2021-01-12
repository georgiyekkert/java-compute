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

public interface PacketMirroringMirroredResourceInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.PacketMirroringMirroredResourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring.
   * Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring.
   * You may specify a maximum of 50 Instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoInstanceInfo instances = 29097598;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoInstanceInfo>
      getInstancesList();
  /**
   *
   *
   * <pre>
   * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring.
   * Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring.
   * You may specify a maximum of 50 Instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoInstanceInfo instances = 29097598;
   * </code>
   */
  com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoInstanceInfo getInstances(
      int index);
  /**
   *
   *
   * <pre>
   * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring.
   * Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring.
   * You may specify a maximum of 50 Instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoInstanceInfo instances = 29097598;
   * </code>
   */
  int getInstancesCount();
  /**
   *
   *
   * <pre>
   * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring.
   * Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring.
   * You may specify a maximum of 50 Instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoInstanceInfo instances = 29097598;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoInstanceInfoOrBuilder>
      getInstancesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring.
   * Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring.
   * You may specify a maximum of 50 Instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoInstanceInfo instances = 29097598;
   * </code>
   */
  com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoInstanceInfoOrBuilder
      getInstancesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring.
   * You may specify a maximum of 5 subnetworks.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo subnetworks = 147417669;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo>
      getSubnetworksList();
  /**
   *
   *
   * <pre>
   * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring.
   * You may specify a maximum of 5 subnetworks.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo subnetworks = 147417669;
   * </code>
   */
  com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo getSubnetworks(
      int index);
  /**
   *
   *
   * <pre>
   * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring.
   * You may specify a maximum of 5 subnetworks.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo subnetworks = 147417669;
   * </code>
   */
  int getSubnetworksCount();
  /**
   *
   *
   * <pre>
   * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring.
   * You may specify a maximum of 5 subnetworks.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo subnetworks = 147417669;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfoOrBuilder>
      getSubnetworksOrBuilderList();
  /**
   *
   *
   * <pre>
   * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring.
   * You may specify a maximum of 5 subnetworks.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfo subnetworks = 147417669;
   * </code>
   */
  com.google.cloud.compute.v1.PacketMirroringMirroredResourceInfoSubnetInfoOrBuilder
      getSubnetworksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored.
   * </pre>
   *
   * <code>repeated string tags = 3552281;</code>
   *
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String> getTagsList();
  /**
   *
   *
   * <pre>
   * A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored.
   * </pre>
   *
   * <code>repeated string tags = 3552281;</code>
   *
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored.
   * </pre>
   *
   * <code>repeated string tags = 3552281;</code>
   *
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   *
   *
   * <pre>
   * A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored.
   * </pre>
   *
   * <code>repeated string tags = 3552281;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString getTagsBytes(int index);
}
