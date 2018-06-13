/**
 * 文 件 名:  QueryUserOrderRequest
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2018/5/26 0026
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.quanteng.tland.vas.pojo.user.request;

import com.quanteng.tland.common.domain.BaseRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zping
 * @version 2018/5/26 0026
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Getter
@Setter
public class QueryUserOrderRequest extends BaseRequest
{
	/**
	 * 用户账号
	 */
	private String account;

	@Override
	public String toString ()
	{
		final StringBuilder sb = new StringBuilder ("QueryUserOrderRequest{");
		sb.append ("account='").append (account).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}
}
