package com.bjpowernode.crm.workbench.mapper;

import com.bjpowernode.crm.workbench.domain.ClueActivityRelation;

public interface ClueActivityRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbg.generated Fri Mar 29 00:22:24 JST 2024
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbg.generated Fri Mar 29 00:22:24 JST 2024
     */
    int insert(ClueActivityRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbg.generated Fri Mar 29 00:22:24 JST 2024
     */
    int insertSelective(ClueActivityRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbg.generated Fri Mar 29 00:22:24 JST 2024
     */
    ClueActivityRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbg.generated Fri Mar 29 00:22:24 JST 2024
     */
    int updateByPrimaryKeySelective(ClueActivityRelation row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbg.generated Fri Mar 29 00:22:24 JST 2024
     */
    int updateByPrimaryKey(ClueActivityRelation row);
}