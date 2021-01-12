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

public interface ListPeeringRoutesNetworksRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ListPeeringRoutesNetworksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The direction of the exchanged routes.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ListPeeringRoutesNetworksRequest.Direction direction = 111150975;
   * </code>
   *
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   *
   *
   * <pre>
   * The direction of the exchanged routes.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.ListPeeringRoutesNetworksRequest.Direction direction = 111150975;
   * </code>
   *
   * @return The direction.
   */
  com.google.cloud.compute.v1.ListPeeringRoutesNetworksRequest.Direction getDirection();

  /**
   *
   *
   * <pre>
   * A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either `=`, `!=`, `&gt;`, or `&lt;`.
   * For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`.
   * You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.
   * To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true) ```
   * </pre>
   *
   * <code>string filter = 67685240;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either `=`, `!=`, `&gt;`, or `&lt;`.
   * For example, if you are filtering Compute Engine instances, you can exclude instances named `example-instance` by specifying `name != example-instance`.
   * You can also filter nested fields. For example, you could specify `scheduling.automaticRestart = false` to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.
   * To filter on multiple expressions, provide each separate expression within parentheses. For example: ``` (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake") ``` By default, each expression is an `AND` expression. However, you can include `AND` and `OR` expressions explicitly. For example: ``` (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true) ```
   * </pre>
   *
   * <code>string filter = 67685240;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of results per page that should be returned. If the number of available results is larger than `maxResults`, Compute Engine returns a `nextPageToken` that can be used to get the next page of results in subsequent list requests. Acceptable values are `0` to `500`, inclusive. (Default: `500`)
   * </pre>
   *
   * <code>uint32 max_results = 54715419;</code>
   *
   * @return The maxResults.
   */
  int getMaxResults();

  /**
   *
   *
   * <pre>
   * Name of the network for this request.
   * </pre>
   *
   * <code>string network = 232872494 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Name of the network for this request.
   * </pre>
   *
   * <code>string network = 232872494 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.
   * You can also sort results in descending order based on the creation timestamp using `orderBy="creationTimestamp desc"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.
   * Currently, only sorting by `name` or `creationTimestamp desc` is supported.
   * </pre>
   *
   * <code>string order_by = 160562920;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.
   * You can also sort results in descending order based on the creation timestamp using `orderBy="creationTimestamp desc"`. This sorts results based on the `creationTimestamp` field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.
   * Currently, only sorting by `name` or `creationTimestamp desc` is supported.
   * </pre>
   *
   * <code>string order_by = 160562920;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Specifies a page token to use. Set `pageToken` to the `nextPageToken` returned by a previous list request to get the next page of results.
   * </pre>
   *
   * <code>string page_token = 19994697;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Specifies a page token to use. Set `pageToken` to the `nextPageToken` returned by a previous list request to get the next page of results.
   * </pre>
   *
   * <code>string page_token = 19994697;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The response will show routes exchanged over the given peering connection.
   * </pre>
   *
   * <code>string peering_name = 249571370;</code>
   *
   * @return The peeringName.
   */
  java.lang.String getPeeringName();
  /**
   *
   *
   * <pre>
   * The response will show routes exchanged over the given peering connection.
   * </pre>
   *
   * <code>string peering_name = 249571370;</code>
   *
   * @return The bytes for peeringName.
   */
  com.google.protobuf.ByteString getPeeringNameBytes();

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
   * The region of the request. The response will include all subnet routes, static routes and dynamic routes in the region.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * The region of the request. The response will include all subnet routes, static routes and dynamic routes in the region.
   * </pre>
   *
   * <code>string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Opt-in for partial success behavior which provides partial results in case of failure. The default value is false and the logic is the same as today.
   * </pre>
   *
   * <code>bool return_partial_success = 248762934;</code>
   *
   * @return The returnPartialSuccess.
   */
  boolean getReturnPartialSuccess();
}
