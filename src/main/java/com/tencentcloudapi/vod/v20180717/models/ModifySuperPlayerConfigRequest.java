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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySuperPlayerConfigRequest extends AbstractModel{

    /**
    * 播放器配置名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * 允许输出的未加密的自适应码流模板 ID。
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * 允许输出的 DRM 自适应码流模板内容。
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfoForUpdate DrmStreamingsInfo;

    /**
    * 允许输出的雪碧图模板 ID。
    */
    @SerializedName("ImageSpriteDefinition")
    @Expose
    private Long ImageSpriteDefinition;

    /**
    * 播放器对不于不同分辨率的子流展示名字。
    */
    @SerializedName("ResolutionNames")
    @Expose
    private ResolutionNameInfo [] ResolutionNames;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 播放器配置名称。 
     * @return Name 播放器配置名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 播放器配置名称。
     * @param Name 播放器配置名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li> 
     * @return DrmSwitch 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
     * @param DrmSwitch 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get 允许输出的未加密的自适应码流模板 ID。 
     * @return AdaptiveDynamicStreamingDefinition 允许输出的未加密的自适应码流模板 ID。
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set 允许输出的未加密的自适应码流模板 ID。
     * @param AdaptiveDynamicStreamingDefinition 允许输出的未加密的自适应码流模板 ID。
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get 允许输出的 DRM 自适应码流模板内容。 
     * @return DrmStreamingsInfo 允许输出的 DRM 自适应码流模板内容。
     */
    public DrmStreamingsInfoForUpdate getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set 允许输出的 DRM 自适应码流模板内容。
     * @param DrmStreamingsInfo 允许输出的 DRM 自适应码流模板内容。
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfoForUpdate DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
    }

    /**
     * Get 允许输出的雪碧图模板 ID。 
     * @return ImageSpriteDefinition 允许输出的雪碧图模板 ID。
     */
    public Long getImageSpriteDefinition() {
        return this.ImageSpriteDefinition;
    }

    /**
     * Set 允许输出的雪碧图模板 ID。
     * @param ImageSpriteDefinition 允许输出的雪碧图模板 ID。
     */
    public void setImageSpriteDefinition(Long ImageSpriteDefinition) {
        this.ImageSpriteDefinition = ImageSpriteDefinition;
    }

    /**
     * Get 播放器对不于不同分辨率的子流展示名字。 
     * @return ResolutionNames 播放器对不于不同分辨率的子流展示名字。
     */
    public ResolutionNameInfo [] getResolutionNames() {
        return this.ResolutionNames;
    }

    /**
     * Set 播放器对不于不同分辨率的子流展示名字。
     * @param ResolutionNames 播放器对不于不同分辨率的子流展示名字。
     */
    public void setResolutionNames(ResolutionNameInfo [] ResolutionNames) {
        this.ResolutionNames = ResolutionNames;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DrmSwitch", this.DrmSwitch);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamObj(map, prefix + "DrmStreamingsInfo.", this.DrmStreamingsInfo);
        this.setParamSimple(map, prefix + "ImageSpriteDefinition", this.ImageSpriteDefinition);
        this.setParamArrayObj(map, prefix + "ResolutionNames.", this.ResolutionNames);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

