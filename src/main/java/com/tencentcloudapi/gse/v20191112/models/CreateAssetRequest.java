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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAssetRequest extends AbstractModel{

    /**
    * 生成包的ZIP包名，例如：server.zip
    */
    @SerializedName("BucketKey")
    @Expose
    private String BucketKey;

    /**
    * 生成包名字，最小长度为1，最大长度为64
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 生成包版本，最小长度为1，最大长度为64
    */
    @SerializedName("AssetVersion")
    @Expose
    private String AssetVersion;

    /**
    * 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
    */
    @SerializedName("AssetRegion")
    @Expose
    private String AssetRegion;

    /**
    * 生成包可运行的操作系统，若传入参数为CentOS7.16则不需要传入ImageId字段，否则，需要传入Imageid字段（该方式是为了兼容之前的版本，后续建议使用ImageId来替代该字段）
    */
    @SerializedName("OperateSystem")
    @Expose
    private String OperateSystem;

    /**
    * 生成包支持的操作系统镜像id，若传入OperateSystem字段的值是CentOS7.16，则不需要传入该值；如果不是，则需要通过DescribeAssetSystems接口获取asset支持的操作系统ImageId进行传入
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
     * Get 生成包的ZIP包名，例如：server.zip 
     * @return BucketKey 生成包的ZIP包名，例如：server.zip
     */
    public String getBucketKey() {
        return this.BucketKey;
    }

    /**
     * Set 生成包的ZIP包名，例如：server.zip
     * @param BucketKey 生成包的ZIP包名，例如：server.zip
     */
    public void setBucketKey(String BucketKey) {
        this.BucketKey = BucketKey;
    }

    /**
     * Get 生成包名字，最小长度为1，最大长度为64 
     * @return AssetName 生成包名字，最小长度为1，最大长度为64
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 生成包名字，最小长度为1，最大长度为64
     * @param AssetName 生成包名字，最小长度为1，最大长度为64
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 生成包版本，最小长度为1，最大长度为64 
     * @return AssetVersion 生成包版本，最小长度为1，最大长度为64
     */
    public String getAssetVersion() {
        return this.AssetVersion;
    }

    /**
     * Set 生成包版本，最小长度为1，最大长度为64
     * @param AssetVersion 生成包版本，最小长度为1，最大长度为64
     */
    public void setAssetVersion(String AssetVersion) {
        this.AssetVersion = AssetVersion;
    }

    /**
     * Get 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8) 
     * @return AssetRegion 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public String getAssetRegion() {
        return this.AssetRegion;
    }

    /**
     * Set 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     * @param AssetRegion 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public void setAssetRegion(String AssetRegion) {
        this.AssetRegion = AssetRegion;
    }

    /**
     * Get 生成包可运行的操作系统，若传入参数为CentOS7.16则不需要传入ImageId字段，否则，需要传入Imageid字段（该方式是为了兼容之前的版本，后续建议使用ImageId来替代该字段） 
     * @return OperateSystem 生成包可运行的操作系统，若传入参数为CentOS7.16则不需要传入ImageId字段，否则，需要传入Imageid字段（该方式是为了兼容之前的版本，后续建议使用ImageId来替代该字段）
     */
    public String getOperateSystem() {
        return this.OperateSystem;
    }

    /**
     * Set 生成包可运行的操作系统，若传入参数为CentOS7.16则不需要传入ImageId字段，否则，需要传入Imageid字段（该方式是为了兼容之前的版本，后续建议使用ImageId来替代该字段）
     * @param OperateSystem 生成包可运行的操作系统，若传入参数为CentOS7.16则不需要传入ImageId字段，否则，需要传入Imageid字段（该方式是为了兼容之前的版本，后续建议使用ImageId来替代该字段）
     */
    public void setOperateSystem(String OperateSystem) {
        this.OperateSystem = OperateSystem;
    }

    /**
     * Get 生成包支持的操作系统镜像id，若传入OperateSystem字段的值是CentOS7.16，则不需要传入该值；如果不是，则需要通过DescribeAssetSystems接口获取asset支持的操作系统ImageId进行传入 
     * @return ImageId 生成包支持的操作系统镜像id，若传入OperateSystem字段的值是CentOS7.16，则不需要传入该值；如果不是，则需要通过DescribeAssetSystems接口获取asset支持的操作系统ImageId进行传入
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 生成包支持的操作系统镜像id，若传入OperateSystem字段的值是CentOS7.16，则不需要传入该值；如果不是，则需要通过DescribeAssetSystems接口获取asset支持的操作系统ImageId进行传入
     * @param ImageId 生成包支持的操作系统镜像id，若传入OperateSystem字段的值是CentOS7.16，则不需要传入该值；如果不是，则需要通过DescribeAssetSystems接口获取asset支持的操作系统ImageId进行传入
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketKey", this.BucketKey);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetVersion", this.AssetVersion);
        this.setParamSimple(map, prefix + "AssetRegion", this.AssetRegion);
        this.setParamSimple(map, prefix + "OperateSystem", this.OperateSystem);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

