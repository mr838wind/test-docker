package com.example.testsetting.domains.board;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardMapper {

    ////@Select("SELECT * FROM tb_board WHERE title like concat('%', #{title}, '%') ") // move to xml
    BoardVO findBySeq(@Param("seq") int seq);

    void updateViewCount(@Param("seq") int seq);


}
