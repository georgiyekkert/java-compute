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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class HealthStatus implements ApiMessage {
  private final Map<String, String> annotations;
  private final String healthState;
  private final String instance;
  private final String ipAddress;
  private final Integer port;

  private HealthStatus() {
    this.annotations = null;
    this.healthState = null;
    this.instance = null;
    this.ipAddress = null;
    this.port = null;
  }

  private HealthStatus(
      Map<String, String> annotations,
      String healthState,
      String instance,
      String ipAddress,
      Integer port) {
    this.annotations = annotations;
    this.healthState = healthState;
    this.instance = instance;
    this.ipAddress = ipAddress;
    this.port = port;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("annotations".equals(fieldName)) {
      return annotations;
    }
    if ("healthState".equals(fieldName)) {
      return healthState;
    }
    if ("instance".equals(fieldName)) {
      return instance;
    }
    if ("ipAddress".equals(fieldName)) {
      return ipAddress;
    }
    if ("port".equals(fieldName)) {
      return port;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /** Metadata defined as annotations for network endpoint. */
  public Map<String, String> getAnnotationsMap() {
    return annotations;
  }

  /** Health state of the instance. */
  public String getHealthState() {
    return healthState;
  }

  /** URL of the instance resource. */
  public String getInstance() {
    return instance;
  }

  /** A forwarding rule IP address assigned to this instance. */
  public String getIpAddress() {
    return ipAddress;
  }

  /** The named port of the instance group, not necessarily the port that is health-checked. */
  public Integer getPort() {
    return port;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(HealthStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static HealthStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final HealthStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new HealthStatus();
  }

  public static class Builder {
    private Map<String, String> annotations;
    private String healthState;
    private String instance;
    private String ipAddress;
    private Integer port;

    Builder() {}

    public Builder mergeFrom(HealthStatus other) {
      if (other == HealthStatus.getDefaultInstance()) return this;
      if (other.getAnnotationsMap() != null) {
        this.annotations = other.annotations;
      }
      if (other.getHealthState() != null) {
        this.healthState = other.healthState;
      }
      if (other.getInstance() != null) {
        this.instance = other.instance;
      }
      if (other.getIpAddress() != null) {
        this.ipAddress = other.ipAddress;
      }
      if (other.getPort() != null) {
        this.port = other.port;
      }
      return this;
    }

    Builder(HealthStatus source) {
      this.annotations = source.annotations;
      this.healthState = source.healthState;
      this.instance = source.instance;
      this.ipAddress = source.ipAddress;
      this.port = source.port;
    }

    /** Metadata defined as annotations for network endpoint. */
    public Map<String, String> getAnnotationsMap() {
      return annotations;
    }

    /** Metadata defined as annotations for network endpoint. */
    public Builder putAllAnnotations(Map<String, String> annotations) {
      this.annotations = annotations;
      return this;
    }

    /** Health state of the instance. */
    public String getHealthState() {
      return healthState;
    }

    /** Health state of the instance. */
    public Builder setHealthState(String healthState) {
      this.healthState = healthState;
      return this;
    }

    /** URL of the instance resource. */
    public String getInstance() {
      return instance;
    }

    /** URL of the instance resource. */
    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }

    /** A forwarding rule IP address assigned to this instance. */
    public String getIpAddress() {
      return ipAddress;
    }

    /** A forwarding rule IP address assigned to this instance. */
    public Builder setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }

    /** The named port of the instance group, not necessarily the port that is health-checked. */
    public Integer getPort() {
      return port;
    }

    /** The named port of the instance group, not necessarily the port that is health-checked. */
    public Builder setPort(Integer port) {
      this.port = port;
      return this;
    }

    public HealthStatus build() {

      return new HealthStatus(annotations, healthState, instance, ipAddress, port);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.putAllAnnotations(this.annotations);
      newBuilder.setHealthState(this.healthState);
      newBuilder.setInstance(this.instance);
      newBuilder.setIpAddress(this.ipAddress);
      newBuilder.setPort(this.port);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "HealthStatus{"
        + "annotations="
        + annotations
        + ", "
        + "healthState="
        + healthState
        + ", "
        + "instance="
        + instance
        + ", "
        + "ipAddress="
        + ipAddress
        + ", "
        + "port="
        + port
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HealthStatus) {
      HealthStatus that = (HealthStatus) o;
      return Objects.equals(this.annotations, that.getAnnotationsMap())
          && Objects.equals(this.healthState, that.getHealthState())
          && Objects.equals(this.instance, that.getInstance())
          && Objects.equals(this.ipAddress, that.getIpAddress())
          && Objects.equals(this.port, that.getPort());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, healthState, instance, ipAddress, port);
  }
}
