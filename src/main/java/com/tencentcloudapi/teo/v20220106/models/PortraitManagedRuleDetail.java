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

public class PortraitManagedRuleDetail extends AbstractModel{

    /**
    * 规则唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则所属类型的名字, botdb(用户画像)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * 规则内的功能分类Id(扫描器，Bot行为等)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationId")
    @Expose
    private Long ClassificationId;

    /**
    * 规则当前所属动作状态(block, alg, ...)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 规则唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 规则的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 规则的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则所属类型的名字, botdb(用户画像)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTypeName 规则所属类型的名字, botdb(用户画像)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set 规则所属类型的名字, botdb(用户画像)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTypeName 规则所属类型的名字, botdb(用户画像)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get 规则内的功能分类Id(扫描器，Bot行为等)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassificationId 规则内的功能分类Id(扫描器，Bot行为等)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClassificationId() {
        return this.ClassificationId;
    }

    /**
     * Set 规则内的功能分类Id(扫描器，Bot行为等)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationId 规则内的功能分类Id(扫描器，Bot行为等)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationId(Long ClassificationId) {
        this.ClassificationId = ClassificationId;
    }

    /**
     * Get 规则当前所属动作状态(block, alg, ...)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 规则当前所属动作状态(block, alg, ...)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则当前所属动作状态(block, alg, ...)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 规则当前所属动作状态(block, alg, ...)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public PortraitManagedRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortraitManagedRuleDetail(PortraitManagedRuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.ClassificationId != null) {
            this.ClassificationId = new Long(source.ClassificationId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "ClassificationId", this.ClassificationId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

