package com.foodfun.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseFuncollect<M extends BaseFuncollect<M>> extends Model<M> implements IBean {

	public void setFuncollectId(java.lang.Integer funcollectId) {
		set("funcollectId", funcollectId);
	}

	public java.lang.Integer getFuncollectId() {
		return get("funcollectId");
	}

	public void setFuncollectUser(java.lang.Integer funcollectUser) {
		set("funcollectUser", funcollectUser);
	}

	public java.lang.Integer getFuncollectUser() {
		return get("funcollectUser");
	}

	public void setFKfunId(java.lang.Integer FKfunId) {
		set("FKfunId", FKfunId);
	}

	public java.lang.Integer getFKfunId() {
		return get("FKfunId");
	}

}
