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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanCompliancePolicyItemsRequest extends AbstractModel{

    /**
    * 要重新扫描的客户检测项的列表。
    */
    @SerializedName("CustomerPolicyItemIdSet")
    @Expose
    private Long [] CustomerPolicyItemIdSet;

    /**
     * Get 要重新扫描的客户检测项的列表。 
     * @return CustomerPolicyItemIdSet 要重新扫描的客户检测项的列表。
     */
    public Long [] getCustomerPolicyItemIdSet() {
        return this.CustomerPolicyItemIdSet;
    }

    /**
     * Set 要重新扫描的客户检测项的列表。
     * @param CustomerPolicyItemIdSet 要重新扫描的客户检测项的列表。
     */
    public void setCustomerPolicyItemIdSet(Long [] CustomerPolicyItemIdSet) {
        this.CustomerPolicyItemIdSet = CustomerPolicyItemIdSet;
    }

    public ScanCompliancePolicyItemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanCompliancePolicyItemsRequest(ScanCompliancePolicyItemsRequest source) {
        if (source.CustomerPolicyItemIdSet != null) {
            this.CustomerPolicyItemIdSet = new Long[source.CustomerPolicyItemIdSet.length];
            for (int i = 0; i < source.CustomerPolicyItemIdSet.length; i++) {
                this.CustomerPolicyItemIdSet[i] = new Long(source.CustomerPolicyItemIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CustomerPolicyItemIdSet.", this.CustomerPolicyItemIdSet);

    }
}
