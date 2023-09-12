package com.icia.board.repository;

import com.icia.board.dto.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public void save(BoardDTO boardDTO) {
        sql.insert("Board.save", boardDTO);
    }

    public List<BoardDTO> findAll() {
        return sql.selectList("Board.findAll");
    }


    public void delete(String boardPass) {
        sql.delete("Board.delete",boardPass);
    }

    public void updateHits(Long id) {
        sql.update("Board.updateHits", id);
    }

    public BoardDTO fidnById(Long id) {
        return sql.selectOne("Board.findById",id);
    }

    public BoardDTO findByPass(String boardPass) {
        return sql.selectOne("Board.findByPass",boardPass);
    }


    public void update(BoardDTO boardDTO) {
        sql.update("Board.update", boardDTO);
    }
}