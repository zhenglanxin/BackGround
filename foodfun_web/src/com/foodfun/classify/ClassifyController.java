package com.foodfun.classify;

import java.util.List;

import com.foodfun.common.model.Classify;
import com.foodfun.common.model.Mclassify;
import com.foodfun.common.model.Test;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

/**
 * ClassifyController
 */
//@Before(BlogInterceptor.class)
public class ClassifyController extends Controller {
	public void index() {
		setAttr("ClassifyPage", Classify.dao.paginate(getParaToInt(0, 1), 20));
		render("classify.html");
	}

	public void add() {
		
	}
	
	public void upload() {
		// 获取上传的文件
		UploadFile uf = getFile("Filedata");

		// 拼接文件上传的完整路径
		String fileName = "http://" + this.getRequest().getRemoteHost() + ":"
				+ this.getRequest().getLocalPort() + "/upload/"
				+ uf.getFileName();
		
		this.setAttr("fileName", fileName);
		System.out.println("================fileName:"+fileName);
		
		//以json格式进行渲染
		renderJson();
	}
	
	public void save() {
		getModel(Classify.class).save();
		redirect("/classify");
	}
	
	public void edit() {
		setAttr("classify", Classify.dao.findById(getParaToInt()));
	}
	
	public void update() {
		getModel(Classify.class).update();
		redirect("/classify");
	}
	
	public void delete() {
		Classify.dao.deleteById(getParaToInt());
		redirect("/classify");
	}
}