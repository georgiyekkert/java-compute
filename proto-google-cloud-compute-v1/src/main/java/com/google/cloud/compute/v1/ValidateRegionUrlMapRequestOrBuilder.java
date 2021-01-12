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

public interface ValidateRegionUrlMapRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ValidateRegionUrlMapRequest)
    com.google.protobuf.MessageOrBuilder {

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
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RegionUrlMapsValidateRequest region_url_maps_validate_request_resource = 56632858 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the regionUrlMapsValidateRequestResource field is set.
   */
  boolean hasRegionUrlMapsValidateRequestResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RegionUrlMapsValidateRequest region_url_maps_validate_request_resource = 56632858 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The regionUrlMapsValidateRequestResource.
   */
  com.google.cloud.compute.v1.RegionUrlMapsValidateRequest
      getRegionUrlMapsValidateRequestResource();
  /**
   *
   *
   * <pre>
   * The body resource for this request
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.RegionUrlMapsValidateRequest region_url_maps_validate_request_resource = 56632858 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.compute.v1.RegionUrlMapsValidateRequestOrBuilder
      getRegionUrlMapsValidateRequestResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the UrlMap resource to be validated as.
   * </pre>
   *
   * <code>string url_map = 98585228 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The urlMap.
   */
  java.lang.String getUrlMap();
  /**
   *
   *
   * <pre>
   * Name of the UrlMap resource to be validated as.
   * </pre>
   *
   * <code>string url_map = 98585228 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for urlMap.
   */
  com.google.protobuf.ByteString getUrlMapBytes();
}
