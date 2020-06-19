package com.sbxxxia.web.facilities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String facilitySeq;

    @Column(length = 20)
    private String fName;
    @Column(length = 10)
    private String fType;
    @Column(length = 5)
    private String fRegion;
    @Column(length = 5)
    private String fPostalCode;
    @Column(length = 50)
    private String fAddress;
    @Column(length = 50)
    private String fDetailedAddress;
    @Column(length = 20)
    private String fPhoneNumber;
    @Builder
    public Facility(String fName, String fType, String fRegion,
                    String fPostalCode, String fAddress,
                    String fDetailedAddress, String fPhoneNumber) {
        this.fName = fName;
        this.fType = fType;
        this.fRegion = fRegion;
        this.fPostalCode = fPostalCode;
        this.fAddress = fAddress;
        this.fDetailedAddress = fDetailedAddress;
        this.fPhoneNumber = fPhoneNumber;
    }

    


}
