/**
 * 文 件 名:  AdminRoleRelation
 * 版    权:  Quanten Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zping
 * 修改时间:  2017/7/11 0011
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.quanteng.tland.cms.database.entity;

import com.quanteng.tland.common.domain.BaseObject;
import lombok.Getter;
import lombok.Setter;

/**
 * <管理员角色关系>
 *
 * @author zping
 * @version 2017/7/11 0011
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Getter
@Setter
public class AdminRoleRelation extends BaseObject
{
	/**
	 * 业务编号
	 */
	private String id;
	/**
	 * 管理员编号
	 */
	private String adminId;
	/**
	 * 角色编号
	 */
	private String roleId;
	/**
	 * 备注
	 */
	private String memo;

	@Override
	public String toString ()
	{
		final StringBuffer sb = new StringBuffer ("AdminRoleRelation{");
		sb.append ("id='").append (id).append ('\'');
		sb.append (", adminId='").append (adminId).append ('\'');
		sb.append (", roleId='").append (roleId).append ('\'');
		sb.append (", memo='").append (memo).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}
}
