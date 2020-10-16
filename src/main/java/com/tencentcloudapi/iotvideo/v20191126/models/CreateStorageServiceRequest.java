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

public class CreateStorageServiceRequest extends AbstractModel{

    /**
    * 云存套餐ID
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 订单数量,可一次性创建多个订单
    */
    @SerializedName("OrderCount")
    @Expose
    private Long OrderCount;

    /**
    * 云存服务所在的区域,如ap-guangzhou,ap-singapore
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 视频流通道号。(对于存在多路视频流的设备，如NVR设备，与设备实际视频流通道号对应)
    */
    @SerializedName("ChnNum")
    @Expose
    private Long ChnNum;

    /**
    * 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 服务生效时间,若不指定此参数，服务立即生效
    */
    @SerializedName("EnableTime")
    @Expose
    private Long EnableTime;

    /**
     * Get 云存套餐ID 
     * @return PkgId 云存套餐ID
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 云存套餐ID
     * @param PkgId 云存套餐ID
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
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
     * Get 订单数量,可一次性创建多个订单 
     * @return OrderCount 订单数量,可一次性创建多个订单
     */
    public Long getOrderCount() {
        return this.OrderCount;
    }

    /**
     * Set 订单数量,可一次性创建多个订单
     * @param OrderCount 订单数量,可一次性创建多个订单
     */
    public void setOrderCount(Long OrderCount) {
        this.OrderCount = OrderCount;
    }

    /**
     * Get 云存服务所在的区域,如ap-guangzhou,ap-singapore 
     * @return StorageRegion 云存服务所在的区域,如ap-guangzhou,ap-singapore
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 云存服务所在的区域,如ap-guangzhou,ap-singapore
     * @param StorageRegion 云存服务所在的区域,如ap-guangzhou,ap-singapore
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
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
     * Get 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致 
     * @return AccessId 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致
     * @param AccessId 设备主人用户在IoT Video平台的注册ID。该参数用于验证Paas/Saas平台的设备/用户关系链是否一致
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 服务生效时间,若不指定此参数，服务立即生效 
     * @return EnableTime 服务生效时间,若不指定此参数，服务立即生效
     */
    public Long getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set 服务生效时间,若不指定此参数，服务立即生效
     * @param EnableTime 服务生效时间,若不指定此参数，服务立即生效
     */
    public void setEnableTime(Long EnableTime) {
        this.EnableTime = EnableTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "OrderCount", this.OrderCount);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ChnNum", this.ChnNum);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);

    }
}

