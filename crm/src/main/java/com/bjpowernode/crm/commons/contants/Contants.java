package com.bjpowernode.crm.commons.contants;

public class Contants {
	// 保存ReturnObject类中的Code值
	// 常量的话，只保存一份，所有人可调用，不能改了
	public static final String RETURN_OBJECT_CODE_SUCCESS = "1";// 成功
	public static final String RETURN_OBJECT_CODE_FAIL = "0";// 失败

	// 保存当前用户的key
	public static final String SESSION_USER = "sessionUser";

	// 备注的修改标记
	public static final String REMARK_EDIT_FLAG_NO_EDITED = "0";// 0----没有修改过
	public static final String REMARK_EDIT_FLAG_YES_EDITED = "1";// 1----有修改过
}
