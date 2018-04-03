/*
 * Copyright 2018 Okta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.okta.authn.sdk.resource;

import com.okta.sdk.resource.Resource;
import com.okta.sdk.resource.user.factor.FactorProvider;
import com.okta.sdk.resource.user.factor.FactorType;

import java.util.Map;

public interface Factor extends Resource {

    String getId();

    String getStatus();

    FactorType getType();

    FactorProvider getProvider();

    String getVendorName();

    Map<String, Link> getLinks();

    Map<String, Object> getProfile();

    Map<String, Object> getEmbedded();

    FactorActivation getActivation();

    <T extends FactorActivation> T getActivation(Class<T> activationClass);

//    Object enroll(Object object)
//    Object verify(Object object)
}