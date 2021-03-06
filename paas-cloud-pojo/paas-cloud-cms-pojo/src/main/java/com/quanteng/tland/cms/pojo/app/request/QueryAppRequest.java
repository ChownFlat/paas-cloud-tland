/**
 * 文 件 名:  QueryAppRequest
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  huangsongbo
 * 修改时间:  2017/8/9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.quanteng.tland.cms.pojo.app.request;

import com.quanteng.tland.common.domain.BasePageRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author huangsongbo
 * @version 2017/8/9
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Getter
@Setter
public class QueryAppRequest extends BasePageRequest
{
	/**
	 * 应用名称
	 */
	private String appName;
	/**
	 * 应用状态
	 */
	private String appStatus;
	/**
	 * 应用编号
	 */
	private String appId;
	/**
	 * 栏目编号
	 */
	private String catalogId;
	/**
	 * 内容提供商编号
	 */
	private String cpId;

	@Override
	public String toString ()
	{
		final StringBuilder sb = new StringBuilder ("QueryAppRequest{");
		sb.append ("appName='").append (appName).append ('\'');
		sb.append (", appStatus='").append (appStatus).append ('\'');
		sb.append (", catalogId='").append (catalogId).append ('\'');
		sb.append (", cpId='").append (cpId).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}
}
