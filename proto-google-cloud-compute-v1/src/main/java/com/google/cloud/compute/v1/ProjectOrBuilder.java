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

public interface ProjectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Project)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Metadata common_instance_metadata = 185794117;</code>
   *
   * @return Whether the commonInstanceMetadata field is set.
   */
  boolean hasCommonInstanceMetadata();
  /**
   *
   *
   * <pre>
   * Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Metadata common_instance_metadata = 185794117;</code>
   *
   * @return The commonInstanceMetadata.
   */
  com.google.cloud.compute.v1.Metadata getCommonInstanceMetadata();
  /**
   *
   *
   * <pre>
   * Metadata key/value pairs available to all instances contained in this project. See Custom metadata for more information.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Metadata common_instance_metadata = 185794117;</code>
   */
  com.google.cloud.compute.v1.MetadataOrBuilder getCommonInstanceMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
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
   * [Output Only] Creation timestamp in RFC3339 text format.
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
   * This signifies the default network tier used for configuring resources of the project and can only take the following values: PREMIUM, STANDARD. Initially the default network tier is PREMIUM.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Project.DefaultNetworkTier default_network_tier = 471753361;
   * </code>
   *
   * @return The enum numeric value on the wire for defaultNetworkTier.
   */
  int getDefaultNetworkTierValue();
  /**
   *
   *
   * <pre>
   * This signifies the default network tier used for configuring resources of the project and can only take the following values: PREMIUM, STANDARD. Initially the default network tier is PREMIUM.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Project.DefaultNetworkTier default_network_tier = 471753361;
   * </code>
   *
   * @return The defaultNetworkTier.
   */
  com.google.cloud.compute.v1.Project.DefaultNetworkTier getDefaultNetworkTier();

  /**
   *
   *
   * <pre>
   * [Output Only] Default service account used by VMs running in this project.
   * </pre>
   *
   * <code>string default_service_account = 298712229;</code>
   *
   * @return The defaultServiceAccount.
   */
  java.lang.String getDefaultServiceAccount();
  /**
   *
   *
   * <pre>
   * [Output Only] Default service account used by VMs running in this project.
   * </pre>
   *
   * <code>string default_service_account = 298712229;</code>
   *
   * @return The bytes for defaultServiceAccount.
   */
  com.google.protobuf.ByteString getDefaultServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * An optional textual description of the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional textual description of the resource.
   * </pre>
   *
   * <code>string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Restricted features enabled for use on this project.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   *
   * @return A list containing the enabledFeatures.
   */
  java.util.List<java.lang.String> getEnabledFeaturesList();
  /**
   *
   *
   * <pre>
   * Restricted features enabled for use on this project.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   *
   * @return The count of enabledFeatures.
   */
  int getEnabledFeaturesCount();
  /**
   *
   *
   * <pre>
   * Restricted features enabled for use on this project.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   *
   * @param index The index of the element to return.
   * @return The enabledFeatures at the given index.
   */
  java.lang.String getEnabledFeatures(int index);
  /**
   *
   *
   * <pre>
   * Restricted features enabled for use on this project.
   * </pre>
   *
   * <code>repeated string enabled_features = 469017467;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the enabledFeatures at the given index.
   */
  com.google.protobuf.ByteString getEnabledFeaturesBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server. This is not the project ID, and is just a unique ID used by Compute Engine to identify resources.
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
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server. This is not the project ID, and is just a unique ID used by Compute Engine to identify resources.
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
   * [Output Only] Type of the resource. Always compute#project for projects.
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
   * [Output Only] Type of the resource. Always compute#project for projects.
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
   * The project ID. For example: my-example-project. Use the project ID to make requests to Compute Engine.
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
   * The project ID. For example: my-example-project. Use the project ID to make requests to Compute Engine.
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
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Quota> getQuotasList();
  /**
   *
   *
   * <pre>
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  com.google.cloud.compute.v1.Quota getQuotas(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  int getQuotasCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.QuotaOrBuilder> getQuotasOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] Quotas assigned to this project.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Quota quotas = 125341947;</code>
   */
  com.google.cloud.compute.v1.QuotaOrBuilder getQuotasOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UsageExportLocation usage_export_location = 347543874;</code>
   *
   * @return Whether the usageExportLocation field is set.
   */
  boolean hasUsageExportLocation();
  /**
   *
   *
   * <pre>
   * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UsageExportLocation usage_export_location = 347543874;</code>
   *
   * @return The usageExportLocation.
   */
  com.google.cloud.compute.v1.UsageExportLocation getUsageExportLocation();
  /**
   *
   *
   * <pre>
   * The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are stored.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.UsageExportLocation usage_export_location = 347543874;</code>
   */
  com.google.cloud.compute.v1.UsageExportLocationOrBuilder getUsageExportLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The role this project has in a shared VPC configuration. Currently, only projects with the host role, which is specified by the value HOST, are differentiated.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Project.XpnProjectStatus xpn_project_status = 228419265;</code>
   *
   * @return The enum numeric value on the wire for xpnProjectStatus.
   */
  int getXpnProjectStatusValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The role this project has in a shared VPC configuration. Currently, only projects with the host role, which is specified by the value HOST, are differentiated.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Project.XpnProjectStatus xpn_project_status = 228419265;</code>
   *
   * @return The xpnProjectStatus.
   */
  com.google.cloud.compute.v1.Project.XpnProjectStatus getXpnProjectStatus();
}