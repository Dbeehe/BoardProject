package com.icia.board.service;

import com.icia.board.dto.BoardDTO;
import com.icia.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }


    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }


    public void delete(String boardPass) {
        boardRepository.delete(boardPass);
    }

    public void updateHits(Long id) {
        boardRepository.updateHits(id);
    }

    public BoardDTO findById(Long id) {
        return boardRepository.fidnById(id);
    }

    public BoardDTO findByPass(String boardPass) {
        return boardRepository.findByPass(boardPass);
    }


    public void update(BoardDTO boardDTO) {
        boardRepository.update(boardDTO);
    }
}