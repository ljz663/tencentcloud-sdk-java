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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetsMappingListResponse extends AbstractModel{

    /**
    * 资产测绘列表
    */
    @SerializedName("Data")
    @Expose
    private DataAssetMapping [] Data;

    /**
    * 资产测绘总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 类型分类统计数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountByType")
    @Expose
    private String CountByType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资产测绘列表 
     * @return Data 资产测绘列表
     */
    public DataAssetMapping [] getData() {
        return this.Data;
    }

    /**
     * Set 资产测绘列表
     * @param Data 资产测绘列表
     */
    public void setData(DataAssetMapping [] Data) {
        this.Data = Data;
    }

    /**
     * Get 资产测绘总数 
     * @return TotalCount 资产测绘总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 资产测绘总数
     * @param TotalCount 资产测绘总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 类型分类统计数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountByType 类型分类统计数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountByType() {
        return this.CountByType;
    }

    /**
     * Set 类型分类统计数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountByType 类型分类统计数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountByType(String CountByType) {
        this.CountByType = CountByType;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "CountByType", this.CountByType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

