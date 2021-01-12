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

public interface HttpRouteRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpRouteRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The short description conveying the intent of this routeRule.
   * The description can have a maximum length of 1024 characters.
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
   * The short description conveying the intent of this routeRule.
   * The description can have a maximum length of 1024 characters.
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
   * Specifies changes to request and response headers that need to take effect for the selected backendService.
   * The headerAction specified here are applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction
   * Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpHeaderAction header_action = 59641896;</code>
   *
   * @return Whether the headerAction field is set.
   */
  boolean hasHeaderAction();
  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService.
   * The headerAction specified here are applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction
   * Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpHeaderAction header_action = 59641896;</code>
   *
   * @return The headerAction.
   */
  com.google.cloud.compute.v1.HttpHeaderAction getHeaderAction();
  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService.
   * The headerAction specified here are applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction
   * Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL.
   * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpHeaderAction header_action = 59641896;</code>
   */
  com.google.cloud.compute.v1.HttpHeaderActionOrBuilder getHeaderActionOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 107765245;</code>
   */
  java.util.List<com.google.cloud.compute.v1.HttpRouteRuleMatch> getMatchRulesList();
  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 107765245;</code>
   */
  com.google.cloud.compute.v1.HttpRouteRuleMatch getMatchRules(int index);
  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 107765245;</code>
   */
  int getMatchRulesCount();
  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 107765245;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HttpRouteRuleMatchOrBuilder>
      getMatchRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HttpRouteRuleMatch match_rules = 107765245;</code>
   */
  com.google.cloud.compute.v1.HttpRouteRuleMatchOrBuilder getMatchRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * For routeRules within a given pathMatcher, priority determines the order in which load balancer will interpret routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied.
   * You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number between 0 and 2147483647 inclusive.
   * Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
   * </pre>
   *
   * <code>int32 priority = 176716196;</code>
   *
   * @return The priority.
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * In response to a matching matchRule, the load balancer performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected backend. If  routeAction specifies any  weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any  weightedBackendServices.
   * Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
   * UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a routeRule's routeAction.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRouteAction route_action = 156128492;</code>
   *
   * @return Whether the routeAction field is set.
   */
  boolean hasRouteAction();
  /**
   *
   *
   * <pre>
   * In response to a matching matchRule, the load balancer performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected backend. If  routeAction specifies any  weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any  weightedBackendServices.
   * Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
   * UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a routeRule's routeAction.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRouteAction route_action = 156128492;</code>
   *
   * @return The routeAction.
   */
  com.google.cloud.compute.v1.HttpRouteAction getRouteAction();
  /**
   *
   *
   * <pre>
   * In response to a matching matchRule, the load balancer performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected backend. If  routeAction specifies any  weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any  weightedBackendServices.
   * Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
   * UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a routeRule's routeAction.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRouteAction route_action = 156128492;</code>
   */
  com.google.cloud.compute.v1.HttpRouteActionOrBuilder getRouteActionOrBuilder();

  /**
   *
   *
   * <pre>
   * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is additionally specified, advanced routing actions like URL Rewrites, etc. take effect prior to sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendService s. Conversely, if routeAction specifies any  weightedBackendServices, service must not be specified.
   * Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
   * </pre>
   *
   * <code>string service = 105105077;</code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is additionally specified, advanced routing actions like URL Rewrites, etc. take effect prior to sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendService s. Conversely, if routeAction specifies any  weightedBackendServices, service must not be specified.
   * Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
   * </pre>
   *
   * <code>string service = 105105077;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect.
   * If urlRedirect is specified, service or routeAction must not be set.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRedirectAction url_redirect = 136712364;</code>
   *
   * @return Whether the urlRedirect field is set.
   */
  boolean hasUrlRedirect();
  /**
   *
   *
   * <pre>
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect.
   * If urlRedirect is specified, service or routeAction must not be set.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRedirectAction url_redirect = 136712364;</code>
   *
   * @return The urlRedirect.
   */
  com.google.cloud.compute.v1.HttpRedirectAction getUrlRedirect();
  /**
   *
   *
   * <pre>
   * When this rule is matched, the request is redirected to a URL specified by urlRedirect.
   * If urlRedirect is specified, service or routeAction must not be set.
   * Not supported when the URL map is bound to target gRPC proxy.
   * </pre>
   *
   * <code>.google.cloud.compute.v1.HttpRedirectAction url_redirect = 136712364;</code>
   */
  com.google.cloud.compute.v1.HttpRedirectActionOrBuilder getUrlRedirectOrBuilder();
}
