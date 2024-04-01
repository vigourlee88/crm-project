package com.bjpowernode.crm.workbench.mapper;

import java.util.List;
import java.util.Map;

import com.bjpowernode.crm.workbench.domain.Activity;

public interface ActivityMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table tbl_activity
	 *
	 * @mbg.generated Fri Feb 23 14:38:33 JST 2024
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table tbl_activity
	 *
	 * @mbg.generated Fri Feb 23 14:38:33 JST 2024
	 */
	int insert(Activity row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table tbl_activity
	 *
	 * @mbg.generated Fri Feb 23 14:38:33 JST 2024
	 */
	int insertSelective(Activity row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table tbl_activity
	 *
	 * @mbg.generated Fri Feb 23 14:38:33 JST 2024
	 */
	Activity selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table tbl_activity
	 *
	 * @mbg.generated Fri Feb 23 14:38:33 JST 2024
	 */
	int updateByPrimaryKeySelective(Activity row);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table tbl_activity
	 *
	 * @mbg.generated Fri Feb 23 14:38:33 JST 2024
	 */
	int updateByPrimaryKey(Activity row);

	/**
	 * 保存创建的市场活动
	 * 
	 * @param activity
	 * @return
	 */
	int insertActivity(Activity activity);

	/**
	 * 根据条件分页查询市场活动的列表
	 * 
	 * @param map
	 * @return
	 */
	List<Activity> selectActivityByConditionForPage(Map<String, Object> map);

	/**
	 * 根据条件查询市场活动的总条数
	 * 
	 * @param map
	 * @return
	 */
	int selectCountOfActivityByCondition(Map<String, Object> map);

	/**
	 * 根据ids数组，批量删除市场活动
	 * 
	 * @param ids
	 * @return
	 */
	int deleteActivityByIds(String[] ids);

	/**
	 * 根据id查询市场活动的信息
	 * 
	 * @param id
	 * @return
	 */
	Activity selectActivityById(String id);

	/**
	 * 保存修改的市场活动
	 * 
	 * @param activity
	 * @return
	 */
	int updateActivity(Activity activity);

	/**
	 * 查询所有的市场活动
	 * 
	 * @param activity
	 * @return
	 */
	List<Activity> selectAllActivitys();

	/**
	 * 批量保存创建的市场活动
	 * 
	 * @param activity
	 * @return
	 */
	int insertActivityByList(List<Activity> activityList);

	/**
	 * 根据id来查询市场活动的明细信息
	 * 
	 * @param id
	 * @return
	 */
	Activity selectActivityForDetailById(String id);

	/**
	 * 根据clueId查询该线索相关联的市场活动的明细信息
	 * 
	 * @param clueId
	 * @return
	 */
	List<Activity> selectActivityForDetailByClueId(String clueId);

	/**
	 * 根据name来模糊查询市场活动，并且把已经跟clueId关联过的市场活动排除
	 * 
	 * @param map
	 * @return
	 */
	List<Activity> selectActivityForDetailByNameClueId(Map<String, Object> map);

	/**
	 * 根据ids数组 查询市场活动的明细信息
	 * 
	 * @param ids
	 * @return
	 */
	List<Activity> selectActivityForDetailByIds(String[] ids);
}