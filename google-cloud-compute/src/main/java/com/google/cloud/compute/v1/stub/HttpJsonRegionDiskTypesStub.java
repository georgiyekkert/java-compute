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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.RegionDiskTypesClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.FieldsExtractor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DiskType;
import com.google.cloud.compute.v1.GetRegionDiskTypeRequest;
import com.google.cloud.compute.v1.ListRegionDiskTypesRequest;
import com.google.cloud.compute.v1.RegionDiskTypeList;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * REST stub implementation for Google Compute Engine API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonRegionDiskTypesStub extends RegionDiskTypesStub {

  @InternalApi
  public static final ApiMethodDescriptor<GetRegionDiskTypeRequest, DiskType> getMethodDescriptor =
      ApiMethodDescriptor.<GetRegionDiskTypeRequest, DiskType>newBuilder()
          .setFullMethodName("google.cloud.compute.v1.RegionDiskTypes.Get")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetRegionDiskTypeRequest>newBuilder()
                  .setPath(
                      "/compute/v1/projects/{project}/regions/{region}/diskTypes/{diskType}",
                      new FieldsExtractor<GetRegionDiskTypeRequest, Map<String, String>>() {
                        @Override
                        public Map<String, String> extract(GetRegionDiskTypeRequest request) {
                          Map<String, String> fields = new HashMap<>();
                          ProtoRestSerializer<GetRegionDiskTypeRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putPathParam(fields, "project", request.getProject());
                          serializer.putPathParam(fields, "region", request.getRegion());
                          serializer.putPathParam(fields, "diskType", request.getDiskType());
                          return fields;
                        }
                      })
                  .setQueryParamsExtractor(
                      new FieldsExtractor<GetRegionDiskTypeRequest, Map<String, List<String>>>() {
                        @Override
                        public Map<String, List<String>> extract(GetRegionDiskTypeRequest request) {
                          Map<String, List<String>> fields = new HashMap<>();
                          ProtoRestSerializer<GetRegionDiskTypeRequest> serializer =
                              ProtoRestSerializer.create();

                          return fields;
                        }
                      })
                  .setRequestBodyExtractor(
                      new FieldsExtractor<GetRegionDiskTypeRequest, String>() {
                        @Override
                        public String extract(GetRegionDiskTypeRequest request) {
                          return "";
                        }
                      })
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<DiskType>newBuilder()
                  .setDefaultInstance(DiskType.getDefaultInstance())
                  .build())
          .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListRegionDiskTypesRequest, RegionDiskTypeList>
      listMethodDescriptor =
          ApiMethodDescriptor.<ListRegionDiskTypesRequest, RegionDiskTypeList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.RegionDiskTypes.List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListRegionDiskTypesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/diskTypes",
                          new FieldsExtractor<ListRegionDiskTypesRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(ListRegionDiskTypesRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<ListRegionDiskTypesRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "region", request.getRegion());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              ListRegionDiskTypesRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                ListRegionDiskTypesRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<ListRegionDiskTypesRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putQueryParam(fields, "filter", request.getFilter());
                              serializer.putQueryParam(
                                  fields, "maxResults", request.getMaxResults());
                              serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                              serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                              serializer.putQueryParam(
                                  fields,
                                  "returnPartialSuccess",
                                  request.getReturnPartialSuccess());
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<ListRegionDiskTypesRequest, String>() {
                            @Override
                            public String extract(ListRegionDiskTypesRequest request) {
                              return "";
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<RegionDiskTypeList>newBuilder()
                      .setDefaultInstance(RegionDiskTypeList.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetRegionDiskTypeRequest, DiskType> getCallable;
  private final UnaryCallable<ListRegionDiskTypesRequest, RegionDiskTypeList> listCallable;
  private final UnaryCallable<ListRegionDiskTypesRequest, ListPagedResponse> listPagedCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonRegionDiskTypesStub create(RegionDiskTypesStubSettings settings)
      throws IOException {
    return new HttpJsonRegionDiskTypesStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionDiskTypesStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonRegionDiskTypesStub(
        RegionDiskTypesStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonRegionDiskTypesStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonRegionDiskTypesStub(
        RegionDiskTypesStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonRegionDiskTypesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonRegionDiskTypesStub(
      RegionDiskTypesStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonRegionDiskTypesCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonRegionDiskTypesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonRegionDiskTypesStub(
      RegionDiskTypesStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetRegionDiskTypeRequest, DiskType> getTransportSettings =
        HttpJsonCallSettings.<GetRegionDiskTypeRequest, DiskType>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListRegionDiskTypesRequest, RegionDiskTypeList> listTransportSettings =
        HttpJsonCallSettings.<ListRegionDiskTypesRequest, RegionDiskTypeList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .build();

    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);
    this.listCallable =
        callableFactory.createUnaryCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.listPagedCallable =
        callableFactory.createPagedCallable(
            listTransportSettings, settings.listSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<GetRegionDiskTypeRequest, DiskType> getCallable() {
    return getCallable;
  }

  public UnaryCallable<ListRegionDiskTypesRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  public UnaryCallable<ListRegionDiskTypesRequest, RegionDiskTypeList> listCallable() {
    return listCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}