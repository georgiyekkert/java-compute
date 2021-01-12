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

public interface InstanceGroupManagerStatusStatefulOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerStatusStateful)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] A bit indicating whether the managed instance group has stateful configuration, that is, if you have configured any items in a stateful policy or in per-instance configs. The group might report that it has no stateful config even when there is still some preserved state on a managed instance, for example, if you have deleted all PICs but not yet applied those deletions.
   * </pre>
   *
   * <code>bool has_stateful_config = 110474224;</code>
   *
   * @return The hasStatefulConfig.
   */
  boolean getHasStatefulConfig();

  /**
   *
   *
   * <pre>
   * [Output Only] Status of per-instance configs on the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
   * </code>
   *
   * @return Whether the perInstanceConfigs field is set.
   */
  boolean hasPerInstanceConfigs();
  /**
   *
   *
   * <pre>
   * [Output Only] Status of per-instance configs on the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
   * </code>
   *
   * @return The perInstanceConfigs.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs
      getPerInstanceConfigs();
  /**
   *
   *
   * <pre>
   * [Output Only] Status of per-instance configs on the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigs per_instance_configs = 257829545;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulPerInstanceConfigsOrBuilder
      getPerInstanceConfigsOrBuilder();
}
