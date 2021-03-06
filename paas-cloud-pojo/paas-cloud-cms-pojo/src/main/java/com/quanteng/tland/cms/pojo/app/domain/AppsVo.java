/**
 * 文 件 名:  Apps
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  huangsongbo
 * 修改时间:  2017/8/9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.quanteng.tland.cms.pojo.app.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * <应用信息>
 *
 * @author huangsongbo
 * @version 2017/8/9
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Getter
@Setter
public class AppsVo implements Serializable
{
	/**
	 * 应用编号
	 */
	private String appId;

	/**
	 * 名称
	 */
	private String appName;

	/**
	 * 图标
	 */
	private String appIcon;

	/**
	 * 缩略图标
	 */
	private String appIconThumb;

	/**
	 * 英文名称
	 */
	private String englishName;

	/**
	 * 星级
	 */
	private String appRate;

	/**
	 * 标签
	 */
	private String appLabel;
	/**
	 * 下载次数
	 */
	private String appDownload;
	/**
	 * 大小
	 */
	private String appSize;
	/**
	 * 版本号
	 */
	private String appVersion;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 修改时间
	 */
	private String updateTime;
	/**
	 * 开发者
	 */
	private String developer;
	/**
	 * 介绍内容
	 */
	private String content;
	/**
	 * 分类
	 */
	private String catalogId;
	/**
	 * 分类名称
	 */
	private String catalogName;
	/**
	 * 图片1
	 */
	private String bannerImg1;
	/**
	 * 图片2
	 */
	private String bannerImg2;
	/**
	 * 图片3
	 */
	private String bannerImg3;
	/**
	 * 图片4
	 */
	private String bannerImg4;

	/**
	 * 图片缩略图1
	 */
	private String bannerImgThumb1;
	/**
	 * 图片缩略图2
	 */
	private String bannerImgThumb2;
	/**
	 * 图片缩略图3
	 */
	private String bannerImgThumb3;
	/**
	 * 图片缩略图4
	 */
	private String bannerImgThumb4;
	/**
	 * 图片下载地址
	 */
	private String appUrl;
	/**
	 * CP编号
	 */
	private String cpId;
	/**
	 * 状态
	 */
	private String appStatus;
	/**
	 * 驳回原因
	 */
	private String reason;
	/**
	 * 宣传图
	 */
	private String progagandaImg;
	/**
	 * update T_APP set app_status = '0' where app_status = #{status};
	 * 一键审核 只将状态为待审核（3）的应用修改为上线，其他状态的不做修改
	 */
	private String status;
	/**
	 * 应用多语言列表
	 */
	private List<AppLangVo> appLangs;

	@Override
	public String toString ()
	{
		final StringBuilder sb = new StringBuilder ("AppsVo{");
		sb.append ("appId='").append (appId).append ('\'');
		sb.append (", appName='").append (appName).append ('\'');
		sb.append (", appIcon='").append (appIcon).append ('\'');
		sb.append (", appIconThumb='").append (appIconThumb).append ('\'');
		sb.append (", englishName='").append (englishName).append ('\'');
		sb.append (", appRate='").append (appRate).append ('\'');
		sb.append (", appLabel='").append (appLabel).append ('\'');
		sb.append (", appDownload='").append (appDownload).append ('\'');
		sb.append (", appSize='").append (appSize).append ('\'');
		sb.append (", appVersion='").append (appVersion).append ('\'');
		sb.append (", createTime='").append (createTime).append ('\'');
		sb.append (", updateTime='").append (updateTime).append ('\'');
		sb.append (", developer='").append (developer).append ('\'');
		sb.append (", content='").append (content).append ('\'');
		sb.append (", catalogId='").append (catalogId).append ('\'');
		sb.append (", catalogName='").append (catalogName).append ('\'');
		sb.append (", bannerImg1='").append (bannerImg1).append ('\'');
		sb.append (", bannerImg2='").append (bannerImg2).append ('\'');
		sb.append (", bannerImg3='").append (bannerImg3).append ('\'');
		sb.append (", bannerImg4='").append (bannerImg4).append ('\'');
		sb.append (", bannerImgThumb1='").append (bannerImgThumb1).append ('\'');
		sb.append (", bannerImgThumb2='").append (bannerImgThumb2).append ('\'');
		sb.append (", bannerImgThumb3='").append (bannerImgThumb3).append ('\'');
		sb.append (", bannerImgThumb4='").append (bannerImgThumb4).append ('\'');
		sb.append (", appUrl='").append (appUrl).append ('\'');
		sb.append (", cpId='").append (cpId).append ('\'');
		sb.append (", appStatus='").append (appStatus).append ('\'');
		sb.append (", reason='").append (reason).append ('\'');
		sb.append (", progagandaImg='").append (progagandaImg).append ('\'');
		sb.append (", status='").append (status).append ('\'');
		sb.append (", appLangs=").append (appLangs);
		sb.append ('}');
		return sb.toString ();
	}
}
