/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerResponse extends AbstractModel{

    /**
    * 由负载均衡实例唯一 ID 组成的数组。
存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过DescribeTaskStatus接口查询创建的资源ID。
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 订单号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 由负载均衡实例唯一 ID 组成的数组。
存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过DescribeTaskStatus接口查询创建的资源ID。 
     * @return LoadBalancerIds 由负载均衡实例唯一 ID 组成的数组。
存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过DescribeTaskStatus接口查询创建的资源ID。
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 由负载均衡实例唯一 ID 组成的数组。
存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过DescribeTaskStatus接口查询创建的资源ID。
     * @param LoadBalancerIds 由负载均衡实例唯一 ID 组成的数组。
存在某些场景，如创建出现延迟时，此字段可能返回为空；此时可以根据接口返回的RequestId或DealName参数，通过DescribeTaskStatus接口查询创建的资源ID。
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get 订单号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealName 订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 订单号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealName 订单号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateLoadBalancerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerResponse(CreateLoadBalancerResponse source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

