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

public interface DiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Disk)
    com.google.protobuf.MessageOrBuilder {

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
   * Encrypts the disk using a customer-supplied encryption key.
   * After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later (e.g. to create a disk snapshot, to create a disk image, to create a machine image, or to attach the disk to a virtual machine).
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   * If you do not provide an encryption key when creating the disk, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 3225221;</code>
   *
   * @return Whether the diskEncryptionKey field is set.
   */
  boolean hasDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * Encrypts the disk using a customer-supplied encryption key.
   * After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later (e.g. to create a disk snapshot, to create a disk image, to create a machine image, or to attach the disk to a virtual machine).
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   * If you do not provide an encryption key when creating the disk, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 3225221;</code>
   *
   * @return The diskEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getDiskEncryptionKey();
  /**
   *
   *
   * <pre>
   * Encrypts the disk using a customer-supplied encryption key.
   * After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later (e.g. to create a disk snapshot, to create a disk image, to create a machine image, or to attach the disk to a virtual machine).
   * Customer-supplied encryption keys do not protect access to metadata of the disk.
   * If you do not provide an encryption key when creating the disk, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey disk_encryption_key = 3225221;</code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getDiskEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  java.util.List<com.google.cloud.compute.v1.GuestOsFeature> getGuestOsFeaturesList();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  com.google.cloud.compute.v1.GuestOsFeature getGuestOsFeatures(int index);
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  int getGuestOsFeaturesCount();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.GuestOsFeatureOrBuilder>
      getGuestOsFeaturesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of features to enable on the guest operating system. Applicable only for bootable images. Read  Enabling guest operating system features to see a list of available options.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.GuestOsFeature guest_os_features = 79294545;</code>
   */
  com.google.cloud.compute.v1.GuestOsFeatureOrBuilder getGuestOsFeaturesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
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
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
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
   * [Output Only] Type of the resource. Always compute#disk for disks.
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
   * [Output Only] Type of the resource. Always compute#disk for disks.
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
   * A fingerprint for the labels being applied to this disk, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet.
   * To see the latest fingerprint, make a get() request to retrieve a disk.
   * </pre>
   *
   * <code>string label_fingerprint = 178124825;</code>
   *
   * @return The labelFingerprint.
   */
  java.lang.String getLabelFingerprint();
  /**
   *
   *
   * <pre>
   * A fingerprint for the labels being applied to this disk, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet.
   * To see the latest fingerprint, make a get() request to retrieve a disk.
   * </pre>
   *
   * <code>string label_fingerprint = 178124825;</code>
   *
   * @return The bytes for labelFingerprint.
   */
  com.google.protobuf.ByteString getLabelFingerprintBytes();

  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to apply to this disk. These can be later modified by the setLabels method.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 231759871;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * [Output Only] Last attach timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_attach_timestamp = 42159653;</code>
   *
   * @return The lastAttachTimestamp.
   */
  java.lang.String getLastAttachTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Last attach timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_attach_timestamp = 42159653;</code>
   *
   * @return The bytes for lastAttachTimestamp.
   */
  com.google.protobuf.ByteString getLastAttachTimestampBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Last detach timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_detach_timestamp = 56471027;</code>
   *
   * @return The lastDetachTimestamp.
   */
  java.lang.String getLastDetachTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Last detach timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>string last_detach_timestamp = 56471027;</code>
   *
   * @return The bytes for lastDetachTimestamp.
   */
  com.google.protobuf.ByteString getLastDetachTimestampBytes();

  /**
   *
   *
   * <pre>
   * Integer license codes indicating which licenses are attached to this disk.
   * </pre>
   *
   * <code>repeated string license_codes = 45482664;</code>
   *
   * @return A list containing the licenseCodes.
   */
  java.util.List<java.lang.String> getLicenseCodesList();
  /**
   *
   *
   * <pre>
   * Integer license codes indicating which licenses are attached to this disk.
   * </pre>
   *
   * <code>repeated string license_codes = 45482664;</code>
   *
   * @return The count of licenseCodes.
   */
  int getLicenseCodesCount();
  /**
   *
   *
   * <pre>
   * Integer license codes indicating which licenses are attached to this disk.
   * </pre>
   *
   * <code>repeated string license_codes = 45482664;</code>
   *
   * @param index The index of the element to return.
   * @return The licenseCodes at the given index.
   */
  java.lang.String getLicenseCodes(int index);
  /**
   *
   *
   * <pre>
   * Integer license codes indicating which licenses are attached to this disk.
   * </pre>
   *
   * <code>repeated string license_codes = 45482664;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the licenseCodes at the given index.
   */
  com.google.protobuf.ByteString getLicenseCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of publicly visible licenses. Reserved for Google's use.
   * </pre>
   *
   * <code>repeated string licenses = 69207122;</code>
   *
   * @return A list containing the licenses.
   */
  java.util.List<java.lang.String> getLicensesList();
  /**
   *
   *
   * <pre>
   * A list of publicly visible licenses. Reserved for Google's use.
   * </pre>
   *
   * <code>repeated string licenses = 69207122;</code>
   *
   * @return The count of licenses.
   */
  int getLicensesCount();
  /**
   *
   *
   * <pre>
   * A list of publicly visible licenses. Reserved for Google's use.
   * </pre>
   *
   * <code>repeated string licenses = 69207122;</code>
   *
   * @param index The index of the element to return.
   * @return The licenses at the given index.
   */
  java.lang.String getLicenses(int index);
  /**
   *
   *
   * <pre>
   * A list of publicly visible licenses. Reserved for Google's use.
   * </pre>
   *
   * <code>repeated string licenses = 69207122;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the licenses at the given index.
   */
  com.google.protobuf.ByteString getLicensesBytes(int index);

  /**
   *
   *
   * <pre>
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
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
   * Internal use only.
   * </pre>
   *
   * <code>string options = 92702366;</code>
   *
   * @return The options.
   */
  java.lang.String getOptions();
  /**
   *
   *
   * <pre>
   * Internal use only.
   * </pre>
   *
   * <code>string options = 92702366;</code>
   *
   * @return The bytes for options.
   */
  com.google.protobuf.ByteString getOptionsBytes();

  /**
   *
   *
   * <pre>
   * Physical block size of the persistent disk, in bytes. If not present in a request, a default value is used. The currently supported size is 4096, other sizes may be added in the future. If an unsupported value is requested, the error message will list the supported values for the caller's project.
   * </pre>
   *
   * <code>string physical_block_size_bytes = 151572487;</code>
   *
   * @return The physicalBlockSizeBytes.
   */
  java.lang.String getPhysicalBlockSizeBytes();
  /**
   *
   *
   * <pre>
   * Physical block size of the persistent disk, in bytes. If not present in a request, a default value is used. The currently supported size is 4096, other sizes may be added in the future. If an unsupported value is requested, the error message will list the supported values for the caller's project.
   * </pre>
   *
   * <code>string physical_block_size_bytes = 151572487;</code>
   *
   * @return The bytes for physicalBlockSizeBytes.
   */
  com.google.protobuf.ByteString getPhysicalBlockSizeBytesBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the region where the disk resides. Only applicable for regional resources. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
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
   * [Output Only] URL of the region where the disk resides. Only applicable for regional resources. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
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
   * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
   * </pre>
   *
   * <code>repeated string replica_zones = 48438272;</code>
   *
   * @return A list containing the replicaZones.
   */
  java.util.List<java.lang.String> getReplicaZonesList();
  /**
   *
   *
   * <pre>
   * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
   * </pre>
   *
   * <code>repeated string replica_zones = 48438272;</code>
   *
   * @return The count of replicaZones.
   */
  int getReplicaZonesCount();
  /**
   *
   *
   * <pre>
   * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
   * </pre>
   *
   * <code>repeated string replica_zones = 48438272;</code>
   *
   * @param index The index of the element to return.
   * @return The replicaZones at the given index.
   */
  java.lang.String getReplicaZones(int index);
  /**
   *
   *
   * <pre>
   * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
   * </pre>
   *
   * <code>repeated string replica_zones = 48438272;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the replicaZones at the given index.
   */
  com.google.protobuf.ByteString getReplicaZonesBytes(int index);

  /**
   *
   *
   * <pre>
   * Resource policies applied to this disk for automatic snapshot creations.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @return A list containing the resourcePolicies.
   */
  java.util.List<java.lang.String> getResourcePoliciesList();
  /**
   *
   *
   * <pre>
   * Resource policies applied to this disk for automatic snapshot creations.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @return The count of resourcePolicies.
   */
  int getResourcePoliciesCount();
  /**
   *
   *
   * <pre>
   * Resource policies applied to this disk for automatic snapshot creations.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @param index The index of the element to return.
   * @return The resourcePolicies at the given index.
   */
  java.lang.String getResourcePolicies(int index);
  /**
   *
   *
   * <pre>
   * Resource policies applied to this disk for automatic snapshot creations.
   * </pre>
   *
   * <code>repeated string resource_policies = 22220385;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourcePolicies at the given index.
   */
  com.google.protobuf.ByteString getResourcePoliciesBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URL for this resource.
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
   * [Output Only] Server-defined fully-qualified URL for this resource.
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
   * Size, in GB, of the persistent disk. You can specify this field when creating a persistent disk using the sourceImage, sourceSnapshot, or sourceDisk parameter, or specify it alone to create an empty persistent disk.
   * If you specify this field along with a source, the value of sizeGb must not be less than the size of the source. Acceptable values are 1 to 65536, inclusive.
   * </pre>
   *
   * <code>string size_gb = 226493913;</code>
   *
   * @return The sizeGb.
   */
  java.lang.String getSizeGb();
  /**
   *
   *
   * <pre>
   * Size, in GB, of the persistent disk. You can specify this field when creating a persistent disk using the sourceImage, sourceSnapshot, or sourceDisk parameter, or specify it alone to create an empty persistent disk.
   * If you specify this field along with a source, the value of sizeGb must not be less than the size of the source. Acceptable values are 1 to 65536, inclusive.
   * </pre>
   *
   * <code>string size_gb = 226493913;</code>
   *
   * @return The bytes for sizeGb.
   */
  com.google.protobuf.ByteString getSizeGbBytes();

  /**
   *
   *
   * <pre>
   * The source disk used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values:
   * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
   * - projects/project/zones/zone/disks/disk
   * - zones/zone/disks/disk
   * </pre>
   *
   * <code>string source_disk = 183318337;</code>
   *
   * @return The sourceDisk.
   */
  java.lang.String getSourceDisk();
  /**
   *
   *
   * <pre>
   * The source disk used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values:
   * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
   * - projects/project/zones/zone/disks/disk
   * - zones/zone/disks/disk
   * </pre>
   *
   * <code>string source_disk = 183318337;</code>
   *
   * @return The bytes for sourceDisk.
   */
  com.google.protobuf.ByteString getSourceDiskBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique ID of the disk used to create this disk. This value identifies the exact disk that was used to create this persistent disk. For example, if you created the persistent disk from a disk that was later deleted and recreated under the same name, the source disk ID would identify the exact version of the disk that was used.
   * </pre>
   *
   * <code>string source_disk_id = 185755353;</code>
   *
   * @return The sourceDiskId.
   */
  java.lang.String getSourceDiskId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique ID of the disk used to create this disk. This value identifies the exact disk that was used to create this persistent disk. For example, if you created the persistent disk from a disk that was later deleted and recreated under the same name, the source disk ID would identify the exact version of the disk that was used.
   * </pre>
   *
   * <code>string source_disk_id = 185755353;</code>
   *
   * @return The bytes for sourceDiskId.
   */
  com.google.protobuf.ByteString getSourceDiskIdBytes();

  /**
   *
   *
   * <pre>
   * The source image used to create this disk. If the source image is deleted, this field will not be set.
   * To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image:
   * projects/debian-cloud/global/images/family/debian-9
   * Alternatively, use a specific version of a public operating system image:
   * projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD
   * To create a disk with a custom image that you created, specify the image name in the following format:
   * global/images/my-custom-image
   * You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name:
   * global/images/family/my-image-family
   * </pre>
   *
   * <code>string source_image = 50443319;</code>
   *
   * @return The sourceImage.
   */
  java.lang.String getSourceImage();
  /**
   *
   *
   * <pre>
   * The source image used to create this disk. If the source image is deleted, this field will not be set.
   * To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image:
   * projects/debian-cloud/global/images/family/debian-9
   * Alternatively, use a specific version of a public operating system image:
   * projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD
   * To create a disk with a custom image that you created, specify the image name in the following format:
   * global/images/my-custom-image
   * You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name:
   * global/images/family/my-image-family
   * </pre>
   *
   * <code>string source_image = 50443319;</code>
   *
   * @return The bytes for sourceImage.
   */
  com.google.protobuf.ByteString getSourceImageBytes();

  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_image_encryption_key = 113068203;
   * </code>
   *
   * @return Whether the sourceImageEncryptionKey field is set.
   */
  boolean hasSourceImageEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_image_encryption_key = 113068203;
   * </code>
   *
   * @return The sourceImageEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getSourceImageEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_image_encryption_key = 113068203;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder getSourceImageEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the image used to create this disk. This value identifies the exact image that was used to create this persistent disk. For example, if you created the persistent disk from an image that was later deleted and recreated under the same name, the source image ID would identify the exact version of the image that was used.
   * </pre>
   *
   * <code>string source_image_id = 55328291;</code>
   *
   * @return The sourceImageId.
   */
  java.lang.String getSourceImageId();
  /**
   *
   *
   * <pre>
   * [Output Only] The ID value of the image used to create this disk. This value identifies the exact image that was used to create this persistent disk. For example, if you created the persistent disk from an image that was later deleted and recreated under the same name, the source image ID would identify the exact version of the image that was used.
   * </pre>
   *
   * <code>string source_image_id = 55328291;</code>
   *
   * @return The bytes for sourceImageId.
   */
  com.google.protobuf.ByteString getSourceImageIdBytes();

  /**
   *
   *
   * <pre>
   * The source snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values:
   * - https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot
   * - projects/project/global/snapshots/snapshot
   * - global/snapshots/snapshot
   * </pre>
   *
   * <code>string source_snapshot = 126061928;</code>
   *
   * @return The sourceSnapshot.
   */
  java.lang.String getSourceSnapshot();
  /**
   *
   *
   * <pre>
   * The source snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values:
   * - https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot
   * - projects/project/global/snapshots/snapshot
   * - global/snapshots/snapshot
   * </pre>
   *
   * <code>string source_snapshot = 126061928;</code>
   *
   * @return The bytes for sourceSnapshot.
   */
  com.google.protobuf.ByteString getSourceSnapshotBytes();

  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_snapshot_encryption_key = 35243866;
   * </code>
   *
   * @return Whether the sourceSnapshotEncryptionKey field is set.
   */
  boolean hasSourceSnapshotEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_snapshot_encryption_key = 35243866;
   * </code>
   *
   * @return The sourceSnapshotEncryptionKey.
   */
  com.google.cloud.compute.v1.CustomerEncryptionKey getSourceSnapshotEncryptionKey();
  /**
   *
   *
   * <pre>
   * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CustomerEncryptionKey source_snapshot_encryption_key = 35243866;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyOrBuilder
      getSourceSnapshotEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
   * </pre>
   *
   * <code>string source_snapshot_id = 98962258;</code>
   *
   * @return The sourceSnapshotId.
   */
  java.lang.String getSourceSnapshotId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique ID of the snapshot used to create this disk. This value identifies the exact snapshot that was used to create this persistent disk. For example, if you created the persistent disk from a snapshot that was later deleted and recreated under the same name, the source snapshot ID would identify the exact version of the snapshot that was used.
   * </pre>
   *
   * <code>string source_snapshot_id = 98962258;</code>
   *
   * @return The bytes for sourceSnapshotId.
   */
  com.google.protobuf.ByteString getSourceSnapshotIdBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of disk creation. CREATING: Disk is provisioning. RESTORING: Source data is being copied into the disk. FAILED: Disk creation failed. READY: Disk is ready for use. DELETING: Disk is deleting.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Disk.Status status = 181260274;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of disk creation. CREATING: Disk is provisioning. RESTORING: Source data is being copied into the disk. FAILED: Disk creation failed. READY: Disk is ready for use. DELETING: Disk is deleting.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.Disk.Status status = 181260274;</code>
   *
   * @return The status.
   */
  com.google.cloud.compute.v1.Disk.Status getStatus();

  /**
   *
   *
   * <pre>
   * URL of the disk type resource describing which disk type to use to create the disk. Provide this when creating the disk. For example: projects/project/zones/zone/diskTypes/pd-standard  or pd-ssd
   * </pre>
   *
   * <code>string type = 3575610;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * URL of the disk type resource describing which disk type to use to create the disk. Provide this when creating the disk. For example: projects/project/zones/zone/diskTypes/pd-standard  or pd-ssd
   * </pre>
   *
   * <code>string type = 3575610;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Links to the users of the disk (attached instances) in form: projects/project/zones/zone/instances/instance
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   *
   * @return A list containing the users.
   */
  java.util.List<java.lang.String> getUsersList();
  /**
   *
   *
   * <pre>
   * [Output Only] Links to the users of the disk (attached instances) in form: projects/project/zones/zone/instances/instance
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   *
   * @return The count of users.
   */
  int getUsersCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Links to the users of the disk (attached instances) in form: projects/project/zones/zone/instances/instance
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   *
   * @param index The index of the element to return.
   * @return The users at the given index.
   */
  java.lang.String getUsers(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] Links to the users of the disk (attached instances) in form: projects/project/zones/zone/instances/instance
   * </pre>
   *
   * <code>repeated string users = 111578632;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the users at the given index.
   */
  com.google.protobuf.ByteString getUsersBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the zone where the disk resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>string zone = 3744684;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the zone where the disk resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
