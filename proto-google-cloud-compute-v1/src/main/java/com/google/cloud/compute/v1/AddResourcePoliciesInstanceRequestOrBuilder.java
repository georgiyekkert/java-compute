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

public interface AddResourcePoliciesInstanceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AddResourcePoliciesInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The instance name for this request.
   * </pre>
   *
   * <code>string instance = 18257045 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   *
   *
   * <pre>
   * The instance name for this request.
   * </pre>
   *
   * <code>string instance = 18257045 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   * <code>
   * .google.cloud.compute.v1.InstancesAddResourcePoliciesRequest instances_add_resource_policies_request_resource = 489351963;
   * </code>
   *
   * @return Whether the instancesAddResourcePoliciesRequestResource field is set.
   */
  boolean hasInstancesAddResourcePoliciesRequestResource();
  /**
   * <code>
   * .google.cloud.compute.v1.InstancesAddResourcePoliciesRequest instances_add_resource_policies_request_resource = 489351963;
   * </code>
   *
   * @return The instancesAddResourcePoliciesRequestResource.
   */
  com.google.cloud.compute.v1.InstancesAddResourcePoliciesRequest
      getInstancesAddResourcePoliciesRequestResource();
  /**
   * <code>
   * .google.cloud.compute.v1.InstancesAddResourcePoliciesRequest instances_add_resource_policies_request_resource = 489351963;
   * </code>
   */
  com.google.cloud.compute.v1.InstancesAddResourcePoliciesRequestOrBuilder
      getInstancesAddResourcePoliciesRequestResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.
   * For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 37109963;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.
   * For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 37109963;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * The name of the zone for this request.
   * </pre>
   *
   * <code>string zone = 3744684 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}