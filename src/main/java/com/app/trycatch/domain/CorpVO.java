package com.app.trycatch.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(of="id")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
public class CorpVO {
    private Long id;
    private String corpCompanyName;
    private String corpBusinessNumber;
    private String corpCeoName;
    private Long corpKindId;
    private Long corpKindSmallId;
    private String corpCompanyType;
    private String corpCompanySize;
    private String corpEstablishmentDate;
    private String corpWebsiteUrl;
    private String corpFax;
    private Long corpCapital;
    private Long corpTotalSales;
    private String corpPerformance;
    private String corpVision;
}
