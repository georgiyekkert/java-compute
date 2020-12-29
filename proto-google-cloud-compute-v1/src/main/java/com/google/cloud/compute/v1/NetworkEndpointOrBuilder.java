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

public interface NetworkEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.lang.String getAnnotationsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional fully qualified domain name of network endpoint. This can only be specified when NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT.
   * </pre>
   *
   * <code>string fqdn = 3150485;</code>
   *
   * @return The fqdn.
   */
  java.lang.String getFqdn();
  /**
   *
   *
   * <pre>
   * Optional fully qualified domain name of network endpoint. This can only be specified when NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT.
   * </pre>
   *
   * <code>string fqdn = 3150485;</code>
   *
   * @return The bytes for fqdn.
   */
  com.google.protobuf.ByteString getFqdnBytes();

  /**
   *
   *
   * <pre>
   * The name for a specific VM instance that the IP address belongs to. This is required for network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network endpoint group.
   * The name must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>string instance = 18257045;</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   *
   *
   * <pre>
   * The name for a specific VM instance that the IP address belongs to. This is required for network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network endpoint group.
   * The name must be 1-63 characters long, and comply with RFC1035.
   * </pre>
   *
   * <code>string instance = 18257045;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   *
   *
   * <pre>
   * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine (either the primary IP or as part of an aliased IP range). If the IP address is not specified, then the primary IP address for the VM instance in the network that the network endpoint group belongs to will be used.
   * </pre>
   *
   * <code>string ip_address = 406272220;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine (either the primary IP or as part of an aliased IP range). If the IP address is not specified, then the primary IP address for the VM instance in the network that the network endpoint group belongs to will be used.
   * </pre>
   *
   * <code>string ip_address = 406272220;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Optional port number of network endpoint. If not specified and the NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the defaultPort for the network endpoint group will be used.
   * </pre>
   *
   * <code>int32 port = 3446913;</code>
   *
   * @return The port.
   */
  int getPort();
}