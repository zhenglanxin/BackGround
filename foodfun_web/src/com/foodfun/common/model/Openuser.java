package com.foodfun.common.model;

import com.foodfun.common.model.base.BaseOpenuser;
import com.jfinal.plugin.activerecord.Page;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Openuser extends BaseOpenuser<Openuser> {
	public static final Openuser dao = new Openuser();
	
	public Page<Openuser> paginate(int pageNumber, int pageSize) {
		return paginate(pageNumber, pageSize, "select *", "from openuser");
	}
}
