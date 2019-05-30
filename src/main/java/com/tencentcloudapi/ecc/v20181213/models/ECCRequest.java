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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ECCRequest  extends AbstractModel{

    /**
    * 作文文本，必填
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 作文题目，可选参数
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 作文提纲，可选参数，作文的写作要求。
    */
    @SerializedName("Outline")
    @Expose
    private String Outline;

    /**
    * 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
    */
    @SerializedName("ModelSubject")
    @Expose
    private String ModelSubject;

    /**
    * 范文内容，可选参数，同上，范文的正文部分。
    */
    @SerializedName("ModelContent")
    @Expose
    private String ModelContent;

    /**
     * 获取作文文本，必填
     * @return Content 作文文本，必填
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * 设置作文文本，必填
     * @param Content 作文文本，必填
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * 获取作文题目，可选参数
     * @return Title 作文题目，可选参数
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * 设置作文题目，可选参数
     * @param Title 作文题目，可选参数
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * 获取年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
     * @return Grade 年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * 设置年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
     * @param Grade 年级标准， 默认以cet4为标准，取值与意义如下：elementary 小学，grade7 grade8 grade9分别对应初一，初二，初三。 grade10 grade11 grade12 分别对应高一，高二，高三，以及cet4和cet6 分别表示 英语4级和6级。
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * 获取作文提纲，可选参数，作文的写作要求。
     * @return Outline 作文提纲，可选参数，作文的写作要求。
     */
    public String getOutline() {
        return this.Outline;
    }

    /**
     * 设置作文提纲，可选参数，作文的写作要求。
     * @param Outline 作文提纲，可选参数，作文的写作要求。
     */
    public void setOutline(String Outline) {
        this.Outline = Outline;
    }

    /**
     * 获取范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     * @return ModelSubject 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     */
    public String getModelSubject() {
        return this.ModelSubject;
    }

    /**
     * 设置范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     * @param ModelSubject 范文标题，可选参数，本接口可以依据提供的范文对作文进行评分。
     */
    public void setModelSubject(String ModelSubject) {
        this.ModelSubject = ModelSubject;
    }

    /**
     * 获取范文内容，可选参数，同上，范文的正文部分。
     * @return ModelContent 范文内容，可选参数，同上，范文的正文部分。
     */
    public String getModelContent() {
        return this.ModelContent;
    }

    /**
     * 设置范文内容，可选参数，同上，范文的正文部分。
     * @param ModelContent 范文内容，可选参数，同上，范文的正文部分。
     */
    public void setModelContent(String ModelContent) {
        this.ModelContent = ModelContent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "Outline", this.Outline);
        this.setParamSimple(map, prefix + "ModelSubject", this.ModelSubject);
        this.setParamSimple(map, prefix + "ModelContent", this.ModelContent);

    }
}

