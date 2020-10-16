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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStorageServiceResponse extends AbstractModel{

    /**
    * 标志是否为续订
    */
    @SerializedName("IsRenew")
    @Expose
    private Boolean IsRenew;

    /**
    * 云存服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 云存服务所在的区域
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应)
    */
    @SerializedName("ChnNum")
    @Expose
    private Long ChnNum;

    /**
    * 终端用户在IoT Video平台的注册ID
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 服务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 服务失效时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 服务状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 新增的云存定单列表
    */
    @SerializedName("Data")
    @Expose
    private StorageOrder [] Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 标志是否为续订 
     * @return IsRenew 标志是否为续订
     */
    public Boolean getIsRenew() {
        return this.IsRenew;
    }

    /**
     * Set 标志是否为续订
     * @param IsRenew 标志是否为续订
     */
    public void setIsRenew(Boolean IsRenew) {
        this.IsRenew = IsRenew;
    }

    /**
     * Get 云存服务ID 
     * @return ServiceId 云存服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 云存服务ID
     * @param ServiceId 云存服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 云存服务所在的区域 
     * @return StorageRegion 云存服务所在的区域
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 云存服务所在的区域
     * @param StorageRegion 云存服务所在的区域
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应) 
     * @return ChnNum 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应)
     */
    public Long getChnNum() {
        return this.ChnNum;
    }

    /**
     * Set 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应)
     * @param ChnNum 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应)
     */
    public void setChnNum(Long ChnNum) {
        this.ChnNum = ChnNum;
    }

    /**
     * Get 终端用户在IoT Video平台的注册ID 
     * @return AccessId 终端用户在IoT Video平台的注册ID
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 终端用户在IoT Video平台的注册ID
     * @param AccessId 终端用户在IoT Video平台的注册ID
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 服务开始时间 
     * @return StartTime 服务开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 服务开始时间
     * @param StartTime 服务开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 服务失效时间 
     * @return EndTime 服务失效时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 服务失效时间
     * @param EndTime 服务失效时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 服务状态 
     * @return Status 服务状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 服务状态
     * @param Status 服务状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 新增的云存定单列表 
     * @return Data 新增的云存定单列表
     */
    public StorageOrder [] getData() {
        return this.Data;
    }

    /**
     * Set 新增的云存定单列表
     * @param Data 新增的云存定单列表
     */
    public void setData(StorageOrder [] Data) {
        this.Data = Data;
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
        this.setParamSimple(map, prefix + "IsRenew", this.IsRenew);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "ChnNum", this.ChnNum);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

