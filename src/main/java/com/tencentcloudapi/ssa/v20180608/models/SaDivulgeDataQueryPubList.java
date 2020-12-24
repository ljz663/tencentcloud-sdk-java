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

public class SaDivulgeDataQueryPubList extends AbstractModel{

    /**
    * Count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * List
    */
    @SerializedName("List")
    @Expose
    private SaDivulgeDataQueryPub [] List;

    /**
     * Get Count 
     * @return Count Count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Count
     * @param Count Count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get List 
     * @return List List
     */
    public SaDivulgeDataQueryPub [] getList() {
        return this.List;
    }

    /**
     * Set List
     * @param List List
     */
    public void setList(SaDivulgeDataQueryPub [] List) {
        this.List = List;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

