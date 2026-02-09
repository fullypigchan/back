package com.app.trycatch.dto.skilllog;

import com.app.trycatch.common.enumeration.SkillLogStatus;
import com.app.trycatch.domain.skilllog.SkillLogVO;
import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class SkillLogDTO {
    private Long id;
    private Long memberId;
    private Long experienceProgramId;
    private String skillLogTitle;
    private String skillLogContent;
    private String skillLogCategory;
    private int skillLogViewCount;
    private SkillLogStatus skillLogStatus;
    private String createdDatetime;
    private String updatedDatetime;

    public SkillLogVO toVO() {
        return SkillLogVO.builder()
                .id(id)
                .memberId(memberId)
                .experienceProgramId(experienceProgramId)
                .skillLogTitle(skillLogTitle)
                .skillLogContent(skillLogContent)
                .skillLogCategory(skillLogCategory)
                .skillLogViewCount(skillLogViewCount)
                .skillLogStatus(skillLogStatus)
                .createdDatetime(createdDatetime)
                .updatedDatetime(updatedDatetime)
                .build();
    }
}
