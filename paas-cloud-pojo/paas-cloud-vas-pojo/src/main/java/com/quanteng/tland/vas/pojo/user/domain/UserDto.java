/**
 * 文 件 名:  User
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2018/4/12 0012
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.quanteng.tland.vas.pojo.user.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zping
 * @version 2018/4/12 0012
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Getter
@Setter
public class UserDto implements Serializable
{
	private String userName;

	private String createTime;

	@Override
	public String toString ()
	{
		final StringBuilder sb = new StringBuilder ("User{");
		sb.append ("userName='").append (userName).append ('\'');
		sb.append (", createTime='").append (createTime).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}
}
