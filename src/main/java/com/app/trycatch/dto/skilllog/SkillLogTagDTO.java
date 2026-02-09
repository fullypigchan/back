package com.app.trycatch.dto.skilllog;

import com.app.trycatch.common.enumeration.SkillLogStatus;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class SkillLogTagDTO {
    private Long id;

    private Long skillLogId;
    private Long memberId;
    private Long experienceProgramId;
    private String skillLogTitle;
    private String skillLogContent;
    private String skillLogCategory;
    private int skillLogViewCount;
    private SkillLogStatus skillLogStatus;

    private Long tagId;
    private String tagName;
}
