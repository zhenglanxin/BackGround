package com.foodfun.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMclassify<M extends BaseMclassify<M>> extends Model<M> implements IBean {

	public void setMclassifyId(java.lang.Integer mclassifyId) {
		set("mclassifyId", mclassifyId);
	}

	public java.lang.Integer getMclassifyId() {
		return get("mclassifyId");
	}

	public void setMclassifyName(java.lang.String mclassifyName) {
		set("mclassifyName", mclassifyName);
	}

	public java.lang.String getMclassifyName() {
		return get("mclassifyName");
	}

}
