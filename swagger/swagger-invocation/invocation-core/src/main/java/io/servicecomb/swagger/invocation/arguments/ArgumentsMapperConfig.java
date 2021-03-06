/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.swagger.invocation.arguments;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ArgumentsMapperConfig {
  // input
  private Method swaggerMethod;

  private Method providerMethod;

  // output
  private List<ArgumentMapper> argumentMapperList = new ArrayList<>();

  public Method getSwaggerMethod() {
    return swaggerMethod;
  }

  public void setSwaggerMethod(Method swaggerMethod) {
    this.swaggerMethod = swaggerMethod;
  }

  public Method getProviderMethod() {
    return providerMethod;
  }

  public void setProviderMethod(Method providerMethod) {
    this.providerMethod = providerMethod;
  }

  public List<ArgumentMapper> getArgumentMapperList() {
    return argumentMapperList;
  }

  public void setArgumentMapperList(List<ArgumentMapper> argumentMapperList) {
    this.argumentMapperList = argumentMapperList;
  }

  public void addArgumentMapper(ArgumentMapper argumentMapper) {
    argumentMapperList.add(argumentMapper);
  }
}
