package kr.desponline.desp_backend.service;

import java.util.List;
import kr.desponline.desp_backend.dto.LevelRankDTO;
import kr.desponline.desp_backend.mongodb_repository.RPGSharpRepository;
import org.springframework.stereotype.Service;

@Service
public class RankingService {
    private final RPGSharpRepository rpgSharpRepository;

    public RankingService(RPGSharpRepository rpgSharpRepository) {
        this.rpgSharpRepository = rpgSharpRepository;
    }

    public List<LevelRankDTO> getTopPlayers(long limit) {
        return rpgSharpRepository.findPlayerOrderByLevel().take(limit).collectList().block();
    }
}