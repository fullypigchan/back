package com.app.trycatch.domain;

import com.app.trycatch.audit.Period;
import com.app.trycatch.common.enumeration.SkillLogStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter @ToString
@EqualsAndHashCode(of = "id")
@SuperBuilder
public class SkillLogVO extends Period {
    private Long id;
    private Long memberId;
    private Long experienceProgramId;
    private String skillLogTitle;
    private String skillLogContent;
    private String skillLogCategory;
    private int skillLogViewCount;
    private SkillLogStatus skillLogStatus;
}
