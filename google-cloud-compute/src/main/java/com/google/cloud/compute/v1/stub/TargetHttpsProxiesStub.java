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

import static com.google.cloud.compute.v1.TargetHttpsProxiesClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.TargetHttpsProxiesClient.ListPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AggregatedListTargetHttpsProxiesRequest;
import com.google.cloud.compute.v1.DeleteTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.GetTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.InsertTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.ListTargetHttpsProxiesRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.SetQuicOverrideTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.SetSslCertificatesTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.SetSslPolicyTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.SetUrlMapTargetHttpsProxyRequest;
import com.google.cloud.compute.v1.TargetHttpsProxy;
import com.google.cloud.compute.v1.TargetHttpsProxyAggregatedList;
import com.google.cloud.compute.v1.TargetHttpsProxyList;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Compute Engine API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class TargetHttpsProxiesStub implements BackgroundResource {

  public UnaryCallable<AggregatedListTargetHttpsProxiesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListPagedCallable()");
  }

  public UnaryCallable<AggregatedListTargetHttpsProxiesRequest, TargetHttpsProxyAggregatedList>
      aggregatedListCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListCallable()");
  }

  public UnaryCallable<DeleteTargetHttpsProxyRequest, Operation> deleteCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteCallable()");
  }

  public UnaryCallable<GetTargetHttpsProxyRequest, TargetHttpsProxy> getCallable() {
    throw new UnsupportedOperationException("Not implemented: getCallable()");
  }

  public UnaryCallable<InsertTargetHttpsProxyRequest, Operation> insertCallable() {
    throw new UnsupportedOperationException("Not implemented: insertCallable()");
  }

  public UnaryCallable<ListTargetHttpsProxiesRequest, ListPagedResponse> listPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listPagedCallable()");
  }

  public UnaryCallable<ListTargetHttpsProxiesRequest, TargetHttpsProxyList> listCallable() {
    throw new UnsupportedOperationException("Not implemented: listCallable()");
  }

  public UnaryCallable<SetQuicOverrideTargetHttpsProxyRequest, Operation>
      setQuicOverrideCallable() {
    throw new UnsupportedOperationException("Not implemented: setQuicOverrideCallable()");
  }

  public UnaryCallable<SetSslCertificatesTargetHttpsProxyRequest, Operation>
      setSslCertificatesCallable() {
    throw new UnsupportedOperationException("Not implemented: setSslCertificatesCallable()");
  }

  public UnaryCallable<SetSslPolicyTargetHttpsProxyRequest, Operation> setSslPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setSslPolicyCallable()");
  }

  public UnaryCallable<SetUrlMapTargetHttpsProxyRequest, Operation> setUrlMapCallable() {
    throw new UnsupportedOperationException("Not implemented: setUrlMapCallable()");
  }

  @Override
  public abstract void close();
}