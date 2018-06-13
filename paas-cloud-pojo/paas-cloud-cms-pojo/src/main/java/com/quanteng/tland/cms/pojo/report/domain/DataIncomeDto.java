/**
 * 文 件 名:  DataIncomeDto
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  LJun
 * 修改时间:  2018/1/11
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.quanteng.tland.cms.pojo.report.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * income实体
 *
 * @author LJun
 * @version 2018/1/11
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Getter
@Setter
public class DataIncomeDto implements Serializable
{
	/**时间**/
	private String time;
	/**日收益**/
	private String dailyIncome;
	/**周收益**/
	private String weeklyIncome;
	/**总收益**/
	private String amountIncome;

	@Override
	public String toString ()
	{
		final StringBuffer sb = new StringBuffer ("DataIncomeDto{");
		sb.append ("time='").append (time).append ('\'');
		sb.append (", dailyIncome='").append (dailyIncome).append ('\'');
		sb.append (", weeklyIncome='").append (weeklyIncome).append ('\'');
		sb.append (", amountIncome='").append (amountIncome).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}
}
