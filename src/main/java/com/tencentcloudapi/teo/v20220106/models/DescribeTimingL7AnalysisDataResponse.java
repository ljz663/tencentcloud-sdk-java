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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimingL7AnalysisDataResponse extends AbstractModel{

    /**
    * 详细数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private TimingDataRecord [] Data;

    /**
    * 查询维度
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 时间间隔
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 详细数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimingDataRecord [] getData() {
        return this.Data;
    }

    /**
     * Set 详细数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(TimingDataRecord [] Data) {
        this.Data = Data;
    }

    /**
     * Get 查询维度 
     * @return Type 查询维度
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 查询维度
     * @param Type 查询维度
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 时间间隔 
     * @return Interval 时间间隔
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间间隔
     * @param Interval 时间间隔
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
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

    public DescribeTimingL7AnalysisDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7AnalysisDataResponse(DescribeTimingL7AnalysisDataResponse source) {
        if (source.Data != null) {
            this.Data = new TimingDataRecord[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TimingDataRecord(source.Data[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

