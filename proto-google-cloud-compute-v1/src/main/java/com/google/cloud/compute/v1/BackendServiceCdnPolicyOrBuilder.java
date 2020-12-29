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

public interface BackendServiceCdnPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceCdnPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The CacheKeyPolicy for this CdnPolicy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CacheKeyPolicy cache_key_policy = 159263727;</code>
   *
   * @return Whether the cacheKeyPolicy field is set.
   */
  boolean hasCacheKeyPolicy();
  /**
   *
   *
   * <pre>
   * The CacheKeyPolicy for this CdnPolicy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CacheKeyPolicy cache_key_policy = 159263727;</code>
   *
   * @return The cacheKeyPolicy.
   */
  com.google.cloud.compute.v1.CacheKeyPolicy getCacheKeyPolicy();
  /**
   *
   *
   * <pre>
   * The CacheKeyPolicy for this CdnPolicy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.CacheKeyPolicy cache_key_policy = 159263727;</code>
   */
  com.google.cloud.compute.v1.CacheKeyPolicyOrBuilder getCacheKeyPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
   * </pre>
   *
   * <code>string signed_url_cache_max_age_sec = 269374534;</code>
   *
   * @return The signedUrlCacheMaxAgeSec.
   */
  java.lang.String getSignedUrlCacheMaxAgeSec();
  /**
   *
   *
   * <pre>
   * Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a "Cache-Control: public, max-age=[TTL]" header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
   * </pre>
   *
   * <code>string signed_url_cache_max_age_sec = 269374534;</code>
   *
   * @return The bytes for signedUrlCacheMaxAgeSec.
   */
  com.google.protobuf.ByteString getSignedUrlCacheMaxAgeSecBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Names of the keys for signing request URLs.
   * </pre>
   *
   * <code>repeated string signed_url_key_names = 371848885;</code>
   *
   * @return A list containing the signedUrlKeyNames.
   */
  java.util.List<java.lang.String> getSignedUrlKeyNamesList();
  /**
   *
   *
   * <pre>
   * [Output Only] Names of the keys for signing request URLs.
   * </pre>
   *
   * <code>repeated string signed_url_key_names = 371848885;</code>
   *
   * @return The count of signedUrlKeyNames.
   */
  int getSignedUrlKeyNamesCount();
  /**
   *
   *
   * <pre>
   * [Output Only] Names of the keys for signing request URLs.
   * </pre>
   *
   * <code>repeated string signed_url_key_names = 371848885;</code>
   *
   * @param index The index of the element to return.
   * @return The signedUrlKeyNames at the given index.
   */
  java.lang.String getSignedUrlKeyNames(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] Names of the keys for signing request URLs.
   * </pre>
   *
   * <code>repeated string signed_url_key_names = 371848885;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the signedUrlKeyNames at the given index.
   */
  com.google.protobuf.ByteString getSignedUrlKeyNamesBytes(int index);
}