package com.example.curr_situation_board.mapper;

import com.example.curr_situation_board.vo.CurrStatusVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
@Mapper
public interface CurrStatusMapper {

    /**
     * 获取A、B、C实际在工现况
     * @param building:A、B、C栋
     * @return
     */
    List<CurrStatusVO> findCurrStatus(@Param("building") String building);
}
