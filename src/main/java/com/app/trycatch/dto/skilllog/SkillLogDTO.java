package com.app.trycatch.dto.skilllog;

import com.app.trycatch.common.enumeration.skillLog.SkillLogStatus;
import com.app.trycatch.domain.member.MemberVO;
import com.app.trycatch.domain.skilllog.SkillLogVO;
import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class SkillLogDTO {
//    skillLog 필드
    private Long id;
    private String skillLogTitle;
    private String skillLogContent;
    private String skillLogCategory;
    private int skillLogViewCount;
    private SkillLogStatus skillLogStatus;
    private String createdDatetime;
    private String updatedDatetime;

//    member 필드
    private Long memberId;
    private String memberName;

//    experienceProgram 필드
    private Long experienceProgramId;

    public SkillLogVO toSkillLogVO() {
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

    public MemberVO toMemberVO() {
        return MemberVO.builder()
                .id(memberId)
                .memberName(memberName)
                .build();
    }

//    experienceProgram toVO 만들어야함.
}
