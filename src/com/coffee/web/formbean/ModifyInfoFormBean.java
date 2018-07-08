package com.coffee.web.formbean;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装用户修改信息表单bean，用来接收user/modify-info.jsp中的注册表单输入项的值
 * RegisterFormBean中的属性与user/modify-info.jsp中的表单输入项一一对应
 * RegisterFormBean还需要进行后端验证
 * 
 * @author K
 */
public class ModifyInfoFormBean {
	private String tel;
	private String email;

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTel() {
		return tel;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	/**
	 * 存储校验不通过时给用户的错误提示信息
	 */
	private Map<String, String> errors = new HashMap<String, String>();

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	/*
	 * 已在前端进行验证，这里暂不写验证
	 */
	/**
	 * 验证是否符合要求
	 */
	public boolean validate() {
		return true;
	}

	@Override
	public String toString() {
		return "ModifyInfoFormBean [tel=" + tel + ",email=" + email + "]";
	}

}
