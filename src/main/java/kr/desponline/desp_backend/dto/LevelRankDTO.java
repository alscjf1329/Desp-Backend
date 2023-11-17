package kr.desponline.desp_backend.dto;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "RPGPlayer")
public class LevelRankDTO {
    @Id
    private final String id;
    private final String uuid;
    private final String nickname;
    private final String job;
    private final int level;
    private final double expPercent;

    public LevelRankDTO(String id, String uuid, String nickname, String job, int level, double exp, double maxexp) {
        this.id = id;
        this.uuid = uuid;
        this.nickname = nickname;
        this.job = job;
        this.level = level;
        this.expPercent = exp / maxexp * 100;
    }
}