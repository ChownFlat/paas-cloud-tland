/**
 * 文 件 名:  Recommand
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2018/1/24 0024
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.quanteng.tland.cms.database.entity;

import com.quanteng.tland.common.domain.BaseObject;
import lombok.Getter;
import lombok.Setter;

/**
 * <游戏应用推荐实体>
 *
 * @author zping
 * @version 2018/1/24 0024
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Getter
@Setter
public class Recommand extends BaseObject
{

	/**
	 * 业务编号
	 */
	private int id;

	/**
	 * 应用名称
	 */
	private String name;

	/**
	 * 应用编码
	 */
	private String appId;

	/**
	 * 备注
	 */
	private String memo;

	@Override
	public String toString ()
	{
		final StringBuilder sb = new StringBuilder ("Recommand{");
		sb.append ("id=").append (id);
		sb.append (", name='").append (name).append ('\'');
		sb.append (", appId='").append (appId).append ('\'');
		sb.append (", memo='").append (memo).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}
}
