package com.bjpowernode.crm.settings.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bjpowernode.crm.commons.contants.Contants;
import com.bjpowernode.crm.commons.domain.ReturnObject;
import com.bjpowernode.crm.commons.utils.DateUtils;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.UserService;

//springmvc.xml下配置扫描包下的controller
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * url要和controller方法处理完请求之后， 响应信息返回的页面的资源目录保持一致
	 * WEB-INF/pages/settings/qx/user/toLogin toLogin资源名称和方法名保持一致
	 */

	@RequestMapping("/settings/qx/user/toLogin.do")
	public String toLogin() {
		// 请求转发到登录页面
		return "settings/qx/user/login";// 视图解析器
	}

	@RequestMapping("/settings/qx/user/login.do") // url路径和响应信息页面的资源路径一致，资源名称和方法名一样
	public @ResponseBody Object login(String loginAct, String loginPwd, String isRemPwd, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {

		// 封装参数
		Map<String, Object> map = new HashMap<>();
		map.put("loginAct", loginAct);
		map.put("loginPwd", loginPwd);

		// 调用service方法，查询用户，需要得到Service层对象注入
		User user = userService.queryUserByLoginActAndPwd(map);

		// 根据查询结果，生成响应信息
		ReturnObject returnObject = new ReturnObject();
		if (user == null) {
			// 登录失败，用户名或密码错误
			returnObject.setCode("0");
			returnObject.setMessage("用户名或者密码错误");

		} else {
			// 进一步判断账号是否合法
			// user.getExpireTime() //2019-10-20
			// new Date() //2020-09-10
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// String nowStr = sdf.format(new Date());
			String nowStr = DateUtils.formateDateTime(new Date());
			if (nowStr.compareTo(user.getExpireTime()) > 0) {
				// 登录失败，账号已过期
				returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
				returnObject.setMessage("账号已过期");
			} else if ("0".equals(user.getLockState())) {
				// 登录失败，状态被锁定
				returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
				returnObject.setMessage("状态被锁定");

			} else if (!user.getAllowIps().contains(request.getRemoteAddr())) {
				// 登录失败，ip受限
				// returnObject.setCode("0");
				returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
				returnObject.setMessage("ip受限");
			} else {
				// 登录成功
				returnObject.setCode(Contants.RETURN_OBJECT_CODE_SUCCESS);

				// 把User保存到session中
				session.setAttribute(Contants.SESSION_USER, user);

				// 如果需要记住密码，则往外写cookie
				if ("true".equals(isRemPwd)) {
					Cookie c1 = new Cookie("loginAct", user.getLoginAct());
					c1.setMaxAge(10 * 24 * 60 * 60);
					response.addCookie(c1);
					Cookie c2 = new Cookie("loginPwd", user.getLoginPwd());
					c2.setMaxAge(10 * 24 * 60 * 60);
					response.addCookie(c2);
				} else {
					// 把没有过期的cookie删除
					Cookie c1 = new Cookie("loginAct", "1");
					c1.setMaxAge(0);
					response.addCookie(c1);
					Cookie c2 = new Cookie("loginPwd", "1");
					c2.setMaxAge(0);
					response.addCookie(c2);
				}
			}
		}

		return returnObject;
	}

	@RequestMapping("/settings/qx/user/logout.do")
	public String logout(HttpServletResponse response, HttpSession session) {
		// 清空cookie
		Cookie c1 = new Cookie("loginAct", "1");
		c1.setMaxAge(0);
		response.addCookie(c1);
		Cookie c2 = new Cookie("loginPwd", "1");
		c2.setMaxAge(0);
		response.addCookie(c2);

		// 销毁session
		session.invalidate();

		// 跳转到首页
		return "redirect:/";// 借用springmvc框架来重定向，底层翻译成response.sendRedirect("/crm/");

	}

}
