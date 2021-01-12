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

public interface InstanceTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The creation timestamp for this instance template in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] The creation timestamp for this instance template in RFC3339 text format.
   * </pre>
   *
   * <code>string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 154502140;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>string description = 154502140;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] A unique identifier for this instance template. The server defines this identifier.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * [Output Only] A unique identifier for this instance template. The server defines this identifier.
   * </pre>
   *
   * <code>string id = 3355;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The resource type, which is always compute#instanceTemplate for instance templates.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] The resource type, which is always compute#instanceTemplate for instance templates.
   * </pre>
   *
   * <code>string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The instance properties for this instance template.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InstanceProperties properties = 147688755;</code>
   *
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   *
   *
   * <pre>
   * The instance properties for this instance template.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InstanceProperties properties = 147688755;</code>
   *
   * @return The properties.
   */
  com.google.cloud.compute.v1.InstanceProperties getProperties();
  /**
   *
   *
   * <pre>
   * The instance properties for this instance template.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.InstanceProperties properties = 147688755;</code>
   */
  com.google.cloud.compute.v1.InstancePropertiesOrBuilder getPropertiesOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL for this instance template. The server defines this URL.
   * </pre>
   *
   * <code>string self_link = 187779341;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] The URL for this instance template. The server defines this URL.
   * </pre>
   *
   * <code>string self_link = 187779341;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values:
   * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
   * - projects/project/zones/zone/instances/instance
   * </pre>
   *
   * <code>string source_instance = 127880249;</code>
   *
   * @return The sourceInstance.
   */
  java.lang.String getSourceInstance();
  /**
   *
   *
   * <pre>
   * The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values:
   * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
   * - projects/project/zones/zone/instances/instance
   * </pre>
   *
   * <code>string source_instance = 127880249;</code>
   *
   * @return The bytes for sourceInstance.
   */
  com.google.protobuf.ByteString getSourceInstanceBytes();

  /**
   *
   *
   * <pre>
   * The source instance params to use to create this instance template.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SourceInstanceParams source_instance_params = 135342156;</code>
   *
   * @return Whether the sourceInstanceParams field is set.
   */
  boolean hasSourceInstanceParams();
  /**
   *
   *
   * <pre>
   * The source instance params to use to create this instance template.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SourceInstanceParams source_instance_params = 135342156;</code>
   *
   * @return The sourceInstanceParams.
   */
  com.google.cloud.compute.v1.SourceInstanceParams getSourceInstanceParams();
  /**
   *
   *
   * <pre>
   * The source instance params to use to create this instance template.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.SourceInstanceParams source_instance_params = 135342156;</code>
   */
  com.google.cloud.compute.v1.SourceInstanceParamsOrBuilder getSourceInstanceParamsOrBuilder();
}
